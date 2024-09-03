
import java.util.*;

class Queuesystem{
    Queue<Integer>que=new LinkedList<>();
    void enqueue(int element){
        que.add(element);
        System.out.println("success");
    }
    void dequeue(){
        if(que.isEmpty()){
            System.out.println("empty queue");
        }else{
            int tp=que.poll();
            System.out.println(tp);
        }
    }

}
public class Q3{
    public static void main(String[] args) {
        Queuesystem q1=new Queuesystem();
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String temp=scan.next();
            if(temp.equals("E")){
                int element=scan.nextInt();
                q1.enqueue(element);
            }else if(temp.equals("D")){
                q1.dequeue();
            }
        }
    }
}