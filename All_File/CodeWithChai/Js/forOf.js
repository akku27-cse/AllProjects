// const arr = [4, 5, 6, 7];
// for (const i of arr) {
    
//     console.log(arr)
// }
//maps
const maps = new Map()
maps.set('1', 'India')
maps.set('2', 'usa')
console.log(maps)


//object  forof loop not work on object
const user = {
    name: "santu",
    email:"jj@gmail.com"
}

// for (const iterator of user) {
    
// }
//in Oject iteration  use Forin loop


for (const key in user) {
    console.log(key);
    console.table(user[key])
}