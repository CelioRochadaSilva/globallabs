package com.globallabes.springwebmvc.controller;

import com.globallabes.springwebmvc.model.Jedi;


import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.JediRepository;

@Controller
public class JediController {

    private JediRepository repository;

    @GetMapping("/jedi")
    public ModelAndView jedi(){
       final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

//        modelAndView.addObject("allJedi" , repository.getAllJedi());
        return modelAndView ;
    }
    @GetMapping("/newjeedi")
    public ModelAndView newJedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-jeedi");

        modelAndView.addObject("jedi", new Jedi());//formulario
        return modelAndView;

    }
    @PostMapping (path = "/jedi")
    public String creatJedi(@Validated @ModelAttribute Jedi jedi) {
        repository.add(jedi);
        return "redrecty:jedi";
        }
}
