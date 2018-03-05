package br.com.fiap.passageiroapi.android29scj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.passageiroapi.android29scj.model.Usuario;
import br.com.fiap.passageiroapi.android29scj.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	public UsuarioService usuarioService;

	@GetMapping
	List<Usuario> buscarTodos() {
		return usuarioService.findAll();
	}

	@GetMapping("/nomeUsuario/{nomeUsuario}")
	List<Usuario> buscarUsuarioPeloNome(@PathVariable(value = "nomeUsuario") String nomeUsuario) {
		return usuarioService.findByUsuario(nomeUsuario);
	}

	@PostMapping("/login")
	public Usuario realizaLogin(@RequestBody Usuario usuaeio) {
		return usuarioService.doLogin(usuaeio.getUsuario(), usuaeio.getSenha());
	}

	@PostMapping
	public void salvarUsuario(@RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
	}

	@DeleteMapping("/apagar/{id}")
	public void apagarUsuario(@PathVariable(value = "id") String id) {
		usuarioService.delete(id);
	}
}