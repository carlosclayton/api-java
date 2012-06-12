/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.viusolucoes.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author CARLOS CLAYTON
 */
@Embeddable
public class LivrosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codlivro")
    private String codlivro;
    @Basic(optional = false)
    @Column(name = "categorias_codcat")
    private int categoriasCodcat;

    public LivrosPK() {
    }

    public LivrosPK(String codlivro, int categoriasCodcat) {
        this.codlivro = codlivro;
        this.categoriasCodcat = categoriasCodcat;
    }

    public String getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(String codlivro) {
        this.codlivro = codlivro;
    }

    public int getCategoriasCodcat() {
        return categoriasCodcat;
    }

    public void setCategoriasCodcat(int categoriasCodcat) {
        this.categoriasCodcat = categoriasCodcat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codlivro != null ? codlivro.hashCode() : 0);
        hash += (int) categoriasCodcat;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LivrosPK)) {
            return false;
        }
        LivrosPK other = (LivrosPK) object;
        if ((this.codlivro == null && other.codlivro != null) || (this.codlivro != null && !this.codlivro.equals(other.codlivro))) {
            return false;
        }
        if (this.categoriasCodcat != other.categoriasCodcat) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.viusolucoes.model.LivrosPK[ codlivro=" + codlivro + ", categoriasCodcat=" + categoriasCodcat + " ]";
    }
    
}
