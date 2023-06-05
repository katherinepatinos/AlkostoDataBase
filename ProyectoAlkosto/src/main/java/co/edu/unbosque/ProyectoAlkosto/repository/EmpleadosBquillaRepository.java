package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosBquilla;

public interface EmpleadosBquillaRepository extends JpaRepository<EmpleadosBquilla, Integer> {

	public List<EmpleadosBquilla> findByOrderByVentasDesc();

	public void deleteByNombre(String nombre);

	public Optional<EmpleadosBquilla> findByNombre(String nombre);
}