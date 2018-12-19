package cn.fancychuan.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Clams createClam() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }
}
