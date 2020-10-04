/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.javaee.todo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author maeda
 */
@Named(value = "todoBean")
@ViewScoped
public class TodoBean implements Serializable {

    private String todo;

    private List<String> listTodo;

    @PostConstruct
    public void init() {
        listTodo = new ArrayList<>();
    }

    public void add() {
        listTodo.add(todo);
    }

    public String getTodo() {
        return this.todo;
    }

    public List<String> getListTodo() {
        return this.listTodo;
    }
}
