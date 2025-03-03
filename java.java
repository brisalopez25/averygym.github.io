const carrusel = document.querySelector('.carrusel');
const imagenes = document.querySelector('.imagenes');
const anterior = document.querySelector('.anterior');
const siguiente = document.querySelector('.siguiente');

let contador = 0;

function siguienteImagen() {
    contador++;
    if (contador > 2) {
        contador = 0;
    }
    imagenes.style.transform = `translateX(-${contador * 100}%)`;
}

function anteriorImagen() {
    contador--;
    if (contador < 0) {
        contador = 2;
    }
    imagenes.style.transform = `translateX(-${contador * 100}%)`;
}

// Reproducción automática
setInterval(siguienteImagen, 3000);

siguiente.addEventListener('click', siguienteImagen);
anterior.addEventListener('click', anteriorImagen);


