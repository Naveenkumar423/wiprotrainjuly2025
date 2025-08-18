let cities = ["Mumbai", "Hyderabad", "Delhi", "Chennai", "Bengaluru", "Pune"];
let btn = document.getElementById("loadCities");
let dropdown = document.getElementById("cityDropdown");

btn.addEventListener("click", function () {
    let sortedCities = cities.sort();

    dropdown.innerHTML = '<option value="">-- Select a city --</option>';

    sortedCities.forEach(function(city) {
        let option = document.createElement("option");
        option.value = city;
        option.textContent = city;
        dropdown.appendChild(option);
    });
});
