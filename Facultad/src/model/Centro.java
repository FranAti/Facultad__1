package model;

public class Centro {
    private Estudiante [] Estudiantes ;
    private Profesores [] Profesores ;
    private PersonalServicio [] PERSONAL_SERVICIO;
    private int numEstudiantes;
    private int numProfesores;
    private int numPersonal;

    public Centro(){
        Estudiantes = new Estudiante[10];
        Profesores = new Profesores[10];
        PERSONAL_SERVICIO = new PersonalServicio[10];

        numEstudiantes = 0;
        numProfesores = 0;
        numPersonal = 0;
    }

    public void darAlta(Estudiante e) {
        Estudiantes[numEstudiantes] = e;
        numEstudiantes++;
    }

    public void darAlta(Profesores p) {
        Profesores[numProfesores] = p;
        numProfesores++;
    }

    public void darAlta(PersonalServicio ps) {
        PERSONAL_SERVICIO[numPersonal] = ps;
        numPersonal++;
    }

    public void bajaEstudiante(String dni) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (Estudiantes[i].getDni().equals(dni)) {
                for (int j = i; j < numEstudiantes - 1; j++) {
                    Estudiantes[j] = Estudiantes[j + 1];
                }
                Estudiantes[numEstudiantes - 1] = null;
                numEstudiantes--;
                return;
            }
        }
    }
    public void bajaProfesor(String dni) {
        for (int i = 0; i < numProfesores; i++) {
            if (Profesores[i].getDni().equals(dni)) {
                for (int j = i; j < numProfesores - 1; j++) {
                    Profesores[j] = Profesores[j + 1];
                }
                Profesores[numProfesores - 1] = null;
                numProfesores--;
                return;
            }
        }
    }
    public void bajaPersonal(String dni) {
        for (int i = 0; i < numPersonal; i++) {
            if (PERSONAL_SERVICIO[i].getDni().equals(dni)) {
                for (int j = i; j < numPersonal - 1; j++) {
                    PERSONAL_SERVICIO[j] = PERSONAL_SERVICIO[j + 1];
                }
                PERSONAL_SERVICIO[numPersonal - 1] = null;
                numPersonal--;
                return;
            }
        }
    }

    public void imprimirPersonas() {

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println(Estudiantes[i]);
        }

        for (int i = 0; i < numProfesores; i++) {
            System.out.println(Profesores[i]);
        }

        for (int i = 0; i < numPersonal; i++) {
            System.out.println(PERSONAL_SERVICIO[i]);
        }
    }
}
