/* ANAGRAM */
console.log("// Anagram //");

var word1 = "ana";
var word2 = "naa"

function isAnagram(word1, word2){

  var word1Sorted = word1.split("").sort().join("");
  var word2Sorted = word2.split("").sort().join("");

  if (word1Sorted !== word2Sorted) {
    return false;
  }
  if (word1Sorted === word2Sorted) {
    return true;
  }
}

console.log(word1 + " and "+ word2 + " are anagrams: " + isAnagram(word1, word2) +".");
