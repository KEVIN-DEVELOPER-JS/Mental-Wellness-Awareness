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
