package Task1inkaps;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<Product> productList = new ArrayList<>();

    public void addHotDrink(HotDrink drink) {
        productList.add(drink);
    }

    @Override
    public void initProducts(List<Product> list) {
        productList = list;
    }



    @Override
    public Product getProduct(String name) {
        for (Product i : productList) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int cost, double volume, int temperature){
        for (Product i : productList) {
            if (
                    i.getName().equals(name) &&
                            ((HotDrink)i).getCost() == cost &&
                            ((HotDrink)i).getVolume() == volume &&
                            ((HotDrink)i).getTemperature() == temperature) {
                return (HotDrink) i;
            }
        }
        return null;

    }

}


