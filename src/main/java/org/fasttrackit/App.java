package org.fasttrackit;

import org.persistence.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {

        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
        //toDoItemRepository.createToDoItem("Learn JDBC", LocalDateTime.now().plusMonths(6));

        //toDoItemRepository.deleteToDoItem(3);

        System.out.println(toDoItemRepository.getToDoItems());
        toDoItemRepository.updateToDoItem(1, true);

        System.out.println(toDoItemRepository.getToDoItems());
    }


}
