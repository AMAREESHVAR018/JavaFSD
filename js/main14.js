$(document).ready(function () {

    $("#registerBtn").click(function () {

        alert(
            "Registration Successful"
        );

    });

    $("#hideBtn").click(function () {

        $(".eventCard").fadeOut();

    });

    $("#showBtn").click(function () {

        $(".eventCard").fadeIn();

    });

});
