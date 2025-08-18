// Create an array of names
let names = ["Ravi", "Abhinaya", "John", "Christopher", "Naveen", "Kiran"];

// Step 1: Filter names with length > 5
let filteredNames = names.filter(function(name) {
    return name.length > 5;
});

// Step 2: Convert those names to uppercase
let upperCaseNames = filteredNames.map(function(name) {
    return name.toUpperCase();
});

// Print results
console.log("Original names:", names);
console.log("Filtered names (more than 5 chars):", filteredNames);
console.log("Filtered names in UPPERCASE:", upperCaseNames);
