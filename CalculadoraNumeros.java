/*
 * Clase para trabajar con grupos de numeros
 */
public class CalculadoraNumeros {
    
    /*
     * Crea una lista de numeros al azar
     * @param cantidad Cuantos numeros crear
     * @param maximo El numero mas grande permitido
     * @return Lista de numeros creados
     */
    public int[] crearNumeros(int cantidad, int maximo);
    
    /*
     * Calcula el promedio de los numeros
     * @param numeros Lista de numeros
     * @return El promedio
     */
    public double calcularPromedio(int[] numeros);
    
    /*
     * Encuentra el numero mas grande
     * @param numeros Lista de numeros
     * @return El numero mas grande
     */
    public int encontrarMayor(int[] numeros);
    
    /*
     * Encuentra el numero mas pequeno
     * @param numeros Lista de numeros
     * @return El numero mas pequeno
     */
    public int encontrarMenor(int[] numeros);
}
