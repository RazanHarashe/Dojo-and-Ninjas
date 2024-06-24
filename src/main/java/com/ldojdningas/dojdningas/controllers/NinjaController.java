package com.ldojdningas.dojdningas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ldojdningas.dojdningas.models.Ninja;
import com.ldojdningas.dojdningas.services.DojoService;
import com.ldojdningas.dojdningas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
    @Autowired
    private NinjaService ninjaService;

    @Autowired
    private DojoService dojoService;

    @GetMapping("/new")
    public String newNinja(Model model) {
        model.addAttribute("ninja", new Ninja());
        model.addAttribute("dojos", dojoService.getAllDojos());
        return "ninja/new";
    }

    @PostMapping("/new")
    public String createNinja(@ModelAttribute Ninja ninja) {
        ninjaService.createNinja(ninja);
        return "redirect:/dojos/" + ninja.getDojo().getId();
    }
}
