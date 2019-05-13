package dominio;

import javax.persistence.Entity; //si uso este paquete es que me deja que puedo dejar de usar hibernate y pasar a toplink si quiero
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data //genera getter y setter,equals, hashcode, to string
@Entity //marca es una entidad que quiero persisitr a hibernate
//no marco @Table ni @column significa que las tablas y columnas se llaman asi
//agrego comentario4
public class Empleado {
	/**
	 * como mínimo marco cuál es el id
	 * puedo poner que sea autogenerado
	 */
	private @Id @GeneratedValue Long id;
	private String nombre;
	private String cargo; 
	public Empleado(Long id, String nombre, String cargo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cargo = cargo;
	}

}
