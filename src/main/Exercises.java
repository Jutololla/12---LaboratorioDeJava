package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercises {




    private static boolean isInt(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static int validIntInput() {
        Scanner sc = new Scanner(System.in);
        String c;
        while (true) {
            c = sc.nextLine();
            if (isInt(c)) return Integer.parseInt(c);
            System.out.println("Ingrese un valor numerico");
        }
    }

    private static boolean isDouble(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static Double validDoubleInput() {
        Scanner sc = new Scanner(System.in);
        String c;
        while (true) {
            c = sc.nextLine();
            if (isDouble(c)) return Double.parseDouble(c);
            System.out.println("Ingrese un valor numerico");
        }
    }

    public static char validOption(char... o) {
        Scanner sc = new Scanner(System.in);
        char c;
        while (true) {
            c = sc.next().charAt(0);
            for (char u : o) if (u == c) return c;
            System.out.println("Escoja una opcion valida");
        }
    }

    public static int validOption(int... o) {
        Scanner sc = new Scanner(System.in);
        String c;
        int d;
        while (true) {
            c = sc.nextLine();
            if(isInt(c)){
                d=Integer.parseInt(c);
                for (int u : o) if (u == d) return d;
            }
            System.out.println("Escoja una opcion valida");
        }
    }

    public static void exercise1(int i, int j) {
        System.out.println("i = " + i + "; j = " + j);
        if (i == j) System.out.println("El numero " + i + " es igual que el numero " + j);
        else {
            if (i > j) System.out.println("El numero " + i + " es mayor que el numero " + j);
            else System.out.println("El numero " + i + " es menor que el numero " + j);
        }
    }

    public static void exercise2() {
        System.out.print("Por favor, ingrese el primer numero: ");
        int i = validIntInput();
        System.out.print("Por favor, ingrese el segundo numero: ");
        int j = validIntInput();
        exercise1(i, j);
    }

    public static void exercise3() {
        Double i;
        System.out.println("Por favor, ingrese el valor del radio del circulo (Valor numerico mayor que 0)");
        while (true) {
            i = validDoubleInput();
            if (i > 0) break;
            else System.out.println("Ingrese un un dato valido (Valor numerico mayor que 0)");
        }
        System.out.println("El radio del circulo es " + i + ", y su area es " + Math.PI * Math.pow(i, 2));
    }

    public static void exercise4() {
        final Double IVA = 0.21;
        Double i;
        System.out.println("Ingrese el precio del producto sin IVA (Valor numerico maoyor que 0)");
        while (true) {
            i = validDoubleInput();
            if (i > 0) break;
            else System.out.println("Ingrese un un dato valido (Valor numerico mayor que 0)");
        }
        System.out.println("El precio base del producto es: " + i + ", el valor del IVA es " + i * IVA + ", para un total de " + i * (1 + IVA));
    }

    public static void exercise5() {
        int i = 0;
        System.out.print("Numeros pares: ");
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
        i = 1;
        System.out.print("\nNumeros impares: ");
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }

    public static void exercise6() {
        System.out.print("Numeros pares: ");
        for (int i = 0; i <= 100; i += 2) System.out.print(i + " ");
        System.out.print("\nNumeros impares: ");
        for (int i = 1; i <= 100; i += 2) System.out.print(i + " ");
    }

    public static void exercise7() {
        Double i;
        System.out.println("Ingrese un valor numerico mayor o igual que 0");
        while (true) {
            i = validDoubleInput();
            if (i >= 0) break;
            System.out.println("Ingrese un un dato valido (Valor numerico mayor o igual que 0)");
        }
        System.out.println("El numero ingresado es" + i);
    }

    public static void exercise8() {
        char c;
        System.out.println("Escoja un dia de la semana 1. LUNES 2. MARTES 3. MIERCOLES 4. JUEVES 5. VIERNES 6. SABADO 7. DOMINGO");
        c = validOption('1', '2', '3', '4', '5', '6', '7');
        switch (c) {
            case '6' -> System.out.println("Este no es un dia laboral");
            case '7' -> System.out.println("Este no es un dia laboral");
            default -> System.out.println("Este es un dia laboral");
        }
    }

    public static void exercise9() {
        String sentence = "La sonrisa sera la mejor arma contra la tristeza ";
        Scanner sc = new Scanner(System.in);
        String scString;
        System.out.println("\"La sonrisa sera la mejor arma contra la tristeza\"\nIngrese una cadena de texto para concatenar despues de la anterior");
        scString = sc.nextLine();
        System.out.println(sentence.replace('a', 'e') + scString);
    }

    public static void exercise10() {
        Scanner sc = new Scanner(System.in);
        String scString;
        System.out.println("Ingrese una cadena de texto a la cual se le eliminaran los espacios");
        scString = sc.nextLine();
        System.out.println(scString.replace(" ", ""));
    }

    public static void exercise11() {
        Scanner sc = new Scanner(System.in);
        String scString;
        int contadorVocales = 0;
        int contadorEspacios = 0;
        HashMap<Character, Boolean> vocales = new HashMap<>();
        vocales.put('a', true);
        vocales.put('e', true);
        vocales.put('i', true);
        vocales.put('o', true);
        vocales.put('u', true);
        System.out.println("Ingrese una cadena de texto");
        scString = sc.nextLine();
        for (int x = 0; x < scString.length(); x++)
            if (vocales.containsKey(Character.toLowerCase(scString.charAt(x)))) contadorVocales += 1;
        System.out.println("La cadena contiene " + contadorVocales + " vocal(es)");
        for (int x = 0; x < scString.length(); x++)
            if (Character.toLowerCase(scString.charAt(x)) == ' ') contadorEspacios += 1;
        System.out.println("La cadena contiene " + (scString.length() - contadorEspacios) + " caracteres sin incluir espacios.\nSi se incluyen los espacios, la cadena tiene " + scString.length() + " caracteres");
    }

    public static void exercise12() {
        ArrayList<Boolean> diffIndex = new ArrayList<>();
        String string1, string2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        string1 = sc.nextLine();
        System.out.println("Ingrese otra palabra para comparar con la anterior (Diferencia entre mayusculas y minusculas");
        string2 = sc.nextLine();
        if (string1.compareToIgnoreCase(string2) == 0) System.out.println("Las dos cadenas son iguales");
        else {
            System.out.println("Las dos cadenas no son iguales. Los caracteres que coinciden son los siguientes:");
            int i = (string1.length() < string2.length()) ? string1.length() : string2.length();
            int n = (string1.length() > string2.length()) ? string1.length() : string2.length();
            for (int j = 0; j < i; j++) {
                diffIndex.add(j, (string1.charAt(j) == string2.charAt(j)) ? false : true);
            }
            for (int m = i; m < n; m++) {
                diffIndex.add(true);
            }
            for (int k = 0; k < string1.length(); k++) {
                if (!diffIndex.get(k)) System.out.print(string1.charAt(k));
                else System.out.print("_");
            }
            System.out.print(" != ");
            for (int l = 0; l < string2.length(); l++) {
                if (!diffIndex.get(l)) System.out.print(string2.charAt(l));
                else System.out.print("_");
            }
        }
    }

    public static void exercise13() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual es: " + dtf.format(LocalDateTime.now()));
    }

    public static void exercise14() {
        int c;
        System.out.println("Por favor, ingrese un numero entero menor que 1000");
        while (true) {
            c = validIntInput();
            if (c < 1000) break;
            System.out.println("Por favor intente nuevamente, ingrese un numero entero menor que 1000");
        }
        for (int e = 0, d = c; d < 1000; d += 2) {
            System.out.print(d + " ");
            e++;
            if (e % 20 == 0) System.out.println('\n');
        }
    }

    public static void exercise15() {
        boolean repeat = true;
        do {
            System.out.print("""
                    ****** GESTION CINEMATOGRÁFICA ********
                    1-NUEVO ACTOR
                    2-BUSCAR ACTOR
                    3-ELIMINAR ACTOR
                    4-MODIFICAR ACTOR
                    5-VER TODOS LOS ACTORES
                    6- VER PELICULAS DE LOS ACTORES
                    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                    8-SALIR
                    """);
            char c = validOption('1', '2', '3', '4', '5', '6', '7', '8');
            if (c == '8') repeat = false;
            else System.out.println("Usted escogio la opcion " + c + "\n\n");
        } while (repeat);
    }

    public static void exercise16() {
        Scanner sc = new Scanner(System.in);
        ArrayList personaAuxiliar = new ArrayList();
        System.out.println("Ingrese los valores de nombre, edad, sexo, peso y altura\nNombre :");
        personaAuxiliar.add(sc.nextLine());
        System.out.print("Edad: ");
        personaAuxiliar.add(validIntInput());
//        boolean corregirSexo = true;
        char sexo = '-';
        while (true) {
            System.out.println("Sexo(H/M): ");
            sexo = sc.nextLine().charAt(0);
            System.out.print("El sexo ingresado es " + sexo + ", ");
            sexo = Persona.comprobarSexo(sexo);
            System.out.print("se almacenara como " + sexo + ", desea corregirlo? (Y/N)");
            if (validOption('Y', 'N') == 'N') {
                break;
            }
        }
        personaAuxiliar.add(sexo);
        System.out.print("Peso (Kg): ");
        double i;
        while (true) {
            i = validDoubleInput();
            if (i >= 1 && i < 200) break;
            System.out.println("Ingrese un un peso valido en Kg (Valor numerico entre 1 y 200)");
        }
        personaAuxiliar.add(i);
        System.out.print("Altura (m): ");
        while (true) {
            i = validDoubleInput();
            if (i > 0 && i < 3) break;
            System.out.println("Ingrese un una altura valida en m (Valor numerico entre 0,0 y 3,0)");
        }
        personaAuxiliar.add(i);

        Persona persona_1 = new Persona((String) personaAuxiliar.get(0), (char) personaAuxiliar.get(2), (int) personaAuxiliar.get(1), (double) personaAuxiliar.get(3), (double) personaAuxiliar.get(4));
        Persona persona_2 = new Persona((String) personaAuxiliar.get(0), (char) personaAuxiliar.get(2), (int) personaAuxiliar.get(1));
        Persona persona_3 = new Persona();
        persona_3.setNombre((String) personaAuxiliar.get(0));
        persona_3.setSexo((char) personaAuxiliar.get(2));
        persona_3.setEdad((int) personaAuxiliar.get(1));
        persona_3.setPeso((double) personaAuxiliar.get(3));
        persona_3.setAltura((double) personaAuxiliar.get(4));

        System.out.println("persona_1 = " + persona_1);
        System.out.println("persona_2 = " + persona_2);
        System.out.println("persona_3 = " + persona_3);
    }

    public static void exercise18() {
        Serie series[] = new Serie[5];
        series[0] = new Serie("Duro de matar", 4, "Accion", "Carlos Agudelo");
        series[1] = new Serie("La vida es bella", 7, "Drama", "Maria Vaupes");
        series[2] = new Serie("Halloween", 2, "Terror", "Tim Burton");
        series[3] = new Serie("Los pitufos", 1, "Infantil", "Ko Wun");
        series[4] = new Serie("Stranger things", 9, "Misterio", "Kikis Suggar");
        series[1].entregar();
        series[3].entregar();
        series[4].entregar();
        Videojuego videojuegos[] = new Videojuego[5];
        videojuegos[0] = new Videojuego("Farcry", 200, "Accion", "Ubisoft");
        videojuegos[1] = new Videojuego("Smash bros", 300, "Pelea", "Nintendo");
        videojuegos[2] = new Videojuego("Sekiro", 450, "Accion", "Ubisoft");
        videojuegos[3] = new Videojuego("Fornite", 150, "Shooter", "EpicGames");
        videojuegos[4] = new Videojuego("Assasin creed", 520, "Aventura", "Sony");
        videojuegos[0].entregar();
        videojuegos[4].entregar();

        int auxContador = 0;
        int auxElementoMayor = 0;
        int auxIndice = 0;
        for (int j = series.length - 1; j >= 0; j--) {
            if (series[j].estaEnPrestamo()) auxContador++;
            if (series[j].numeroTemporadas > auxElementoMayor) {
                auxElementoMayor = series[j].numeroTemporadas;
                auxIndice = j;
            }
        }
        System.out.println("Hay " + auxContador + " series prestadas");
        System.out.println("La serie con mas temporadas es " + series[auxIndice].titulo + ", que tiene "
                + auxElementoMayor + " temporadas.");
        System.out.println(series[auxIndice] + "\n\n");

        auxContador = 0;
        auxElementoMayor = 0;
        for (int j = videojuegos.length - 1; j >= 0; j--) {
            if (videojuegos[j].estaEnPrestamo()) auxContador++;
            if (videojuegos[j].horasEstimadas > auxElementoMayor) {
                auxElementoMayor = videojuegos[j].horasEstimadas;
                auxIndice=j;
            }
        }
        System.out.println("Hay " + auxContador + " videojuegos prestados");
        System.out.println("El videojuego con mas horas estimadas de juego es " +
                videojuegos[auxIndice].titulo + ", el cual tiene "
                + auxElementoMayor);
        System.out.println(videojuegos[auxIndice]);
    }

    public static void exercise17() {

    }
}







