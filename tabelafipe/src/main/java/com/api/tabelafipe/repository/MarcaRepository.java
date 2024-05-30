package com.api.tabelafipe.repository;

import com.api.tabelafipe.model.MarcaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<MarcaModel, Long> {

    List<MarcaModel> findByCategoriaModelId(Long idCategoriaModel);

}
