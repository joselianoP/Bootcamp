package org.dio;

import java.util.HashSet;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Curso> cursosConcluidos = new HashSet<>();
	private Set<Curso> cursosInscritos = new HashSet<>();
	private Set<Mentoria> mentoriasConcluidas = new HashSet<>();
	private Set<Mentoria> mentoriasInscritas = new HashSet<>();

	public Dev(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void inscreverCurso(Curso curso) {
		this.cursosInscritos.add(curso);
	}

	public void inscreverMentoria(Mentoria mentoria) {
		this.mentoriasInscritas.add(mentoria);
	}

	public void concluirCurso(Curso curso) {
		if (this.cursosInscritos.remove(curso)) {
			this.cursosConcluidos.add(curso);
		}
	}

	public void concluirMentoria(Mentoria mentoria) {
		if (this.mentoriasInscritas.remove(mentoria)) {
			this.mentoriasConcluidas.add(mentoria);
		}
	}

	public void mostrarCursosConcluidos() {
		System.out.println("Cursos Concluídos:");
		for (Curso curso : cursosConcluidos) {
			curso.mostrarDetalhes();
		}
	}

	public void mostrarMentoriasConcluidas() {
		System.out.println("Mentorias Concluídas:");
		for (Mentoria mentoria : mentoriasConcluidas) {
			mentoria.mostrarDetalhes();
		}
	}
}
