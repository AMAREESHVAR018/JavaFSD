document
    .getElementById("submitBtn")
    .addEventListener(
        "click",
        function () {

            console.log(
                "Registration Started"
            );

            const user = {

                name: "John",
                email: "john@email.com"

            };

            console.log(
                "User Data:",
                user
            );

            debugger;

            fetch(
                "https://jsonplaceholder.typicode.com/posts",
                {
                    method: "POST",

                    headers: {
                        "Content-Type":
                            "application/json"
                    },

                    body: JSON.stringify(user)

                }
            )

            .then(response =>
                response.json()
            )

            .then(data => {

                console.log(
                    "Response:",
                    data
                );

            })

            .catch(error => {

                console.error(
                    error
                );

            });

        }
    );
