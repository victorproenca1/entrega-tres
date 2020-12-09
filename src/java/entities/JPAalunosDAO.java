/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author viter
 */
public class JPAalunosDAO {
    
    private EntityManager em;
    
    public JPAalunosDAO() {
    }
    
    public List<Alunos> searchAll() {
        String jpqlQuery = "SELECT a FROM Alunos a";
        em = JPAUtil.getEM();
        Query query = em.createQuery(jpqlQuery);
        List<Alunos> e = query.getResultList();
        em.close();
        return e;
    }
    
}