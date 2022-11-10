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
        
        System.out.println("");
        Doctor doctor = new Doctor();
        doctor.setNombres("Mario Ruben");
        doctor.setApellidos("Estrada Zuniga");
        doctor.setDireccion("Barrio Terminal");
        doctor.setTelefono("504 34213522");
        doctor.setEdad(40);
        doctor.setEspecializacion("Cirujano");
        doctor.setLugarTrabajo("Hospital General");
        doctor.setAnioExperiencia(5);
        
        System.out.println(doctor.getNombres());
        System.out.println(doctor.getApellidos());
        System.out.println(doctor.getDireccion());
        System.out.println(doctor.getTelefono());
        System.out.println(doctor.getEdad());
        System.out.println(doctor.getEspecializacion());
        System.out.println(doctor.getLugarTrabajo());
        System.out.println(doctor.getAnioExperiencia());
        
    }

}
