package com.albuquerquelima.meusgastos.Domain.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.albuquerquelima.meusgastos.Domain.model.Usuario;
import com.albuquerquelima.meusgastos.Domain.repository.UsuarioRepository;
import com.albuquerquelima.meusgastos.Dto.Usuario.UsuarioRequestDto;
import com.albuquerquelima.meusgastos.Dto.Usuario.UsuarioResponseDto;

public class UsuarioService implements ICRUDService<UsuarioRequestDto, UsuarioResponseDto> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper mapper;

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
        Optional<Usuario> optUsuario = usuarioRepository.findById(id);
        if (optUsuario.isEmpty()) {
            // Aqui lançar uma exception ...
        }
        return mapper.map(optUsuario.get(), UsuarioResponseDto.class);

    }

    @Override
    public List<UsuarioResponseDto> obterTodos() {

        List<Usuario> usuarios = usuarioRepository.findAll();

        // List<UsuarioResponseDto> usuariosDto = new ArrayList<>();

        // for (Usuario usuario : usuarios) {

        // UsuarioResponseDto dto = mapper.map(usuario, UsuarioResponseDto.class);
        // usuariosDto.add(dto);
        // }
        // return usuariosDto;

        return usuarios.stream()
                .map(usuario -> mapper.map(usuario, UsuarioResponseDto.class))
                .collect(Collectors.toList());
    }
}
