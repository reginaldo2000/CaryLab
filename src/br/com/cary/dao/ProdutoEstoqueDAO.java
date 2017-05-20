/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.entity.Produto;
import br.com.cary.entity.ProdutoEstoque;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import cary.utility.Alertas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class ProdutoEstoqueDAO extends GenericDAO {

    public static ProdutoEstoqueDAO getInstance() {
        return new ProdutoEstoqueDAO();
    }

    public void atualizarEstoque(ProdutoEstoque pe) {
        Session s = ConectaDB.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            Query q = s.createQuery("update ProdutoEstoque set quantidade = quantidade + :qtde where produto = :prod and setor = :setor")
                    .setParameter("qtde", pe.getQuantidade())
                    .setParameter("prod", pe.getProduto())
                    .setParameter("setor", pe.getSetor());
            q.executeUpdate();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
    }
    
    public ProdutoEstoque verificaSeExiste(ProdutoEstoque prod) {
        Session s = ConectaDB.getSessionFactory().openSession();
        try {
            Criteria c = s.createCriteria(ProdutoEstoque.class);
            c.add(Restrictions.eq("produto", prod.getProduto()))
                    .add(Restrictions.eq("setor", prod.getSetor()));
            if(c.list().size() != 0) {
                return (ProdutoEstoque) c.uniqueResult();
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
            Criteria crit = s.createCriteria(ProdutoEstoque.class);
            crit.add(Restrictions.eq("produto", p));
            lista = crit.list();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar salvar os dados!");
        } finally {
            s.close();
        }
        return lista;
    }
}
