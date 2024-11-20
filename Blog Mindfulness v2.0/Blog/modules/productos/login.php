

<!DOCTYPE html>
<html>
<head><link rel="icon" href="../../path/to/iniciar-sesion.png" type="image/png"> <title>Mindfulness</title>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <?php include("../../plantilla/head.php");?>
  <script src='js/productos-login.js'></script>
  
</head>
<body>
<div class="container-form register">
        <div class="information">
            <div class="info-childs">
                <h2>¡¡Bienvenido nuevamente!!</h2>
                <p>Te echamos de menos unete al foro de la comunidad por favor Inicia Sesión con tus datos -></p>
                
            </div>
        </div>
        <div class="form-information">
            <div class="form-information-childs">
                <h2>Crear una cuenta</h2>
                <div class="icons">
                    <i class='bx bxl-google' id="google-login"></i>
                    <i class='bx bxl-github' id="github-login"></i>
                    <i class='bx bxl-linkedin' id="linkedin-login"></i>
                </div>
                <p>o usa tu email para registrarte</p>
                <form id="loginForm" class="form form-register" novalidate>
           
        <div class="col-md-12">
          <div class="form-group ">
       <label class="control-label " for="categoria">
         Correo
       </label>
         <input class="form-control" id="categoria" name="categoria" type="text"/>
         </div>
         </div>
        <div class="col-md-12"> 
        <div class="form-group ">
          <label class="control-label " for="valor">
          Contraseña
          </label>
         <input class="form-control" id="valor" name="valor" type="password"/>
       </div>
     </div>

    

     <div class="col-md-12"> 
     <div class="form-group">
      <div>
       <button class="btn btn-success " id= "save" name="save" type="submit">
        Iniciar Sesion
       </button>
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
     </div> 
  </div>
</div>
</div>



