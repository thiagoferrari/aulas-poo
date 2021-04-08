/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3.exe0;

/**
 *
 * @author vimarteleto
 */
public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    
    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.setProfessor(professor);
    }

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public final void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public final void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String mostra() {
        return "Disciplina{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", professor=" + professor.mostra() + '}';
    }
       
    
}
