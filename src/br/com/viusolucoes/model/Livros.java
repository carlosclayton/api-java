/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.viusolucoes.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CARLOS CLAYTON
 */
@Entity
@Table(name = "livros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livros.findAll", query = "SELECT l FROM Livros l"),
    @NamedQuery(name = "Livros.findByCodlivro", query = "SELECT l FROM Livros l WHERE l.livrosPK.codlivro = :codlivro"),
    @NamedQuery(name = "Livros.findByTitulo", query = "SELECT l FROM Livros l WHERE l.titulo = :titulo"),
    @NamedQuery(name = "Livros.findByAutor", query = "SELECT l FROM Livros l WHERE l.autor = :autor"),
    @NamedQuery(name = "Livros.findByNpaginas", query = "SELECT l FROM Livros l WHERE l.npaginas = :npaginas"),
    @NamedQuery(name = "Livros.findByFormato", query = "SELECT l FROM Livros l WHERE l.formato = :formato"),
    @NamedQuery(name = "Livros.findByPreco", query = "SELECT l FROM Livros l WHERE l.preco = :preco"),
    @NamedQuery(name = "Livros.findByDtlanc", query = "SELECT l FROM Livros l WHERE l.dtlanc = :dtlanc"),
    @NamedQuery(name = "Livros.findByCapa", query = "SELECT l FROM Livros l WHERE l.capa = :capa"),
    @NamedQuery(name = "Livros.findByMaisvend", query = "SELECT l FROM Livros l WHERE l.maisvend = :maisvend"),
    @NamedQuery(name = "Livros.findByCategoriasCodcat", query = "SELECT l FROM Livros l WHERE l.livrosPK.categoriasCodcat = :categoriasCodcat")})
public class Livros implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LivrosPK livrosPK;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "autor")
    private String autor;
    @Column(name = "npaginas")
    private Integer npaginas;
    @Column(name = "formato")
    private String formato;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Float preco;
    @Lob
    @Column(name = "resenha")
    private String resenha;
    @Column(name = "dtlanc")
    @Temporal(TemporalType.DATE)
    private Date dtlanc;
    @Column(name = "capa")
    private String capa;
    @Column(name = "maisvend")
    private Character maisvend;

    public Livros() {
    }

    public Livros(LivrosPK livrosPK) {
        this.livrosPK = livrosPK;
    }

    public Livros(LivrosPK livrosPK, String titulo, String autor) {
        this.livrosPK = livrosPK;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livros(String codlivro, int categoriasCodcat) {
        this.livrosPK = new LivrosPK(codlivro, categoriasCodcat);
    }

    public LivrosPK getLivrosPK() {
        return livrosPK;
    }

    public void setLivrosPK(LivrosPK livrosPK) {
        this.livrosPK = livrosPK;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(Integer npaginas) {
        this.npaginas = npaginas;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public Date getDtlanc() {
        return dtlanc;
    }

    public void setDtlanc(Date dtlanc) {
        this.dtlanc = dtlanc;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public Character getMaisvend() {
        return maisvend;
    }

    public void setMaisvend(Character maisvend) {
        this.maisvend = maisvend;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (livrosPK != null ? livrosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livros)) {
            return false;
        }
        Livros other = (Livros) object;
        if ((this.livrosPK == null && other.livrosPK != null) || (this.livrosPK != null && !this.livrosPK.equals(other.livrosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.viusolucoes.model.Livros[ livrosPK=" + livrosPK + " ]";
    }
    
}
