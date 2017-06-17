
package com.jetsky.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bratc
 */
@Entity
@Table(name = "tipo_clientes")
@XmlRootElement
public class TipoClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "tipo")
    private String tipo;
   
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idTipoCliente")
    private List<Alquileres> alquileresList;

    public TipoClientes() {
    }

    public TipoClientes(String id) {
        this.id = id;
    }

    public TipoClientes(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient

    public List<Alquileres> getAlquileresList() {
        return alquileresList;
    }

    public void setAlquileresList(List<Alquileres> alquileresList) {
        this.alquileresList = alquileresList;
    }
    

    
}
