package com.example.Base.controller;

import com.example.Base.entity.Projeto;
import com.example.Base.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService service;

    @PostMapping
    public Projeto salvar(@RequestBody Projeto projeto) {
        return service.salvar(projeto);
    }

    @GetMapping
    public List<Projeto> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Projeto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}