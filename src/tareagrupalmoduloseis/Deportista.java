/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author OSCAR
 */
public class Deportista extends Persona{
    public String disciplina;

public Deportista(){
  establecerNombre("Carlos");
  establecerApellido("Guevara");
  establecerEdad(30);
}

public void establecerDisciplina(String _disciplina){
   this.disciplina=_disciplina;
}
public String obtenerDisciplina(){
return disciplina;
}

    @Override
    public String getProfesion(){
    return "Deportista";
}

    @Override
    public int getExperiencia(){
    return 11;
}
}