package marketplace;

public class Marketplace {
public static void main(String[] args) {
ProductManager manager = new ProductManager();

    //nama, nim, kelas
    System.out.println("=================================================================================================================="); 
    System.out.println("Angeliani Junitaviana Herman");
    System.out.println("245150700111021");
    System.out.println("Teknologi Informasi - C");
    System.out.println("=================================================================================================================="); //kak apakah penempatan pewarnanya sudah betul maaf kalau masi salah


    // menambahkan beberapa produk, urutan berdsrkan kategori
    Product<String> p1 = new Product<>(1, "This is April's Joelene Cardigan Black", "Fashion", 309000);
    Product<String> p2 = new Product<>(2, "Tir Tir Mask Fit Red Cushion 13W Cream", "Beauty", 420000);
    Product<String> p3 = new Product<>(3, "Loreal's Elseve Total Repair 5 Hair Mask", "Lifestyle", 87200);
    Product<String> p4 = new Product<>(4, "ZARA's Strapless Top 50th Anniversary", "Fashion", 799900);

    // tambahkan produk ke ProductManager
    manager.addProduct(p1);
    manager.addProduct(p2);
    manager.addProduct(p3);
    manager.addProduct(p4);

    // tampilkan semua produk (terurut berdasarkan kategori)
    System.out.println("\nDaftar Produk:");
    manager.displaySortedProducts();

    // tampilkan semua kategori unik
    System.out.println("\nKategori Unik:");
    manager.displayCategories();

    // cari produk tertentu
    System.out.println("\nHasil Pencarian:");
    for (Product<?> p : manager.searchProduct("ZARA's Strapless Top 50th Anniversary", "Fashion")) {
        System.out.println(p);
    }

    // proses beberapa produk
    manager.processProduct(p1);
    manager.processProduct(p3);

    // tampilkan antrian produk yang telah diproses
    System.out.println("\nAntrian Produk Diproses:");
    manager.displayProcessedQueue();

    // hapus produk
    manager.removeProductById(2);

    // tampilkan produk setelah penghapusan
    System.out.println("\nDaftar Produk Setelah Penghapusan:");
    manager.displaySortedProducts();
}
}

