package Tugas3;

public class Category {
    private String Kind;
    private String Ingredient;
    private Product Cemiland;

    public Category(Category category1) {
        this(category1.getKind(), category1.getIngredient(), new Product(category1.getCemiland()));
    }
    public Category(String kind, String ingredient, Product cemiland) {
        Kind = kind;
        Ingredient = ingredient;
        Cemiland = cemiland;
    }

    public Object clone() {
        Category category1 = null;
        try {
            category1 = (Category) super.clone();
        } catch (CloneNotSupportedException e) {
            category1 = new Category(
                    this.getKind(), this.getIngredient(), this.getCemiland());
        }
        category1.Cemiland = (Product) this.Cemiland.clone();
        return category1;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getIngredient() {
        return Ingredient;
    }

    public void setIngredient(String ingredient) {
        Ingredient = ingredient;
    }

    public Product getCemiland() {
        return Cemiland;
    }

    public void setCemiland(Product cemiland) {
        Cemiland = cemiland;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Kind='" + Kind + '\'' +
                ", Ingredient='" + Ingredient + '\'' +
                ", Cemiland=" + Cemiland +
                '}';
    }
}
