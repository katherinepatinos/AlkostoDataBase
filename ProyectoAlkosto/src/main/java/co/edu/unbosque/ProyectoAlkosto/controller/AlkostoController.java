package co.edu.unbosque.ProyectoAlkosto.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.ProyectoAlkosto.model.*;
import co.edu.unbosque.ProyectoAlkosto.repository.*;
import co.edu.unbosque.ProyectoAlkosto.service.CrearPDF;
import jakarta.transaction.Transactional;

@Transactional
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/alkosto")
public class AlkostoController {

	@Autowired
	private EmpleadosBgtaRepository bogota;
	@Autowired
	private EmpleadosBquillaRepository barranquilla;
	@Autowired
	private EmpleadosCaliRepository cali;
	@Autowired
	private EmpleadosPastoRepository pasto;
	@Autowired
	private EmpleadosPereRepository pereira;
	@Autowired
	private EmpleadosSinRepository sincelejo;
	@Autowired
	private EmpleadosVillavoRepository villavicencio;
	@Autowired
	private InventarioBgtaRepository bogotaInv;
	@Autowired
	private InventarioBquillaRepository barranInv;
	@Autowired
	private InventarioCaliRepository caliInv;
	@Autowired
	private InventarioPastoRepository pastoInv;
	@Autowired
	private InventarioPereRepository pereiInv;
	@Autowired
	private InventarioSinRepository sinceInv;
	@Autowired
	private InventarioVillavoRepository villavoInv;
	@Autowired
	private CrearPDF pdf;

	@PostMapping("/inventario")
	public ResponseEntity<String> agregarInventario(@RequestParam("cmd") String cmd, @RequestParam String producto,
			@RequestParam int valor, @RequestParam int cantidad) {

		if (cmd.equals("Bogota")) {
			InventarioBogota temp = new InventarioBogota();

			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			bogotaInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");

		} else if (cmd.equals("Barranquilla")) {
			InventarioBquilla temp = new InventarioBquilla();
			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			barranInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");

		} else if (cmd.equals("Cali")) {
			InventarioCali temp = new InventarioCali();
			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			caliInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");

		} else if (cmd.equals("Pasto")) {
			InventarioPasto temp = new InventarioPasto();
			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			pastoInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");

		} else if (cmd.equals("Pereira")) {
			InventarioPereira temp = new InventarioPereira();
			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			pereiInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");

		} else if (cmd.equals("Sincelejo")) {
			InventarioSincelejo temp = new InventarioSincelejo();
			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			sinceInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");

		} else if (cmd.equals("Villavicencio")) {
			InventarioVillavicencio temp = new InventarioVillavicencio();
			temp.setProducto(producto);
			temp.setValorUnitario(valor);
			temp.setCantidad(cantidad);

			villavoInv.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("201");
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("404");
	}

	@GetMapping("/inventariobogota")
	public ResponseEntity<List<InventarioBogota>> mostrarInventarioBogota() {
		List<InventarioBogota> op = bogotaInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/inventariobarranquilla")
	public ResponseEntity<List<InventarioBquilla>> mostrarInventarioBarranquilla() {
		List<InventarioBquilla> op = barranInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/inventariocali")
	public ResponseEntity<List<InventarioCali>> mostrarInventarioCali() {
		List<InventarioCali> op = caliInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/inventariopasto")
	public ResponseEntity<List<InventarioPasto>> mostrarInventarioPasto() {
		List<InventarioPasto> op = pastoInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/inventariopereira")
	public ResponseEntity<List<InventarioPereira>> mostrarInventarioPereira() {
		List<InventarioPereira> op = pereiInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/inventariosincelejo")
	public ResponseEntity<List<InventarioSincelejo>> mostrarInventarioSincelejo() {
		List<InventarioSincelejo> op = sinceInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/inventariovillavicencio")
	public ResponseEntity<List<InventarioVillavicencio>> mostrarInventarioVillavicencio() {
		List<InventarioVillavicencio> op = villavoInv.findAll();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@PostMapping("/empleados")
	public ResponseEntity<String> agregarEmpleado(@RequestParam String cmd, @RequestParam String nombre,
			@RequestParam Date nacimiento, @RequestParam String sexo, @RequestParam Date ingreso,
			@RequestParam int ventas, @RequestParam String productos) {

		if (cmd.equals("Bogota")) {

			EmpleadosBogota temp = new EmpleadosBogota();

			Optional<InventarioBogota> po = bogotaInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioBogota pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(productos);

			bogota.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED BOGOTA");

		} else if (cmd.equals("Barranquilla")) {

			EmpleadosBquilla temp = new EmpleadosBquilla();

			Optional<InventarioBquilla> po = barranInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioBquilla pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(productos);

			barranquilla.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED BARRANQUILLA");

		} else if (cmd.equals("Cali")) {

			EmpleadosCali temp = new EmpleadosCali();

			Optional<InventarioCali> po = caliInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioCali pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(productos);

			cali.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED CALI");

		} else if (cmd.equals("Pasto")) {

			EmpleadosPasto temp = new EmpleadosPasto();

			Optional<InventarioPasto> po = pastoInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioPasto pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(productos);

			pasto.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED PASTO");

		} else if (cmd.equals("Pereira")) {

			EmpleadosPereira temp = new EmpleadosPereira();

			Optional<InventarioPereira> po = pereiInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioPereira pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(productos);

			pereira.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED PEREIRA");

		} else if (cmd.equals("Sincelejo")) {

			EmpleadosSincelejo temp = new EmpleadosSincelejo();
			
			Optional<InventarioSincelejo> po = sinceInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioSincelejo pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);temp.setProductosVendidos(productos);

			sincelejo.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED SINCELEJO");

		} else if (cmd.equals("Villavicencio")) {

			EmpleadosVillavicencio temp = new EmpleadosVillavicencio();
			
			Optional<InventarioVillavicencio> po = villavoInv.findByProducto(productos);

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Producto no disponible");
			}

			InventarioVillavicencio pemt = po.get();
			temp.setNombre(nombre);
			temp.setNacimiento(nacimiento);
			temp.setSexo(sexo);
			temp.setIngreso(ingreso);
			temp.setVentas(ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(productos);

			villavicencio.save(temp);

			return ResponseEntity.status(HttpStatus.CREATED).body("CREATED VILLAVICENCIO");
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sucursal no disponible");
	}

	@PutMapping("/empleados/{nombre}")
	public ResponseEntity<String> actualizarVentas(@RequestParam String cmd, @RequestParam String nombre,
			@RequestParam int ventas, @RequestParam String producto) {

		if (cmd.equals("Bogota")) {

			Optional<EmpleadosBogota> op = bogota.findByNombre(nombre);
			Optional<InventarioBogota> po = bogotaInv.findByProducto(producto);

			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Bogota");
			}

			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosBogota temp = op.get();
			InventarioBogota pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Bogota");

		} else if (cmd.equals("Barranquilla")) {

			Optional<EmpleadosBquilla> op = barranquilla.findByNombre(nombre);
			Optional<InventarioBquilla> po = barranInv.findByProducto(producto);

			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Barranquilla");
			}
			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosBquilla temp = op.get();
			InventarioBquilla pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Barranquilla");

		} else if (cmd.equals("Cali")) {

			Optional<EmpleadosCali> op = cali.findByNombre(nombre);
			Optional<InventarioCali> po = caliInv.findByProducto(producto);

			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Cali");
			}
			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosCali temp = op.get();
			InventarioCali pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Cali");

		} else if (cmd.equals("Pasto")) {

			Optional<EmpleadosPasto> op = pasto.findByNombre(nombre);
			Optional<InventarioPasto> po = pastoInv.findByProducto(producto);

			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Pasto");
			}
			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosPasto temp = op.get();
			InventarioPasto pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Pasto");

		} else if (cmd.equals("Pereira")) {

			Optional<EmpleadosPereira> op = pereira.findByNombre(nombre);
			Optional<InventarioPereira> po = pereiInv.findByProducto(producto);

			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Pereira");
			}
			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosPereira temp = op.get();
			InventarioPereira pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Pereira");

		} else if (cmd.equals("Sincelejo")) {

			Optional<EmpleadosSincelejo> op = sincelejo.findByNombre(nombre);
			Optional<InventarioSincelejo> po = sinceInv.findByProducto(producto);
			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Sincelejo");
			}
			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosSincelejo temp = op.get();
			InventarioSincelejo pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Sincelejo");

		} else if (cmd.equals("villavicencio")) {

			Optional<EmpleadosVillavicencio> op = villavicencio.findByNombre(nombre);
			Optional<InventarioVillavicencio> po = villavoInv.findByProducto(producto);

			if (!op.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro el empleado Barranquilla");
			}
			if (!po.isPresent()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se esta disponible el producto");
			}

			EmpleadosVillavicencio temp = op.get();
			InventarioVillavicencio pemt = po.get();
			temp.setVentas(temp.getVentas() + ventas);
			pemt.setCantidad(pemt.getCantidad() - ventas);
			temp.setProductosVendidos(temp.getProductosVendidos() + ", " + producto);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado actualizado Barranquilla");

		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sucursal no disponible");

	}

	@GetMapping("/empleadosbogota")
	public ResponseEntity<List<EmpleadosBogota>> mostrarEmpleadosBogota() {
		List<EmpleadosBogota> op = bogota.findByOrderByVentasDesc();
		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/empleadosbarranquilla")
	public ResponseEntity<List<EmpleadosBquilla>> mostrarEmpleadosBarranquilla() {
		List<EmpleadosBquilla> op = barranquilla.findByOrderByVentasDesc();
		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/empleadoscali")
	public ResponseEntity<List<EmpleadosCali>> mostrarEmpleadosCali() {
		List<EmpleadosCali> op = cali.findByOrderByVentasDesc();

		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/empleadospasto")
	public ResponseEntity<List<EmpleadosPasto>> mostrarEmpleadosPasto() {
		List<EmpleadosPasto> op = pasto.findByOrderByVentasDesc();
		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/empleadospereira")
	public ResponseEntity<List<EmpleadosPereira>> mostrarEmpleadosPereira() {
		List<EmpleadosPereira> op = pereira.findByOrderByVentasDesc();
		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/empleadossincelejo")
	public ResponseEntity<List<EmpleadosSincelejo>> mostrarEmpleadosSincelejo() {
		List<EmpleadosSincelejo> op = sincelejo.findByOrderByVentasDesc();
		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@GetMapping("/empleadosvillavicencio")
	public ResponseEntity<List<EmpleadosVillavicencio>> mostrarEmpleadosVillavicencio() {
		List<EmpleadosVillavicencio> op = villavicencio.findByOrderByVentasDesc();
		if (op.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(op);
	}

	@DeleteMapping("/empleados")
	public ResponseEntity<String> eliminarEmpleados(@RequestParam String cmd) {

		if (cmd.equals("Bogota")) {
			List<EmpleadosBogota> op = bogota.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Bogota");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					bogota.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					bogota.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					bogota.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Bogota");

		} else if (cmd.equals("Barranquilla")) {
			List<EmpleadosBquilla> op = barranquilla.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Barranquilla");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					barranquilla.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					barranquilla.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					barranquilla.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Barranquilla");

		} else if (cmd.equals("Cali")) {
			List<EmpleadosCali> op = cali.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Cali");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					cali.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					cali.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					cali.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Cali");

		} else if (cmd.equals("Pasto")) {
			List<EmpleadosPasto> op = pasto.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Pasto");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					pasto.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					pasto.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					pasto.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Pasto");

		} else if (cmd.equals("Pereira")) {
			List<EmpleadosPereira> op = pereira.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Pereira");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					pereira.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					pereira.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					pereira.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Pereira");

		} else if (cmd.equals("Sincelejo")) {
			List<EmpleadosSincelejo> op = sincelejo.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Sincelejo");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					sincelejo.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					sincelejo.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					sincelejo.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Sincelejo");

		} else if (cmd.equals("Villavicencio")) {
			List<EmpleadosVillavicencio> op = villavicencio.findByOrderByVentasDesc();

			if (op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se encontro empleado Villavicencio");
			}

			if (op.size() > 5) {
				for (int i = op.size() - 1; i > op.size() - 4; i--) {
					villavicencio.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 5) {
				for (int i = op.size() - 1; i > op.size() - 3; i--) {
					villavicencio.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}

			} else if (op.size() == 4) {
				for (int i = op.size() - 1; i > op.size() - 2; i--) {
					villavicencio.delete(op.get(i));
					
					pdf.exportar(op.get(i).getNombre());
				}
			} else if (op.size() <= 3) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se pudo despedir ningun empleado");
			}

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Empleado eliminado Villavicencio");
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sucursal no disponible");
	}

}
