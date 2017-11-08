package com.huangq.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by hq on 17/11/5.
 */
@Data
@Entity
@Table(name = "t_person")
@NamedQuery(name = "Person.WithNameAndAgeNamedQuery",
query = "select p from Person p where p.name = ?1 and age = ?2")
public class Person {

    public Person() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "age")
    private Integer age;
}
