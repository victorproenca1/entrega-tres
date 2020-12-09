/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
/**
 *
 * @author Victor
 */
public class AlunosDAO {
    void save(Alunos a);

    Alunos retrieve(int id);

    List<Alunos> searchAll();
}
