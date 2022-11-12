/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareagrupalmoduloseis;

/**
 *
 * @author OSCAR
 */
public class Deportista extends Persona{
    public String disciplina;
    public String posicion;
public Deportista(){
 
}

public void setDisciplina(String disciplina){
   this.disciplina= disciplina;
}
public String getDisciplina(){
return disciplina;
}
public void setPosicion(String posicion){
   this.posicion= posicion;
}
public String getPosicion(){
return posicion;
}
 
}