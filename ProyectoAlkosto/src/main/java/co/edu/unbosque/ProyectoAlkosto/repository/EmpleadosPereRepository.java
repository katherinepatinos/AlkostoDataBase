package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosPereira;

public interface EmpleadosPereRepository extends JpaRepository<EmpleadosPereira, Integer> {

	public List<EmpleadosPereira> findByOrderByVentasDesc();

	public void deleteByNombre(String nombre);

	public Optional<EmpleadosPereira> findByNombre(String nombre);
}