const events = [
    {
        name: "Music Festival",
        seats: 20
    },
    {
        name: "Sports Meet",
        seats: 15
    }
];

const container =
    document.querySelector(
        "#eventsContainer"
    );

events.forEach(event => {

    const card =
        document.createElement("div");

    card.className = "eventCard";

    card.innerHTML = `
        <h3>${event.name}</h3>
        <p>Seats: ${event.seats}</p>
        <button>Register</button>
        <button>Cancel</button>
    `;

    const buttons =
        card.querySelectorAll("button");

    buttons[0].onclick = () => {

        event.seats--;

        card.querySelector("p").textContent =
            `Seats: ${event.seats}`;
    };

    buttons[1].onclick = () => {

        event.seats++;

        card.querySelector("p").textContent =
            `Seats: ${event.seats}`;
    };

    container.appendChild(card);

});
