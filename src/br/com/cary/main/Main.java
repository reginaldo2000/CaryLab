/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.main;

import br.com.cary.util.ConectaDB;
import br.com.cary.view.FormLogin;
import cary.utility.Alertas;
import cary.utility.Layout;
import org.hibernate.Session;

/**
 *
 * @author Reginaldo
 */
public class Main {
    
    public static void main(String[] args) {
        Layout.mudaLayout("Windows");
        abrirConexao();
        new FormLogin().setVisible(true);
    }
    
    private static void abrirConexao() {
        try {
            Session s = ConectaDB.getSessionFactory().openSession();
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage()+"\nNão foi possível estabelecer conexão com o banco de dados!");
        }
    }
}
