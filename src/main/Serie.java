package main;

public class Serie implements Entregable{
    String titulo;
    int numeroTemporadas=3;
    boolean enPrestamo=false;
    String genero;
    String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", enPrestamo=" + enPrestamo +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.enPrestamo=true;
    }

    @Override
    public void devolver() {
this.enPrestamo=false;
    }

    @Override
    public boolean estaEnPrestamo() {
        return this.enPrestamo;
    }

    @Override
    public void compareTo(Object a) {
        if(((Serie) a).numeroTemporadas==this.numeroTemporadas){
            System.out.println("La serie "+((Serie) a).titulo+" y "
                    +this.titulo+" tienen el mismo numero de temporadas.");
        }
        String t1;
        String t2;
        int n;
        t1=(((Serie) a).numeroTemporadas>this.numeroTemporadas)?((Serie) a).titulo:this.titulo;
        t2=(t1==this.titulo)?((Serie) a).titulo:this.titulo;
        n=Math.abs((((Serie) a).numeroTemporadas-this.numeroTemporadas));
        System.out.print("La serie "+t1+"tiene "+n+" temporadas mas que "+t2);
    }
}
