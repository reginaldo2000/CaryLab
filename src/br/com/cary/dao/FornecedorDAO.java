/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.entity.Fornecedor;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class FornecedorDAO extends GenericDAO {
    
    public static FornecedorDAO getInstance() {
        return new FornecedorDAO();
    }
    
    public List<Fornecedor> listar(String nome){
        Session s = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Fornecedor.class);
            c.add(Restrictions.like("nomeFantasia", nome + "%"));
            return c.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Fornecedor pesquisar(Fornecedor forn) {
        Session s = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Fornecedor.class);
            c.addOrder(Order.asc("nomeFantasia"));
            if(c.uniqueResult() != null) {
                return (Fornecedor) c.uniqueResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Fornecedor> listarOrdenadoPorNomeFantasia() {
        Session s = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Fornecedor.class);
            c.addOrder(Order.asc("nomeFantasia"));
            return c.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
