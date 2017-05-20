/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.dao;

import br.com.cary.util.GenericDAO;

/**
 *
 * @author Reginaldo
 */
public class ExameDAO extends GenericDAO{
    
    public static ExameDAO getInstance() {
        return new ExameDAO();
    }
}
