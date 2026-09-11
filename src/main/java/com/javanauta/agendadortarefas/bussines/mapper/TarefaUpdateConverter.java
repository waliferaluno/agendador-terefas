package com.javanauta.agendadortarefas.bussines.mapper;

import com.javanauta.agendadortarefas.bussines.dto.TarefasDTORecord;
import com.javanauta.agendadortarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTORecord dto, @MappingTarget TarefasEntity entity);

}
