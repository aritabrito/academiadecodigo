/* LINEAR SEARCH */
var cardDeck = [1, 2, 3, 4, 5];

function linearSearch(array, searchElement) {
  if (array.indexOf(searchElement) === -1) {
    console.log("Card not in card deck.");
  } else {
    for (var i=0; i<array.length; i++) {
      if (searchElement === array[i]) {
          console.log("Yay! You found my card: " + searchElement + ".");
      }
    }
  }
}

linearSearch(cardDeck, 10);


/* BINARY SEARCH */
var cardDeck = [7, 1, 10, 4, 12, 2];

function binarySearch(array, searchElement) {
  var min = 0;
  var max = array.length - 1;
  var mid = Math.floor(max/2);
  
  searchElement = array.indexOf(searchElement);
  
  if (searchElement === -1) {
    console.log("Card not in card deck.");
  } else {
      while(min <= max) {
        if (mid === searchElement) {
          console.log("Yay! You found my card: " + array[searchElement] + ".");
          break;
        }
        if (mid < searchElement) {
          min = mid + 1;
          console.log("My card is higher.");
        }
        if (mid > searchElement) {
          max = mid - 1;
          console.log("My card is lower.");
        }
        mid = Math.floor((min + max) / 2); 
    }
  }
}

binarySearch(cardDeck, 2);