
package br.com.cary.dao;

import br.com.cary.entity.Transportador;
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
public class TransportadorDAO extends GenericDAO {

    public static TransportadorDAO getInstance() {
        return new TransportadorDAO();
    }
    
    public List<Transportador> listar(String nome) {
        Session s = ConectaDB.getSessionFactory().openSession();
        Criteria c = s.createCriteria(Transportador.class);
        c.add(Restrictions.like("nome", nome+"%"));
        return c.list();
    }
}
