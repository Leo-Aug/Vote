public class Candidate{
    private int vote_count = 0;
    private String name;

    public Candidate(){

    }

    public Candidate(String name){
        this.name = name;
        this.vote_count = 0;
    }

    public int get_vote_count(){
        return vote_count;
    }

    public void voted(){
        vote_count++;
    }

    public void print_information(){
        System.out.println("姓名：" + name + " 票数：" + vote_count);
    }

    public String get_name(){
        return name;
    }
}