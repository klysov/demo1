package com.example.demo1.mapper;

import com.example.demo1.dto.BillionaireDto;
import com.example.demo1.model.Billionaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface BillionaireMapper {

    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "career", source = "career")
    BillionaireDto mapToDto(Billionaire billionaire);

    List<BillionaireDto> mapToDtos(List<Billionaire> billionaires);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "career", source = "career")
    Billionaire mapToJpaEntity(BillionaireDto billionaireDto);

    List<Billionaire> mapToJpaEntities(List<BillionaireDto> billionaireDto);

}
