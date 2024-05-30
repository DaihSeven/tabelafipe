package com.api.tabelafipe.controller;


import com.api.tabelafipe.model.CategoriaModel;
import com.api.tabelafipe.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public void criarCategorias(@RequestBody String nomeCategoria){
        categoriaService.criarCategoria(nomeCategoria);
    }

    @GetMapping
    public List<CategoriaModel> buscarCategoria(){
        return categoriaService.buscarCategoria();
    }
}
