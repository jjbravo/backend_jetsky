/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetsky.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "planes")
@XmlRootElement
public class Planes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_plan")
    private String nombrePlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion")
    private String descripcion;  
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    private Integer duracion;
 
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "valor")
    private BigDecimal valor;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentaje_descuento")
    private Integer porcentajeDescuento;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idPlan")
    private List<Alquileres> alquileresList;

    public Planes() {
    }

    public Planes(Integer id) {
        this.id = id;
    }

    public Planes(Integer id, String nombrePlan, String descripcion, Integer duracion, BigDecimal valor, Integer porcentajeDescuento) {
        this.id = id;
        this.nombrePlan = nombrePlan;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.valor = valor;
        this.porcentajeDescuento = porcentajeDescuento;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Integer porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @XmlTransient
    public List<Alquileres> getAlquileresList() {
        return alquileresList;
    }

    public void setAlquileresList(List<Alquileres> alquileresList) {
        this.alquileresList = alquileresList;
    }
    
    
}
    
