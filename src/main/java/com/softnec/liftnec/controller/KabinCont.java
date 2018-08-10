package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.part.Kabin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kabin")
public class KabinCont extends GenericRestController<Kabin>{
}
