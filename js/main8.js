const events = [
    { name: "Music Festival", category: "Music" },
    { name: "Sports Meet", category: "Sports" }
];

const container = document.getElementById("eventsContainer");

function displayEvents(data) {

    container.innerHTML = "";

    data.forEach(event => {

        const card = document.createElement("div");

        card.className = "eventCard";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <button onclick="register('${event.name}')">
                Register
            </button>
        `;

        container.appendChild(card);

    });
}

function register(name) {
    alert(`Registered for ${name}`);
}

document.getElementById("categoryFilter").onchange = function () {

    const selected = this.value;

    if (selected === "All") {
        displayEvents(events);
        return;
    }

    const filtered =
        events.filter(event => event.category === selected);

    displayEvents(filtered);
};

document.getElementById("searchBox")
.addEventListener("keydown", function () {

    const keyword = this.value.toLowerCase();

    const result =
        events.filter(event =>
            event.name.toLowerCase().includes(keyword)
        );

    displayEvents(result);
});

displayEvents(events);
