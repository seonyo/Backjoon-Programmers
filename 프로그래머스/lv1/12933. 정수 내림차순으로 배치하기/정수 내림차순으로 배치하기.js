function solution(n) {
    var answer = 0;
    var arr = Number(n.toString().split('').sort((a,b)=>b-a).join(''));
    return arr;
}