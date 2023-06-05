package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.ProyectoAlkosto.model.InventarioPereira;

public interface InventarioPereRepository extends CrudRepository<InventarioPereira, Integer>{

	public Optional<InventarioPereira> findByProducto(String producto);
	public List<InventarioPereira> findAll();
}
