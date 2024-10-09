/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.decoratoracai;

/**
 *
 * @author rafaelamoreira
 */
public class DecoratorAcai {

    public static void main(String[] args) {
        // Açaí simples
        Adicional acai = new Acai();
        System.out.println(acai.getDescricao() + "\nCusto: R$ " + acai.custo());

        // Açaí com Morango
        Adicional acaiComMorango = new Morango(new Acai());
        System.out.println(acaiComMorango.getDescricao() + "\nCusto: R$ " + acaiComMorango.custo());

        // Açaí com Morango, Leite Condensado e Banana
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(new Acai())));
        System.out.println(acaiCompleto.getDescricao() + "\nCusto: R$ " + acaiCompleto.custo());
    }
}
