const form = document.getElementById("registerForm");

form.addEventListener("submit", function(event) {

    event.preventDefault();

    const name =
        form.elements.username.value;

    const email =
        form.elements.email.value;

    const selectedEvent =
        form.elements.event.value;

    document.getElementById("nameError").textContent = "";
    document.getElementById("emailError").textContent = "";

    let valid = true;

    if (!name) {

        document.getElementById("nameError")
            .textContent = "Name is required";

        valid = false;
    }

    if (!email) {

        document.getElementById("emailError")
            .textContent = "Email is required";

        valid = false;
    }

    if (valid) {

        alert(`Registered for ${selectedEvent}`);

    }
});
