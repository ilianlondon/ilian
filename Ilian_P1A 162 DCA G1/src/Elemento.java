import processing.core.PApplet;

public class Elemento implements Comparable {
	private String usuario, tono, id;
	private int r, g, b, edad, peso;
	private String[] info;

	public Elemento(String usuario, String[] info, String tono) {
		this.usuario = usuario;
		this.info = info;
		this.tono = tono;
	}

	public void nomColor(PApplet app) {
		String[] colores = tono.split("/");
		for (int i = 0; i < colores.length; i++) {

			r = Integer.parseInt(colores[0]);
			g = Integer.parseInt(colores[1]);
			b = Integer.parseInt(colores[2]);

		}
	}

	public void pintar(PApplet app, int u) {
		app.fill(r, g, b);
		app.text(usuario, 20, u * 20);

	}
 
	public void cargarInformacion(){
		id = info[0];
		edad = Integer.parseInt(info[1]);
		peso = Integer.parseInt(info[2]);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTono() {
		return tono;
	}

	public void setTono(String tono) {
		this.tono = tono;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Elemento) {
		return ((Elemento) o).edad-edad;	
	}
		return 0;

}
}
