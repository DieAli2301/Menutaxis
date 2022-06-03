package com.upchiapas.menutaxis;

import com.upchiapas.menutaxis.models.Choferes;
import com.upchiapas.menutaxis.models.Taxis;

import java.util.Scanner;

public class Main {

        private static Choferes[] listChoferes = new Choferes[10];
        private static com.upchiapas.menutaxis.models.Taxis[] listTaxis = new Taxis[10];
        private static Scanner teclado;
        private static com.upchiapas.menutaxis.models.Choferes Choferes;
        private static String eda;
        private static Taxis Taxis;
        private static int AsChof;
        private static int AsTaxi;
        private static int option;
        private static String id;

        public Main() {
        }

        public static void main(String[] args) {
            do {
                System.out.println("***** Taxis Rapiditos *****");
                System.out.println("1. Alta de taxis ");
                System.out.println("2. Alta de choferes ");
                System.out.println("3. Agregar chofer a vehiculos ");
                System.out.println("4. Imprimir las ganancias generadas por vehiculo ");
                System.out.println("5. Salir ");
                System.out.println("Opcion: ");
                option = teclado.nextInt();
                new Scanner(System.in);
                switch (option) {
                    case 1:
                        addTaxis();
                        break;
                    case 2:
                        addChoferes();
                        break;
                    case 3:
                        addAsignar();
                        break;
                    case 4:
                        addGanancias();
                }
            } while(option <= 6);

        }

        public static void addTaxis() {
            teclado = new Scanner(System.in);
            System.out.println("Ingrese la marca del Taxi: ");
            String marc = teclado.nextLine();
            System.out.println("Ingrese el modelo del Taxi: ");
            String model = teclado.nextLine();
            System.out.println("Ingrese el numero de Taxi: ");
            int taxi = teclado.nextInt();
            Taxis = new Taxis();
            Taxis.setMarc(marc);
            Taxis.setModel(model);
            Taxis.setTaxi(taxi);

            byte ind;
            for(ind = 0; listTaxis[ind] != null; ++ind) {
            }

            listTaxis[ind] = Taxis;

            for(int j = 0; listTaxis[j] != null; ++j) {
                Taxis var10001 = listTaxis[j];
                System.out.println("\n\n" + var10001);
            }

        }

        private static void addChoferes() {
            teclado = new Scanner(System.in);
            System.out.println("Ingrese el ID del chofer: ");
            String ID = teclado.nextLine();
            System.out.println("Ingrese el nombre del chofer: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la edad de chofer: ");
            Short eda = teclado.nextShort();
            Choferes = new Choferes();
            Choferes.setID(ID);
            Choferes.setNombre(nombre);
            Choferes.setEda(eda);

            byte ind;
            for(ind = 0; listChoferes[ind] != null; ++ind) {
            }

            listChoferes[ind] = Choferes;

            for(int k = 0; listChoferes[k] != null; ++k) {
                Choferes var10001 = listChoferes[k];
                System.out.println("\n\n" + var10001);
            }

        }

        public static void addAsignar() {
            System.out.println("Seleccione el Chofer: ");
            AsChof = teclado.nextByte();
            Choferes var10001 = listChoferes[AsChof];
            System.out.println(" " + var10001 + "Se le asigno el taxi: " + listTaxis[AsTaxi]);
        }

        private static void addGanancias() {
        }

        static {
            teclado = new Scanner(System.in);
        }
    }

