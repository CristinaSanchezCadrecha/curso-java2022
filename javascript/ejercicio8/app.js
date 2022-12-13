let enlaces = document.getElementById("datos")
let enlacesResultado =  document.body.getElementsByTagName('a').length;
enlaces.innerHTML ="Número de enlaces en esta página: " + enlacesResultado

let ultimo = document.getElementById("ultimo")        
let ultimoResultado =  enlacesResultado[(enlacesResultado.length-1)];
ultimo.innerHTML = "Último enlace visitado: " + ultimoResultado;

let parrafos = document.getElementById("parrafo") 
let parrafosResultado = document.getElementsByTagName('p').length;
parrafos.innerHTML = "El número de parrafos es: " + parrafosResultado


let nuevoParrafo = document.getElementById("newp")
let parrafo = prompt("Introduce un párrafo")
let tag = document.createElement("p")
let text = document.createTextNode("Párrafo añadido: " + parrafo)
tag.appendChild(text)
nuevoParrafo.appendChild(tag)





