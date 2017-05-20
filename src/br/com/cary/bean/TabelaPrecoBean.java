/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.TabelaPrecoControl;
import br.com.cary.entity.TabelaPreco;
import br.com.cary.exceptions.CampoVazioException;
import cary.utility.Alertas;

/**
 *
 * @author Reginaldo
 */
public class TabelaPrecoBean {
    
    private TabelaPreco tabelaPreco;
    private TabelaPrecoControl tpc;
    
    public TabelaPrecoBean() {
        tpc = new TabelaPrecoControl();
        tabelaPreco = new TabelaPreco();
    }
    
    public void salvar() throws CampoVazioException{
        if(tabelaPreco.getCodigo() != null) {
            tpc.editar(tabelaPreco);
            Alertas.mensagemConfirmacao("Dados da tabela de preços editados com sucesso!");
        } else {
            tpc.salvar(tabelaPreco);
            Alertas.mensagemConfirmacao("Tabela de Preços cadastrada com sucesso!");
        }
    }
    
    public void editar() throws CampoVazioException {
        tpc.editar(tabelaPreco);
    }
    
    public void excluir() throws CampoVazioException {
        tpc.excluir(tabelaPreco);
    }
    
    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
    
    
}
