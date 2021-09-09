package main;

public class Persona {
    String Nombre = "";
    String DNI;
    char Sexo = 'H';
    int Edad = 0;
    double Peso = 0;
    double Altura = 0;

    public Persona() {
        DNI=generaDNI();
    }

    public Persona(String nombre, char sexo, int edad) {
        Nombre = nombre;
        Sexo = sexo;
        Edad = edad;
        DNI=generaDNI();
    }

    public Persona(String nombre, char sexo, int edad, double peso, double altura) {
        Nombre = nombre;
        Sexo = sexo;
        Edad = edad;
        Peso = peso;
        Altura = altura;
        DNI=generaDNI();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public int calcularIMC() {
        double indiceIMC;
        indiceIMC = this.Peso / (this.Altura * this.Altura);
        if (indiceIMC < 20) {
            indiceIMC = -1;
        } else if (indiceIMC <= 25) {
            indiceIMC = 0;
        } else {
            indiceIMC = 1;
        }
        return (int) indiceIMC;
    }

    public String estadoIMC(){
        double indiceIMC = calcularIMC();
        if(Peso==0||Altura==0){
            return Nombre+"("+DNI+")"+" no tiene datos suficientes para calcular su IMC";
        }
        else if (indiceIMC == -1) {
            return Nombre+"("+DNI+")"+" esta por debajo de su peso ideal: Desnutricion";
        } else if (indiceIMC ==0) {
            return Nombre+"("+DNI+")"+" esta en su peso ideal";
        } else {
            return Nombre+"("+DNI+")"+" esta por encima de su peso ideal: Sobrepeso";
        }
    }

    public String estadoMayoriaEdad(){
        if(esMayorDeEdad()){
            return Nombre+"("+DNI+")"+" es mayor de edad";
        }
        else{
            return Nombre+"("+DNI+")"+" no es mayor de edad";
        }

    }

    public boolean esMayorDeEdad() {
        return (this.Edad >= 18);
    }

    public static char comprobarSexo(char sexo) {
        return (sexo=='M'||sexo=='H')?sexo:'H';
        }

    @Override
    public String toString() {
        String estadoIMC=estadoIMC();
        String estadoMayoriaEdad=estadoMayoriaEdad();
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Sexo=" + Sexo +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Altura=" + Altura +
                '}'+"\n"+estadoIMC+"\n"+estadoMayoriaEdad+"\n";


    }

    public int numeroAleatorio(){
        int sup=99999999;
        int inf=10000000;
        return (int)(Math.random()*(sup-inf+1)+inf);
    }

    public String generaDNI(){
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroAleatorio=numeroAleatorio();
        char letra = juegoCaracteres.charAt(numeroAleatorio % 23);
        return DNI = String.valueOf(numeroAleatorio())+String.valueOf(letra);
    }


}
