
package br.com.cary.bean;

import br.com.cary.control.EntradaControl;
import br.com.cary.entity.Entrada;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class EntradaBean {
    
    private Entrada entrada;
    private EntradaControl ec;
    
    public EntradaBean() {
        entrada = new Entrada();
        ec = new EntradaControl();
    }
    
    public void salvar() throws CampoVazioException {
        ec.salvar(entrada);
    }
    
    public void cancelar() {
        ec.cancelar(entrada);
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
    
    
    
}
