
let employees = [
    { name: "John Doe", role: "Manager", empId: 101, salary: 90000 },
    { name: "Jane Smith", role: "QA", empId: 102, salary: 55000 },
    { name: "Michael Johnson", role: "Developer", empId: 103, salary: 60000 },
    { name: "Patricia Brown", role: "Manager", empId: 104, salary: 95000 },
    { name: "David Williams", role: "Developer", empId: 105, salary: 65000 }
];

let managers = employees.filter(emp => emp.role === "Manager");
let totalManagerSalary = managers.reduce((total, emp) => total + emp.salary, 0);


console.log("Total Salary of Managers:", totalManagerSalary);
