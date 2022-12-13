function validateForm() {
    let seleccionProvincia = document.forms["formularioCv"]["prov"].value;
    if (seleccionProvincia == "0") {
      alert("Seleccionar una provincia");
      return false;
    }

    let dia = document.forms["formularioCv"]["dia"].value;
    if (dia < 1 | dia > 31) {
        alert("Introducir fecha valida");
        return false;
      }


  }

  
    
  