package marketplace;

import java.util.*;

public class ProductManager {
// list untuk menyimpan semua produk
private List<Product<?>> products = new ArrayList<>();

// set untuk menyimpan kategori unik
private Set<String> categories = new HashSet<>();

// queue untuk menyimpan produk yang telah diproses
private Queue<Product<?>> processedQueue = new LinkedList<>();

// method untuk menambahkan produk
public <T extends Comparable<T>> void addProduct(Product<T> product) {
    products.add(product);
    categories.add(product.getCategory().toString());
}

// method untuk menghapus produk berdasarkan ID
public void removeProductById(int id) {
    products.removeIf(product -> product.getId() == id);
}

// method untuk mencari produk berdasarkan nama dan kategori
public List<Product<?>> searchProduct(String name, String category) {
    List<Product<?>> result = new ArrayList<>();
    for (Product<?> p : products) {
        if (p.getName().equalsIgnoreCase(name) && p.getCategory().toString().equalsIgnoreCase(category)) {
            result.add(p);
        }
    }
    return result;
}

// method untuk menampilkan semua produk dan mengurutkannya berdasarkan kategori
public void displaySortedProducts() {
    List<Product<?>> sorted = new ArrayList<>(products);
    // Kita casting agar bisa compare berdasarkan kategori
    sorted.sort((a, b) -> a.getCategory().toString().compareTo(b.getCategory().toString()));
    for (Product<?> p : sorted) {
        System.out.println(p);
    }
}

// method untuk menampilkan semua kategori unik
public void displayCategories() {
    for (String category : categories) {
        System.out.println("- " + category);
    }
}

// method untuk menambahkan produk ke antrian yang telah diproses
public void processProduct(Product<?> product) {
    processedQueue.offer(product);
}

// method untuk menampilkan antrian produk yang telah diproses
public void displayProcessedQueue() {
    for (Product<?> p : processedQueue) {
        System.out.println(p);
    }
}

// method untuk menghitung total nilai semua produk di list setelah penghapusan (tambahan nilai)
public double calculateTotalValue() {
    double total = 0.0;
    for (Product<?> p : products) {
    total += p.getPrice();
    }
    return total;
    }    
}