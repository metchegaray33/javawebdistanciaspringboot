package persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import dominio.Empleado;

//definimos de que tipo es el repositorio y el tipo de la primary ky
public interface RepositorioEmpleados extends JpaRepository <Empleado,Long> {

}
