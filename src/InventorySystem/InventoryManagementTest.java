package InventorySystem;

public class InventoryManagementTest {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        inventory.addProduct(new Product(1, "Computer", 10, 999.99));
        inventory.addProduct(new Product(2, "Mouse", 50, 19.99));

        System.out.println("All products:");
        inventory.displayAllProducts();

        inventory.updateProduct(new Product(1, "Computer", 8, 899.99));

        System.out.println("After updating Computer:");
        inventory.displayAllProducts();

        inventory.deleteProduct(2);

        System.out.println("After deleting Mouse:");
        inventory.displayAllProducts();
    }
}
