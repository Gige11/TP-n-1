package ejercicio1;


//Alumno Matias Gigena
public class PuntoB {

    public static void main(String[] args) {

        int a = 3;
        int b = 12;

        while(a <= b){
            if((a%2) != 0){
                a++;
            }
            System.out.println(a);
            a++;
        }
    }
}
