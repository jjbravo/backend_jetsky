/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetsky.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bratc
 */

@Entity
@Table(name = "alquileres")
@XmlRootElement
public class Alquileres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres_cliente")
    private String nombresCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;  
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_plan")
    private Integer cantidadPlan;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_pagar")
    private BigDecimal totalPagar;
 
    @Basic(optional = true)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
     @JoinColumn(name="id_empleado",referencedColumnName="id")
     @ManyToOne(optional = false)
     private Usuarios idEmpleado;
     
    @JoinColumn(name="id_tipo_cliente",referencedColumnName="id")
     @ManyToOne(optional = false)
     private TipoClientes idTipoCliente; 
    
    @JoinColumn(name="id_plan",referencedColumnName="id")
     @ManyToOne(optional = false)
     private Planes idPlan;
    
    @JoinColumn(name="id_moto",referencedColumnName="id")
     @ManyToOne(optional = false)
     private MotosAcuaticas idMotoAcuatica;
    
    @Transient
    SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
    
    public Alquileres(Integer id, String nombresCliente, String apellidosCliente, Integer cantidadPlan, BigDecimal totalPagar, Date fecha, Usuarios idEmpleado, TipoClientes idTipoCliente, Planes idPlan, MotosAcuaticas idMotoAcuatica) {
        this.id = id;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.cantidadPlan = cantidadPlan;
        this.totalPagar = totalPagar;
        this.fecha = fecha;
        this.idEmpleado = idEmpleado;
        this.idTipoCliente = idTipoCliente;
        this.idPlan = idPlan;
        this.idMotoAcuatica = idMotoAcuatica;
    }

    public Alquileres() {
    }

    public Alquileres(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Integer getCantidadPlan() {
        return cantidadPlan;
    }

    public void setCantidadPlan(Integer cantidadPlan) {
        this.cantidadPlan = cantidadPlan;
    }

    public BigDecimal getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(BigDecimal totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getFecha() {
        return date.format(fecha);
    }

    public void setFecha(String fecha) {
        this.fecha = new Date();
    }

    public Usuarios getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Usuarios idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public TipoClientes getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(TipoClientes idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public Planes getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Planes idPlan) {
        this.idPlan = idPlan;
    }

    public MotosAcuaticas getIdMotoAcuatica() {
        return idMotoAcuatica;
    }

    public void setIdMotoAcuatica(MotosAcuaticas idMotoAcuatica) {
        this.idMotoAcuatica = idMotoAcuatica;
    }
    
}
    
