/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ufes.Model;

/**
 *
 * @author Lenovo
 */
public class CupomDescontoEntrega {
            private String nomeMetodo;
            private Double valorDesconto;
            
            public CupomDescontoEntrega(String nomeMetodo, Double valorDesconto){
                    this.nomeMetodo = nomeMetodo;
                    this.valorDesconto = valorDesconto;            
            }
            
            public Double getValorDesconto(){
                return valorDesconto;            
            }
            
            public String getNomeMetodo(){
                return nomeMetodo;
            }
            @Override
            public String toString(){
                return "Nome do método de desconto:"+ nomeMetodo+ "Valor do desconto: "+ valorDesconto;
            
            }
}
