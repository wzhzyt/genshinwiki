let prev1 = document.querySelectorAll(".cal-prev")[0];
let prev2 = document.querySelectorAll(".cal-prev")[1];
let next1 = document.querySelectorAll(".cal-next")[0];
let next2 = document.querySelectorAll(".cal-next")[1];

prev1.onclick = function () {
  var Photo = document.getElementById("cal-ID-Photo1");
  Photo.style.right = "0px";
  prev1.style.backgroundImage = "url(img/cal-toleft.浅色.png)";
  next1.style.backgroundImage = "url(img/cal-toright.深色.png)";
};
next1.onclick = function () {
  let Photo = document.getElementById("cal-ID-Photo1");
  Photo.style.right = "295px";
  next1.style.backgroundImage = "url(img/cal-toright.浅色.png)"
  prev1.style.backgroundImage = "url(img/cal-toleft.深色.png)";
};
prev2.onclick = function () {
  var Photo = document.getElementById("cal-ID-Photo2");
  Photo.style.right = "0px";
  prev2.style.backgroundImage = "url(img/cal-toleft.浅色.png)";
  next2.style.backgroundImage = "url(img/cal-toright.深色.png)";
};
next2.onclick = function () {
  let Photo = document.getElementById("cal-ID-Photo2");
  Photo.style.right = "365px";
  next2.style.backgroundImage = "url(img/cal-toright.浅色.png)"
  prev2.style.backgroundImage = "url(img/cal-toleft.深色.png)";
};
// prev.onclick = function changephoto() {
//   next.background = "url (../img/cal-toright.浅色.png)";
// };
// next.onclick = function changephoto() {
//   prev.background = "url (../img/cal-toleft.深色.png)";
// };
// function prev1() {
//   var Photo = document.getElementById("cal-ID-Photo1");
//   Photo.style.right = "0px",
// }

// function next1() {
//   let Photo = document.getElementById("cal-ID-Photo1");
//   Photo.style.right = "295px";
// }

// function prev2() {
//   var Photo = document.getElementById("cal-ID-Photo2");
//   Photo.style.right = "0px";
// }

// function next2() {
//   let Photo = document.getElementById("cal-ID-Photo2");
//   Photo.style.right = "365px";
// }
