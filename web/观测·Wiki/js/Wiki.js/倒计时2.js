function Time() {
    //获取当前时间
    var date2 = new Date();
    var now2 = date2.getTime();
    //设置截⽌时间
    var str2 = "2022/9/9 18:00:00";
    var endDate2 = new Date(str2);
    var end2 = endDate2.getTime();
    //时间差
    var leftTime2 = end2 - now2;
    //定义变量 d,h,m,s保存倒计时的时间
    let d2, h2, m2, s2;
    if (leftTime2 >= 0) {
      d2 = Math.floor(leftTime2 / 1000 / 60 / 60 / 24);
      h2 = Math.floor((leftTime2 / 1000 / 60 / 60) % 24);
      m2 = Math.floor((leftTime2 / 1000 / 60) % 60);
      s2 = Math.floor((leftTime2 / 1000) % 60);
    }
    //将倒计时赋值到div中
    document.getElementById("_d2").innerHTML = d2;
    document.getElementById("_h2").innerHTML = h2;
    document.getElementById("_m2").innerHTML = m2;
    document.getElementById("_s2").innerHTML = s2;
    //递归每秒调⽤Time⽅法，显⽰动态时间效果
    setTimeout(Time, 1000);
  }