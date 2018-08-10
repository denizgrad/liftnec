package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.common.Marka;
import com.softnec.liftnec.model.domain.part.Ray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("marka/")
public class MarkaCont extends GenericRestController<Marka>{
/*
    @RequestMapping("/")
    String home(Asansor model) {
        modal.addAttribute("title","CRUD Example");
        return "index";
    }
    */
}
