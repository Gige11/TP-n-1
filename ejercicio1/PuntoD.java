package ejercicio1;

//Alumno Matias Gigena
public class PuntoD {

    public static void main(String[] args) {

        int a = 3;
        int b = 15;

        if ((b%2) != 0){
            b= b-1;
        }
        for(int x=b;x>=a;x=x-2){
            System.out.println(x);
        }
    }
}
