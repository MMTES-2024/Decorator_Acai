/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decoratoracai;

/**
 *
 * @author rafaelamoreira
 */
public class Acai implements Adicional {

    @Override
    public String getDescricao() {
        return "Açaí";
    }

    @Override
    public double custo() {
        return 10.00;
    }

}
