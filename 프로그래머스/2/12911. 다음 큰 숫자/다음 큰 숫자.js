function solution(n) {
    let binaryNum = n.toString(2).split("1").length-1;
    let max = Number.MAX_SAFE_INTEGER;
    
    for(let i=n+1; i<max; i++){
        if(i.toString(2).split("1").length-1 === binaryNum) 
            return i;
    }
}