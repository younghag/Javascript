//ans = 0
//do{
//    var ans=parseInt(prompt("1+1 = ?"))
//} while (ans !=2)
//console.log("정답입니다. ")

var a = Math.ceil(Math.random()*10)
var b = Math.ceil(Math.random()*10)

var solution = a * b;

var ans;
do{
ans = parseInt(prompt(a + "*" + b + "=?"));
}while(ans != solution)
console.log("정답입니다.")
