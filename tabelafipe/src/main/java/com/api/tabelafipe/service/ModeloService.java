package com.api.tabelafipe.service;

import com.api.tabelafipe.model.MarcaModel;
import com.api.tabelafipe.model.ModeloModel;
import com.api.tabelafipe.repository.MarcaRepository;
import com.api.tabelafipe.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    public void criarNovoModelo(String nome, Long idMarca){
        Optional<MarcaModel> marcaModel = marcaRepository.findById(idMarca);
        ModeloModel modeloModel = new ModeloModel(nome, marcaModel.get());
        modeloRepository.save(modeloModel);
    }

    public List<ModeloModel> buscarListaDeModelos(){
        return modeloRepository.findAll();
    }

    public List<ModeloModel> buscarListaDeModelosPorMarca(Long idMarca) {
        return modeloRepository.findByMarcaModelId(idMarca);
    }



}
