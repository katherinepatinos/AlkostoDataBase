package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.ProyectoAlkosto.model.InventarioSincelejo;

public interface InventarioSinRepository extends CrudRepository<InventarioSincelejo, Integer>{

	public Optional<InventarioSincelejo> findByProducto(String producto);
	public List<InventarioSincelejo> findAll();
}
