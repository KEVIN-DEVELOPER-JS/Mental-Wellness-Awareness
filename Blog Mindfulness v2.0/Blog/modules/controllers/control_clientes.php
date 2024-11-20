<?php
include '../clases/clientes.php';
if(isset($_POST)){
    extract($_POST);
}

//var_dump($_POST);

$prod = new classClientes();
switch($accion){
    case "registrar":
        $ret = $prod->nuevo($nombres, $identificacion, $tipo_cliente, $direccion, $telefono, $correo);
        break;
        case 'tabla':
            $res = $prod->listar();
            echo json_encode($res);
            break;
            case 'editar':
                $prod->editar($nombres, $identificacion, $direccion, $telefono, $correo, $id);
                break;
                case 'buscar':
                    $id_cliente = $_POST['id'];
                    $resp = $prod->buscar($id_cliente);
                     echo json_encode($resp);
                    break;

                    case 'borrar':
                        $prod->eliminar($id);
                        break;
}



?>