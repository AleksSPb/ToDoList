package tasks;

import contacts.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Задача: выполяется за один раз
 */
public class Task {
    public String getDescription() {
        return description;
    }

    public Contact getPerson() {
        return person;
    }

    public Date getPlaningDate() {
        return planingDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPerson(Contact person) {
        this.person = person;
    }

    public void setPlaningDate(Date planingDate) {
        this.planingDate = planingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

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
     * Список кого нужно оповестить о окончании задачи (подзадачи)
     */
    List<Contact> advertisingPersons = new ArrayList<>();

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


    public Task(String name, String description) {
        this.name = name;
        this.description=description;
    }

    public Task(String name, String description, Contact person) {
        this.name = name;
        this.description=description;
        this.person=person;
    }

    public Task(String name, String description, Date planingDate) {
        this.name = name;
        this.description=description;
        this.planingDate=planingDate;
    }

    public String getName() {
        return name;
    }
}
