/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author Allison
 */
public class Revista {
    private int produto;
    private String descricao;
    private String tipo;
    private edicao edicao;

    public Revista(int produto, String descricao, float preco, int edicao) {
        this.produto = produto;
        this.descricao = descricao;
        this.tipo = tipo;
        this.edicao = new edicao(10, "10 de hj", 10);
    }
    
}
