package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void buscarPorTitulo(String tituloBusqueda) {
        boolean encontrado = false;
        for (Libro libro : libros) {
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

    public void buscarPorAutor(String autorBusqueda) {
        boolean encontrado = false;
        for (Libro libro : libros) {
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

    public void mostrarTodosLosLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        } else {
            System.out.println("Listado de todos los libros:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
