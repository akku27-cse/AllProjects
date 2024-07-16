let body = document.querySelector('body');

let red = document.querySelector('#red')
let green = document.querySelector('#green');
let blue = document.querySelector('#blue')


let button = document.querySelectorAll('.button')

button.forEach(function (button) {
    
    console.log(button)
    button.addEventListener('click', (e) => {
        console.log(e);
        console.log(e.target)
        if (e.target.id == 'red') {
            body.style.background = "red";
        } else if (e.target.id == 'green') {
            body.style.backgroundColor = "green";

        } else if (e.target.id == 'blue') {
            body.style.backgroundColor = "blue";
        }
})    
})
