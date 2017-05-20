package br.com.cary.dao;

import br.com.cary.entity.Funcionario;
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
public class FuncionarioDAO extends GenericDAO {

    public static FuncionarioDAO getInstance() {
        return new FuncionarioDAO();
    }

    public List<Funcionario> listar(String nome) {
        Session s = null;
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Funcionario.class);
            c.add(Restrictions.like("nome", nome + "%"));
            return c.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
