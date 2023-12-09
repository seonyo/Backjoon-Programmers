function solution(s) {
    var min = Math.min(...s.split(" "));
    var max = Math.max(...s.split(" "));
    return min + " " + max;
}