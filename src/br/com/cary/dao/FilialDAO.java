
package br.com.cary.dao;

import br.com.cary.entity.Filial;
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
public class FilialDAO extends GenericDAO {
    
    public static FilialDAO getInstance() {
        return new FilialDAO();
    }
    
    public List<Filial> listar(String nome) {
        List<Filial> lista = null;
        Session s = ConectaDB.getSessionFactory().openSession();
        try {
            Criteria c = s.createCriteria(Filial.class);
            c.add(Restrictions.like("nomeFilial", nome+"%"));
            lista = c.list();
        } catch (Exception e) {
            Alertas.mensagemErro("erro ao listar os dados!\n"+e.getMessage());
        }
        return lista;
    }
}
