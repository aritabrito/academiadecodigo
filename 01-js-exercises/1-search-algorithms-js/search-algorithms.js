/* LINEAR SEARCH */
console.log("// Linear Search //");

function linearSearch(array, searchElement) {
  for (var i = 0; i < array.length; i++) {
    if (array[i] === searchElement) {
      return "The element " + searchElement + " was found at position: " + i + ".";
    }
  }
  return "Element not found.";
}
console.log(linearSearch([1, 2, 3, 4, 5], 2));


console.log("\n");


/* BINARY SEARCH */
console.log("// Binary Search //");

function binarySearch(array, searchElement) {
  var min = 0;
  var max = array.length - 1;
  var mid = array[Math.floor(max / 2)];

  while(min <= max) {
    if (mid === searchElement) {
      return "The element " + searchElement + " was found at position: " + array.indexOf(searchElement) + ".";
    }
    if (mid < searchElement) {
      min = mid + 1;
    }
    if (mid > searchElement) {
      max = mid - 1;
    }
    mid = Math.floor((min + max) / 2);
  }
  return "Element not found.";
}
console.log(binarySearch([7, 1, 10, 4, 12, 2], 10));
