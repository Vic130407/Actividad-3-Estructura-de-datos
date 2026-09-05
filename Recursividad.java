public class Recursividad {
    public static int getContraseña(int clave) {
        if (clave==0){
            return 0;
        }
        int contraseña = clave % 10;
        clave = clave / 10;
        contraseña+= getContraseña(clave);
        if (contraseña>9){
            contraseña = getContraseña(contraseña);
        }
        return contraseña;
    }
    public static void main(String[] args) {
        System.out.println("La primera parte de la contraseña es: " + getContraseña(84729)+getContraseña(56318)+getContraseña(92746));
    }
}