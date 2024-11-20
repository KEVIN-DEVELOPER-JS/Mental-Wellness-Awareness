document.getElementById('google-login').addEventListener('click', function() {
    // Configuración de la URL de autenticación de Google
    const clientId = '530405682467-e0dkps2g046ia9irnop3rjca4dh19756.apps.googleusercontent.com';
    const redirectUri = 'http://localhost/mindfulness/modules/clientes/registro_clientes.php';
    const scope = 'email profile';
    const authUrl = `https://accounts.google.com/o/oauth2/auth?client_id=${clientId}&redirect_uri=${redirectUri}&response_type=token&scope=${scope}`;

    // Abrir ventana emergente para la autenticación de Google
    const width = 500;
    const height = 600;
    const left = (screen.width / 2) - (width / 2);
    const top = (screen.height / 2) - (height / 2);
    window.open(authUrl, 'Google Login', `width=${width},height=${height},top=${top},left=${left}`);
});
