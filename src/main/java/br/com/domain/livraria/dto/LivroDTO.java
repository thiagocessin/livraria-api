package br.com.domain.livraria.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import br.com.domain.livraria.entity.Livro;

public class LivroDTO {
	

	private Long id;
	private String titulo;
	private Integer qtdePaginas;
	private String isbn;
	private BigDecimal preco;
	private ZonedDateTime dataLancamento;
	private String autor;
	
	public Livro toEntity() {
		Livro entity = new Livro();
		entity.setId(id);
		entity.setTitulo(titulo);
		entity.setQtdePaginas(qtdePaginas);
		entity.setIsbn(isbn);
		entity.setPreco(preco);
		entity.setDataLancamento(dataLancamento);
		entity.setAutor(autor);
		
		return entity;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getQtdePaginas() {
		return qtdePaginas;
	}
	public void setQtdePaginas(Integer qtdePaginas) {
		this.qtdePaginas = qtdePaginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public ZonedDateTime getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(ZonedDateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	

}
