function solution(num_list) {
    var sum=0, mul=1;
    for(var i of num_list){
        sum+=i;
        mul*=i;
    }
    return (sum*sum > mul) ? 1 : 0;
}