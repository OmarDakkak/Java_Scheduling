import java.util.*;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of processes : ");
        int num = sc.nextInt();

        // assign the array to get burst time for each process
        int B[] = new int[num];

        // now get the burst time for each process
        for (int i=0; i<num; i++){
            System.out.println("Enter the burst time for p"+(i+1));
            B[i] = sc.nextInt();
        }

        System.out.println("Enter the quantum number: ");
        int q = sc.nextInt();

        //now assign one array to get the waiting for each process
        int waiting [] = new int[num];

        // assign one variable to get the total burst time for all process after each loop
        int total=0;
        //now do the loop until every process burst time is equal to 0

        do{
            for(int i=0; i<num ; i++){
                if(B[i]>q){
                    for(int j=0; j<num; j++){
                        if(j!=i && B[j]!=0){
                            waiting[j] += q;
                        }
                    }

                    B[i] -=q;
                }else {
                    for(int j=0; j<num; j++){
                        if(j!=i && B[j]!=0){
                            waiting[j] += B[i];
                        }
                    }

                    B[i] = 0;
                }
            }
            total = 0;
            for(int i=0; i<num;i++){
                total+=B[i];
            }
        }while(total!=0);

        System.out.println("Process \t \t \t waiting time");

        // assign one variable to get the total of all waiting time

        float total_waiting = 0;
        for(int i=0; i<num; i++){
            System.out.println("p"+(i+1)+"\t \t \t "+waiting[i]);
            total_waiting+=waiting[i];
        }
        System.out.println("Average wait time is : "+(total_waiting/num));

    }
}
