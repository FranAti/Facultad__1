package model;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String apellido, String dni, Est_civ estado) {
        super(nombre, apellido, dni, estado);
    }
    //Curso podria ser un enum tambien, con todos los cursos que hay.
    private String curso;

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
