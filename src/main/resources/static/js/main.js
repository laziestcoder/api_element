$(document).ready(function () {

    $("#element_button").on("click", function (){
        console.log("button clicked with id " + this);
        var hostUrl = window.location.protocol + "//"+ window.location.host;
        window.location.href = hostUrl + "/api/button";
    });

    $("#currentYear").html(new Date().getFullYear());

});
