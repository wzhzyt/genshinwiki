function countTime() {
  //获取当前时间
  var date = new Date();
  var now = date.getTime();
  //设置截⽌时间
  var str = "2022/9/9 18:00:00";
  var endDate = new Date(str);
  var end = endDate.getTime();
  //时间差
  var leftTime = end - now;
  //定义变量 d,h,m,s保存倒计时的时间
  var d, h, m, s;
  if (leftTime >= 0) {
    d = Math.floor(leftTime / 1000 / 60 / 60 / 24);
    h = Math.floor((leftTime / 1000 / 60 / 60) % 24);
    m = Math.floor((leftTime / 1000 / 60) % 60);
    s = Math.floor((leftTime / 1000) % 60);
  }
  //将倒计时赋值到div中
  document.getElementById("_d").innerHTML = d;
  document.getElementById("_h").innerHTML = h;
  document.getElementById("_m").innerHTML = m;
  document.getElementById("_s").innerHTML = s;
  //递归每秒调⽤countTime⽅法，显⽰动态时间效果
  setTimeout(countTime, 1000);
}
