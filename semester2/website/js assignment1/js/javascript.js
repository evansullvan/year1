

//list of words
let nouns, adjectives;
nouns = ["bird", "clock", "boy", "plastic", "duck", "teacher", "old lady", "professor", "hamster", "dog"];
adjectives = ["beautiful", "lazy", "professional", "lovely", "dumb", "rough", "soft", "hot", "vibrating", "slimy"];
let starters = ["The ", "A "];

//generate a random number
function randGen() {
    return Math.floor(Math.random() * 5);
}
//creates a random number and assigns it to rand1 rand2 rand3 etc
function sentence() {

    let rand1 = Math.floor(Math.random() * 10);
    let rand2 = Math.floor(Math.random() * 10);
    let rand3 = Math.floor(Math.random() * 2);
   
   //creates the sentence
    let content = starters[rand3]+" " + adjectives[rand1] + " " + nouns[rand2] + ".";

    document.getElementById('quote').innerHTML = "&quot;" + content + "&quot;";
};
sentence();










function Name1() {

const isFilled = (field) => {
 if (field==null || field.length== 0) {
     return false
  }
 return true
}


  let  Name6 = prompt("what is your name?")
    let res = isFilled(Name6)

    nameCapitalized = Name6.charAt(0).toUpperCase() + Name6.slice(1)
if (res) {
  document.getElementById("name").innerHTML =
  "Hello " + nameCapitalized;
} else {
    alert("no input was entered")
    Name6 = prompt("what is your name?")
    }
   
}
Name1();


    




