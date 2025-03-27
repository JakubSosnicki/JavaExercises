public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem( ListItem newItem ) {
        if( root == null ){
            root = newItem;
            return true;
        }

        var currentItem = root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if( comparison < 0 ){
                // newItem is greater than currentItem, move right if possible
                if( currentItem.next() != null ) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            
            } else if (comparison > 0) {
                // newItem is less than currentItem, insert before
                if( currentItem.previous() != null){
                    currentItem.setNext(newItem).setPrevious(currentItem.previous());

                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(root).setPrevious(newItem);
                    root = newItem; //korzeń to od teraz nowy item
                }
                return true;
            } else {
                // equal
                return false;
            }
        }
    return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if ( item != null)
            System.out.println("Deleting item " + item.getValue());

        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison == 0) { // found the item to delete
                if (currentItem == root) {
                    root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

}
