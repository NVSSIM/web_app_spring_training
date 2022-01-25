package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;


@RestController
public class TodoListController {

    private final TodoRepository repository;
    public TodoListController(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    @PostMapping("/api/todo")
    public void post(@RequestBody TodoEntity todoEntity){
        this.repository.save(todoEntity);
    }
    @GetMapping("/api/todo")
    public Iterable<TodoEntity> get(){
        return this.repository.findAll();
    }
}

