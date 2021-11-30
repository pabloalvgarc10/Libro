
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas , boolean texto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = texto;
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
        String esTexto = "..";
        
        System.out.println("Titulo Libro" + titulo);
        System.out.println("Autor Libro"  + autor);
        System.out.println("Paginas Libro" + numeroPaginas);
        System.out.println("Veces Prestado" + vecesPrestado);
        System.out.println("esLibroDeTexto" + esTexto);
        
        if(numeroReferencia != ""){
            System.out.println("numero referencia" + numeroReferencia);
        }
        else{
            System.out.println("numero referencia = ZZZ");
        }
        
        
        
        if(esLibroDeTexto == true){
            esTexto = "yes";
        }
        
        if(esLibroDeTexto == false){
            esTexto = "no";
        }
    }
    
    
    public String getDetalles(){
        String detalles = ("Titulo Libro" + titulo + "Autor" + autor + "Paginas" + numeroPaginas + ".." );
        
        
        if(numeroReferencia ==("")){
            detalles = "Titulo Libro" + titulo + "Autor" + autor + "Paginas" + "NumeroPaginas" + numeroPaginas + "numeroReferencia ZZ" + "Veces prestado" + vecesPrestado; 
        }
        else{
            detalles = "Titulo Libro" + titulo + "Autor" + autor + "Paginas" + "NumeroPaginas" + numeroPaginas + numeroReferencia + ".." +  "Veces prestado" + vecesPrestado; 
        }
        
        String Texto = "..";
        
        if(esLibroDeTexto == true){
            Texto = "yes";
        }
        
        if(esLibroDeTexto == false){
            Texto = "no";
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
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public void prestar(){
        vecesPrestado +=1;
    }
    
    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
    }
}
