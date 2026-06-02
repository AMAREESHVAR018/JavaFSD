const events = [
    { name: "Music Festival", upcoming: true, seats: 20 },
    { name: "Food Carnival", upcoming: false, seats: 30 },
    { name: "Sports Meet", upcoming: true, seats: 0 }
];

const eventList =
    document.getElementById("eventList");

events.forEach(event => {

    if (event.upcoming && event.seats > 0) {

        const li =
            document.createElement("li");

        li.textContent =
            `${event.name} - Seats: ${event.seats}`;

        eventList.appendChild(li);
    }
    else if (event.upcoming) {

        const li =
            document.createElement("li");
        li.textContent =
            `${event.name} - Sold Out`;
        eventList.appendChild(li);
    }else { 
        const li =
            document.createElement("li");

        li.textContent =
            `${event.name} - Past Event`;
        eventList.appendChild(li);
    }

});

function register(event) {

    try {

        if (event.seats <= 0) {
            throw new Error("No seats available");
        }

        event.seats--;

        console.log(
            "Registered successfully"
        );

    }

    catch (error) {

        console.error(error.message);

    }

}

register(events[0]);