public class App {
    public static void main(String[] args) throws Exception {
        Candidate candidates[] = {new Candidate("张三"), new Candidate("李四"), new Candidate("王五")};
        while(Voter.get_voter_count() < 100){
            Voter v = new Voter();
            v.vote(candidates[(int)(Math.random()*3)]);
        }
    
        System.out.println("投票停止，开始计票。");
        for(Candidate candidate : candidates){
            candidate.print_information();
        }
    }
}
