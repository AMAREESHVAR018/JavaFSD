const events = [
    { name: "Music Festival", category: "Music" },
    { name: "Sports Meet", category: "Sports" },
    { name: "Art Exhibition", category: "Art" },
    { name: "Tech Workshop", category: "Tech" },
    { name: "Community Service", category: "Community" }
];

function showEvent(eventName = "Community Event") {
    return eventName;
}

let clonedEvents = [...events];
const { name, category } = clonedEvents[0];
const musicEvents = clonedEvents.filter(event => event.category === "Music");

const output = document.getElementById("output");
output.textContent = `${showEvent()}\n${name}\n${category}\n${JSON.stringify(musicEvents, null, 2)}`;
