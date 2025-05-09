package marketplace;

public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
private int id;
private String name;
private T category;
private double price;

// constructor untuk membuat objek Product
public Product(int id, String name, T category, double price) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
}

// getter untuk ID produk
public int getId() {
    return id;
}

// getter untuk nama produk
public String getName() {
    return name;
}

// getter untuk kategori produk
public T getCategory() {
    return category;
}

// getter untuk harga produk
public double getPrice() {
    return price;
}

// implementasi method compareTo agar produk bisa diurutkan berdasarkan kategori
@Override
public int compareTo(Product<T> other) {
    return this.category.compareTo(other.category);
}

// method toString untuk menampilkan informasi produk secara ringkas
@Override
public String toString() {
    return "ID: " + id + " | Name: " + name + " | Category: " + category + " | Price: Rp" + price;
}
}