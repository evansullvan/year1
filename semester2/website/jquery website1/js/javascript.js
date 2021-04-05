$(document).ready(function() {
    // .ready() means when the document has loaded up do all this code
    $("#submit").on('click', function() {
        //defining what count means
        var count = $('#storybank').data("count") || 0;
        if (count >= 8 ) { // needs to be less than equal to for 9th story to be added to left column
            //user clicked more than 8 times print story on the left

            var makeStory2 = function(st) {
                //creating all the elements and assigning them to makestroty
                var storys = $(document.createElement('div')).addClass('storybank2').addClass('box')
                var h2 = $(document.createElement('h2')).text(st.name)
                var p = $(document.createElement('p')).text(st.story)
                var h3 = $(document.createElement('h3')).text(st.location).addClass('location')


                $('#storybank2').prepend(storys.append(h2).append(h3).append(p));
            }

            //taking what user inputs in text area and assigning it to story. it acts the same as this.Name = name; in java
            var story = $('#textarea').val()
            var name = $('#name').val()
            var location = $('#City').val()

            makeStory2({
                    name: name,
                    location: "City " + location,
                    story: story
                })
                //another way to prevent default
            return false

        } else { // when user clicks less than 8 times it will print on the right
            var makeStory = function(s) {
                    //creating all the elements
                    var storys = $(document.createElement('div')).addClass('storybank').addClass('box' ).addClass('outline')
                    var h2 = $(document.createElement('h1')).text(s.name).addClass('name')
                    var p = $(document.createElement('h4')).text(s.story).addClass('para')
                    var h3 = $(document.createElement('h2')).text(s.location).addClass('location')

                    //adding them to the page in a certain order
                    $('#storybank').prepend(storys.append(h2).append(h3).append(p));
                }
                //taking user input
            var story = $('#textarea').val()
            var name = $('#name').val() //val() sets the value of the attribute
            var location = $('#City').val()
            makeStory({
                name: name,
                location: "City: " + location,
                story: story
            })
            $('#storybank').data("count", ++count); // needs to be within scope of submit click handler
            
            return false
        }
    })













});