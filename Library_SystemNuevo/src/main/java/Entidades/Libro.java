/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Libro {
    int idLibro; 
    String Codigo_Libro;
    int idEditorial;
    String Titulo;
    int idEscritor;
    int idCategoria;
    int idGenero_Literario;
    int idSubgenero_Literario;
    String Clasificacion;

    public Libro() {
    }

    public Libro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Libro(int idLibro, String Codigo_Libro, int idEditorial, String Titulo, int idEscritor, int idCategoria, int idGenero_Literario, int idSubgenero_Literario, String Clasificacion) {
        this.idLibro = idLibro;
        this.Codigo_Libro = Codigo_Libro;
        this.idEditorial = idEditorial;
        this.Titulo = Titulo;
        this.idEscritor = idEscritor;
        this.idCategoria = idCategoria;
        this.idGenero_Literario = idGenero_Literario;
        this.idSubgenero_Literario = idSubgenero_Literario;
        this.Clasificacion = Clasificacion;
    }
    
    

    public Libro(String Codigo_Libro, int idEditorial, String Titulo, int idEscritor, int idCategoria, int idGenero_Literario, int idSubgenero_Literario, String Clasificacion) {
        this.Codigo_Libro = Codigo_Libro;
        this.idEditorial = idEditorial;
        this.Titulo = Titulo;
        this.idEscritor = idEscritor;
        this.idCategoria = idCategoria;
        this.idGenero_Literario = idGenero_Literario;
        this.idSubgenero_Literario = idSubgenero_Literario;
        this.Clasificacion = Clasificacion;
    }

    
    
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getCodigo_Libro() {
        return Codigo_Libro;
    }

    public void setCodigo_Libro(String Codigo_Libro) {
        this.Codigo_Libro = Codigo_Libro;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getIdEscritor() {
        return idEscritor;
    }

    public void setIdEscritor(int idEscritor) {
        this.idEscritor = idEscritor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdGenero_Literario() {
        return idGenero_Literario;
    }

    public void setIdGenero_Literario(int idGenero_Literario) {
        this.idGenero_Literario = idGenero_Literario;
    }

    public int getIdSubgenero_Literario() {
        return idSubgenero_Literario;
    }

    public void setIdSubgenero_Literario(int idSubgenero_Literario) {
        this.idSubgenero_Literario = idSubgenero_Literario;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
}
