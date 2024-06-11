package com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nSistema de Gestión de Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int añoPublicacion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn, añoPublicacion));
                    System.out.println("Libro agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Buscar libro por título: ");
                    String tituloBusqueda = scanner.nextLine();
                    buscarPorTitulo(biblioteca, tituloBusqueda);
                    break;
                case 3:
                    System.out.print("Buscar libro por autor: ");
                    String autorBusqueda = scanner.nextLine();
                    buscarPorAutor(biblioteca, autorBusqueda);
                    break;
                case 4:
                    biblioteca.mostrarTodosLosLibros();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de gestión de biblioteca.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 5.");
                    break;
            }
        }

        scanner.close();
    }

    private static void buscarPorTitulo(Biblioteca biblioteca, String tituloBusqueda) {
        boolean encontrado = false;
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.buscarPorTitulo(tituloBusqueda)) {
                System.out.println("Resultado de la búsqueda:");
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con ese título.");
        }
    }

    private static void buscarPorAutor(Biblioteca biblioteca, String autorBusqueda) {
        boolean encontrado = false;
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.buscarPorAutor(autorBusqueda)) {
                System.out.println("Resultado de la búsqueda:");
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }
}
