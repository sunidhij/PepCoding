//To begin with any language , we need to get familiar with the 5 basics of the language
//1.Output
//2.Variable
//3.Input
//4.Conditionals
//5.Loops
//1.Output/To print 
console.log("Hello world");;

//2.Variable/To print the variables 
let i=10;
console.log(i);
i="Hello world";

//javaScript is dynamic hence no particular data types

console.log(i);
//Using parseInt
let j=parseInt("200",10);//Here 10 means the base is 10

//3.Input/To take the input
let args=process.argv;
let x=args[2];
console.log(x);
console.log("The data at index 0 of args array is "+args[0]);//Remember that the index starts from 0 
console.log("The data at index 1 of args array is "+args[1]);
console.log("The data at index 2 of args array is "+args[2]);
console.log("The data at index 3 of args array is "+args[3]);
console.log("The data at index 4 of args array is "+args[4]);
console.log(typeof(x));
console.log(typeof(parseInt(x)));

//4.Conditionals/if-else  
let args=process.argv;
let x = parseInt(args[2],10)
if(x%2==0)
{
    console .log(x +"is even");
}
else
{
    console .log(x +"is odd");
}

//5.Loops
let num=parseInt(args[8],10);//providing the base 10 is not always necessary
for(let k=1;k<=num;k++)
{
console.log(k);
}
//The input is always string automatically, so we have to change to number using parseInt

//Is Prime
let clargs=process.argv;
let n=parseInt(clargs[2]);

for(let i=1;i<=n;i++)
{
let isPrime=ISPRIME(i);
if(isPrime==true)
{
    console.log(i);
}
}
function ISPRIME(x)
{
    let isPrime=true;
    for(let i=2;i*i<=x;i++)
    {
        if(x%i==0)
        {
            return false;
            
        }
    }
    if(isPrime==true)
{
    return true;
}
}

//Pattern 1
for (let i = 1; i<=n; i++){
    let line ="";
    for (let j = 1; j<=i; j++){
        line = line + "*\t";
         }
    console.log(line);
}
