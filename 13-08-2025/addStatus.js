// Person list
var listPersons = [
    { name: "Naveen", age: 17, city: "Hyderabad" },
    { name: "Chandu", age: 22, city: "Vijayawada" },
    { name: "Abhi", age: 19, city: "Visakhapatnam" },
    { name: "Ram", age: 25, city: "Guntur" },
    { name: "Suresh", age: 15, city: "Tirupati" }
];

// Add status using forEach()
listPersons.forEach(function(person) {
    if (person.age >= 18) {
        person.status = "Adult";
    } else {
        person.status = "Minor";
    }
});

// Print updated list
console.log("Updated Person List with Status:", listPersons);
