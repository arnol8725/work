package com.escom.service;

import com.escom.entity.Usuario;

public interface IUsuarioService  {
	public Usuario findByUsername(String name);
}