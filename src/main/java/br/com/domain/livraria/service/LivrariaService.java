package br.com.domain.livraria.service;

import java.util.List;

import br.com.domain.livraria.dto.LivroDTO;
import br.com.domain.livraria.dto.NovoLivroDTO;
import br.com.domain.livraria.dto.NovoPrecoDTO;

public interface LivrariaService {
	
	List<LivroDTO> listarLivros(String titulo);
	LivroDTO buscarLivroPorId(Long id);
	LivroDTO criar(NovoLivroDTO novoLivroDTO);
	LivroDTO atualizar(Long id, NovoLivroDTO novoLivroDTO);
	LivroDTO atualizarPreco(Long id, NovoPrecoDTO novoPrecoDTO);
	void deletarLivro(Long id);
	

	
	
	

}
