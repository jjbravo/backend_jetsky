package com.jetsky.jpa.entities;

import com.jetsky.jpa.entities.Alquileres;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-19T18:43:35")
@StaticMetamodel(MotosAcuaticas.class)
public class MotosAcuaticas_ { 

    public static volatile SingularAttribute<MotosAcuaticas, String> descripcion;
    public static volatile SingularAttribute<MotosAcuaticas, String> marca;
    public static volatile SingularAttribute<MotosAcuaticas, String> color;
    public static volatile ListAttribute<MotosAcuaticas, Alquileres> alquileresList;
    public static volatile SingularAttribute<MotosAcuaticas, Integer> id;
    public static volatile SingularAttribute<MotosAcuaticas, Integer> modelo;

}