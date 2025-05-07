/*
 * Clase para hacer calculos basicos
 */
public class Calculadora {
    
    /*
     * Lee un numero que escribe el usuario
     * @param mensaje Texto que se muestra al usuario
     * @return El numero que escribio el usuario
     */
    public double leerNumero(String mensaje);
    
    /*
     * Pregunta que operacion quiere hacer (+, -, *, /)
     * @return El simbolo de la operacion elegida
     */
    public char leerOperacion();
    
    /*
     * Hace el calculo entre dos numeros
     * @param a Primer numero
     * @param b Segundo numero
     * @param op Operacion a realizar
     * @return El resultado
     */
    public double calcular(double a, double b, char op);
    
    /*
     * Muestra el resultado en pantalla
     * @param resultado El numero a mostrar
     */
    public void mostrarResultado(double resultado);
}
