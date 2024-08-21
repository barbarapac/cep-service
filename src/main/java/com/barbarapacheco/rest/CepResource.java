package com.barbarapacheco.rest;

import com.barbarapacheco.cepservice.CepService;
import com.barbarapacheco.model.Endereco;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cep")
public class CepResource {

    @Inject 
    @Named("ViaCepService")
    CepService cepService;
    
    @GET
    @Path("{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") String cep) {        
        return cepService.buscaEndereco(cep);
    }    
}
