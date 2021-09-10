package main;

public class Electrodomestico {
    double precioBase = 100;
    String color = "blanco";
    char consumoEnergetico = 'F';
    double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        String cat = "ABCDE";
        for (int i = 0; i < 6; i++) {
            if (letra == cat.charAt(i)) {
                return letra;
            }
        }
        return 'F';
    }

    public String comprobarColor(String color) {
        String colorReference[] = {"negro", "rojo", "gris"};
        for (int i = 0; i < 3; i++) {
            if (color == colorReference[i]) {
                return color;
            }
        }
        return "blanco";
    }

    public void precioFinal() {
        if (consumoEnergetico == 'A') {
            precioBase = 100;
        } else if (consumoEnergetico == 'B') {
            precioBase = 80;
        } else if (consumoEnergetico == 'C') {
            precioBase = 60;
        } else if (consumoEnergetico == 'D') {
            precioBase = 50;
        } else if (consumoEnergetico == 'E') {
            precioBase = 30;
        } else {
            precioBase = 10;
        }

        if (peso <= 19) {
            precioBase += 10;
        } else if (peso <= 49) {
            precioBase += 50;
        } else if (peso <= 79) {
            precioBase += 80;
        } else {
            precioBase += 100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
