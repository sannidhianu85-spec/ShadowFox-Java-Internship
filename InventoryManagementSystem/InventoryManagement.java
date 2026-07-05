import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InventoryManagement {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Inventory Management System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Table Model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Product");
        model.addColumn("Quantity");
        model.addColumn("Price");

        JTable table = new JTable(model);

        // Text Fields
        JTextField productField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField priceField = new JTextField();

        // Buttons
        JButton addButton = new JButton("Add Product");
        JButton updateButton = new JButton("Update Product");
        JButton deleteButton = new JButton("Delete Product");

        // Input Panel
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        panel.add(new JLabel("Product:"));
        panel.add(productField);

        panel.add(new JLabel("Quantity:"));
        panel.add(quantityField);

        panel.add(new JLabel("Price:"));
        panel.add(priceField);

        panel.add(addButton);
        panel.add(updateButton);

        // Delete button at bottom
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(deleteButton);

        // Add Product
        addButton.addActionListener(e -> {
            model.addRow(new Object[]{
                    productField.getText(),
                    quantityField.getText(),
                    priceField.getText()
            });

            productField.setText("");
            quantityField.setText("");
            priceField.setText("");
        });

        // Update Product
        updateButton.addActionListener(e -> {
            int row = table.getSelectedRow();

            if (row != -1) {
                model.setValueAt(productField.getText(), row, 0);
                model.setValueAt(quantityField.getText(), row, 1);
                model.setValueAt(priceField.getText(), row, 2);
            } else {
                JOptionPane.showMessageDialog(frame, "Select a row first!");
            }
        });

        // Delete Product
        deleteButton.addActionListener(e -> {
            int row = table.getSelectedRow();

            if (row != -1) {
                model.removeRow(row);
            } else {
                JOptionPane.showMessageDialog(frame, "Select a row first!");
            }
        });

        // Fill text fields when row is clicked
        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();

            if (row != -1) {
                productField.setText(model.getValueAt(row, 0).toString());
                quantityField.setText(model.getValueAt(row, 1).toString());
                priceField.setText(model.getValueAt(row, 2).toString());
            }
        });

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}