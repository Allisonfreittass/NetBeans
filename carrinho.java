/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author Allison
 */
 /* public class carrinho {
  public static void main(String[] args) {
   Produto p1 = new Produto();
     p1.setCodigo(1);
     p1.setDescricao("carro");
     p1.setPreco(93000);
     p1.setQuantidade(1);
     
     System.out.println("Codigo: + p1.getCodigo");
     System.out.println("Descricao: + p1.getDescricao");
     System.out.println("preco: + p1.getPreco");
  }
}

*/

 public class carrinho {
     private Produto item;
     
     public carrinho (Produto item){
         this.item = item;
     }

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }
  
 } 