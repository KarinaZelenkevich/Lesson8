public enum Position {

    DIRECTOR ("Director", 5),
    WORKER ("Worker", 2);

    private String post;
    private int koef;

    public String getPost() {
        return post;
    }

    public int getKoef() {
        return koef;
    }


    Position(String post, int koef) {
        this.post = post;
        this.koef = koef;

    }
}
