<?php 
class classProductos
{


 public function nuevo($descripcion, $categoria, $valor)
 { 
 require_once ("../../config/db.php");
 require_once ("../../config/conexion.php");
   $sql = "INSERT INTO producto (descripcion, categoria, valor) VALUES('".$descripcion."', '".$categoria."','".$valor."');";
    $query_new_user_insert = mysqli_query($con,$sql);
 }

}