package tareagrupalmoduloseis;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombres("Ayniver Jaqueline");
        persona.setApellidos("Chavarria Padilla");
        persona.setDireccion("Barrio Centro");
        persona.setEdad(20);
        persona.setTelefono("504 2312512");
        
        System.out.println(persona.getNombres());
        System.out.println(persona.getApellidos());
        System.out.println(persona.getDireccion());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }

}
