
package br.com.cary.util;

import cary.utility.Alertas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Reginaldo
 */
public class GenericDAO {
    
    private Session s;
    
    public void salvar(Object obj) {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            s.beginTransaction();
            s.persist(obj);
            s.getTransaction().commit();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar salvar os dados!");
            e.printStackTrace();
        } finally {
            s.close();
        }
    }
    
    public void atualizar(Object obj) {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            s.beginTransaction();
            s.update(obj);
            s.getTransaction().commit();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar editar os dados!");
        } finally {
            s.close();
        }
    }
    
    public void excluir(Object obj) {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            s.beginTransaction();
            s.delete(obj);
            s.getTransaction().commit();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar excluir os dados!");
        } finally {
            s.close();
        }
    }
    
    public List listar(Object obj) {
        List lista = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria crit = s.createCriteria(obj.getClass());
            lista = crit.list();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar salvar os dados!");
        } finally {
            s.close();
        }
        return lista;
    }
}
