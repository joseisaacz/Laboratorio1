/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author jonathan
 */
public class GrupoAlumno {
    
    private Grupo grupo;
    private Alumno alumno;
    private float nota;

    public GrupoAlumno() {
    }

    public GrupoAlumno(Grupo grupo, Alumno alumno, float nota) {
        this.grupo = grupo;
        this.alumno = alumno;
        this.nota=nota;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "GrupoAlumno{" + "grupo=" + grupo + ", alumno=" + alumno + ", nota=" + nota + '}';
    }


    
    
}
