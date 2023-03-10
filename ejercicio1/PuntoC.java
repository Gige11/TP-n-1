package ejercicio1;

//Alumno Matias Gigena
public class PuntoC {

    public static void main(String[] args) {

        int a = 3;
        int b = 12;
        Boolean imprimirPares = false;

        while(a <= b){
            if (imprimirPares == true){
                if((a%2) != 0){
                    a++;
                }
                System.out.println(a);
                a++;
            } else {
                if((a%2) != 0){
                    System.out.println(a);
                    a = a+2;
                }else {
                    a++;
                }
            }
        }
    }
}