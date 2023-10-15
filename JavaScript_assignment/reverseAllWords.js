const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWordsInSentence(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });


  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}

rl.question('Enter a sentence: ', (inputSentence) => {
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log('Reversed sentence:', reversedSentence);
  rl.close();
});
