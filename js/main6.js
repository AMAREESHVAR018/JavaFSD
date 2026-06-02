const events = [
    {
        name: "Music Festival",
        category: "Music"
    },
    {
        name: "Baking Workshop",
        category: "Workshop"
    }
];

events.push({
    name: "Food Carnival",
    category: "Food"
});

const musicEvents =
    events.filter(
        event => event.category === "Music"
    );

console.log(musicEvents);

const formattedEvents =
    events.map(
        event => `Workshop on ${event.name}`
    );

const list =
    document.getElementById("eventList");

formattedEvents.forEach(item => {

    const li =
        document.createElement("li");

    li.textContent = item;

    list.appendChild(li);

});
