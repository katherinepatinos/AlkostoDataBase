package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosSincelejo;

public interface EmpleadosSinRepository extends JpaRepository<EmpleadosSincelejo, Integer> {

	public List<EmpleadosSincelejo> findByOrderByVentasDesc();

	public void deleteByNombre(String nombre);

	public Optional<EmpleadosSincelejo> findByNombre(String nombre);
}