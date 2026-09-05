public class Divide_y_venceras {
    public static int getContraseña(int[] señales, int inicio, int fin){
        if(inicio == fin){
            return señales[inicio];
        }
        int mitad = (inicio + fin) / 2;
        int izquierda = getContraseña(señales, inicio, mitad);
        int derecha = getContraseña(señales, mitad + 1, fin);
        return Math.max(izquierda, derecha);
    }
    public static void main(String[] args) {
        int[] señales = {418, 732, 156, 894, 327, 641, 285, 519,763, 204, 947, 386, 675, 128, 856, 493};
        System.out.println("La segunda parte de la contraseña es: " + getContraseña(señales, 0, señales.length - 1));
    }
}