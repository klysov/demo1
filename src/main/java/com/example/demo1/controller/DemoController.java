package com.example.demo1.controller;

import com.example.demo1.dto.BillionaireDto;
import com.example.demo1.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DemoController {

    private DemoService demoService;

    @GetMapping(path = "/get-demo")
    public List<BillionaireDto> demoMethod1() {
        return demoService.getSomething();
    }

}
