//given a string, return the character that is mostly used in the string
//example
//maxChar("aabbbbcccccccd") === "c"
//maxChar("apple 12377777") === "7"

function maxChar(str) { 
    //create map to store char
    const charMap ={};
    let max = 0;
    let maxChar ="";
    //loop through the string
    for(let char of str){
        if(charMap[char]) {
            charMap[char] = charMap[char] + 1;
        }else {
            charMap[char] = 1;
        }
    }
    // return charMap;
    //loop through the object
    for(let[key, value] of Object.entries(charMap)){
        if(value > max){
            max = value;
            maxChar = key;
        }
    }

    return maxChar;
}

console.log(maxChar("aabbbbcccccccd"));
console.log(maxChar("apple 12377777"));