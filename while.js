console.log("Menu");
console.log("1. Ice Americaano");
console.log("2. Cafe Latte");
console.log("3. Cappuccino");
console.log("4. Tea");
var count =0;
while (count<3){ 
var choice = parseInt(prompt ("메뉴를 선택해 주세요"));
console.log(choice + "번 메뉴를 선택하셨습니다.")
switch (choice){
    case 1:
    console.log("아이스 아메리카노는 1500원입니다. ")
    break;

    case 2:
    console.log("아이스 아메리카노는 1500원입니다. ")
    break;

    case 3:
    console.log("아이스 아메리카노는 1500원입니다. ")
    break;

    case 4:
    console.log("아이스 아메리카노는 1500원입니다. ")
    break;

    default:
    console.log("그런메뉴는없습니다. ")
    break;




}

count++;
}
console.log("안녕히 가십시오.");