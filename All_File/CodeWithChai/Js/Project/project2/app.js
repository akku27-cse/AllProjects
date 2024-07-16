// const result = document.querySelector('div')
// const height = parseInt(document.querySelector('#height').value)
// const width =parseInt( document.querySelector('#weidth').value)

// function calcluate(height,width) {
//     let ans = height * width
//     return ans * ans;
// }
// calcluate();

let from = document.querySelector('form');

from.addEventListener('submit', (e) => {
  e.preventDefault();
  const height = parseInt(document.querySelector("#height").value);
    const width = parseInt(document.querySelector('#weidth').value)
    const result = document.querySelector("div");
    if (height == '' || height < 0 || isNaN(height)) {
        result.innerHTML = `please Provide valid height`;
    }
    if (width == "" || width < 0 || isNaN(width)) {
        result.innerHTML = `please Provide valid width`;
        
    }
    let results = (width / ((height * height) / 1000).toFixed(2))
    result.innerHTML=results
    // const ans = height * width
    // const final=ans*ans
    // result.innerHTML=final

})