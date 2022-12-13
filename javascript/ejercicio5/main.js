let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

let dni = (prompt("Introduce tu número de dni: "))
let letraIntroducida = prompt("Introduce tu letra")

let resto = dni%23
let letra = letras[resto]
let resultado = dni + letra

if(dni <= 0 || dni > 99999999){
    alert("El número introducido no es válido")
}else if(letra != letraIntroducida){
        alert("La letra introducida, " + letraIntroducida + ", no es correcta")
    }else{
        alert("Tu dni es corrrecto: " + resultado  )
    }

 
