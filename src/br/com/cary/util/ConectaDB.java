/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.util;

import br.com.cary.dao.UsuarioDAO;
import br.com.cary.entity.*;
import java.io.BufferedReader;
import java.io.FileReader;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Reginaldo
 */
public class ConectaDB {

    private static String url;
    private static final SessionFactory sessionFactory;
    private static String servidor;
    private static String banco;
    private static String porta;

    static {
        try {
            lerArquivo();
            System.out.println(url);
            Configuration cfg = new Configuration()
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                    .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
                    .setProperty("hibernate.connection.url", url)
                    .setProperty("hibernate.connection.username", "root")
                    .setProperty("hibernate.connection.password", "developer")
                    .setProperty("hibernate.show_sql", "true")
                    .setProperty("hibernate.hbm2ddl.auto", "update")
                    .addAnnotatedClass(Usuario.class)
                    .addAnnotatedClass(Filial.class)
                    .addAnnotatedClass(Funcionario.class)
                    .addAnnotatedClass(Transportador.class)
                    .addAnnotatedClass(Setor.class)
                    .addAnnotatedClass(Fornecedor.class)
                    .addAnnotatedClass(TabelaProduto.class)
                    .addAnnotatedClass(TabelaPreco.class)
                    .addAnnotatedClass(Produto.class)
                    .addAnnotatedClass(ProdutoEstoque.class)
                    .addAnnotatedClass(ProdutoEntrada.class)
                    .addAnnotatedClass(Entrada.class)
                    .addAnnotatedClass(FornecedorPrecoCusto.class)
                    .addAnnotatedClass(EntradaParcela.class)
                    .addAnnotatedClass(Financeiro.class)
                    .addAnnotatedClass(Exame.class)
                    .addAnnotatedClass(ExameComposicao.class);
            sessionFactory = cfg.buildSessionFactory();
            //inserirUsuarioPadrao();
//            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    private static void lerArquivo() {
        try {
            BufferedReader buf = new BufferedReader(new FileReader("conf/config.cfg"));
            servidor = buf.readLine();
            banco = buf.readLine();
            porta = buf.readLine();
            buf.close();
            url = "jdbc:mysql://" + servidor + ":" + porta + "/" + banco + "?zeroDateTimeBehavior=convertToNull";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    private static void inserirUsuarioPadrao() {
        Usuario us = new Usuario();
        us.setNomeUsuario("ADMIN");
        us.setSenha("master");
        UsuarioDAO.getInstance().salvar(us);
    }

}
