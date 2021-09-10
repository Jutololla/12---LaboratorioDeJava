package main;

public class Television extends Electrodomestico {
    double resolucion = 20;
    boolean isTDT = false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean isTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.isTDT = isTDT;
    }

    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precioBase += precioBase * 0.3;
        }
        if (isTDT) {
            precioBase += 50;
        }
    }

    @Override
    public String toString() {
        return "Television{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", resolucion=" + resolucion +
                ", isTDT=" + isTDT +
                '}';
    }
}
