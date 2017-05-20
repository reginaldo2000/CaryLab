
package br.com.cary.bean;

import br.com.cary.control.FinanceiroControl;
import br.com.cary.entity.Financeiro;

/**
 *
 * @author Reginaldo
 */
public class FinanceiroBean {
    
    private Financeiro financeiro;
    private FinanceiroControl fc;
    
    public FinanceiroBean() {
        fc = new FinanceiroControl();
        financeiro = new Financeiro();
    }

    public void salvar() {
        fc.salvar(financeiro);
    }
    
    public Financeiro getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(Financeiro financeiro) {
        this.financeiro = financeiro;
    }
    
    
}
