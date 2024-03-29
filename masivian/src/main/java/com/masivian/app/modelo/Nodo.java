package com.masivian.app.modelo;

public class Nodo {

	private int valor;
	private Nodo hojaIzquierda;
	private Nodo hojaDerecha;

	public Nodo(int valor) {
		this.valor = valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public Nodo getHojaIzquierda() {
		return hojaIzquierda;
	}

	public void setHojaIzquierda(Nodo hojaIzquierda) {
		this.hojaIzquierda = hojaIzquierda;
	}

	public Nodo getHojaDerecha() {
		return hojaDerecha;
	}

	public void setHojaDerecha(Nodo hojaDerecha) {
		this.hojaDerecha = hojaDerecha;
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + ", hojaIzquierda=" + hojaIzquierda + ", hojaDerecha=" + hojaDerecha + "]";
	}

}