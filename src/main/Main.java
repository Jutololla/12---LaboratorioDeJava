package main;

import main.*;

public class Main {
    public static void main(String[] args) {
        boolean repeat=true;
        while(repeat) {
            System.out.println("\n\n_______________________________________________________________________________________________________\n\n");
            System.out.println("Ingrese un numero del 1 al 18 para ejecutar el ejercicio correspondiente" +
                    "\nIngrese 0 para terminar la ejecucion del aplicativo");
            int option = Exercises.validOption(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18);
            switch (option) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    Exercises.exercise1(1, 2);
                    break;//ingrese como parametros de la funcion los numeros a comparar
                case 2:
                    Exercises.exercise2();
                    break;
                case 3:
                    Exercises.exercise3();
                    break;
                case 4:
                    Exercises.exercise4();
                    break;
                case 5:
                    Exercises.exercise5();
                    break;
                case 6:
                    Exercises.exercise6();
                    break;
                case 7:
                    Exercises.exercise7();
                    break;
                case 8:
                    Exercises.exercise8();
                    break;
                case 9:
                    Exercises.exercise9();
                    break;
                case 10:
                    Exercises.exercise10();
                    break;
                case 11:
                    Exercises.exercise11();
                    break;
                case 12:
                    Exercises.exercise12();
                    break;
                case 13:
                    Exercises.exercise13();
                    break;
                case 14:
                    Exercises.exercise14();
                    break;
                case 15:
                    Exercises.exercise15();
                    break;
                case 16:
                    Exercises.exercise16();
                    break;
                case 17:
                    Exercises.exercise17();
                    break;
                case 18:
                    Exercises.exercise18();
                    break;
            }
        }
    }
}
