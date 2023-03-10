package ejercicio2;


//Alumno Matias Gigena
public class PuntoD {
    public static void main(String[] args) {

        double ingresosMensuales = 156698;
        int cantidadVehiculos = 2;
        int cantidadInmuebles = 1;
        Boolean capacidadEconomicaPlena = false;

        if((ingresosMensuales <= 489083) && (cantidadVehiculos <3 ) && (cantidadInmuebles <3 ) && (capacidadEconomicaPlena == false)){

            System.out.println("La persona NO pertenece al tramo de ingresos altos ");

        }else{

            System.out.println("La persona pertenece al tramo de ingresos altos ");

        }
    }
}
