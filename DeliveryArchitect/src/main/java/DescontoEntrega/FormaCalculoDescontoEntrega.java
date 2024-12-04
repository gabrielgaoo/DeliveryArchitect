/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DescontoEntrega;

import com.mycompany.ufes.Model.Pedido;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public interface FormaCalculoDescontoEntrega {
    Map<String, Double> calcularDesconto(Pedido pedido);

    boolean seAplica(Pedido pedido);
}
