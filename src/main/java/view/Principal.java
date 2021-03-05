package view;

import java.util.Random;

import controller.ThreadCalcula;

public class Principal {

	public static void main(String[] args) {

		Thread tCal = new ThreadCalcula();
		tCal.start();

	}

}
