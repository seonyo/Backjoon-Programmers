function solution(my_string, is_prefix) {
    var answer = 0;
    var temp="";
    for(i of my_string){
        temp +=i;
        if(temp === is_prefix) 
            return 1;
    }
    return 0;
}