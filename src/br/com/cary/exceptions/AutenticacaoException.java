/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.exceptions;

/**
 *
 * @author Reginaldo
 */
public class AutenticacaoException extends Exception {
    
    public AutenticacaoException() {
        super("Falha na autenticação, por favor verifique usuário e senha!");
    }
    
}
