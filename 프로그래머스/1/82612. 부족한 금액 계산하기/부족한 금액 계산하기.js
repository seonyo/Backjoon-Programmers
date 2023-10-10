function solution(price, money, count) {
    var answer = -1;
    var p=0;
    for(var i=1; i<=count; i++){
        p += price*i;
    }
    return (p-money>0) ? Math.abs(p-money) : 0;
}