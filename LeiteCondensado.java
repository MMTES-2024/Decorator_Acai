/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decoratoracai;

/**
 *
 * @author rafaelamoreira
 */
public class LeiteCondensado extends BaseDecorator {

    public LeiteCondensado(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        return wrappee.custo() + 1.00;
    }

}
