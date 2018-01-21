/* PALINDROME */

var word = "annnnnnna";

console.log("// Palindrome (iterative) //");

function isPalindromeIterative(wordToCheck) {

  var finalChar = wordToCheck.length - 1;

  if (wordToCheck.length === 1) {
    return true;
  }

  for (var i=0; i<Math.floor(wordToCheck.length / 2); i++) {
    if (wordToCheck[i] !== wordToCheck[finalChar-i] ) {
      return false;

    }
  } return true;

}

console.log(word + " is a palindrome: " + isPalindromeIterative(word) +".");


console.log("\n");


console.log("// Palindrome (recursive) //");

function isPalindromeRecursive(wordToCheck) {

  var beg = 0;
  var end = wordToCheck.length - 1;

  if (wordToCheck.length <= 1) {
    return true;
  }

  if (wordToCheck[beg] !== wordToCheck[end]) {
    return false;
  }

  var subs = wordToCheck.substring(beg + 1, end);
  return isPalindromeRecursive(subs);
}

console.log(word + " is a palindrome: " + isPalindromeRecursive(word) +".");
