package com.example.demo.repository;

import com.example.demo.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@PropertySource("application-test.properties")
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    public void findAllTest() {
        List<Person> persons = repository.findAll();
        assertEquals(1, persons.size());
    }

}