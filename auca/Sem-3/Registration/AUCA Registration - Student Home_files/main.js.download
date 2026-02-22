// Get the current year
var currentYear = new Date().getFullYear();
// Find the span element with the current-year id
var yearElement = document.getElementById('current-year');
// Update the content of the span element with the current year
yearElement.innerHTML = currentYear;

var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
  return new bootstrap.Tooltip(tooltipTriggerEl)
})

try {
  document.getElementById("AutomaticRegistration").addEventListener("click", function () {
    // change button text
    this.innerText = "Loading...";
    window.addEventListener("load", function () {
      autoRegButton.innerText = "Automatic registration completed";
    });
  });
  
} catch (error) {
  console.log("'sup bro!");
}