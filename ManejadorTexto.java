/**
 * Clase para trabajar con texto
 */
public class ManejadorTexto {
    
    /**
     * Lee texto que escribe el usuario
     * @param mensaje Lo que se muestra al usuario
     * @return El texto que escribio
     */
    public String leerTexto(String mensaje);
    
    /**
     * Cuenta cuantas vocales hay en el texto
     * @param texto El texto a revisar
     * @return Numero de vocales encontradas
     */
    public int contarVocales(String texto);
    
    /**
     * Escribe el texto al reves
     * @param texto El texto original
     * @return El texto invertido
     */
    public String invertirTexto(String texto);
    
    /**
     * Revisa si el texto se lee igual al derecho y al reves
     * @param texto El texto a revisar
     * @return true si se lee igual, false si no
     */
    public boolean esPalindromo(String texto);
}
