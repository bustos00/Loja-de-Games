package com.lojagames.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lojagames.lojaGames.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
