/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.viusolucoes.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CARLOS CLAYTON
 */
@Entity
@Table(name = "categorias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorias.findAll", query = "SELECT c FROM Categorias c"),
    @NamedQuery(name = "Categorias.findByCodcat", query = "SELECT c FROM Categorias c WHERE c.codcat = :codcat"),
    @NamedQuery(name = "Categorias.findByNomecat", query = "SELECT c FROM Categorias c WHERE c.nomecat = :nomecat")})
public class Categorias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codcat")
    private Integer codcat;
    @Basic(optional = false)
    @Column(name = "nomecat")
    private String nomecat;

    public Categorias() {
    }

    public Categorias(Integer codcat) {
        this.codcat = codcat;
    }

    public Categorias(Integer codcat, String nomecat) {
        this.codcat = codcat;
        this.nomecat = nomecat;
    }

    public Integer getCodcat() {
        return codcat;
    }

    public void setCodcat(Integer codcat) {
        this.codcat = codcat;
    }

    public String getNomecat() {
        return nomecat;
    }

    public void setNomecat(String nomecat) {
        this.nomecat = nomecat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcat != null ? codcat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias)) {
            return false;
        }
        Categorias other = (Categorias) object;
        if ((this.codcat == null && other.codcat != null) || (this.codcat != null && !this.codcat.equals(other.codcat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.viusolucoes.model.Categorias[ codcat=" + codcat + " ]";
    }
    
}
