// node Firstfiles.js --source=f1.txt --dest=f2.txt
let minimist = require("minimist")
let fs = require("fs")
let args = minimist(process.argv)
 
//read from source
let stext = fs.readFileSync(args.source, "utf-8")

//capitalize
let dtext = stext.toUpperCase();

//write file
fs.writeFileSync(args.dest, dtext,"utf-8")
