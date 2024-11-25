
document.querySelector('.form-register').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const formData = new FormData(this);
    fetch('register.php', {
        method: 'POST',
        body: formData
    })
    .then(response => response.text())
    .then(data => {
        if (data.includes('Registro exitoso')) {
            document.querySelector('.alerta-exito').classList.add('alertaExito');
            document.querySelector('.alerta-error').classList.remove('alertaError');
        } else {
            document.querySelector('.alerta-error').classList.add('alertaError');
            document.querySelector('.alerta-exito').classList.remove('alertaExito');
        }
    })
    .catch(error => console.error('Error:', error));
});

class Usuarios {
    constructor(nombre, identificacion, correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    toString() {
        return `${this.nombre} - ${this.identificacion} - ${this.correo}`;
    }
}

// Validar entrada
function validarEntrada(tipo, mensaje) {
    let entrada;
    while (true) {
        entrada = prompt(mensaje);
        if (tipo === 'str') {
            if (entrada && entrada.trim() !== "") return entrada.trim();
            alert("Este campo no puede estar vacío.");
        } else if (tipo === 'gmail') {
            if (entrada.includes("@") && entrada.includes(".")) return entrada;
            alert("Por favor, ingrese un correo electrónico válido.");
        }
    }
}

function registrarUsuario() {
    const nombre = validarEntrada('str', "Ingrese su nombre completo:");
    const identificacion = validarEntrada('str', "Ingrese su número de identificación profesional:");
    const correo = validarEntrada('gmail', "Ingrese su correo electrónico:");

    return new Usuarios(nombre, identificacion, correo);
}

// Mostrar Usuarios
function mostrarUsuarios(lista) {
    lista.forEach(usuarios => console.log(usuarios.toString()));
}

// Guardar en archivo JSON simulado (localStorage para navegador)
function guardarEnArchivo(key, data) {
    localStorage.setItem(key, JSON.stringify(data));
}

// Cargar de archivo JSON simulado (localStorage para navegador)
function cargarDeArchivo(key) {
    const data = localStorage.getItem(key);
    if (data) {
        return JSON.parse(data).map(obj => new Enfermera(...Object.values(obj)));
    }
    return [];
}

// Eliminar registro
function eliminarRegistro(lista, identificacion) {
    const index = lista.findIndex(usuarios => usuarios.identificacion === identificacion);
    if (index !== -1) {
        lista.splice(index, 1);
        console.log(`Registro con identificación ${identificacion} eliminado.`);
        return true;
    }
    console.log(`No se encontró un registro con la identificación ${identificacion}.`);
    return false;
}

// Ordenar lista por nombre
function ordenarBurbuja(lista) {
    const n = lista.length;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (lista[j].nombre.toLowerCase() > lista[j + 1].nombre.toLowerCase()) {
                [lista[j], lista[j + 1]] = [lista[j + 1], lista[j]];
            }
        }
    }
}

// Registrar usuario
function registrarUsuario() {
    const key = "clientes";
    let usuarios = cargarDeArchivo(key);

    while (true) {
        const opcion = validarEntrada('str', `
Opciones:
1. Registrar un usuario
2. Eliminar un registro
3. Mostrar registros
4. Salir
Seleccione una opción: `);

        if (opcion === "1") {
            usuarios.push(registrarEnfermera());
            console.log("Datos del usuario registrados exitosamente.");
        } else if (opcion === "2") {
            const identificacion = validarEntrada('str', "Ingrese la identificación del registro a eliminar:");
            eliminarRegistro(usuarios, identificacion);
        } else if (opcion === "3") {
            ordenarBurbuja(usuarios);
            console.log("\nusuarios Registradas:");
            mostrarEnfermeras(usuarios);
        } else if (opcion === "4") {
            console.log("Guardando registros...");
            guardarEnArchivo(key, usuarios);
            console.log("Registros guardados. Saliendo.");
            break;
        } else {
            console.log("Opción no válida, intente de nuevo.");
        }
    }
}

// Ejecutar el registro
registrarUsuario();
