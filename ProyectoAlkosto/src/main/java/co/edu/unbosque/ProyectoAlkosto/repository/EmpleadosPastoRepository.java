package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ProyectoAlkosto.model.EmpleadosPasto;

public interface EmpleadosPastoRepository extends JpaRepository<EmpleadosPasto, Integer> {

	public List<EmpleadosPasto> findByOrderByVentasDesc();

	public void deleteByNombre(String nombre);

	public Optional<EmpleadosPasto> findByNombre(String nombre);
}