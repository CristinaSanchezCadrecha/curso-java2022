function parImpar() {
    let number = Number(prompt("Introduce un número: "))
    if(number%2 == 0){
        return alert("El número es par")
    }else{
        return alert("El número es impar")
    }
    
}


    function mayusculasMinusculas() {
        let frase = prompt("Introduce una frase: ")
        let mayuscula = /[A-Z]/.test(frase)
        let minuscula = /[a-z]/.test(frase)
        
        // return alert(`${mayuscula} mayuscula`)
        if(mayuscula === true && minuscula === false){
            return alert("La frase esta en mayusculas")

        }else if(mayuscula === false && minuscula === true){
            return alert("La frase no esta en mayusculas")
        }else{
            return alert("La frase contiene mayusculas y minusculas")
        }
    }