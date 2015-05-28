package tasks;

import contacts.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Задача: выполяется за один раз
 */
public class Task {
    public enum TaskPriority {HIGH, MEDIUM,LOW}

    /**
     * Название задачи
     */
    private final String name;

    /**
     * Описание задачи
     */
    private String description;

    /**
     * Исполнитель
     */
    private Contact person;

    /**
     * Дата завершения планируемая
     */
    private Date planingDate;

    /**
     * Дата завершения реальная
     */
    private Date closingDate;

    /**
     * Дата создания задачи(изменения)
     */
    private Date createDate;

    /**
     * Пункты задачи (подзадачи)
     */
    List<Task> subTasks = new ArrayList<>();

    /**
     * Теги задачи
     */
    List<String> tags = new ArrayList<>();

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
