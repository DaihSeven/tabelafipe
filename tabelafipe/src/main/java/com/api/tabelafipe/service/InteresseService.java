package com.api.tabelafipe.service;


import com.api.tabelafipe.model.InteresseModel;
import com.api.tabelafipe.repository.InteresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteresseService {

    @Autowired
    private InteresseRepository repository;

    public void criarNovoInteresse(String nome){
        InteresseModel interesseModel = new InteresseModel(nome);
        repository.save(interesseModel);
    }

    public List<InteresseModel> buscarListaDeInteresses(){
        return repository.findAll();
    }

}
