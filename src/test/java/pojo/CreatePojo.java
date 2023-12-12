
package pojo;

public class CreatePojo {
    private String name;
    private String job;

    // Construtores, getters e setters (pode ser gerado automaticamente por IDE)

    public CreatePojo() {
    }

    public CreatePojo(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
