package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private final List<Todo> todos = new ArrayList<>();
    @PostMapping("/api/todo")
    void addTodo(Todo todo){
        todos.add(todo);
    }
    @GetMapping("/api/todo")
    List<Todo> getTodos(){
        return todos;
    }
}
