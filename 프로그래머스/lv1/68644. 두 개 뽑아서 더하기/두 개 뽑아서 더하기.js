function solution(numbers) {
    var answer = [];
    for(var i in numbers){
        for(var j in numbers){
            var sum = numbers[i]+numbers[j];
            if((i!==j) && !(answer.includes(sum))) answer.push(sum);
        }
    }
    answer.sort(function(a,b){
        return a-b;
    });
    return answer;
}