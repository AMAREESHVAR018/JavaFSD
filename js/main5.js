function Event(name, date, seats) {

    this.name = name;
    this.date = date;
    this.seats = seats;
}

Event.prototype.checkAvailability =
function () {

    return this.seats > 0
        ? "Seats Available"
        : "Full";
};

const event1 =
    new Event(
        "Music Festival",
        "15 June",
        25
    );
const event2 =
    new Event(
        "Food Carnival",
        "20 June",
        0
    );
const event3 =
    new Event(
        "Tech Workshop",
        "25 June",
        10
    );
const events = [event1, event2, event3];

const output = document.getElementById("output");
output.textContent = event1.checkAvailability() + "\n\n";

Object.entries(event1).forEach(([key, value]) => {
    output.textContent += `${key}: ${value}\n`;
});
