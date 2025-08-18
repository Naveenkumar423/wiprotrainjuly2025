// Quiz questions
let questions = [
    {
        question: "What is the capital of France?",
        options: ["London", "Berlin", "Paris", "Rome"],
        answer: "Paris"
    },
    {
        question: "Which planet is known as the Red Planet?",
        options: ["Earth", "Mars", "Jupiter", "Saturn"],
        answer: "Mars"
    },
    {
        question: "What is 5 + 3?",
        options: ["5", "8", "10", "12"],
        answer: "8"
    }
];

let currentQuestionIndex = 0;
let score = 0;

// Get elements
let questionEl = document.getElementById("question");
let optionsEl = document.getElementById("options");
let feedbackEl = document.getElementById("feedback");
let scoreEl = document.getElementById("score");
let nextBtn = document.getElementById("nextBtn");

// Load a question
function loadQuestion() {
    let q = questions[currentQuestionIndex];
    questionEl.textContent = q.question;
    optionsEl.innerHTML = "";
    feedbackEl.textContent = "";

    q.options.forEach(option => {
        let btn = document.createElement("button");
        btn.textContent = option;
        btn.addEventListener("click", () => checkAnswer(option));
        optionsEl.appendChild(btn);
    });
}

// Check the selected answer
function checkAnswer(selectedOption) {
    let correctAnswer = questions[currentQuestionIndex].answer;
    if (selectedOption === correctAnswer) {
        feedbackEl.textContent = "✅ Correct!";
        feedbackEl.style.color = "green";
        score++;
    } else {
        feedbackEl.textContent = "❌ Wrong!";
        feedbackEl.style.color = "red";
    }
    scoreEl.textContent = `Score: ${score}`;
}

// Go to next question
nextBtn.addEventListener("click", () => {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        loadQuestion();
    } else {
        questionEl.textContent = "Quiz Finished!";
        optionsEl.innerHTML = "";
        nextBtn.style.display = "none";
    }
});

// Initial load
loadQuestion();
