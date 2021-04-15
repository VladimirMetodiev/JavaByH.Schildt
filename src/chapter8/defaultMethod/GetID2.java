package chapter8.defaultMethod;

public class GetID2 implements MyIF {
    private int id = 0;
    private int adminID;

    public GetID2() {
        this.id = 9383761;
        this.adminID = 9383761;
    }

    public GetID2(int id) {
        this.id = id;
    }

    @Override
    public int getUserID() {
        return id;
    }

    public void setAdminID(int id) {
        if(this.id == adminID) {
            this.id = id;
            this.adminID = id;
        }
        else System.out.println("You don't have administrative rights!");
    }

    @Override
    public int getAdminID() {
        return adminID;
    }
}
