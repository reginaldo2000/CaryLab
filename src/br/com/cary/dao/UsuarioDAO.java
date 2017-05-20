/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.entity.Usuario;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import cary.utility.Alertas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class UsuarioDAO extends GenericDAO {

    private UsuarioDAO instance;
    private Session s;
    
    public static UsuarioDAO getInstance() {
        return new UsuarioDAO();
    }

    public boolean autenticar(Usuario u) {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Usuario.class);
            c.add(Restrictions.eq("nomeUsuario", u.getNomeUsuario())).add(Restrictions.eq("senha", u.getSenha()));
            if(c.list().size() > 0) {
                return true;
            }
        } catch (Exception e) {
            Alertas.mensagemErro("Erro na autenticação!\n"+e.getMessage());
            e.printStackTrace();
        } finally {
            s.close();
        }
        return false;
    }
    
    public List<Usuario> listar(String nomeUsuario) {
        List<Usuario> lista = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria crit = s.createCriteria(Usuario.class);
            crit.add(Restrictions.like("nomeUsuario", nomeUsuario+"%"));
            lista = crit.list();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nErro ao tentar consultar os dados!");
        } finally {
            s.close();
        }
        return lista;
    }
    
    
}
