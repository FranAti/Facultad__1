package model;

import java.time.LocalDate;

public class PersonalServicio extends Empleado {
    private Secc seccion;
    public PersonalServicio(String nombre, String apellido, String dni, Est_civ estado, int num_despacho, LocalDate fecha_incorporacion, Secc seccion) {
        super(nombre, apellido, dni, estado, num_despacho, fecha_incorporacion);
        this.seccion = seccion;
    }
}
