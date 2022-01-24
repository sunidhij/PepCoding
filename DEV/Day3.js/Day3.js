// let clargs = process.argv;
// let x = parseInt(clargs[2])



// //Code for printing prime numbers till n;
// for(let i = 2; i<=x; i++){
//     let a = isPrime(i);
//     if (a == true){
//        console.log(i)
//     }
// }

// //Function
// function isPrime(x){
//     let m = true;
//     for(let y = 2; y*y<=x ; y++){
//         if (x%y == 0){
//             m = false;
//             break;
//         }
//     }
//     return m;
// }

// // Array
// let arr =[]  // no need to mention size

// //Pushing values o=into array
// for(let i =0; i<x; i++){
//     let val = parseInt(clargs[i+3])
//     arr.push(val);  // OR arr[i] = val
// }

// for(let i =0; i<x; i++){
//     console.log(arr[i])
// }

// console.log(arr)
// console.log(arr.length)

// Dependencies

// npm install minimist (folder wise)
let parser = require('minimist') // the -- property is from here
let args = parser(process.argv)

console.log(args)

// input = node .\day3.js -x 4 -y 7       
//node .\day3.js --name="sunidhi jain" --age=19   

let name = args.name
let age = args.age

if(age>10){
    console.log("Yes")
}else{
    console.log("Yes")
}
