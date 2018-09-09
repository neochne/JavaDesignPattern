package pattern.structual.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sharp on 2018/9/9.
 */
public class Leader implements Worker{

    private List<Worker> workers = new ArrayList<>();

    @Override
    public void work() {

        System.out.println("manager");
        for (Worker worker:workers){
            worker.work();
        }

    }

    public void addWorker(Worker worker){
        this.workers.add(worker);
    }

    public void removeWorker(Worker worker){
        this.workers.remove(worker);
    }

}
