<!DOCTYPE html>
<html>
<head>
  <link rel="icon" href="../../path/to/registro-en-linea.png" type="image/png">
  <title>Mindfulness</title>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <?php include("../../plantilla/head.php");?>
  <script src='js/productos.js'></script>
  <style>
    .fade-out {
      opacity: 1;
      transition: opacity 1.5s ease-in-out;
    }

    .fade-out.hidden {
      opacity: 0;
    }

    .center-image {
      display: none;
      justify-content: center;
      align-items: center;
      height: 100vh;
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      background-color: white;
      z-index: 10;
    }

    .center-image img {
      max-width: 100%;
      height: auto;
    }

    .center-image.visible {
      display: flex;
    }
  </style>
</head>
<body>
  <div class="center-image">
    <img src="../../path/to/charge.png" alt="Pantalla de Carga">
  </div>
  <div class="container-form register fade-out">
    <div class="information fade-out">
      <div class="info-childs fade-out">
        <h2>Bienvenido</h2>
        <p>Para unirte a nuestra comunidad por favor Inicia Sesión con tus datos</p>
        <input type="button" value="Iniciar Sesion" id="sign-in">
      </div>
    </div>
    <div class="form-information fade-out">
      <div class="form-information-childs fade-out">
        <h2>Crear una cuenta</h2>
        <div class="icons fade-out">
          <i class='bx bxl-google' id="google-login"></i>
          <i class='bx bxl-github' id="github-login"></i>
          <i class='bx bxl-linkedin' id="linkedin-login"></i>
        </div>
        <p>o usa tu email para registrarte</p>
        <form id="loginForm" class="form form-register fade-out" novalidate>
          <div class="col-md-12 fade-out">
            <div class="form-group fade-out">
              <label class="control-label" for="descripcion">Nombres</label>
              <input class="form-control" id="descripcion" name="descripcion" type="text"/>
            </div>
          </div>
          <div class="col-md-12 fade-out">
            <div class="form-group fade-out">
              <label class="control-label" for="categoria">Correo</label>
              <input class="form-control" id="categoria" name="categoria" type="text"/>
            </div>
          </div>
          <div class="col-md-12 fade-out">
            <div class="form-group fade-out">
              <label class="control-label" for="valor">Contraseña</label>
              <input class="form-control" id="valor" name="valor" type="password"/>
            </div>
          </div>
          <div class="col-md-12 fade-out">
            <div class="form-group fade-out">
              <button class="btn btn-success" id="save" name="save" type="submit">REGISTRATE A MINDFULNESS!!</button>
              <script>
    document.getElementById('loginForm').addEventListener('submit', function(event) {
        event.preventDefault(); // Evita el envío del formulario

        // Obtén los datos del formulario
        const formData = new FormData(this);

        // Envía los datos al servidor usando fetch
        fetch('../usuarios/login.php', {
            method: 'POST',
            body: formData
        })
        .then(response => response.json())
        .then(data => {
            if (data.success) {
                alert('Inicio de sesión exitoso');
                window.location.href = '../productos/user.php'; // Redirige al foro
            } else {
                alert('Error en el inicio de sesión');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('menssage alert!!');
        });
    });
</script>
<script src='js/login.js'></script>
<script src='js/register.js'></script>
<script src='js/script.js'></script>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
  <script>
    document.getElementById('sign-in').addEventListener('click', function(event) {
      event.preventDefault(); // Evita la redirección inmediata
      const formElements = document.querySelectorAll('.fade-out');
      const loadingImage = document.querySelector('.center-image');
      
      formElements.forEach(element => {
        element.classList.add('hidden');
      });
      
      loadingImage.classList.add('visible');
      
      // Redirige después de que la animación se complete (1.5 segundos)
      setTimeout(function() {
        window.location.href = '../productos/login.php';
      }, 1500);
    });
  </script>
</body>
</html>