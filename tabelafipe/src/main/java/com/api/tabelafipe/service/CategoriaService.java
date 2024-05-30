package com.api.tabelafipe.service;


import com.api.tabelafipe.model.CategoriaModel;
import com.api.tabelafipe.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void criarCategoria(String nomeCategoria){
        CategoriaModel categoria = new CategoriaModel(nomeCategoria);
        categoriaRepository.save(categoria);
    }

    public List<CategoriaModel> buscarCategoria(){
        return categoriaRepository.findAll();
    }

}
