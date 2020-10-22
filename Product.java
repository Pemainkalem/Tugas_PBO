package Tugas3;

public class Product {
    private String Nama;
    private String Code;
    private String Price;

    public Product(Product Cemiland) {
        this(Cemiland.getNama(), Cemiland.getCode(),Cemiland.getPrice());
    }

    public Product(String nama, String code, String price) {
        Nama = nama;
        Code = code;
        Price = price;
    }
    public Object clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.getNama(), this.getCode(), this.getPrice());
        }
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Nama='" + Nama + '\'' +
                ", Code='" + Code + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}

