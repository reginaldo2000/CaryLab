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
public class ProdutoExistenteException extends Exception {
    
    public ProdutoExistenteException(String msg) {
        super(msg);
    }
    
    public ProdutoExistenteException() {
        super("Um produto já foi cadastrado com esse código!");
    }
}
