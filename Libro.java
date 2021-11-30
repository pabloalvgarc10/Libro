
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
    }

    public String getAutor(){
            return autor;
    }
    
    public String getTitulo(){
            return titulo;
    }
    
    public int getnumeroPaginas(){
            return numeroPaginas;
    }
    
    public void imprimirDetalles(){
        System.out.println("Titulo Libro" + titulo);
        System.out.println("Autor Libro"  + autor);
        System.out.println("Paginas Libro" + numeroPaginas);
        
        if(numeroReferencia != ""){
            System.out.println("numero referencia" + numeroReferencia);
        }
        else{
            System.out.println("numero referencia = ZZZ");
        }
    }
    
    
    public String getDetalles(){
        String detalles = ("Titulo Libro" + titulo + "Autor" + autor + "Paginas" + numeroPaginas + ".." );
        
        
        if(numeroReferencia ==("")){
            detalles = "Titulo Libro" + titulo + "Autor" + autor + "Paginas" + "NumeroPaginas" + numeroPaginas + "numeroReferencia ZZ";
        }
        else{
            detalles = "Titulo Libro" + titulo + "Autor" + autor + "Paginas" + "NumeroPaginas" + numeroPaginas + numeroReferencia + "..";
        }
        
        return detalles;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public void setnumeroReferencia(String referencia){
        if(referencia.length()>3){
            numeroReferencia = referencia;
        }
        else{
            System.out.println("al menos tres caracteres");
        }
    }
        
}
