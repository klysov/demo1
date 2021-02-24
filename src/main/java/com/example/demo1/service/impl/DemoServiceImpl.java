package com.example.demo1.service.impl;

import com.example.demo1.dto.BillionaireDto;
import com.example.demo1.mapper.BillionaireMapper;
import com.example.demo1.repository.BillionairesRepository;
import com.example.demo1.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DemoServiceImpl implements DemoService {

    private BillionairesRepository billionairesRepository;
    private BillionaireMapper billionaireMapper;

    @Override
    public List<BillionaireDto> getSomething() {
        return billionaireMapper.mapToDtos(billionairesRepository.findAll());
    }

}
