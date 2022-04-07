import React from 'react';

// Class based component
// "Classical" Component
export class ClassCounter extends React.Component {

    // I cannot use hooks in a class component

    constructor() {
        super();
        // Instead of useState, we create a state object
        // on the class itself
        // This sets the initial state
        this.state = {
            count: 0
        }
        this.increment = this.increment.bind(this);
        this.decrement = this.decrement.bind(this);
    }

    increment() {
        if (this.state.count + 1 >= 0) {
            this.setState({count: this.state.count + 1});
        }

        // What's going on behind the scenes
        // let oldState = {};
        // let newState = {};
        // oldState = {...oldState, ...newState};
    }

    decrement() {
        if (this.state.count - 1 >= 0) {
            this.setState({count: this.state.count - 1});
        }
    }

    // LIFE CYCLE METHODS

    //Runs immediately as soon as the component is first rendered/inserted into DOM
    // useEffect(() => {}, [])
    componentDidMount() {
        // I might make an API call to fetch data from a server
        // Then change the state based on the data
        console.log('I am born');
    }

    // This function is automatically called any time the props/state of the component changes
    // useEffect(() => {}, [count])
    componentDidUpdate(prevProps, prevState) {
        if (prevState.count !== this.state.count) {
            console.log(`Old count: ${prevState.count}. New count: ${this.state.count}`);
        }
    }

    // Runs right before the component is to be unrendered/removed from the DOM
    // This is commonly used for cleanup right before obliteration
    // useEffect(() => {return () => {}}, []);
    componentWillUnmount() {
        console.log('Goodbye!');
    }

    // render() is in charge of returning the JSX
    render() {
        return (
        <>
            <h1>This is my Class Counter</h1>
            <h2>Count: {this.state.count}</h2>
            <button onClick={this.increment}>Increment</button>
            <button onClick={this.decrement}>Decrement</button>
        </>);
    }
}