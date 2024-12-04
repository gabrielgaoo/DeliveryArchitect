/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

public class Xmllog implements ILog {


    @Override
    public void escrever(String message) {
        System.out.println("XMLLog: " + message);
    }
}
