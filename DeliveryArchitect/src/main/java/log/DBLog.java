/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

public class DBLog implements ILog {
    @Override
    public void escrever(String message) {
        System.out.println("Logando no banco de dados: " + message);
    }
}
