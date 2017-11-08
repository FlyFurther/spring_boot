package com.huangq.repository;

import com.huangq.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by hq on 17/11/5.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByName(String name);

    Person findByNameAndAge(String name, int age);

    @Query("select p from Person p where p.name=:name and p.age=:age")
    Person withNameAndAgeQuery(@Param("name") String name, @Param("age") int age);

    Person WithNameAndAgeNamedQuery(String name, int age);
}
