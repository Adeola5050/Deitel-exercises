public class Native {
    private int scvid;
    private String name;

    public Native(String name, int scvid){
        this.name = name;
        this.scvid = scvid;

    }

    public int getScvid() {
        String myScvid = "";
        myScvid = "SCV900"+scvid;
        return scvid;
    }

    public void setScvid(int scvid) {
        this.scvid = scvid;
    }
    public String getName(){
        return name;
    }
}
