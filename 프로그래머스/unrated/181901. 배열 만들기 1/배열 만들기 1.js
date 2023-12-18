function solution(n, k) {
    var answer = [];
    for(var i = k; i<=n; i++){
        if(i%k===0) answer.push(i);
    }
    return answer;
}