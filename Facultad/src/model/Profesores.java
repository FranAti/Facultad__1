package model;

import java.time.LocalDate;

public class Profesores extends Empleado{
    private Dept dept;
    public Profesores(String nombre, String apellido, String dni, Est_civ estado, int num_despacho, String fecha_incorporacion,Dept dept) {
        super(nombre, apellido, dni, estado, num_despacho,fecha_incorporacion);
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void cambioDept(Dept dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return super.toString()+", Departamento: "+dept;
    }
}
