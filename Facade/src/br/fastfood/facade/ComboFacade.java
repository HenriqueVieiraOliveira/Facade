package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo combo;

    public Combo criarCombo(int codigo){
        switch(codigo){
            case 1 ->{
                this.combo = new Combo(
                    new Burger("X-Ratão", 32.55),
                    new Bebida("Coca-Cola", 8.0),
                    new Sobremesa("Sorvete", 5.90)
                );
            }
            case 2->{
                this.combo = new Combo(
                    new Burger("Super-Rato", 45),
                    new Bebida("Red Label", 91),
                    new Sobremesa("Cookie", 10)
                );
            }
            default -> System.out.println("Código de combo inválido!");
        }

        return combo;
    }

    public double getPrecoTotal(){
        double precoTotal =+ combo.getBurger().getPreco() + combo.getBebida().getPreco() + combo.getSobremesa().getPreco();

        return precoTotal;
    }

    public void exibirItens(){
        System.out.println(combo.getBurger().toString());
        System.out.println(combo.getBebida().toString());
        System.out.println(combo.getSobremesa().toString());    }
}
