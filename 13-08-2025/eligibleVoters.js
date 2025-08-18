// Create one person object
let person = {
    name: "Ravi Kumar",
    age: 25,
    city: "Hyderabad"
};

// Create list of persons
var listPersons = [
    {
        name: "John Doe",
        age: 17,
        city: "Delhi"
    },
    {
        name: "Mark Freeman",
        age: 20,
        city: "Mumbai"
    },
    {
        name: "Patricia Dark",
        age: 34,
        city: "Chennai"
    }
];

// Add the single person to the list
listPersons.push(person);

// Filter out people eligible to vote (age >= 18)
let eligibleVoters = listPersons.filter(function(p) {
    return p.age >= 18;
});

// Optional: Convert names of eligible voters to uppercase
eligibleVoters = eligibleVoters.map(function(p) {
    return {
        name: p.name.toUpperCase(),
        age: p.age,
        city: p.city
    };
});

// Print the eligible voters list
for (let i = 0; i < eligibleVoters.length; i++) {
    console.log(eligibleVoters[i]);
}
