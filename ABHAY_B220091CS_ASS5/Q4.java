import java.util.*;

interface SortVotes {
    void ascendDisplay();     
    void descendDisplay();    
}

class ElectionPost implements SortVotes {
    private String nameOfThePost;    
    private ArrayList<String> listOfCandidates;    
    private ArrayList<String> votesEntered;       

    public ElectionPost(String nameOfThePost, ArrayList<String> listOfCandidates, ArrayList<String> votesEntered) {
        this.nameOfThePost = nameOfThePost;
        this.listOfCandidates = listOfCandidates;
        this.votesEntered = votesEntered;
    }

    public void display() {
        Collections.sort(listOfCandidates); 
        System.out.println("Post: " + nameOfThePost);
        System.out.println("Candidates:");
        for (String candidate : listOfCandidates) {
            System.out.println(candidate);
        }
    }

    private Map<String, Integer> countVotes() {
        Map<String, Integer> voteCount = new HashMap<>();
        for (String candidate : listOfCandidates) {
            voteCount.put(candidate, 0);
        }
        for (String vote : votesEntered) {
            if (voteCount.containsKey(vote)) {
                voteCount.put(vote, voteCount.get(vote) + 1);
            }
        }
        return voteCount;
    }

    @Override
    public void ascendDisplay() {
        Map<String, Integer> voteCount = countVotes();
        List<Map.Entry<String, Integer>> sortedCandidates = new ArrayList<>(voteCount.entrySet());
        sortedCandidates.sort(Map.Entry.comparingByValue());

        System.out.println("Candidates and votes (Ascending order):");
        for (Map.Entry<String, Integer> entry : sortedCandidates) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    @Override
    public void descendDisplay() {
        Map<String, Integer> voteCount = countVotes();
        List<Map.Entry<String, Integer>> sortedCandidates = new ArrayList<>(voteCount.entrySet());
        sortedCandidates.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Candidates and votes (Descending order):");
        for (Map.Entry<String, Integer> entry : sortedCandidates) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the post: ");
        String nameOfThePost = scanner.nextLine();

        System.out.print("Enter the number of candidates: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> listOfCandidates = new ArrayList<>();
        System.out.println("Enter the names of the candidates:");
        for (int i = 0; i < n; i++) {
            listOfCandidates.add(scanner.nextLine());
        }

        System.out.print("Enter the total number of votes: ");
        int m = scanner.nextInt();
        scanner.nextLine(); 

        ArrayList<String> votesEntered = new ArrayList<>();
        System.out.println("Enter the votes (one vote per line):");
        for (int i = 0; i < m; i++) {
            votesEntered.add(scanner.nextLine());
        }

        ElectionPost election = new ElectionPost(nameOfThePost, listOfCandidates, votesEntered);

        election.display();

        election.ascendDisplay();

        election.descendDisplay();

        scanner.close();
    }
}
