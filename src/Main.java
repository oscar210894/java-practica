public class Main {

    public static void main(String[] args) {

        Carro toyota = new Carro("Toyota", "Corolla", 2026);
        Carro mazda = new Carro("Mazda", "CX-5", 2023);

        System.out.println(toyota.getMarca() + " " + toyota.getModelo() + ", Año: " + toyota.getAno());
        System.out.println(mazda.getMarca() + " " + mazda.getModelo() + ", Año: " + mazda.getAno());
    }
}