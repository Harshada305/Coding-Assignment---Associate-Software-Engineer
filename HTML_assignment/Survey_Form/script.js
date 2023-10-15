function submitForm() {
    event.preventDefault(); // Prevents the default form submission behavior

    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const isFirstTime = document.querySelector('input[name="answer"]:checked').value;
    const wouldRecommend = document.querySelectorAll('input[name="answer"]')[1].checked ? "Yes" : "No";
    const satisfactionLevel = document.querySelectorAll('input[name="answer"]')[3].checked ? "Satisfied" : document.querySelectorAll('input[name="answer"]')[4].checked ? "Undecided" : "Unsatisfied";
    const suggestions = document.getElementById('textbox').value;

    const details = `Name: ${name}\nEmail: ${email}\nIs this your first time using our product and service? ${isFirstTime}\nWould you recommend us? ${wouldRecommend}\nSatisfaction level: ${satisfactionLevel}\nSuggestions: ${suggestions}`;

    alert(details);
}
