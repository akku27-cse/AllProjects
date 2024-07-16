//promisehas three State:peding,fullfill,rejected
//promise creatiion
// const promise = new Promise((resolve, reject) => {
    
//     setTimeout(() => {
//         console.log("Promise is crtated");
//         reject()
// },2000)

// })

//promise uses or consumption
// promise.then(() => {
//     console.log("Promise is run or use");//jotokhon na promise ta k reject ba resolve k execute kora hochhe totokhon kono  ten or cath e execute hobe na

// })


//Object calling use Promise
// const ObjectCalling = new Promise(function (resolve, reject) {
//     setTimeout(() => {
//         resolve({
//             user: "santu",
//          wife:"deya"
//        })
//    },2000)
// }).then((user) => {
//     console.log(user);
// })


//promise chianning
const promiseChaining = new Promise((resolve,reject) => {
    
    setTimeout(() => {
        
        let error = false;
        if (!error) {
            resolve({
                userName: "santu",
                wife:"deya"
            })
        } else {
            reject('Error Something');
        }
    },2000)
})

// use of async and wait

 asyncPromise=async() => {
    try {
       let response= await promiseChaining
        console.log(response)
    } catch (error) {
        console.log(error)
    }

}
asyncPromise()
//     .then((user) => {
//     console.log(user)
//     return user.wife
// }).then((wife) => {
//     console.log(wife)
// }).catch((err) => {
//     console.log(err)
// })