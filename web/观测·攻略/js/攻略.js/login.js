var loginwrap = document.querySelector(".login-background .login-wrap");
var move1 = document.querySelector(".login-background .move");
move1.addEventListener("mousedown", function (e) {
  var distanceleft = e.pageX - loginwrap.offsetLeft;
  var distancetop = e.pageY - loginwrap.offsetTop;
  document.addEventListener("mousemove", move);
  function move(e) {
    loginwrap.style.top = e.pageY - distancetop - 58 + "px"; //减去logo的距离
    loginwrap.style.left = e.pageX - distanceleft + "px";
  }
  //抬起清除
  move1.addEventListener("mouseup", function () {
    document.removeEventListener("mousemove", move);
  });
});


// login 的隐藏与出现
var loginbtn = document.querySelector(".header-user");
var login = document.querySelector(".login-background");
loginbtn.addEventListener("click", function () {
  login.style.display = "block";
});

var loginfork = document.querySelector('.login-background .fork');
loginfork.addEventListener("click", function () {
    login.style.display = "none";
});

//输入框
var inputcontainer = document.querySelectorAll('.input-container')
var logininput = document.querySelectorAll(' .login-background .input-container input');
for (let i = 0; i < logininput.length; i++) {
    logininput[i].addEventListener('focus',function(){
        inputcontainer[i].className = 'input-container focus'
    })
    logininput[i].addEventListener('blur',function(){
        inputcontainer[i].className = 'input-container'
    })
}
// var