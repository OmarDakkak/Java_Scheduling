import java.util.LinkedList;

public class FIFO{
    public static Task LirePremiereTache(LinkedList<Task> lt){
        return lt.getFirst();
    }
    public static void TacheSuivante(LinkedList<Task> lt){
        lt.remove();
    }
    public static void ExecuterTache(Task tc){
        while(tc.getDTC()>0){
            tc.setDTC(tc.getDTC()-1);
            System.out.println("Task : "+tc.getName()+" executed, remaing burst time is : "+tc.getDTC());
        }
    }


    public static void execute(LinkedList<Task> ListeTaches){
        Task Tache_courante;
        while(ListeTaches!=null){
            Tache_courante = LirePremiereTache(ListeTaches);
            TacheSuivante(ListeTaches);
            ExecuterTache(Tache_courante);
        }
    }
    public static void main(String[] args) {
        Task T1 = new Task("T1", 3);
        Task T2 = new Task("T2", 4);
        Task T3 = new Task("T3", 1);
        Task T4 = new Task("T4", 6);

        LinkedList<Task> ListeTaches = new LinkedList<>();
        ListeTaches.add(T1);
        ListeTaches.add(T2);
        ListeTaches.add(T3);
        ListeTaches.add(T4);
        try{
            execute(ListeTaches);
        }catch (Exception e){

        }
    }
}
