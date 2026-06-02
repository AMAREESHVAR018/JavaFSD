const loading = document.getElementById("loading");
const list = document.getElementById("eventList");

fetch("https://jsonplaceholder.typicode.com/users")
.then(response => response.json())
.then(data => {

    loading.style.display = "none";

    data.forEach(item => {

        const li = document.createElement("li");

        li.textContent = item.name;

        list.appendChild(li);

    });

})
.catch(error => console.error(error));

async function loadEvents() {

    try {

        loading.style.display = "block";

        const response =
            await fetch("https://jsonplaceholder.typicode.com/users");

        const data = await response.json();

        loading.style.display = "none";

        console.log(data);

    }

    catch(error) {

        console.error(error);

    }
}

loadEvents();
