var count = 0;

while(true){
    var ans;
    ans = parseInt(prompt("1+1 = ?"));
    if (ans !=2){
        console.log((++count)+"번틀렸습니다. 다시 도전하세요.");

        continue;
    }
    ans = parseInt(prompt("7-3 = ?"));
    if(ans != 4){
        console.log((++count)+"번틀려씁네다. 다시 도전하세요.");

        continue;

    }
    ans = parseInt(prompt("6*7 = ?"));
    if(ans != 42){
        console.log((++count)+"번틀려씁네다. 다시 도전하세요.");

        continue;
    }
    break;
}