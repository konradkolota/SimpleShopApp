package pl.kk.model;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    public static Map<Product, Integer> productsWarehouse = new HashMap<>(Map.of(
            new Product("testItem", "testManufacturer", "testSpec" ), 10,
            new Product("testItem1", "testManufacturer", "testSpec"),15,
            new Product("testItem2", "testManufacturer", "testSpec"),20,
            new Product("testItem3", "testManufacturer", "testSpec"),25,
            new Product("testItem4", "testManufacturer", "testSpec"),40,
            new Product("testItem5", "testManufacturer", "testSpec"),564,
            new Product("testItem6", "testManufacturer", "testSpec"), 45
    ));



}
