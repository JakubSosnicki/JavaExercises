public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        rightLink = listItem;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        leftLink = listItem;
        return leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (listItem != null) {
            return ((String) super.getValue()).compareTo((String) listItem.getValue());
        } else {
            return -1;
        }

    }


}
