package org.example.service;

import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    List<Usuario> usuarios = new ArrayList<Usuario>();

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
