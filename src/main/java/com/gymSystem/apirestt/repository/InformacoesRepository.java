package com.gymSystem.apirestt.repository;

import com.google.common.base.Predicate;
import com.gymSystem.apirestt.models.Informacoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InformacoesRepository extends JpaRepository<Informacoes, Long> {

    List<Informacoes> Findall();
    Informacoes FindById( long id );






}
