/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Victor
 */
@Path("alunos")
public class AlunosService {
    
    
    private final JsonBuilderFactory factory;

    public AlunosService() {
        factory = Json.createBuilderFactory(null);
    }

    @GET
    @Path("alunostodos")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Alunos> findAll() {
        JPAalunosDAO dao = new JPAalunosDAO();
        return dao.searchAll();
    }
}
