package org.fade.pattern.cp.abstraction;

import org.fade.pattern.cp.factory.example.Pizza;
import org.fade.pattern.cp.factory.method.LondonCheesePizza;
import org.fade.pattern.cp.factory.method.LondonPepperPizza;

/**
 * 抽象工厂模式
 * @author fade
 * */
public class LondonFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new LondonCheesePizza();
        }
        else if (type.equals("pepper")){
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
