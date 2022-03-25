// For events, we can take as the parameter, the event object itself
function handleSubmit(e) {
    e.preventDefault(); // Prevents the default behavior of the submit event

    // How can I get the form-data?
    // I can use new FormData and pass the form as a parameter to get my form's data out
    const form = document.getElementById('person-form');
    let formData = new FormData(form);

    // Use formData.get() and pass in the name property of the form field you wish to get the user's answer for

    // Handling the data
    createRow(formData);
    this.reset(); // This refers to the element whose event triggered. In this case, the form's
}

function createRow(data) {
    // Creates and adds the row to the end of the table body
    const tableBody = document.getElementById('table-body');

    let row = document.createElement('tr'); // Creates a <tr></tr> tag

    let nameCol = document.createElement('td');
    nameCol.innerText = data.get('name');

    let genderCol = document.createElement('td');
    genderCol.innerText = data.get('gender');

    let dobCol = document.createElement('td');
    dobCol.innerText = data.get('dob');

    row.appendChild(nameCol);
    row.appendChild(genderCol);
    row.appendChild(dobCol);

    row.style.color = data.get('favorite-color');

    tableBody.appendChild(row);
}

window.addEventListener('DOMContentLoaded', () => {
    let personForm = document.getElementById('person-form');
    personForm.addEventListener('submit', handleSubmit);
});