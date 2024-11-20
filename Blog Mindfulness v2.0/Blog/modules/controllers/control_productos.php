<?php
include '../clases/productos.php';
if(isset($_POST)){
    extract($_POST);
}

//var_dump($_POST);

$prod = new classProductos();
switch($accion){
    case 'registrar':
        $ret = $prod->nuevo($descripcion, $categoria, $valor);
        break;
   
}



?>