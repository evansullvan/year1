$(document).ready(function () {
     $('#sell1').toggle(function () {
        $("#sell1").addClass("on");
    }, function () {
        $("#sell1").removeClass("on");
    });

    $("#submit").on('click', function () {

        var makelisting = function (st) {
            
            //creating all the elements and assigning them to makestroty
            var card = $(document.createElement('div')).addClass('ui card')
            var name = $(document.createElement('h1')).text(st.name)
            var location = $(document.createElement('h2')).text(st.location).addClass('location')
            var phone = $(document.createElement('p')).text(st.phone).addClass('phone')


            $('#listings12').prepend(card.append(name).append(location).append(phone));
        }
        
        var name = $('#name').val()
        var location = $('#location').val()
        var phone = $('#phone').val()

        makelisting({
            name: "Name " + name,
            location: "City " + location,
            phone: phone
        })
       return false
    })
});
    
   




    



