package com.javanauta.agendadortarefas.bussines.mapper;

import com.javanauta.agendadortarefas.bussines.dto.TarefasDTORecord;
import com.javanauta.agendadortarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source ="dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    TarefasEntity paraTarefaEnity(TarefasDTORecord dto);

    TarefasDTORecord paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTORecord> dtos);
    List<TarefasDTORecord> paraListaTerefasDTO(List<TarefasEntity> entities);
}
