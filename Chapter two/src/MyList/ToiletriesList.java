package MyList;

public class ToiletriesList {
    private String[] toiletries = new String[4];
    private String[] myList = new String[0];
    private int size;


    public ToiletriesList(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String[] getToiletries() {
        return toiletries;
    }

    public void setToiletries(String[] toiletries) {
        this.toiletries = toiletries;
    }

    public String[] getMyList() {
        return myList;
    }

    public void setMyList(String[] myList) {
        if (getSize() == toiletries.length) {
            myList = toiletries;
            toiletries = new String[toiletries.length * 2];

        }

        this.myList = myList;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public void canAdd(String item) {
        setMyList(myList);
        for (int i = 0; i < toiletries.length; i++) {
            if (toiletries[i] == null) {
                toiletries[i] = item;

                size++;
                break;
            }
        }


    }

    public void canRemove() {
        for (int i = 0; i < toiletries.length; i++) {
            if (toiletries[i] == null) {
                myList = toiletries;
                toiletries = new String[toiletries.length-1];
            }
        }
    }

}
