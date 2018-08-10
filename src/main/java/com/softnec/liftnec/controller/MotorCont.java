package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.part.Motor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motor")
public class MotorCont extends GenericRestController<Motor> {
}
