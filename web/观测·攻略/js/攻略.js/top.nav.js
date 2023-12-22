//当网页向下滑动 5px 改变背景色
window.onscroll = function() {scrollFunction()};
function scrollFunction() {
    if (document.body.scrollTop > 5 || document.documentElement.scrollTop > 5) {
        document.getElementById("header").style.background = "#2d2f33";
    } 
    else {
        document.getElementById("header").style.background = "transparent";
    }
}