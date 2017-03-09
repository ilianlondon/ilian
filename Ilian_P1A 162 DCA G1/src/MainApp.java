import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class MainApp extends PApplet {


	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	@Override
	public void settings() {
		size(500, 500);
	}

	private ArrayList<String> usuarios;
	private ArrayList<String> informaciones;
	private ArrayList<String> tonos;

	private LinkedList<Elemento> elementos;

	@Override
	public void setup() {

		usuarios = new ArrayList<>();
		informaciones = new ArrayList<>();
		tonos = new ArrayList<>();
		elementos = new LinkedList<Elemento>();
		String[] usuariosString = loadStrings("../data/usuarios.txt");
		String[] informacionesString = loadStrings("../data/informacion.txt");
		String[] tonosString = loadStrings("../data/tonos.txt");

		for (int i = 0; i < informacionesString.length; i++) {
			String[] informacion = informacionesString[i].split("/");
			Elemento nuevo = new Elemento(usuariosString[i], informacion, tonosString[i]);
			elementos.add(nuevo);
		}
		for (int i = 0; i < elementos.size(); i++) {
			elementos.get(i).nomColor(this);
		}

	}

	@Override
	public void draw() {
		background(255);
		for (int i = 0; i < elementos.size(); i++) {
			elementos.get(i).pintar(this, i);
			;

		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void keyPressed() {
		if (keyCode == 49) {
			Collections.sort(elementos);
		}
		if (keyCode == 50) {
			
		}
		if (keyCode == 51) {
		
		}
		if (keyCode == 52) {
		
		}

	}
}
