//File manipulation
//Read a file, capitalise everything, write the file.

let minimist = require("minimist")
let args = minimist(process.argv)

//node FirstFiles.js --source=f1.txt --dest=f2.txt
let fs = require("fs") //another module : file system
let stext = fs.readFileSync(args.source, "utf-8") //source text stext utf - text form
//console.log(stext)

let words= stext.split(" "); //string has split
//console.log(words)

for(let i = 0; i<words.length; i++){
    words[i] = words[i].toUpperCase();
}

let dtext = words.join(" ") //destination text
//console.log(dtext) // array joined

fs.writeFileSync(args.dest, dtext, "utf-8") 
