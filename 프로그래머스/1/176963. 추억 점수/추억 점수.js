function solution(name, yearning, photo) {
    var answer = [];
    var sum = 0;
    for(var i=0; i<photo.length; i++){
        for(var j=0; j<name.length; j++){
            if(photo[i].indexOf(name[j])>-1){
                sum+=yearning[j];
            }
        }
        answer.push(sum);
        sum=0;
    }
    return answer;
}