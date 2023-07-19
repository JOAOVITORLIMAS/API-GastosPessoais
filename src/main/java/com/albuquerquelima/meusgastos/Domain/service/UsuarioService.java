package com.albuquerquelima.meusgastos.Domain.service;

import java.util.List;

import com.albuquerquelima.meusgastos.Dto.Usuario.UsuarioRequestDto;
import com.albuquerquelima.meusgastos.Dto.Usuario.UsuarioResponseDto;


public class UsuarioService implements ICRUDService < UsuarioRequestDto, UsuarioResponseDto> {

    @Override
    public UsuarioResponseDto atualizar(Long id, UsuarioRequestDto dto) {  
        return null;
    }

    @Override
    public UsuarioResponseDto cadastrar(UsuarioRequestDto dto) {
        return null;
    }
    @Override
    public void deletar(long id) {    
    }
    @Override
    public UsuarioResponseDto obterPorId(Long id) {
        return null;
    }
    @Override
    public List<UsuarioResponseDto> obterTodos() {
        return null;
    }


    
}
