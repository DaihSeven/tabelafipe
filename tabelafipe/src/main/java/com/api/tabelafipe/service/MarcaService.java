package com.api.tabelafipe.service;

import com.api.tabelafipe.model.CategoriaModel;
import com.api.tabelafipe.model.InteresseModel;
import com.api.tabelafipe.model.MarcaModel;
import com.api.tabelafipe.repository.CategoriaRepository;
import com.api.tabelafipe.repository.InteresseRepository;
import com.api.tabelafipe.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void criarNovaMarca(String nome, Long idCategoria){
        Optional<CategoriaModel> categoriaModel = categoriaRepository.findById(idCategoria);
        MarcaModel marcaModel = new MarcaModel(nome, categoriaModel.get());
        marcaRepository.save(marcaModel);
    }

    public List<MarcaModel> buscarListaDeMarcas(){
        return marcaRepository.findAll();
    }

    public List<MarcaModel> buscarListaDeMarcasPorCategoria(Long idCategoria){
        return marcaRepository.findByCategoriaModelId(idCategoria);
    }



}
