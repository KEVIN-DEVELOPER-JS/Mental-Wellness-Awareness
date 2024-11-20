<?php
  $active_new="";
  $active_productos="";
  $active_clientes="active";
  $active_usuarios="";  
?>

<!DOCTYPE html>
<html>
<head><title>Clientes</title>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <?php include("../../plantilla/head.php");?>
  <script src='js/clientes.js'></script> 
  <script src='js/modalEditarClientes.js'></script>
</head>
<body>


<?php
include("../../plantilla/navbar.php");
?> 


<div class="container-fluid">
<div class="col-md-3">
<div class="panel panel-primary">
   <div class="panel-heading">
     <h2 class="panel-title">Registrar Clientes</h2>
  </div>
   <div class="panel-body">  


   <div class="col-md-12">
     <div class="form-group ">
      <label class="control-label " for="nombres">
       Nombre Completo
      </label>
      <input class="form-control" id="nombres" name="nombres" type="text"/>
     </div>
         </div>
 <div class="col-md-12">
     <div class="form-group ">
      <label class="control-label " for="identificacion">
       Identificacion
      </label>
      <input class="form-control" id="identificacion" name="identificacion" type="text"/>
     </div>
     </div>

      <div class="col-md-12">
     <div class="form-group ">
      <label class="control-label " for="tipo">
       Tipo Cliente
      </label>
      <select id = "tipo" class="form-control">
        <option value = "1">Persona Natural</option>
        <option value = "2">Persona Juridica</option>
      </select>
     </div>
      </div>
<input class="form-control" id="tipoId" name="tipoId" value="1" type="hidden"/>
     <div class="col-md-12"> 
     <div class="form-group ">
      <label class="control-label " for="direccion">
       Direccion
      </label>
      <input class="form-control" id="direccion" name="direccion" type="text"/>
     </div>
     </div>

     <div class="col-md-12"> 
     <div class="form-group ">
      <label class="control-label " for="telefono">
       Telefono
      </label>
      <input class="form-control" id="telefono" name="telefono" type="text"/>
     </div>
     </div>
     
   
   <div class="col-md-12"> 
     <div class="form-group ">
      <label class="control-label " for="correo">
       Correo
      </label>
      <input class="form-control" id="correo" name="correo" type="text"/>
     </div>
     </div>

     <div class="col-md-12"> 
     <div class="form-group">
      <div>
       <button class="btn btn-success " id= "save" name="save" type="submit">
        Guardar
       </button>
      </div>
      </div>
     </div> 
  </div>
</div>
</div>



<div class="col-md-9">
<div class="panel panel-primary">
   <div class="panel-heading">
     <h2 class="panel-title">Listado Clientes</h2>
  </div>
   <div class="panel-body">  
         <div class="table-responsive">
             <div id="contenido"></div>
   </div>
    
  </div>
</div>
</div>







</div>





</div>
<?php

?>
<?php
include 'modal_editarClientes.php';
?>

</body>
</html>


