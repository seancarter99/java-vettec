const timedPromise = (time, name, partySize=1) => {
    return new Promise((resolve, reject) => {
        if (name == null) {
            reject('Not a valid name!');
        }
        if (typeof partySize !== 'number') {
            reject(`${name}, you must provide a valid party size.`);
        }
        setTimeout(() => {
            resolve(`${name}, your table for ${partySize} is ready!`);
        }, time);
    });
}

const seansTable = timedPromise(5000, 'Sean', 4);

console.log(seansTable);

// To handle my promise
// Use .then for fulfilled Promise
// Use .catch for rejected Promise
seansTable.then(msg => console.log(msg));

const bobsTable = timedPromise(3000, 'Bob', null); // Didn't provide a party size. Promise will be rejected

bobsTable
.then(msg => console.log(msg))
.catch(err => console.log(bobsTable));


const placeOrder = (order) => {
    if (order.name == null || order.card == null || order.address == null 
        || order.orderDetails == null || order.orderDetails.length === 0) {
        return Promise.reject('Could not place order');
    }
    return Promise.resolve(`Congrats, ${order.name}, your order has been placed!`);
}

const prepOrder = (orderDetails) => {
    for (item of orderDetails) {
        // If you lack the materials to make the item, return rejected promise
        console.log(`Making ${item}`);
    }
}

const boxOrder = (orderDetails) => {
    let boxes = 4; // I only have 4 boxes
    if (boxes < orderDetails.length) {
        return Promise.reject('Not enough boxes to finish the order');
    }
    for (item of orderDetails) {
        console.log(`Boxing ${item}`);
        boxes--;
    }
    return Promise.resolve('Moving on to delivery order!');
}

const deliverOrder = (order) => {
    if (order.address == null) {
        throw 'Invalid address'; // You can also throw
    }
    return 'Enjoy your food!';
}

const myOrder = {
    name: 'Sean',
    card: '32q51adsf',
    address: 'P Sherman 42 Wallaby Way Sydney',
    orderDetails: ['18in thick crust pepperoni pizza', '18in supreme pizza', 'cheesey bread', 'coke', 'sprite']
};

placeOrder(myOrder)
.then(() => prepOrder(myOrder.orderDetails))
.then(() => boxOrder(myOrder.orderDetails))
.then(() => deliverOrder(myOrder))
.then((msg) => console.log(msg))
.catch(err => console.log('ERROR: ' + err))