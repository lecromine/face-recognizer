/*
 * In this class I will implement a graph (like linkedlist) where the face database can be uploaded.
 */
package tilab.facerecogniser;

public class FaceList {

    private Face head;
    private int count;

    public FaceList() {
        head = new Face();
        count = 0;
    }

    public void add(int keyNumber) {
        Face listTemp = new Face(keyNumber);
        Face listCurrent = head;

        while (listCurrent.getNext() != null) {
            listCurrent = listCurrent.getNext();
        }

        listCurrent.setNext(listTemp);
        count++;
    }

    /*
     * This method returns the value that corresponds to the index value.
     * @param   index   value that is used to find the node in the list
     * @return the node that corresponds to the index
     */
    public Face get(int index) {

        if (index <= 0) {
            return null;
        }
        Face listCurrent = null;
        if (head != null) {
            listCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (listCurrent.getNext() == null) {
                    return null;
                }

                listCurrent = listCurrent.getNext();
            }

        }
        return listCurrent;

    }

    /* 
     * Remove a node from the list.
     * @param   index   index of the parameter that is to be removed
     * @return  true/false  true if the node is removed successfully, otherwise false.
     */
    public boolean remove(int index) {

        if (index < 1 || index > getCount()) {
            return false;
        }

        Face listCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (listCurrent.getNext() == null) {
                    return false;
                }

                listCurrent = listCurrent.getNext();
            }
            listCurrent.setNext(listCurrent.getNext().getNext());

            decCount();
            return true;

        }
        return false;
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Face listCurrent = head.getNext();
            while (listCurrent != null) {
                output += "[" + listCurrent.toString() + "]";
                listCurrent = listCurrent.getNext();
            }

        }
        return output;
    }

    public int getCount() {
        return count;
    }

    public void incCount() {
        count++;
    }

    public void decCount() {
        count--;
    }
}