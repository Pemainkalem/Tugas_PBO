package Tugas3;

public class DCmaininterface {
    public static void main(String args[]) {
        DCmaininterface main = new DCmaininterface();
        main.testCase();
    }

    public void testCase() {
        Product produksi= new Product ("Kripset","KR666","Idr 10.000");
        Category Kripset = new Category("Food", "singkong", produksi);
        Category boba = (Category) Kripset.clone();

        boba.setKind("Drink");
        boba.setIngredient("Water");

        System.out.println(Kripset);
        System.out.println(boba);
    }
}
