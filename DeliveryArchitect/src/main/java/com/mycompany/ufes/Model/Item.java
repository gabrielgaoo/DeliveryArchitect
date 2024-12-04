/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ufes.Model;

/**
 *
 * @author Lenovo
 */
public class Item {
        private String nome;
        private Integer quantidade;
        private Double valorUnitario;
        private String tipo;
                
        public Item(String nome, Integer quantidade, Double valorUnitario, String tipo){
            if (nome == null || quantidade == null || valorUnitario == null || tipo == null) {
            throw new IllegalArgumentException("Valores inválidos para criar o item.");
            }
            
            this.nome = nome;
            this.quantidade = quantidade;
            this.valorUnitario = valorUnitario;
            this.tipo = tipo;            
        }
        
        public Double getValorTotal(){                        
            return this.quantidade * this.valorUnitario;
        }
        
        public String getTipo(){
            return this.tipo;        
        }
        
        @Override 
        public String toString(){
        return "Nome: "+ this.nome +" Tipo: "+ this.tipo +" Quantidade: "+ this.quantidade +"Valor Unitário: " + this.valorUnitario;
        }
        
}
