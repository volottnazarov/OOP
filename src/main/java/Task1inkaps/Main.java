package Task1inkaps;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
        HotDrinkVendingMachine hotMachine = new HotDrinkVendingMachine();
        machine.addBottleOfWater(new BottleOfWater("Вода1", 100,10));
        machine.addBottleOfWater(new BottleOfWater("Вода2", 500,100));
        machine.addBottleOfWater(new BottleOfWater("Вода3", 5,0.5));
        machine.addBottleOfWater(new BottleOfWater("Вода4", 10,1));
        hotMachine.addHotDrink(new HotDrink("Чай", 30, 0.2, 82));
        hotMachine.addHotDrink(new HotDrink("Кофе", 50, 0.2, 80));
        hotMachine.addHotDrink(new HotDrink("Бульон", 45, 0.2, 78));
        hotMachine.addHotDrink(new HotDrink("Кипяток", 15, 0.2, 95));
        System.out.println(machine.getProduct("Вода1"));
        System.out.println(hotMachine.getProduct("Кофе"));
        printGetProduct(hotMachine); // печать с методом printGetProduct, для гибкости,
        // если существует несколько аппаратов с разными продуктами.
    }
    public static void printGetProduct(VendingMachine vendingMachine){
        System.out.println(vendingMachine.getProduct("Чай"));
    }
}
