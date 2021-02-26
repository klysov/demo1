package com.example.demo1.service;

import com.example.demo1.dto.BillionaireDto;

import java.util.List;

public interface DemoService {

    List<BillionaireDto> getSomething();

    BillionaireDto saveSomething(BillionaireDto billionaireDto);

}
