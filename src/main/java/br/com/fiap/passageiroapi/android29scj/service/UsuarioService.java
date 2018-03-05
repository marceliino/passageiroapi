package br.com.fiap.passageiroapi.android29scj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.passageiroapi.android29scj.model.Usuario;
import br.com.fiap.passageiroapi.android29scj.repository.UsuarioRepository;

@Service
public class UsuarioService
{
	@Autowired
	UsuarioRepository usuarioRepository;

	public void salvar(Usuario usuario) {
		Usuario usu = usuarioRepository.findById(usuario.getId());
		if(usu!=null) {
			usuario.setId(usu.getId());
		}
		usuarioRepository.save(usuario);
	}
	
	public void delete(String id) {
		usuarioRepository.delete(id);
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	public List<Usuario> findByUsuario(String usuario) {
		return usuarioRepository.findByUsuario(usuario);
	}
	
	public Usuario pesquisarUsuario(String usuario) {
        List<Usuario> usuarios = usuarioRepository.findByUsuario(usuario);
        if (usuarios.isEmpty()) {
            return new Usuario();
        } else {
            return usuarios.get(0);
        }
    }
	
	public Usuario doLogin(String usuario, String senha) {
		return usuarioRepository.findByUsuarioAndSenha(usuario, senha);
	}
}