package model;

import java.time.LocalDate;

public class Empleado extends Persona{
    private LocalDate fecha_incorporacion;
    private int num_despacho;

    public Empleado(String nombre, String apellido, String dni, Est_civ estado,int num_despacho,LocalDate fecha_incorporacion) {
        super(nombre, apellido, dni, estado);
        this.fecha_incorporacion = fecha_incorporacion;
        this.num_despacho = num_despacho;
    }

    public LocalDate getFecha_incorporacion() {
        return fecha_incorporacion;
    }
    public void setFecha_incorporacion(LocalDate fecha_incorporacion) {
        this.fecha_incorporacion = fecha_incorporacion;
    }
    public int getNum_despacho() {
        return num_despacho;
    }
    public void setNum_despacho(int num_despacho) {
        this.num_despacho = num_despacho;
    }
}
