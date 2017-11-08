package com.huangq.web.rest;

import com.huangq.domain.Person;
import com.huangq.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hq on 17/11/5.
 */
@RestController
public class DataController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Person savePerson(String name, Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        personRepository.save(person);

        return person;
    }

    @RequestMapping(value = "/selectPerson")
    public Person selectPerson(String name, Integer age) {
        Person person = personRepository.withNameAndAgeQuery(name, age);

        return person;
    }

    @RequestMapping(value = "/namedQuery")
    public Person namedQuery(String name, Integer age) {
        Person person = personRepository.WithNameAndAgeNamedQuery(name, age);

        return person;
    }
}
