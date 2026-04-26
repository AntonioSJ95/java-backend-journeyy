public class Alumno extends Persona{
    private String matricula;

    public Alumno(String nombre, int edad, String email, String matricula) {
        super(nombre, edad, email);
        this.matricula = matricula;
    }

    @Override
    public void presentarse(){
       super.presentarse();
        System.out.println("Mi matricula es: " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }
}
