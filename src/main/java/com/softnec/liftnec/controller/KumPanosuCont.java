package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.part.KumandaPanosu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kumPanosu")
public class KumPanosuCont  extends  GenericRestController<KumandaPanosu>{
}
