package ch.zhaw.soe.swen1.le06.forum.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * A discussion inside a topic of a form. 
 */
public class Discussion {
    private String name;
    private List<Contribution> contributions = new ArrayList<Contribution>();

    public Discussion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected List<Contribution> getContributions() {
        return contributions;
    }

    public int getNbrOfContributions(){
        int result = contributions.size();
        return result;
    }
}
