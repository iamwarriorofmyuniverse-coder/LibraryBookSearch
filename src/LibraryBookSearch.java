import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class LibraryBookSearch extends JFrame implements ActionListener {

    JTextField titleField = new JTextField(15);
    JButton searchButton = new JButton("Search");
    JLabel resultLabel = new JLabel("Result");

    String[] books = { "Java", "Python", "C++", "DBMS", "Networks" };

    LibraryBookSearch() {
        setLayout(new FlowLayout());
        add(titleField);
        add(searchButton);
        add(resultLabel);

        searchButton.addActionListener(this);

        setTitle("Library Book Search");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = titleField.getText().trim();
        boolean found = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            resultLabel.setText("Available");
        } else {
            resultLabel.setText("Not Found");
        }
    }

    public static void main(String[] args) {
        new LibraryBookSearch();
    }
}