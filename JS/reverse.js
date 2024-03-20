// Given an integer, return an integer that is the reverse
//ordering of numbers
//example
//reverseInt(67) === 76
//reverseInt(-34) === -43


function reverseInt(n){
    let reversed = n.toString().split('').reverse().join('');
    return parseFloat(reversed) * Math.sign(n); //for positive multiply by 1 and negative * -1
    
}

console.log(reverseInt(-43));
console.log("====================================== \n");

//given a string, return a new string with the reversed order of character

//try with a for loop(decremental)
function reverseStr(str){
    let reversed = "";
    for(let i=str.length-1; i >=0; i--){
        reversed += str[i];
    }

    return reversed;
}

console.log(reverseStr("Hello"));

console.log(reverseStr("using decremental for loop"));
console.log("====================================== \n");

//try with a for loop(incremental)
function reverseStr(str){
    let reversed = "";
    for(let i=0; i < str.length; i++){
        reversed = str[i] + reversed;
    }

    return reversed;
}
console.log(reverseStr("Hello"));

console.log(reverseStr("using incremental for loop"));
console.log("====================================== \n");

//try with an advanced for loop
function reverseStrAdvFor(str){
    let reversed ="";
    for(let char of str){
        reversed = char + reversed;
    }
    return reversed;
}

console.log(reverseStrAdvFor("Hello"));

console.log(reverseStrAdvFor("using advanced for loop"));
