package com.sena.springecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "detalles")
	public class Detalle {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // anoataciones JOA
		
		private Integer id;
		private String nombre;
		private Double cantidad;
		private Double precio;
		private Double total;
	
		@ManyToOne
		private Orden orden ;
		
		
		@ManyToOne
		private Producto producto;


		public Detalle() {
			
		}


		public Detalle(Integer id, String nombre, double cantidad, double precio, Double total) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.cantidad = cantidad;
			this.precio = precio;
			this.total = total;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public double getCantidad() {
			return cantidad;
		}


		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}


		public double getPrecio() {
			return precio;
		}


		public void setPrecio(double precio) {
			this.precio = precio;
		}


		public Double getTotal() {
			return total;
		}


		public void setTotal(Double total) {
			this.total = total;
		}


		public Orden getOrden() {
			return orden;
		}


		public void setOrden(Orden orden) {
			this.orden = orden;
		}


		public Producto getProducto() {
			return producto;
		}


		public void setProducto(Producto producto) {
			this.producto = producto;
		}


		@Override
		public String toString() {
			return "Detalle [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
					+ ", total=" + total + "]";
		}
		
		
		
         
}
