package br.com.fiap.passageiroapi.android29scj.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.passageiroapi.android29scj.model.Passageiro;

@Repository
public interface PassageiroRepository extends MongoRepository<Passageiro, String>{
	Passageiro findById(String id);
	List<Passageiro> findByNome(final String nome);
}