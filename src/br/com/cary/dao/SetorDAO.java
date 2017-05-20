/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.entity.Setor;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Reginaldo
 */
public class SetorDAO extends GenericDAO {

    public static SetorDAO getInstance() {
        return new SetorDAO();
    }

    public Setor verificaSetor() {
        Session s = ConectaDB.getSessionFactory().openSession();
        try {
            Criteria c = s.createCriteria(Setor.class);
            c.setMaxResults(1);
            if (c.list().size() != 0) {
                return (Setor) c.uniqueResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
        return null;
    }
}
