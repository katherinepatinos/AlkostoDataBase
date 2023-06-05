package co.edu.unbosque.ProyectoAlkosto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.ProyectoAlkosto.model.InventarioPasto;

public interface InventarioPastoRepository extends CrudRepository<InventarioPasto, Integer>{

	public Optional<InventarioPasto> findByProducto(String producto);
	public List<InventarioPasto> findAll();
}
