function solution(s) {
    var answer = "";
    const number = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    var temp="";
    
    for(var i of s){
        temp += i;
        if(number.indexOf(temp) > -1){
            answer+=number.indexOf(temp);
            temp = ""
        }
        if(!isNaN(i)){
            answer += i;
            temp = ""
        } 
    }
    return Number(answer);
}