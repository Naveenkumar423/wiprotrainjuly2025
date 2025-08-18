
let btn1 = document.getElementById("btn1");
let input1 = document.getElementById("input1");
let remainingLabel = document.getElementById("remainingLabel");


input1.addEventListener("input", function () {
    let remaining = 50 - input1.value.length;
    remainingLabel.textContent = remaining + " characters remaining";
});


btn1.addEventListener("click", function fn() {
    var input = input1.value;
    console.log(input); 
    alert("You entered: " + input);
});
