const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sortArrayDescending(arr) {
  return arr.sort((a, b) => b - a);
}

rl.question('Enter an array of numbers separated by spaces: ', (input) => {
 
  const inputArray = input.split(' ').map(Number);


  if (inputArray.some(isNaN)) {
    console.log('Invalid input. Please enter numbers separated by spaces.');
  } else {
    const sortedArray = sortArrayDescending(inputArray);
    console.log('Sorted array in descending order:', sortedArray);
  }

  rl.close();
});
