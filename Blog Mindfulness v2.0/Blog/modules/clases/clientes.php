<?php 
class classClientes
{


 public function nuevo($nombres, $identificacion, $tipo, $direccion, $telefono, $correo)
 { 
 require_once ("../../config/db.php");
 require_once ("../../config/conexion.php");
   $sql = "INSERT INTO cliente (nombres, identificacion, tipo_cliente, direccion, telefono, correo) VALUES('".$nombres."', '".$identificacion."','".$tipo."','".$direccion."','".$telefono."','".$correo."');";
    $query_new_user_insert = mysqli_query($con,$sql);
 }

 public function listar()
 { 
 require_once ("../../config/db.php");
 require_once ("../../config/conexion.php");
 $sql = "SELECT 
  `cliente`.`nombres`,
  `cliente`.`identificacion`,
  `cliente`.`direccion`,
  `cliente`.`telefono`,
  `cliente`.`correo`,
  `cliente`.`idcliente`,
               \"
              <button type=\'button\' class=\'btn btn-primary btn-sm btn_edit\' data-title=\'Edit\' data-toggle=\'modal\' data-target=\'#myModal\' >
               <span class=\'glyphicon glyphicon-pencil\'></span></button>
               </div>
                \" 
               as borrar,
               \"
              <button type=\'button\' class=\'btn btn-danger btn-sm btn_delete\' data-title=\'Edit\'>
               <span class=\'glyphicon glyphicon-trash\'></span></button>
               </div>
                \"
                 as buttons                    
            FROM
            cliente";

$query = mysqli_query($con, $sql);
        $tabla = '<table id="example" class="table table-hover table-striped table-bordered table-condensed" cellpadding="0" cellspacing="0" border="1" class="display" >
                        <thead>
                        <tr>
                        <th id="yw9_c0">#</th>
                        <th id="yw9_c0">Identificacion</th>
                        <th id="yw9_c1">Nombres</th>
                        <th id="yw9_c2">Direccion</th>
                        <th id="yw9_c3">Telefono</th>
                        <th id="yw9_c4">Correo</th>
                        <th id="yw9_c5">Edit</th>
                        <th id="yw9_c6">Delete</th>
                        </tr>
                        </thead>
                        <tbody>';
		          while ($row=mysqli_fetch_array($query)) 
                   {
                   	$tabla.='<tr >  
                            <td>                            
                                '.utf8_encode($row['idcliente']).'
                            </td>
                            <td>                            
                                '.utf8_encode($row['identificacion']).'
                            </td> 
                            <td>                            
                                '.utf8_encode($row['nombres']).'
                            </td> 
                            <td>                            
                                '.utf8_encode($row['direccion']).'
                            </td> 
                            <td>                            
                                '.utf8_encode($row['telefono']).'
                            </td> 
                            <td>                            
                                '.utf8_encode($row['correo']).'
                            </td> 
                            <td width= "30" onclick="editar('.$row['idcliente'].')">                            
                                '.utf8_encode($row['borrar']).'
                            </td>

                            <td onclick="eliminar('.$row['idcliente'].')">                            
                                '.utf8_encode($row['buttons']).'
                            </td>' ;                                                                               
                            
            $tabla.= '</tr>';                                    
	
	              
                   }  
            
        $tabla.="</tbody></table>";
        return $tabla;

 }

 public function editar($nombres, $identificacion, $direccion, $telefono, $correo, $id)
 { 
 require_once ("../../config/db.php");
 require_once ("../../config/conexion.php");
   $sql = "UPDATE cliente SET nombres = '".$nombres."', identificacion = '".$identificacion."', direccion = '".$direccion."', telefono = '".$telefono."', correo = '".$correo."' WHERE idcliente = '".$id."'";
    $query_update = mysqli_query($con,$sql);
 }

 public function buscar($id)
	{
        require_once ("../../config/db.php");
        require_once ("../../config/conexion.php");
        $sql = "SELECT 
            `cliente`.`nombres`,
            `cliente`.`identificacion`,         
            `cliente`.`direccion`,
            `cliente`.`telefono`,
            `cliente`.`correo`,
            `cliente`.`idcliente`
FROM
  `cliente` 
WHERE `idcliente`= $id ";
		$query = mysqli_query($con, $sql);

		while ($row=mysqli_fetch_array($query)) 
                   {

                   	$res = array( "id_cliente" => $row['idcliente'],
                      "nombres" => $row['nombres'],
                      "identificacion" => $row['identificacion'],
                      "direccion" => $row['direccion'],
                      "telefono" => $row['telefono'],
                      "correo" => $row['correo']
                      );

                  	    
                   } 
                   return $res;

	}

    public function eliminar($id)
        { 
                require_once ("../../config/db.php");
                require_once ("../../config/conexion.php");
                $sql = "DELETE FROM `cliente` WHERE `idcliente` = '".$id."'";
                $query_delete = mysqli_query($con,$sql);
        }



 
 } 

?>