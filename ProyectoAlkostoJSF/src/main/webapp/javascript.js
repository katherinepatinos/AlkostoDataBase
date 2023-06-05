function mostrarImg1() {
	var selectElement = document.getElementById('lista');
	var selectedValue = selectElement.value;
	if (selectedValue === 'Inventario') {
		document.getElementById('inv').style.display = 'block';
		document.getElementById('emp').style.display = 'none';

	} else if (selectedValue === 'Empleados') {
		document.getElementById('inv').style.display = 'none';
		document.getElementById('emp').style.display = 'block';
	}

}

function mostrarImg2() {
	var selectElement = document.getElementById('listap');
	var selectedValue = selectElement.value;
	if (selectedValue === 'Bogota') {
		document.getElementById('bog').style.display = 'block';
		document.getElementById('bar').style.display = 'none';
		document.getElementById('cal').style.display = 'none';
		document.getElementById('pas').style.display = 'none';
		document.getElementById('per').style.display = 'none';
		document.getElementById('sin').style.display = 'none';
		document.getElementById('vil').style.display = 'none';

	} else if (selectedValue === 'Barranquilla') {
		document.getElementById('bog').style.display = 'none';
		document.getElementById('bar').style.display = 'block';
		document.getElementById('cal').style.display = 'none';
		document.getElementById('pas').style.display = 'none';
		document.getElementById('per').style.display = 'none';
		document.getElementById('sin').style.display = 'none';
		document.getElementById('vil').style.display = 'none';

	} else if (selectedValue === 'Cali') {
		document.getElementById('bog').style.display = 'none';
		document.getElementById('bar').style.display = 'none';
		document.getElementById('cal').style.display = 'block';
		document.getElementById('pas').style.display = 'none';
		document.getElementById('per').style.display = 'none';
		document.getElementById('sin').style.display = 'none';
		document.getElementById('vil').style.display = 'none';

	} else if (selectedValue === 'Pasto') {
		document.getElementById('bog').style.display = 'none';
		document.getElementById('bar').style.display = 'none';
		document.getElementById('cal').style.display = 'none';
		document.getElementById('pas').style.display = 'block';
		document.getElementById('per').style.display = 'none';
		document.getElementById('sin').style.display = 'none';
		document.getElementById('vil').style.display = 'none';

	} else if (selectedValue === 'Pereira') {
		document.getElementById('bog').style.display = 'none';
		document.getElementById('bar').style.display = 'none';
		document.getElementById('cal').style.display = 'none';
		document.getElementById('pas').style.display = 'none';
		document.getElementById('per').style.display = 'block';
		document.getElementById('sin').style.display = 'none';
		document.getElementById('vil').style.display = 'none';

	} else if (selectedValue === 'Sincelejo') {
		document.getElementById('bog').style.display = 'none';
		document.getElementById('bar').style.display = 'none';
		document.getElementById('cal').style.display = 'none';
		document.getElementById('pas').style.display = 'none';
		document.getElementById('per').style.display = 'none';
		document.getElementById('sin').style.display = 'block';
		document.getElementById('vil').style.display = 'none';

	} else if (selectedValue === 'Villavicencio') {
		document.getElementById('bog').style.display = 'none';
		document.getElementById('bar').style.display = 'none';
		document.getElementById('cal').style.display = 'none';
		document.getElementById('pas').style.display = 'none';
		document.getElementById('per').style.display = 'none';
		document.getElementById('sin').style.display = 'none';
		document.getElementById('vil').style.display = 'block';

	}

}

function redireccionar() {

	var selectElement = document.getElementById('lista');
	var selectedValue = selectElement.value;
	var selectElement2 = document.getElementById('listap');
	var selectedValue2 = selectElement2.value;
	if (selectedValue === 'Inventario' && selectedValue2 === 'Bogota') {

		window.location.href = "inventarioBogota.html";
	} else if (selectedValue === 'Inventario' && selectedValue2 === 'Barranquilla') {

		window.location.href = "inventarioBarranquilla.html";
	} else if (selectedValue === 'Inventario' && selectedValue2 === 'Cali') {

		window.location.href = "inventarioCali.html";
	} else if (selectedValue === 'Inventario' && selectedValue2 === 'Pasto') {

		window.location.href = "inventarioPasto.html";
	} else if (selectedValue === 'Inventario' && selectedValue2 === 'Pereira') {

		window.location.href = "inventarioPereira.html";
	} else if (selectedValue === 'Inventario' && selectedValue2 === 'Sincelejo') {

		window.location.href = "inventarioSincelejo.html";
	} else if (selectedValue === 'Inventario' && selectedValue2 === 'Villavicencio') {

		window.location.href = "inventarioVillavicencio.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Bogota') {

		window.location.href = "empleadosBogota.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Barranquilla') {

		window.location.href = "empleadosBarranquilla.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Cali') {

		window.location.href = "empleadosCali.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Pasto') {

		window.location.href = "empleadosPasto.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Pereira') {

		window.location.href = "empleadosPereira.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Sincelejo') {

		window.location.href = "empleadosSincelejo.html";
	} else if (selectedValue === 'Empleados' && selectedValue2 === 'Villavicencio') {

		window.location.href = "empleadosVillavicencio.html";
	}
}


function ocultar() {
	document.getElementById('cards').style.display = 'none';
	document.getElementById('agr').style.display = 'block';
	document.getElementById('actu').style.display = 'none';
}

function ocultar2() {
	document.getElementById('cards').style.display = 'none';
	document.getElementById('actu').style.display = 'block';
	document.getElementById('agr').style.display = 'none';
}

function mostrarInvBog() {

	var url = "http://localhost:8088/alkosto/inventariobogota";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarInvBar() {

	var url = "http://localhost:8088/alkosto/inventariobarranquilla";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarInvCal() {

	var url = "http://localhost:8088/alkosto/inventariocali";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarInvPas() {

	var url = "http://localhost:8088/alkosto/inventariopasto";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarInvPer() {

	var url = "http://localhost:8088/alkosto/inventariopereira";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarInvSin() {

	var url = "http://localhost:8088/alkosto/inventariosincelejo";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarInvVil() {

	var url = "http://localhost:8088/alkosto/inventariovillavicencio";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var inv = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(inv);
			for (data in inv) {
				document.write("ID: " + inv[data].id + " Producto: " + inv[data].producto + " Cantidad: " + inv[data].cantidad + " Valor unitario: " + inv[data].valorUnitario + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function agregarInvBog() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Bogota";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function agregarInvBar() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Barranquilla";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function agregarInvCal() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Cali";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function agregarInvPas() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Pasto";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function agregarInvPer() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Pereira";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function agregarInvSin() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Sincelejo";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function agregarInvVil() {

	var producto = document.getElementById('producto').value;
	var cantidad = document.getElementById('cantidad').value;
	var valor = document.getElementById('valor').value;

	var parametros = "&producto=" + encodeURI(producto) + "&cantidad=" + encodeURI(cantidad) + "&valor=" + encodeURI(valor);

	var url = "http://localhost:8088/alkosto/inventario?cmd=Villavicencio";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(producto + " ha sido agregado");
		} else {
			document.write("No se pudo agregar el producto");
		}
	}
	xhr.send(null);
}

function mostrarEmpBog() {

	var url = "http://localhost:8088/alkosto/empleadosbogota";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarEmpBar() {

	var url = "http://localhost:8088/alkosto/empleadosbarranquilla";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarEmpCal() {

	var url = "http://localhost:8088/alkosto/empleadoscali";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarEmpPas() {

	var url = "http://localhost:8088/alkosto/empleadospasto";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarEmpPer() {

	var url = "http://localhost:8088/alkosto/empleadospereira";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarEmpSin() {

	var url = "http://localhost:8088/alkosto/empleadossincelejo";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function mostrarEmpVil() {

	var url = "http://localhost:8088/alkosto/empleadosvillavicencio";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", url, true);
	xhr.onload = function() {
		var emp = JSON.parse(xhr.responseText);
		if (xhr.status == "202") {
			console.table(emp);
			for (data in emp) {
				document.write("ID: " + emp[data].id + " Nombre: " + emp[data].nombre + " Fecha nacimiento: " + emp[data].nacimiento + " Sexo: " + emp[data].sexo + " Fecha ingreso: " + emp[data].ingreso + " Total ventas: " + emp[data].ventas + " Productos vendidos: " + emp[data].productosVendidos + "<br>");
			}
		} else {
			document.write("El inventario se encuentra vacio");
			console.error(inv);
		}
	}
	xhr.send(null);
}

function agregarEmpBog() {


	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Bogota";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function agregarEmpBar() {

	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Barranquilla";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function agregarEmpCal() {

	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Cali";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function agregarEmpPas() {

	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Pasto";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function agregarEmpPer() {

	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Pereira";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function agregarEmpSin() {

	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Sincelejo";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function agregarEmpVil() {

	var nombre = document.getElementById('nom').value;
	var nacimiento = document.getElementById('naci').value;
	var sexo = document.getElementById('sexo').value;
	var ingreso = document.getElementById('ing').value;
	var ventas = document.getElementById('ventas').value;
	var productos = document.getElementById('pro').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&nacimiento=" + encodeURI(nacimiento) + "&sexo=" + encodeURI(sexo) + "&ingreso=" + encodeURI(ingreso) + "&ventas=" + encodeURI(ventas) + "&productos=" + encodeURI(productos);

	var url = "http://localhost:8088/alkosto/empleados?cmd=Villavicencio";
	var xhr = new XMLHttpRequest();

	xhr.open("POST", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 201) {
			document.write(nombre + " ha sido agregado");
		} else if (xhr.status == 204) {
			document.write(productos + " no se encuentra en el inventario");
		}
	}
	xhr.send(null);
}

function actualizarBog() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Bogota";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function actualizarBar() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Barranquilla";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function actualizarCal() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Cali";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function actualizarPas() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Pasto";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function actualizarPer() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Pereira";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function actualizarSin() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Sincelejo";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function actualizarvil() {

	var nombre = document.getElementById('nomAct').value;
	var cantidad = document.getElementById('venAct').value;
	var producto = document.getElementById('proAct').value;

	var parametros = "&nombre=" + encodeURI(nombre) + "&ventas=" + encodeURI(cantidad) + "&producto=" + encodeURI(producto);
	
	var url = "http://localhost:8088/alkosto/empleados/{nombre}?cmd=Villavicencio";
	var xhr = new XMLHttpRequest();

	xhr.open("PUT", url + parametros, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se ha agregado la venta");
		} else if (xhr.status == 204) {
			document.write("El producto o el empleado no se encuencuentran en la base de datos");
		}
	}
	xhr.send(null);
}

function despedirBog(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Bogota";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}

function despedirBar(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Barraquilla";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}

function despedirCal(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Cali";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}

function despedirPas(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Pasto";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}

function despedirPer(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Pereira";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}

function despedirSin(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Sincelejo";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}

function despedirVil(){
	
	var url = "http://localhost:8088/alkosto/empleados?cmd=Villavicencio";
	var xhr = new XMLHttpRequest();

	xhr.open("DELETE", url, true);

	xhr.onload = function() {
		console.log(xhr.responseText);
		if (xhr.readyState == 4 && xhr.status == 202) {
			document.write("Se han despedido y generado los pdf de despido por empleado en el escritorio");
		} else if (xhr.status == 204) {
			document.write(xhr.responseText);
		} else if (xhr.status == 401) {
			document.write(xhr.responseText);
		}
	}
	xhr.send(null);
}