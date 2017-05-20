/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.entity.TabelaPreco;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class TabelaPrecoDAO extends GenericDAO {
    
    public static TabelaPrecoDAO getInstance() {
        return new TabelaPrecoDAO();
    }
    
    public List<TabelaPreco> listar(String nome) throws Exception{
        Session s = ConectaDB.getSessionFactory().openSession();
        Criteria c = s.createCriteria(TabelaPreco.class);
        c.add(Restrictions.like("nomeTabela", nome+"%"));
        return c.list();
    }
}
