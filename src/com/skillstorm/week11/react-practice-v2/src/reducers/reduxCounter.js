// State=0 is important because without it state would be undefined by default
// Doing things this way sets state to be 0 on the first go around
export const counterReducer = (state=0, action) => {
    switch(action.type) {
        case 'INCREMENT':
            return state + 1;
        case 'DECREMENT':
            return state - 1;
        case 'SET_COUNT':
            return Number(action.payload);
        case 'CLEAR_COUNT':
            return 0;
        default:
            return state;
    }
}