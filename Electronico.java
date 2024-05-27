package herencias;

class Electronico {
	private String nombre;
	private double precio;
	private String marca;

	public Electronico(String nombre, double precio, String marca) {
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
    }

