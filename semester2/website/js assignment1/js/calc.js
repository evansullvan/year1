
                                
function add(num1, num2) {
   
  num3 = prompt("enter first number");
  num4 = prompt("enter second number");
  
 while (isNaN(num3) || isNaN(num4)) {
    alert("values entered are not a number")
    num3 = prompt("enter first number")
    num4 = prompt("enter second number")
  }

  
     num1 = parseInt(num3)
     num2 = parseInt(num4)
     
  ans = (num1 + num2);
    document.getElementById('ans').innerHTML = num1 + " + " + num2 +" = " + ans
};

function minus(num1,num2) {
  num1 = prompt("enter first number");
   num2 = prompt("enter second number");

  while (isNaN(num1) || isNaN(num2)) {
    alert("values entered are not a number")
    num1 = prompt("enter first number")
    num2 = prompt("enter second number")
  }
  
  ans = num1 - num2;
 
     document.getElementById('ans').innerHTML =  num1 + " - " + num2 +" = " + ans

    
};

function divid(num1,num2) {
  num1 = prompt("enter first number");
   num2 = prompt("enter second number");

  
   while (isNaN(num1) || isNaN(num2)) {
    alert("values entered are not a number")
    num1 = prompt("enter first number")
    num2 = prompt("enter second number")
  }

  ans = num1 / num2;
     document.getElementById('ans').innerHTML =  num1 + " ÷ " + num2 +" = " + ans
};

function mult(num1,num2) {
  num1 = prompt("enter first number");
   num2 = prompt("enter second number");

   while (isNaN(num1) || isNaN(num2)) {
    alert("values entered are not a number")
    num1 = prompt("enter first number")
    num2 = prompt("enter second number")
  }
  
  ans = num1 * num2;
     document.getElementById('ans').innerHTML =  num1 + " x " + num2 +" = " + ans
};










