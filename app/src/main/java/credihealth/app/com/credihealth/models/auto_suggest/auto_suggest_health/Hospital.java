
package credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health;


import com.google.gson.annotations.Expose;


public class Hospital {

    @Expose
    private String name;
    @Expose
    private int id;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Hospital withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Hospital withId(int id) {
        this.id = id;
        return this;
    }

}
