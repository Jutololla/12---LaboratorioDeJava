package main;

public class Videojuego implements Entregable {
    String titulo;
    int horasEstimadas = 10;
    boolean enPrestamo = false;
    String genero;
    String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String

    toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", enPrestamo=" + enPrestamo +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.enPrestamo = true;
    }

    @Override
    public void devolver() {
        this.enPrestamo = false;
    }

    @Override
    public boolean estaEnPrestamo() {
        return this.enPrestamo;
    }

    @Override
    public void compareTo(Object a) {
        if (((Videojuego) a).horasEstimadas == this.horasEstimadas) {
            System.out.println("El videojuego " + ((Videojuego) a).titulo + " y "
                    + this.titulo + " tienen el mismo numero de horas estimadas de juego.");
        }
        String v1;
        String v2;
        int n;
        v1 = (((Videojuego) a).horasEstimadas > this.horasEstimadas) ? ((Videojuego) a).titulo : this.titulo;
        v2 = (v1 == this.titulo) ? ((Videojuego) a).titulo : this.titulo;
        n = Math.abs((((Videojuego) a).horasEstimadas - this.horasEstimadas));
        System.out.print("El videojuego " + v1 + "tiene estimadas " + n + " horas de juego mas que " + v2);
    }

}
