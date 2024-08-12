package org.dio;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	private String nome;
	private List<Curso> cursos = new ArrayList<>();
	private List<Mentoria> mentorias = new ArrayList<>();
	private List<Dev> devsInscritos = new ArrayList<>();

	public Bootcamp(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
	}

	public List<Mentoria> getMentorias() {
		return mentorias;
	}

	public void adicionarMentoria(Mentoria mentoria) {
		this.mentorias.add(mentoria);
	}

	public List<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void inscreverDev(Dev dev) {
		this.devsInscritos.add(dev);
	}
}