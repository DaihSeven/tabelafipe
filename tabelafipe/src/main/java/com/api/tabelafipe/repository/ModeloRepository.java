package com.api.tabelafipe.repository;

import com.api.tabelafipe.model.ModeloModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeloRepository extends JpaRepository<ModeloModel, Long> {

    List<ModeloModel> findByMarcaModelId(Long idMarca);

}
