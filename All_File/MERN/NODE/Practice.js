const fs = require('fs');
//create folder
//fs.mkdirSync("practiceJs");
//create a file into new folder wchic is created

//fs.writeFileSync("practiceJs/bio.txt", "hello i am santu");
//update
//fs.appendFileSync("practiceJs/bio.txt","please god give me a job");

//read
// const data = fs.readFileSync("practiceJs/bio.txt", "utf-8");
// console.log(data)

//rename
//fs.renameSync("practiceJs/bio.txt", "practiceJs/letter.txt");

//delete
fs.unlinkSync("practiceJs/letter.txt");