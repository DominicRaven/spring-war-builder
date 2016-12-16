package uk.gov.metoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Literal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.metoffice.domain.Person;
import uk.gov.metoffice.repo.PersonRepo;

/**
 * Created by dominic.raven on 16/12/2016.
 */
@RestController
@RequestMapping(value = "/out")
public class MainController {

    @Autowired
    PersonRepo person;

    @RequestMapping(method = RequestMethod.GET, value = "test")
    public String test() {
        return "test123";
    }

    @RequestMapping(method = RequestMethod.GET, value = "person")
    public Iterable<Person> getPerson() {
        return person.findAll();
    }
}
