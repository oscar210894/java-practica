public class Carro  {

    private final String marca;
    private final String modelo;
    private final int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void mostrarInfo() {
        System.out.println(marca + ", " + modelo + ", " + "Año: " + ano);
    }
}