package cn.fancychuan.factory;

public interface PizzaIngredientFactory {

    public Clams createClam();
    public Cheese createCheese();
    public Veggies[] createVeggies();
}
