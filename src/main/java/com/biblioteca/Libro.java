package com.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int añoPublicacion;

    public Libro(String titulo, String autor, String isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean buscarPorTitulo(String tituloBuscado) {
        return titulo.equalsIgnoreCase(tituloBuscado);
    }

    public boolean buscarPorAutor(String autorBuscado) {
        return autor.equalsIgnoreCase(autorBuscado);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
}
