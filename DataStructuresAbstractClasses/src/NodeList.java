public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem newItem);

    boolean removeItem(ListItem listItem);

    void traverse(ListItem root);
}
