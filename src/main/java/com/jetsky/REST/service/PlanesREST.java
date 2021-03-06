/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetsky.REST.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jetsky.jpa.entities.Planes;
import com.jetsky.jpa.sessions.PlanesFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author bratc
 */
@Stateless
@Path("planes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PlanesREST {

   
    @EJB
    private PlanesFacade planesEJB;
   
    /**
     * Obtiene todos los alquileres
     *
     * @return lista de alquileres
     */
    @GET
   // @RolesAllowed({"ADMIN"})
    public List<Planes> findAll() {
        return planesEJB.findAll();
    }
    
    @POST
    public Response create(Planes planes) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try{
            planesEJB.create(planes);
            return Response.status(Response.Status.CREATED).entity(gson.toJson("El alquiler se ha creado satisfactoriamente!")).build();
        }catch (Exception e) {
            Logger.getLogger(AlquileresREST.class.getName()).log(Level.SEVERE, null, e);
            return Response.status(Response.Status.BAD_REQUEST).entity(gson.toJson("Error al guardar el alquiler!.")).build();
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
    public Planes findById(@PathParam("id") Integer id) {
        return planesEJB.find(id);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Planes planes){
        planesEJB.edit(planes);
    }
    
}
