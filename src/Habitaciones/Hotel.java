package Habitaciones;

public class Hotel {
   private String nombre;
   private int nHabitaciones;
   private int habitacionesDisponibles;
   private int habitacionesOcupadas;

   Hotel(){
       this.nombre="California";
       this.nHabitaciones=5;
       this.habitacionesDisponibles=getHabitacionesDisponibles();
   }

    public String getNombre() {
        return nombre;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public int getHabitacionesDisponibles() {
        return habitacionesDisponibles=nHabitaciones-habitacionesOcupadas;
    }

    public int getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }



}
