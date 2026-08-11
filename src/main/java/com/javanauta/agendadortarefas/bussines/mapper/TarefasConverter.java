package com.javanauta.agendadortarefas.bussines.mapper;

import com.javanauta.agendadortarefas.bussines.dto.TarefasDTO;
import com.javanauta.agendadortarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEnity(TarefasDTO dto);
    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
