package Tugas3;

import java.io.Serializable;

public class Apache {
    public static class Apche implements Serializable, Cloneable {
        public static void main(String args[]) {
            Apche main = new Apche();
            main.whenModifyingOriginalObject_thenApcheCloneShouldNotChange();
        }

        public void whenModifyingOriginalObject_thenApcheCloneShouldNotChange() {
            Product produksi = new Product("Kripset", "KR666", "Idr 10.000");
            Category kategori = new Category("Food", "singkong", produksi);
            Category deepCopy = (Category) kategori.clone();

            produksi.setNama("Kripset");
            deepCopy.getCemiland().getCode();
            kategori.getCemiland().getPrice();
            System.out.println(kategori);
        }
    }
}
