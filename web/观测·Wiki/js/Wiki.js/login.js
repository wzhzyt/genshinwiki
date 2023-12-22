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
//
var loginbackgroundwrap = login.parentNode;
loginbtn.addEventListener("click", function () {
  loginbackgroundwrap.style.display = "block";
});

var loginfork = document.querySelector(".login-background .fork");
loginfork.addEventListener("click", function () {
  loginbackgroundwrap.style.display = "none";
});

//输入框
var reminder = document.querySelectorAll(".login-wrap .reminder");
var inputcontainer = document.querySelectorAll(".input-container");
var logininput = document.querySelectorAll(
  " .login-background .input-container input"
);
for (let i = 0; i < logininput.length; i++) {
  logininput[i].addEventListener("focus", function () {
    inputcontainer[i].className = "input-container focus";
  });
  logininput[i].addEventListener("blur", function () {
    inputcontainer[i].className = "input-container";
    // 提示信息
    if (!this.value) {
      reminder[i].style.display = "block";
      reminder[0].innerHTML = "*Uid不能为空";
      reminder[1].innerHTML = "*" + logininput[1].placeholder + "不能为空";
    } else {
      reminder[i].style.display = "none";
    }
  });
}

// 验证码 密码 切换
var title = loginwrap.children[3];
var tabitem = title.children;
var authcode = document.querySelector(".login-background .auth-code-btn");
var text = loginwrap.lastElementChild.children[0];
// 排他思想
for (let i = 0; i < tabitem.length; i++) {
  tabitem[i].addEventListener("click", function () {
    for (let j = 0; j < tabitem.length; j++) {
      tabitem[j].className = "tab-item ";
    }
    this.className = "tab-item active";
  });
}

tabitem[0].addEventListener("click", function () {
  logininput[0].placeholder = "手机号注册/登录";
  logininput[1].placeholder = "验证码";
  authcode.style.display = "block";
  text.innerHTML = "未注册的手机验证后将自动登录。注册/登录即代表您同意并遵守";
  for (let i = 0; i < logininput.length; i++) {
    reminder[i].style.display = "none";
  }
});

// 登录按钮
let submitbtn = document.querySelector(".buttom-wrap");
submitbtn.addEventListener("click", function () {
  for (let i = 0; i < logininput.length; index++) {
    if (!logininput[i].value) {
      reminder[0].style.display = "block";
      reminder[0].innerHTML = "*手机号不能为空";
    }
  }
});

// 滚动轮
// let announcementcontent = document.querySelector(".announcement-content");
// announcementcontent.addEventListener("scroll", function () {
//   console.log(this.scrollHeight);  //元素实际高度;含滚动的距离
//   console.log(this.scrollTop);   //滚动距离
//   console.log(this.clientHeight); //可视图距离
//   if (this.scrollHeight == Math.ceil(this.scrollTop) + this.clientHeight) {
//       let p = document.createElement('p');
//       p.innerHTML = '原神观测枢交流③群：795360057（已满）';
//       announcementcontent.appendChild(p);
//   }
// });
