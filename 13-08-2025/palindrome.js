
function isPalindrome(str) {
    let cleaned = str.toLowerCase().replace(/[^a-z0-9]/g, '');
    let reversed = cleaned.split('').reverse().join('');
    return cleaned === reversed;
}

document.getElementById("checkBtn").addEventListener("click", function() {
    let input = document.getElementById("wordInput").value;
    let resultElement = document.getElementById("result");

    if (isPalindrome(input)) {
        resultElement.textContent = `"${input}" is a palindrome ✅`;
        resultElement.style.color = "green";
    } else {
        resultElement.textContent = `"${input}" is NOT a palindrome ❌`;
        resultElement.style.color = "red";
    }
});
