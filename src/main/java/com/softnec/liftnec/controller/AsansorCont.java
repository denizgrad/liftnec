package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.product.Asansor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asansor")
public class AsansorCont extends GenericRestController<Asansor> {
}
