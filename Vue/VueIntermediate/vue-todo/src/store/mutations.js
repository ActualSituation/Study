const addOneItem = (state, todoItem) => {
  console.log("received");
  const obj = { completed: false, item: todoItem };
  localStorage.setItem(todoItem, JSON.stringify(obj));
  //this.todoItems.push(obj);
  state.todoItems.push(obj);
};

const removeOneItem = (state, payload) => {
  console.log("received");
  localStorage.removeItem(payload.todoItem.item);
  state.todoItems.splice(payload.index, 1);
};

const toggleOneItem = (state, payload) => {
  console.log("toggleOneItem");
  state.todoItems[payload.index].completed = !state.todoItems[payload.index]
    .completed;
  localStorage.removeItem(payload.todoItem.item);
  localStorage.setItem(payload.todoItem.item, JSON.stringify(payload.todoItem));
};

const clearAllItems = state => {
  localStorage.clear();
  state.todoItems = [];
};

export { addOneItem, removeOneItem, toggleOneItem, clearAllItems };