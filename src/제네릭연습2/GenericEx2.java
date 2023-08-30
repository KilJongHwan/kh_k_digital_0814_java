package 제네릭연습2;

public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrint<Powder> powderPrint = new GenericPrint<>();
        powderPrint.setMaterial(new Powder());
        Powder powder = powderPrint.getMaterial();
        System.out.println(powder);

        GenericPrint<Plastic> plasticPrint = new GenericPrint<>();
        plasticPrint.setMaterial(new Plastic());
        Plastic plastic = plasticPrint.getMaterial();
        System.out.println(plastic);
    }
}
