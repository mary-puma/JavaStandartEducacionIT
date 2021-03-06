package com.educacionIT.javase.entidades;

public abstract class Transporte extends Auto {
	private String licencia;
	private String tipo;

	public Transporte() {
		super();
	}

	public Transporte(String color, String marca, Patente patente, int puestos, String licencia, String tipo) {
		super(color, marca, patente, puestos);
		this.licencia = licencia;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Transporte [toString()=" + super.toString() + ", licencia=" + licencia + ", tipo=" + tipo + "]";
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
