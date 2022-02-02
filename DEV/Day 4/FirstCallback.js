// t1 = read a file (disk)
// t2 = calculate primes (cpu)
//t2 is done in parallel w t1
// node FirstCallback.js --source=f1.txt --dest=f2.txt --n=50000


function isPrime(x){
    let m = true;
    for(let div = 2; div*div<=x; div++){
        if(x%div == 0){
            m = false
            break
        }
    }
    return m;
}

let minimist = require("minimist")
let fs = require("fs")

let args = minimist(process.argv)

//task 1
let t1 = Date.now()
//console.log(t1)

//let stext = fs.readFileSync(args.source, "utf-8")
let t2= 0;
//callback
fs.readFile(args.source, function(data){
    let t2 = Date.now()
    //console.log(t2)
    let time = t2 -t1;
console.log(time)
})

//task 1

//task 2
let t3 = Date.now()
let arr=[]
for(let i = 2; i<args.n; i++){
    let p = isPrime(i);
    if (p == true){
        arr.push(i)
    }
}
let t4 = Date.now()

let time = t4-t3;
console.log(time)
//task 2
let t5 = Date.now()
console.log(t5-t1)
