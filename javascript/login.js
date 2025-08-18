
function isValidEmail(email) {
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // basic pattern
    return emailPattern.test(email);
}

function validateEmail() {
    const email = document.getElementById("email").value.trim();
    const emailError = document.getElementById("emailError");

    if (email === "") {
        emailError.textContent = "Email is required";
        return false;
    } else if (!isValidEmail(email)) {
        emailError.textContent = "Enter a valid email address";
        return false;
    } else {
        emailError.textContent = "";
        return true;
    }
}
function validatePassword() {
    const password = document.getElementById("password").value.trim();
    const passwordError = document.getElementById("passwordError");

    if (password === "") {
        passwordError.textContent = "Password is required";
        return false;
    } else {
        passwordError.textContent = "";
        return true;
    }
}

document.getElementById("email").addEventListener("blur", validateEmail);
document.getElementById("password").addEventListener("blur", validatePassword);

document.getElementById("loginBtn").addEventListener("click", function () {
    const emailValid = validateEmail();
    const passwordValid = validatePassword();

    if (emailValid && passwordValid) {
        alert("Login successful! 🎉");
    } else {
        alert("Please fix the errors before logging in.");
    }
});
