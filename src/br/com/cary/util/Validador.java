/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.util;

import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.DataException;
import br.com.cary.exceptions.PhoneException;
import cary.utility.NovaData;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Reginaldo
 */
public class Validador {

    public static Validador getInstance() {
        return new Validador();
    }

    public void validarData(String dt) throws DataException {

        if(dt.contains(" ")) {
            throw new DataException("Preencha o campo da data de nascimento corretamente!");
        }
        int dia = Integer.parseInt(dt.substring(0, 2));
        int mes = Integer.parseInt(dt.substring(3, 5));
        int ano = Integer.parseInt(dt.substring(6, 10));

        if (dia > 31 || dia < 1 || mes > 12 || mes < 1) {
            throw new DataException("Data inválida!");
        }
        if (mes == 2 && dia > 29) {
            throw new DataException("Data inválida!");
        }
    }

    public void validarTelefoneCelular(String tel) throws PhoneException {
        String aux = tel.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        if (aux.length() < 11 || tel.length() > 11) {
            throw new PhoneException("Telefone inválido!");
        }
    }
}
