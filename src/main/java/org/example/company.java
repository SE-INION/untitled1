package org.example;

public class company {
    private  long id;
    private String name;
     private  int worker;

    public company(long id, String name, int worker) {
        this.id = id;
        this.name = name;
        this.worker = worker;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorker() {
        return worker;
    }

    public void setWorker(int worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", worker=" + worker +
                '}';
    }

    public company() {
    }
}
