package com.escom.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.escom.entity.Usuario;



public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String name);

	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsernameAndEmail2(String username, String enail);

}
