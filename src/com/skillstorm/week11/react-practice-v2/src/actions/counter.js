export const increment = () => ({ type: 'INCREMENT' });
export const decrement = () => ({ type: 'DECREMENT' });
export const setCount = (payload) => ({type: 'SET_COUNT', payload});
export const clearCount = () => ({type: 'CLEAR_COUNT'});