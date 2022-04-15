import { createStore } from 'redux';
import { counterReducer } from './reducers/reduxCounter';

// In order to create a redux store, we need to use the createStore function from Redux

// createStore requires a reducer to use
// In other words, "creates a store using that reducer to access data"
export const store = createStore(counterReducer);