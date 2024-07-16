// console.log("1.data type practice");
// console.log(typeof null)
// console.log(typeof undefined)
// console.log("2. data type conversion")

// console.log("2"==2);
// console.log("2"===2);
// console.lo

//how to stack memeory work:->
//Statck memeory work on int string boolean (premitive datatype).On stack memeory all value have one coopy an when we change this value copy will be changed but mail value no be chnaged

// let s = "santu";
// let r = s;
// //heap  memeory work on non premitive datatpe . it give the refeances so  if we change the value its directly effect on our main vcalue
// console.log(r);
// r = "tom";
// let user = {
//   name: "santu",
//   email: "janaa@gmail.com",
// };
// console.table(user);

// let user2 = user;
// user2.email = "janaa";
// console.table(user);

// console.table(user2);
// console.log(user.email);
// console.log(user2.email);


//String
 //Number
//  const s=900;


//Function

// function easy(name){
// name="santu"
// console.log(name)
// }
// easy()

// function addNumbers(a,b){
//    return a+b
   
//    //return er por kono kechu code execute korbe na 
// }
// const result=addNumbers(3,4);
// console.log(result)

//Function with object and arrary

//...=>rest operator{Akta function e multipule operator pass koranor jonnono {...(rest operator use kora hoy)}}
//jokhon rest operator use kora hoy  sob value gulo array t5e store hoye jay

//example
// function name(nam,namew,...ame){
// return ame,
// }
// console.log(name("sanru","hnuman","jambu1"))




//functon objecrt
// const user={
//     name:"Santu",
//     email:"janaa@gmail.com"
// }

// function result(anyObject){
// console.table(anyObject)
// }
// result(user)

//scope
/*
let
const 
var
scope={}->it define as as scope it mainl use in if else of function
*/

//Hoisting
//nested Scope
// function name(){
// const name1="sanru"
//     function name2(){
//      const anme1="adakb";
//      console.lo
//     }

// }

console.log(addTwo());//jokhon akrta function define korar agei decleaT KORA Hoye jay seta k bole hoisthing
function addTwo(){
    return 1+1
}