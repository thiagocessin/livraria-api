package br.com.domain.livraria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.domain.livraria.entity.Livro;

public interface LivrariaRepository extends JpaRepository<Livro, Long>{
	
	List<Livro> findAllByTituloLike(String titulo);
	
	@Query("select l from livro l where l.titulo like :titulo")
	List<Livro> buscarLivroPorTitulo(String titulo);
	

}
