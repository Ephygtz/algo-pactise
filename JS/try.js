function steps(n){
    for(let i=1; i<=n; i++){
        let line="";
        for(let j=1; j<=2*n-1; j++){
            line += " # ";
        }
        console.log(line);
    }
}

steps(5);