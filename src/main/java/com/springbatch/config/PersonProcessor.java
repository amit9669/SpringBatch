package com.springbatch.config;

import com.springbatch.model.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person,Person> {

    @Override
    public Person process(Person person) throws Exception {

        person.setName(person.getName().toUpperCase());

        return person;
    }
}
