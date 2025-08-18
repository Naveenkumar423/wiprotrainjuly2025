// Get elements
let taskInput = document.getElementById("taskInput");
let addTaskBtn = document.getElementById("addTaskBtn");
let taskList = document.getElementById("taskList");

// Add Task
addTaskBtn.addEventListener("click", function () {
    let taskText = taskInput.value.trim();

    if (taskText === "") {
        alert("Please enter a task");
        return;
    }

    // Create list item
    let li = document.createElement("li");
    li.textContent = taskText;

    // Create delete button
    let deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.classList.add("deleteBtn");

    // Delete task on click
    deleteBtn.addEventListener("click", function () {
        taskList.removeChild(li);
    });

    // Append button to list item
    li.appendChild(deleteBtn);

    // Add list item to ul
    taskList.appendChild(li);

    // Clear input
    taskInput.value = "";
});
