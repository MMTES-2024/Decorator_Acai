/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.decoratoracai;

/**
 *
 * @author rafaelamoreira
 */
public class BaseDecorator implements Adicional {

    protected Adicional wrappee;

    public BaseDecorator(Adicional wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao();
    }

    @Override
    public double custo() {
        return wrappee.custo();
    }

}
