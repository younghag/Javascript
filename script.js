var req = new XMLHttpRequest( );            // 객체 생성
req.open("GET", "./json/image_list.json "); // 이미지 파일을 얻어 오도록 설정
req.onreadystatechange = function( ) {      // 콜백 함수 등록
    if (this.readyState == 4) {            // 모든 데이터가 정상으로 수신되었을 때
    var data = JSON.parse(this.response); //parse 사진들을 분리해서 자른다.
        for (var i = 0; i < data.length; i++){ //11장의 사진들을 각각 읽어서 추가
            var div = document.createElement("div"); //얖 태그로 나누어 이미지 넣기
            div.setAttribute("class", "image");
            div.onclick = function() {
                this.classList.toggle("image-selected")
            };
            div.onmouseover = function() { // 마우스를 올려놓으면
                var element = this;
                    this.timerId = setTimeout(function() {   //일정시간
                    element.classList.add("image-magnified");//그림 확대
                },1000);  // 1초 동안 
            };

            div.onmouseout = function() {
                clearTimeout(this.timerId);
                this.classList.remove("image-magnified");
            };

            var img = document.createElement("img"); // 이미지 태그로 문서 띄우기
            img.src = data[i]; //각각의 사진들을 한장식 뿌리기
            div.appendChild(img);//div 안에 사진을 추가하기 
            document.body.appendChild(div);//문서의 body 에 넣기


        }
    }
}
function selectAll(btn){
    var images = document.getElementsByClassName("image");//이미지 모두 선택
    for (var i =0; i < images.length; i++) { //한장씩 전부 선택 적용
        if(btn.value =="Unselect All"){
            images[i].classList.remove("image-selected");
    } else{
        images[i].classList.add("image-selected");
    }
}
    if (btn.value =="Unselect All"){
        btn.value = "Select All"
    }else{
        btn.value = "Unselect All"
    }
}

function slideshow(btn){
    var images = document.getElementsByClassName('image');
    var index = 0;
    images[index].classList.add("image-magnified");

    var intervalId = setInterval(function() {
        images[index].classList.remove("image-magnified");
        index++;
        if(index < images.length) {
            images[index].classList.add("image-magnified");
        }
        else {
            clearInterval(intervalId);
        }
    }, 2000);
    

}

req.send( );
