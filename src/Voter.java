public class Voter{
    private static int voter_count = 0;
    public Voter(){
        voter_count++;
    }
    
    public void vote(Candidate person){
        person.voted();
        System.out.println("投票者" + voter_count + "投给了" + person.get_name());
    }

    public static int get_voter_count(){
        return voter_count;
    }
}
