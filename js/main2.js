const eventName = "Music Festival";
const eventDate = "15 June 2026";
const eventCategory = "Music";
const eventDescription =
    "Join us for an unforgettable experience with live performances, food stalls, and fun activities for all ages!";

let seats = 50;

const details =
    `${eventName} on ${eventDate} | Category: ${eventCategory} | Seats Available: ${seats}`;

document.getElementById("eventInfo").textContent = details;

seats--;

console.log("Remaining Seats:", seats);