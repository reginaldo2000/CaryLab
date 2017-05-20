
package br.com.cary.bean;

import br.com.cary.control.ExameControl;
import br.com.cary.entity.Exame;
import br.com.cary.entity.ExameComposicao;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class ExameBean {
    
    private Exame exame;
    private ExameComposicao item;
    private ExameControl ec;

    public ExameBean() {
        exame = new Exame();
        item = new ExameComposicao();
        ec = new ExameControl();
    }
    
    public void salvarExame() throws CampoVazioException {
        ec.salvarExame(exame);
    }
    
    public void salvarItem() {
        ec.salvarItem(item);
    }
    
    public void novoItem() {
        item = new ExameComposicao();
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public ExameComposicao getItem() {
        return item;
    }

    public void setItem(ExameComposicao item) {
        this.item = item;
    }
    
    
    
    
}
