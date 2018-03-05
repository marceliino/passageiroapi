package br.com.fiap.passageiroapi.android29scj.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.passageiroapi.android29scj.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	Usuario findById(String id);
	List<Usuario> findByUsuario(String usuario);
	Usuario findByUsuarioAndSenha(String usuario, String senha);
}