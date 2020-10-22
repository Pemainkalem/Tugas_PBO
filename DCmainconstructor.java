package Tugas3;

public class DCmainconstructor {
    public static void main(String args[]) {
        DCmainconstructor main = new DCmainconstructor();
        main.testCase();
    }

    public void testCase() {
       Product Cemiland = new Product("Kripset","KR666","Idr 10.000");
        Category kripiklada = new Category("Food", "singkong", Cemiland);
        Category boba = new Category(kripiklada);

        boba.getCemiland().setCode("KR666");
        boba.setKind("minuman");
        boba.setIngredient("water");

        System.out.println(kripiklada);
        System.out.println(boba);
    }
}
