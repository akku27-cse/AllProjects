const fs = require("fs");
//createing a new file
//fs.writeFileSync('script.js','var name="santu"')
//fs.writeFileSync('script.js','coslole.log(name)')
//fs.appendFileSync("script.js", "console.log(name);");

// fs.writeFileSync("read.txt", "santu jana");
// //readfile

// const buf_data = fs.readFileSync("script.js");
// const org_data = buf_data.toString();
// console.log(buf_data)
// //covert string data
// console.log(org_data);


//rename
fs.renameSync("read.txt","read2.txt")