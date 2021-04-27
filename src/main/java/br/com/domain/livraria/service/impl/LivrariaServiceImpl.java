package br.com.domain.livraria.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.domain.livraria.dto.LivroDTO;
import br.com.domain.livraria.dto.NovoLivroDTO;
import br.com.domain.livraria.dto.NovoPrecoDTO;
import br.com.domain.livraria.entity.Livro;
import br.com.domain.livraria.repository.LivrariaRepository;
import br.com.domain.livraria.service.LivrariaService;

@Service
public class LivrariaServiceImpl implements LivrariaService {

	private LivrariaRepository livrariaRepository;
	
	public LivrariaServiceImpl(LivrariaRepository livrariaRepository) {
		this.livrariaRepository = livrariaRepository;
	}
	
	
	@Override
	public List<LivroDTO> listarLivros(String titulo) {
		
		List<Livro> livrosList;
		
		//= Arrays.asList(new Livro("Java"), new Livro("Angular"));
		
		if(titulo.isEmpty()) {
			livrosList = livrariaRepository.findAll();
		}else {
			livrosList = livrariaRepository.findAllByTituloLike(titulo);
		}
		
		return livrosList
				.stream()
				.map(l->new LivroDTO())
				.collect(Collectors.toList());
					
	}

	@Override
	public LivroDTO buscarLivroPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LivroDTO criar(NovoLivroDTO novoLivroDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LivroDTO atualizar(Long id, NovoLivroDTO novoLivroDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LivroDTO atualizarPreco(Long id, NovoPrecoDTO novoPrecoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletarLivro(Long id) {
		// TODO Auto-generated method stub

	}

}
