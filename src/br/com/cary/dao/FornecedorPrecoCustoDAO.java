/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.entity.FornecedorPrecoCusto;
import br.com.cary.entity.Produto;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import cary.utility.Alertas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class FornecedorPrecoCustoDAO extends GenericDAO {
    
    public static FornecedorPrecoCustoDAO getInstance(){
        return new FornecedorPrecoCustoDAO();
    }
    
    public FornecedorPrecoCusto verificaSeExiste(FornecedorPrecoCusto pr) {
        Session s = ConectaDB.getSessionFactory().openSession();
        try {
            Criteria c = s.createCriteria(FornecedorPrecoCusto.class);
            c.add(Restrictions.eq("fornecedor", pr.getFornecedor())).add(Restrictions.eq("produto", pr.getProduto()));
            if(c.list().size() != 0) {
                return (FornecedorPrecoCusto) c.uniqueResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
        return null;
    }
    
    public List listar(Produto p) {
        List lista = null;
        Session s = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria crit = s.createCriteria(FornecedorPrecoCusto.class);
            crit.add(Restrictions.eq("produto", p));
            crit.addOrder(Order.asc("preco"));
            lista = crit.list();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar salvar os dados!");
        } finally {
            s.close();
        }
        return lista;
    }
    
}
