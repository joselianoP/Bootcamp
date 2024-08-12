package org.dio;

import java.time.LocalDate;

public class Application {
	public static void main(String[] args) {
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer");

		Curso curso1 = new Curso("Curso Java", "Aprenda Java do básico ao avançado", 80);
		Curso curso2 = new Curso("Curso Spring", "Aprenda Spring Framework", 60);

		Mentoria mentoria1 = new Mentoria("Mentoria Java", "Dicas para desenvolvimento em Java", LocalDate.now());

		bootcamp.adicionarCurso(curso1);
		bootcamp.adicionarCurso(curso2);
		bootcamp.adicionarMentoria(mentoria1);

		Dev dev1 = new Dev("João");
		dev1.inscreverCurso(curso1);
		dev1.inscreverMentoria(mentoria1);

		dev1.concluirCurso(curso1);
		dev1.concluirMentoria(mentoria1);

		dev1.mostrarCursosConcluidos();
		dev1.mostrarMentoriasConcluidas();
	}
}
