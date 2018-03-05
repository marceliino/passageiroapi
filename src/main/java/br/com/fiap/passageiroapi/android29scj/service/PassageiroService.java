package br.com.fiap.passageiroapi.android29scj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.passageiroapi.android29scj.model.Passageiro;
import br.com.fiap.passageiroapi.android29scj.model.Usuario;
import br.com.fiap.passageiroapi.android29scj.repository.PassageiroRepository;

@Service
public class PassageiroService {

    @Autowired
    PassageiroRepository passageiroRepository;

    public Passageiro salvar(Passageiro passageiro) {
        List<Passageiro> passageiros = passageiroRepository.findByNome(passageiro.getNome());
        if (passageiros.size() > 0) {
            passageiro.setId(passageiros.get(0).getId());
        }
        return passageiroRepository.save(passageiro);
    }
    
    public Passageiro findById(String id) {
        return passageiroRepository.findById(id);
    }

    public List<Passageiro> findAll() {
        return passageiroRepository.findAll();
    }
    
    public void delete(String id) {
    	Passageiro passageiro = passageiroRepository.findById(id);
		if(passageiro != null) {
			passageiroRepository.delete(passageiro);
		}
	}
    
    public Passageiro pesquisarNomePassageiro(String nome) {
        List<Passageiro> passageiros = passageiroRepository.findByNome(nome);
        if (passageiros.isEmpty()) {
            return new Passageiro();
        } else {
            return passageiros.get(0);
        }
    }

    public void deleteAll() {
        passageiroRepository.deleteAll();
    }
}