function tabla() {
    $.ajax({
            url: "../controllers/control_productos.php",
            type: "POST",
            dataType: "json",
            data: { accion: "tabla" },
        })
        .done(function(res) {
            // console.log(res);  
            $("#contenido").html(res);
            $('#example').dataTable({
                "processing": true,
                "sPaginationType": "full_numbers",
            });
        });

}


function eliminar(id) {
    bootbox.confirm("Desea eliminar el registro?", function(result) {
        if (result) {
            $.ajax({
                    url: "../controllers/control_clientes.php",
                    type: "POST",
                    dataType: "json",
                    data: {
                        accion: "borrar",
                        id: id
                    },
                })
                .done(function() {});
            bootbox.alert("Se elimino el registro con exito", function() {
                tabla()
            })
        }
    })
}

function editar(id) {

    $.ajax({
            url: "../controllers/control_productos.php",
            type: "POST",
            dataType: "json",
            data: {
                accion: "buscar",
                id: id
            },
        })
        .done(function(data) {
            //console.log(data) 
            $("#modal_id").val(data.idproducto);
            $("#modal_productos").val(data.descripcion);
            $("#modal_categoria").val(data.categoria);
            $("#modal_valor").val(data.valor);
       

        });



}

$(document).ready(function() {
    $('#nombres').focus();
    $('#nombres').select();
    //$('#save').prop('disabled', true);   
    tabla();


    function guardarDatos() {

        if ($('#descripcion').val() == "" || $('#valor').val() == "") {
            bootbox.alert("Hay Campos Obligatorios", function() {

            })
        } else {
            $.ajax({
                    url: "../controllers/control_productos.php",
                    type: "POST",
                    dataType: "json",
                    data: {
                        accion: "registrar",
                        descripcion: $('#descripcion').val(),
                        categoria: $('#categoria').val(),
                        valor: $('#valor').val(),              
                      }
                })
                .done(function() {});
        bootbox.alert("Iniciaste Sesion Correctamente", function() {
            window.location.href = '../productos/user.php';
            tabla()
            })
            $('#descripcion').val("")
            $('#categoria').val("")
            $('#valor').val("")
           
        }

    }

    $("select#tipo").on("change keyup on paste", function() {
        var value = $(this).val();
        $("#tipoId").val(value)

    })


    $("#save").click(function() {
        guardarDatos()
    })

})