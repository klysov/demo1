package com.example.demo1.service.impl;

import com.example.demo1.dto.BillionaireDto;
import com.example.demo1.mapper.BillionaireMapper;
import com.example.demo1.model.Billionaire;
import com.example.demo1.repository.BillionairesRepository;
import com.example.demo1.service.DemoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    private BillionairesRepository billionairesRepository;
    private BillionaireMapper billionaireMapper;

    @Override
    public List<BillionaireDto> getSomething() {
        return billionaireMapper.mapToDtos(billionairesRepository.findAll());
    }

    @Override
    public BillionaireDto saveSomething(BillionaireDto billionaireDto) {
        Billionaire billionaire = billionaireMapper.mapToJpaEntity(billionaireDto);
        log.info(billionaire.toString());
        billionairesRepository.save(billionaire);
        billionaireDto.setCareer("SAVED!");
        billionaireDto.setFirstName("SAVED!");
        billionaireDto.setLastName("SAVED!");
        return billionaireDto;
    }
}
