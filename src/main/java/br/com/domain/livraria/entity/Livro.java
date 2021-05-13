package br.com.domain.livraria.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.domain.livraria.dto.LivroDTO;

@Entity
@Table(name = "TB_LIVRO")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String titulo;
	@Column
	private Integer qtdePaginas;
	@Column
	private String isbn;
	@Column
	private BigDecimal preco;
	@Column
	private ZonedDateTime dataLancamento;
	@Column
	private String autor;
	
	public LivroDTO toDto() {
		LivroDTO livroDto = new LivroDTO();
		livroDto.setId(id);
		livroDto.setTitulo(titulo);
		livroDto.setQtdePaginas(qtdePaginas);
		livroDto.setIsbn(isbn);
		livroDto.setPreco(preco);
		livroDto.setDataLancamento(dataLancamento);
		livroDto.setAutor(autor);
		
		return livroDto;
		
	}
	
	public Livro() {
	}


	public Livro(String titulo) {
		this.titulo = titulo;
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
