/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.application;

import com.mycompany.ufes.Model.Cliente;
import com.mycompany.ufes.Model.Item;
import com.mycompany.ufes.Model.Pedido;

import java.time.LocalDate;
import log.ILog;
import log.JsonLog;
import log.Xmllog;
import service.UsuarioLogadoService;
import util.GeradorDeLog;

public class Main {
    public static void main(String[] args) {
        ILog log = new JsonLog();

        Cliente cliente = new Cliente(
                "Gabriel Guimarães","Pessoa Física","Centro","Ouro","Alegre","Rua Antonio Marins, 23"
        );


        double taxaEntrega = 15.0;
        LocalDate dataPedido = LocalDate.now();
        Pedido pedido = new Pedido(taxaEntrega, dataPedido, cliente);


        Item item1 = new Item("Celular", 1, 1500.0, "Eletrônicos");
        Item item2 = new Item("Monitor", 2, 800.0, "Eletrônicos");
        Item item3 = new Item("Mouse", 1, 150.0, "Periférico");

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        var gerar = GeradorDeLog.execute(UsuarioLogadoService.getNomeUsuario(), pedido.getId(), pedido.getValorPedido(), cliente.getNome());

        log.escrever(gerar);

        log = new Xmllog();

        log.escrever(gerar);

    }
}