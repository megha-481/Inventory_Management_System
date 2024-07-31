package InventorySystem;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    private Map<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product with ID " + product.getProductId() + " does not exist.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    public void displayAllProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
