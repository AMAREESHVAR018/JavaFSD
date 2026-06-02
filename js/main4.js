const events = [
    { name: "Music Festival", category: "Music" },
    { name: "Food Carnival", category: "Food" },
    { name: "Sports Meet", category: "Sports" },
    { name: "Art Exhibition", category: "Art" },
    { name: "Tech Workshop", category: "Tech" },
    { name: "Community Service", category: "Community" }
];

function addEvent(name, category) {
    events.push({ name, category });
}

function registerUser(eventName) {
    const total = registrationTracker(eventName)();
    console.log(`${eventName}: ${total}`);
}

function filterEventsByCategory(category, callback) {
    callback(events.filter(event => event.category === category));
}

function registrationTracker() {
    let total = 0;
    return function () {
        total++;
        return total;
    };
}

const categoryTrackers = {};

function getCategoryTracker(category) {
    if (!categoryTrackers[category]) {
        categoryTrackers[category] = registrationTracker();
    }
    return categoryTrackers[category];
}

function renderEvents(list) {
    const eventList = document.getElementById("eventList");
    eventList.innerHTML = "";
    list.forEach(event => {
        const item = document.createElement("li");
        item.textContent = `${event.name} - ${event.category}`;
        eventList.appendChild(item);
    });
}

document.getElementById("loadEvents").addEventListener("click", function () {
    renderEvents(events);
    filterEventsByCategory("Music", function (result) {
        console.log(result);
    });
    registerUser("Music Festival");
    console.log(getCategoryTracker("Music")());
});

document.getElementById("clearEvents").addEventListener("click", function () {
    document.getElementById("eventList").innerHTML = "";
});

