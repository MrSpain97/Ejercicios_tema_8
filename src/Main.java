public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("David Revilla");
        persona.setTelefono(617787780);
        System.out.println("Edad: "+persona.getEdad()+"\n"
                +"Nombre: "+persona.getNombre()+"\n"
                +"Telefono: "+persona.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad= edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }


}