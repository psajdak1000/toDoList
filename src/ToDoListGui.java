import javax.swing.*;

public class ToDoListGui extends JFrame {
    public ToDoListGui(){
        super("To Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(CommonConstants.FRAME_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

    }
}
