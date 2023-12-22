//当网页向下滑动 20px 出现"返回顶部" 按钮
window.onscroll = function() {scrollFunction()};
function scrollFunction() {
    if (document.body.scrollTop > 5 || document.documentElement.scrollTop > 5) {
        document.getElementById("header").style.background = "#2d2f33";
    } 
    else {
        document.getElementById("header").style.background = "transparent";
    }
}