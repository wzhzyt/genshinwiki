var myTimer = -1;
function topFunction() {
    //1、获取当前滚动了多少距离
    //2、启动定时器，以一定时间减少响应的滚动距离
    var scrollTo = document.documentElement.scrollTop || document.body.scrollTop
    if (myTimer == -1) {
        myTimer = setInterval(() => {
            scrollTo -= 60
            if (scrollTo <= 0) {
                scrollTo = 0
                window.clearInterval(myTimer)
                myTimer = -1
            }
            window.scrollTo(0, scrollTo) //这是值  是指离开网页顶部的距离   
        }, 10);

    }

}