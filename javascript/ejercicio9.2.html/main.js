const nombre = document.getElementById("nombre2")
const precio = document.getElementById("precio")
const impuestos = document.getElementById("impuestos")
const descuento = document.getElementById("descuento")
const form = document.getElementById("formInfo")


form.addEventListener("submit", e=>{
    let faltaNombre =""
    let faltaPrecio = ""
    let precioInvalido = ""
    let descuentoIndicado= ""
    let impuestoBajo = ""

    e.preventDefault()
    if(nombre.value == null || nombre.value == 0 )
       faltaNombre = "Campo nombre requerido \n"

    if(precio.value == null || precio.value == 0)
        faltaPrecio = "Campo precio requerido \n"

    if(precio.value < 120)
        precioInvalido = "El precio ha de ser mayor a 120€ \n"
    
    if(impuestos.value < 3)
        impuestoBajo = "Esta seleccionando un impuesto bajo \n"
    
    if(descuento.checked == true)
        descuentoIndicado  = "La opción de promoción seleccionada es la más indicada \n"
    
    if(faltaNombre != "" || faltaPrecio != "" || precioInvalido != "" || impuestoBajo != "" || descuentoIndicado != "")
        alert(faltaNombre + faltaPrecio  + precioInvalido + impuestoBajo + descuentoIndicado)

})
