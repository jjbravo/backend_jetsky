/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetsky.REST.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jetsky.jpa.entities.MotosAcuaticas;
import com.jetsky.jpa.sessions.MotosAcuaticasFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author bratc
 */
@Stateless
@Path("motos_acuaticas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class MotosAcuaticasREST {

   
    @EJB
    private MotosAcuaticasFacade motosAcuaticasEJB;
   
    /**
     * Obtiene todos los alquileres
     *
     * @return lista de alquileres
     */
    @GET
   // @RolesAllowed({"ADMIN"})
    public List<MotosAcuaticas> findAll() {
        return motosAcuaticasEJB.findAll();
    }
    
    @POST
    public Response create(MotosAcuaticas motos) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try{
            motosAcuaticasEJB.create(motos);
            return Response.status(Response.Status.CREATED).entity(gson.toJson("La moto se ha creado satisfactoriamente!")).build();
        }catch (Exception e) {
            Logger.getLogger(AlquileresREST.class.getName()).log(Level.SEVERE, null, e);
            return Response.status(Response.Status.BAD_REQUEST).entity(gson.toJson("Error al guardar la moto acuatica!.")).build();
        }
       
    }

     /**
     * Busca alquiler por su id
     *
     * @param id
     * @return alquiler
     */
    @GET
    @Path("{id}")
    public MotosAcuaticas findById(@PathParam("id") Integer id) {
        return motosAcuaticasEJB.find(id);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, MotosAcuaticas moto){
        motosAcuaticasEJB.edit(moto);
    }
    
}
