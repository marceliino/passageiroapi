package br.com.fiap.passageiroapi.android29scj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.passageiroapi.android29scj.model.Passageiro;
import br.com.fiap.passageiroapi.android29scj.service.PassageiroService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/passageiro")
public class PassageiroController {

    @Autowired
    private PassageiroService passageiroService;

    @GetMapping
    private List<Passageiro> findAll() {
        return passageiroService.findAll();
    }

    @GetMapping(value = "/nome/{nome}")
    private Passageiro findAll(@PathVariable(value = "nome") String nome) {
        return passageiroService.pesquisarNomePassageiro(nome);
    }

    @PostMapping
    private void save(@RequestBody Passageiro passageiro) {
        passageiroService.salvar(passageiro);
    }

    @DeleteMapping
    private void deleteAll() {
        passageiroService.deleteAll();
    }
}