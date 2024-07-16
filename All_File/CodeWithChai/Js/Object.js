//singleton:->jokhon object constructor diye hobe tokhon seta k singleton bole
//object letarels
//add sybmobols
// const mySym = Symbol('key1')

// const myObj = {
//     name: "SAntu JAna",
//     roll: 127,
//     [mySym]:"key1",
//     "add": "Dakshin Narikelda",
// isLogin:false
// }

// //access the object
// console.table(myObj)

// console.log(typeof myObj[mySym])
// //lock this object use to frees
// Object.freeze(myObj)
// myObj.name = "DEYA";
// console.table(myObj)


//object with Function
// myObj.addr =function(){
//     console.log(`${this.name}`)
// }
// console.log(myObj.addr());



//nestted Object
// const details = {
//     name: "santu jana",
//     detail: {
//         add: "dakshin Narikelda",
//         post:"nandakumar"
//     }
// }
// console.table(details.detail)
//object Singletonw




//object merge
// const first = {
//     name: "santu Jana",
//     add:"d narikelad"
// }
// const second = {
//     fullname: "deya",
//     fulladd:"kulberiya"
// }



// const aobj3 = Object.assign(first, second)
// console.table(aobj3)




//data  base values
//find key from the Object value
const keys = {
    id: 2,
    name: "santu",
    add:"DakshinNarikelda"
}

// console.table(Object.keys(keys))//find the key
// console.table(Object.values(keys))//find the values
// console.log(Object.entries(keys))//it covert all single keys value into the array

/***
 * <prototype>: Object { … }
​​
__defineGetter__: function __defineGetter__()
​​​
length: 2
​​​
name: "__defineGetter__"
​​​
<prototype>: function ()
​​​​
apply: function apply()
​​​​
arguments: 
​​​​
bind: function bind()
​​​​
call: function call()
​​​​
caller: 
​​​​
constructor: function Function()
​​​​
length: 0
​​​​
name: ""
​​​​
toString: function toString()
​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​
<get arguments()>: function arguments()
​​​​​
length: 0
​​​​​
name: "get arguments"
​​​​​
<prototype>: function ()
​​​​
<set arguments()>: function arguments()
​​​​​
length: 1
​​​​​
name: "set arguments"
​​​​​
<prototype>: function ()
​​​​
<get caller()>: function caller()
​​​​​
length: 0
​​​​​
name: "get caller"
​​​​​
<prototype>: function ()
​​​​
<set caller()>: function caller()
​​​​​
length: 1
​​​​​
name: "set caller"
​​​​​
<prototype>: function ()
​​​​​​
apply: function apply()
​​​​​​
arguments: 
​​​​​​
bind: function bind()
​​​​​​
call: function call()
​​​​​​
caller: 
​​​​​​
constructor: function Function()
​​​​​​
length: 0
​​​​​​
name: ""
​​​​​​
toString: function toString()
​​​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​​​
<get arguments()>: function arguments()
​​​​​​
<set arguments()>: function arguments()
​​​​​​
<get caller()>: function caller()
​​​​​​
<set caller()>: function caller()
​​​​​​
<prototype>: Object { … }
​​​​
<prototype>: Object { … }
​​​​​
__defineGetter__: function __defineGetter__()
​​​​​
__defineSetter__: function __defineSetter__()
​​​​​
__lookupGetter__: function __lookupGetter__()
​​​​​
__lookupSetter__: function __lookupSetter__()
​​​​​
__proto__: 
​​​​​
constructor: function Object()
​​​​​
hasOwnProperty: function hasOwnProperty()
​​​​​
isPrototypeOf: function isPrototypeOf()
​​​​​
propertyIsEnumerable: function propertyIsEnumerable()
​​​​​
toLocaleString: function toLocaleString()
​​​​​
toString: function toString()
​​​​​
valueOf: function valueOf()
​​​​​
<get __proto__()>: function __proto__()
​​​​​
<set __proto__()>: function __proto__()
​​
__defineSetter__: function __defineSetter__()
​​​
length: 2
​​​
name: "__defineSetter__"
​​​
<prototype>: function ()
​​​​
apply: function apply()
​​​​​
length: 2
​​​​​
name: "apply"
​​​​​
<prototype>: function ()
​​​​​​
apply: function apply()
​​​​​​
arguments: 
​​​​​​
bind: function bind()
​​​​​​
call: function call()
​​​​​​
caller: 
​​​​​​
constructor: function Function()
​​​​​​
length: 0
​​​​​​
name: ""
​​​​​​
toString: function toString()
​​​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​​​
<get arguments()>: function arguments()
​​​​​​
<set arguments()>: function arguments()
​​​​​​
<get caller()>: function caller()
​​​​​​
<set caller()>: function caller()
​​​​​​
<prototype>: Object { … }
​​​​
arguments: 
​​​​
bind: function bind()
​​​​​
length: 1
​​​​​
name: "bind"
​​​​​
<prototype>: function ()
​​​​​​
apply: function apply()
​​​​​​
arguments: 
​​​​​​
bind: function bind()
​​​​​​
call: function call()
​​​​​​
caller: 
​​​​​​
constructor: function Function()
​​​​​​
length: 0
​​​​​​
name: ""
​​​​​​
toString: function toString()
​​​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​​​
<get arguments()>: function arguments()
​​​​​​
<set arguments()>: function arguments()
​​​​​​
<get caller()>: function caller()
​​​​​​
<set caller()>: function caller()
​​​​​​
<prototype>: Object { … }
​​​​
call: function call()
​​​​
caller: 
​​​​
constructor: function Function()
​​​​
length: 0
​​​​
name: ""
​​​​
toString: function toString()
​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​
<get arguments()>: function arguments()
​​​​
<set arguments()>: function arguments()
​​​​
<get caller()>: function caller()
​​​​
<set caller()>: function caller()
​​​​
<prototype>: Object { … }
​​
__lookupGetter__: function __lookupGetter__()
​​
__lookupSetter__: function __lookupSetter__()
​​
__proto__: 
​​
constructor: function Object()
​​
hasOwnProperty: function hasOwnProperty()
​​
isPrototypeOf: function isPrototypeOf()
​​
propertyIsEnumerable: function propertyIsEnumerable()
​​​
length: 1
​​​
name: "propertyIsEnumerable"
​​​
<prototype>: function ()
​​
toLocaleString: function toLocaleString()
​​​
length: 0
​​​
name: "toLocaleString"
​​​
<prototype>: function ()
​​​​
apply: function apply()
​​​​
arguments: 
​​​​
bind: function bind()
​​​​
call: function call()
​​​​
caller: 
​​​​
constructor: function Function()
​​​​
length: 0
​​​​
name: ""
​​​​
toString: function toString()
​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​
<get arguments()>: function arguments()
​​​​
<set arguments()>: function arguments()
​​​​
<get caller()>: function caller()
​​​​
<set caller()>: function caller()
​​​​
<prototype>: Object { … }
​​
toString: function toString()
​​​
length: 0
​​​
name: "toString"
​​​
<prototype>: function ()
​​​​
apply: function apply()
​​​​
arguments: 
​​​​
bind: function bind()
​​​​
call: function call()
​​​​
caller: 
​​​​
constructor: function Function()
​​​​
length: 0
​​​​
name: ""
​​​​
toString: function toString()
​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​
<get arguments()>: function arguments()
​​​​
<set arguments()>: function arguments()
​​​​
<get caller()>: function caller()
​​​​
<set caller()>: function caller()
​​​​
<prototype>: Object { … }
​​
valueOf: function valueOf()
​​​
length: 0
​​​
name: "valueOf"
​​​
<prototype>: function ()
​​​​
apply: function apply()
​​​​
arguments: 
​​​​
bind: function bind()
​​​​
call: function call()
​​​​
caller: 
​​​​
constructor: function Function()
​​​​
length: 0
​​​​
name: ""
​​​​
toString: function toString()
​​​​
Symbol(Symbol.hasInstance): function Symbol.hasInstance()
​​​​
<get arguments()>: function arguments()
​​​​
<set arguments()>: function arguments()
​​​​
<get caller()>: function caller()
​​​​
<set caller()>: function caller()
​​​​
<prototype>: Object { … }
​​
<get __proto__()>: function __proto__()
​​
<set __proto__()>: function __proto__()
​​​
length: 1
​​​
name: "set __proto__"
 */