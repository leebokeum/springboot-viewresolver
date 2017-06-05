package com.example.viewresolver.controller;

import com.example.viewresolver.dao.PersonDao;
import com.example.viewresolver.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 이복음 on 2017-06-05.
 */
@Controller
public class InitController {

    @Autowired
    PersonDao personDao;

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public ModelAndView getPerson(@PathVariable int id) {
        Person person = personDao.findOne(id);
        return new ModelAndView("person").addObject("person", person);

    }

    @RequestMapping(value = "/save/{id}", method = RequestMethod.GET)
    public ModelAndView savePerson(@PathVariable int id) {
        Person person = new Person(id, "chulsoo" + id, "kim", 20 + id);
        personDao.save(person);
        return new ModelAndView("person").addObject("person", person);
    }
}
