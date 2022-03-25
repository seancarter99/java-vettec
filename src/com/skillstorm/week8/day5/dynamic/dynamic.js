let itemNumber = 0;

function addItem() {
    itemNumber++;
    const container = document.getElementById('item-container');
    // We can dynamically create elements using document.createElement()
    let newItem = document.createElement('div');
    newItem.classList.add('item'); // add the class="item" to new div
    
    // sets the inner text of the div to look like <div class="item">Item 1</div>
    newItem.innerText = `Item ${itemNumber}`;
    container.appendChild(newItem); // Add the new div to the end of the children list
}

// Another way to write it, but worse
// function addOtherItem() {
//     itemNumber++;
//     const container = document.getElementById('item-container');
//     let newItem = `<div class="item">Item ${itemNumber}</div>`;
//     let div = document.createElement('div');
//     div.innerHTML = newItem;
//     container.appendChild
// }

window.addEventListener('DOMContentLoaded', () => {

    setInterval(addItem, 1000);
});