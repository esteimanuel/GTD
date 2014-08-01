/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gtd.Models;

/**
 *
 * @author st
 */
public class Project {
    // Properties
    private final int id;
    private String name;
    private String notes;
    
    /**
     * Contructor
     */
    public Project() {
        // Initialize fields
        this.id = 0;
        this.name = "";
        this.notes = "";
    }
    
    public Project(int id, String name, String notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
