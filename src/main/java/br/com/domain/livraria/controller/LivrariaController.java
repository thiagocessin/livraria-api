package br.com.domain.livraria.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.domain.livraria.dto.LivroDTO;
import br.com.domain.livraria.dto.NovoLivroDTO;
import br.com.domain.livraria.dto.NovoPrecoDTO;
import br.com.domain.livraria.service.LivrariaService;

@RestController
@RequestMapping("livros")
public class LivrariaController {
	
	//@Autowired//instancia desse atributo é gerenciada pelo spring
	//spring recomenda que seja injetado pelo construtor, auxiliando no teste
	private LivrariaService livrariaService;
		
	
	public LivrariaController(LivrariaService livrariaService) {
		this.livrariaService = livrariaService;
	}
	
	
	
	@GetMapping
	public List<LivroDTO> getLivros(@RequestParam String titulo){
		return livrariaService.listarLivros(titulo);
	}
	
	@GetMapping("{id}")
	public LivroDTO getLivroById(
			@PathVariable(name = "id") Long id) {
		return livrariaService.buscarLivroPorId(id);
	}
	
	/*
	public LivroDTO buscarLivroPorISBN(String isbn) {
		
		return livroDTOList.stream()
				.filter(dto-> dto.getIsbn().equals(isbn))
				.findFirst()
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}*/
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public LivroDTO createLivro(@RequestBody LivroDTO livroDTO) {
		return livrariaService.saveOrUpdate(livroDTO);
				
	}
	
	@PutMapping("{id}")
	public LivroDTO updateLivro(
			@RequestBody NovoLivroDTO novoLivro,
			@PathVariable Long id) {
		return livrariaService.atualizar(id, novoLivro);
		
	}
	
	
	@PatchMapping("{id}")
	public LivroDTO updatePrecoLivro(
			@RequestBody NovoPrecoDTO novoPreco,
			@PathVariable Long id) {
		
		return livrariaService.atualizarPreco(id, novoPreco);
		
	}
	
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteLivro(
			@PathVariable Long id) {
		
		livrariaService.deletarLivro(id);
	}
	

}
