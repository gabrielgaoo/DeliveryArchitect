/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

public class JsonLog implements ILog {
    @Override
    public void escrever(String message) {
        System.out.println("JSONLog: " + message);
    }


}
