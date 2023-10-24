package br.com.hoogle.todo.controllers;

import br.com.hoogle.todo.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {

    private static List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List<Task> getTasks() {
        tasks.add(new Task(1L, "ir ao dentista", "ir ao dentista dia 05", false));
        tasks.add(new Task(2L, "Estudar spring", "Estudar JPA do spring", true));
        return tasks;
    }
}
