package com.jetsky.jpa.entities;

import com.jetsky.jpa.entities.Alquileres;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-19T18:43:35")
@StaticMetamodel(Planes.class)
public class Planes_ { 

    public static volatile SingularAttribute<Planes, String> descripcion;
    public static volatile SingularAttribute<Planes, Integer> porcentajeDescuento;
    public static volatile ListAttribute<Planes, Alquileres> alquileresList;
    public static volatile SingularAttribute<Planes, BigDecimal> valor;
    public static volatile SingularAttribute<Planes, String> nombrePlan;
    public static volatile SingularAttribute<Planes, Integer> duracion;
    public static volatile SingularAttribute<Planes, Integer> id;

}