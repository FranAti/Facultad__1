package model;

import java.time.LocalDate;

public class PersonalServicio extends Empleado {
    private Secc seccion;
    public PersonalServicio(String nombre, String apellido, String dni, Est_civ estado, int num_despacho, String fecha_incorporacion, Secc seccion) {
        super(nombre, apellido, dni, estado, num_despacho, fecha_incorporacion);
        this.seccion = seccion;
    }

    public Secc getSeccion() {
        return seccion;
    }
    public void cambioSeccion(Secc seccion) {
        this.seccion = seccion;
    }
    @Override
    public String toString() {
        return super.toString()+", Seccion: "+seccion;
    }
}
