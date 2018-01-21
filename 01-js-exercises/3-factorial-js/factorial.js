/* FACTORIAL */

var numberToCalculate = 5;

console.log("// Factorial (iterative) //");

function factorialIt(number) {
  var result = number;
  for (var i = number; i>1; i--) {
    result = result * (i-1);
  }
  return result;
}
console.log(numberToCalculate + "! = " + factorialIt(numberToCalculate));


console.log("\n");


console.log("// Factorial (recursive) //");

function factorial(number) {
  if (number === 1) {
    return number;
  } else {
    return number * factorial(number - 1);
  }
}
console.log(numberToCalculate + "! = " + factorial(numberToCalculate));
