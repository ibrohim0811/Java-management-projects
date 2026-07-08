package TaskManager;

public class Task {
    private int id = 1;

    private String title;

    private String content;

    private String status;

    public String getTitle(){return title;}

    public void setTitle(String title){this.title = title;}

    public String getContent() {return content;}

    public void setContent(String content){this.content = content;}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean findTitle(String title){
        if(this.title.equals(title)){
            return true;
        }
        return false;
    }

    public boolean checkId(int id){
        if (this.id == id){
            return true;
        }else {
            return false;
        }

    }
}

