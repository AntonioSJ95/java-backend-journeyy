public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String email, String materia) {
        super(nombre, edad, email);
        this.materia = materia;
    }

    @Override
    public void presentarse(){
        super.presentarse();
        System.out.println("Mi materia es: " + materia);
    }

    public String getMateria() {
        return materia;
    }
}
