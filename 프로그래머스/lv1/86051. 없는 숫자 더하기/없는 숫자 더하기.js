function solution(numbers) {
    var sum=0;
    for(var i of numbers){
        sum+=i;
    }
    return 45 - sum;
}