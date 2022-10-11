package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;

import java.util.List;

public class View {

    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {
        Entity apple = new Apple("red");
        apple.setWeight(201);
        controller.add(apple);
        Entity apple2 = new Apple("green");
        apple2.setWeight(200);
        controller.add(apple2);

        Entity book = new Book(50, "Generic Youtube Lambo guru eBook but printed");
        book.setWeight(180);
        controller.add(book);

        Entity bookbig = new Book(1600, "Codex Gigas");
        bookbig.setWeight(80000);
        controller.add(bookbig);

        Entity cake = new Cake("vanilla");
        cake.setWeight(2500);
        controller.add(cake);

        List<Entity> entities = controller.getAllWithWeightGreaterThan();

        for (Entity entity: entities) {
            System.out.println(entity);
        }
    }
}
