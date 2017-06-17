package com.jetsky.jpa.entities;

import com.jetsky.jpa.entities.MotosAcuaticas;
import com.jetsky.jpa.entities.Planes;
import com.jetsky.jpa.entities.TipoClientes;
import com.jetsky.jpa.entities.Usuarios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-16T22:17:13")
@StaticMetamodel(Alquileres.class)
public class Alquileres_ { 

    public static volatile SingularAttribute<Alquileres, Planes> idPlan;
    public static volatile SingularAttribute<Alquileres, Date> fecha;
    public static volatile SingularAttribute<Alquileres, MotosAcuaticas> idMotoAcuatica;
    public static volatile SingularAttribute<Alquileres, String> apellidosCliente;
    public static volatile SingularAttribute<Alquileres, Usuarios> idUsuario;
    public static volatile SingularAttribute<Alquileres, Integer> cantidadPlan;
    public static volatile SingularAttribute<Alquileres, TipoClientes> idTipoCliente;
    public static volatile SingularAttribute<Alquileres, Integer> id;
    public static volatile SingularAttribute<Alquileres, String> nombresCliente;
    public static volatile SingularAttribute<Alquileres, BigDecimal> totalPagar;

}