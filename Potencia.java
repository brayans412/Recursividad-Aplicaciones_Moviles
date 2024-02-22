// Grupo: 
// ELejalde Salgado Edgar David
// Lopez Rincon Braham Steveen
// Salgado Brayan Enrique

public class Potencia{
    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es " + resultado);
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return multiplicacion(base, potencia(base, exponente - 1));
        }
    }

    public static int multiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacion(a, b - 1);
        }
    }
}