package mx.edu.utez.u2_ti_08_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        Label lblOpciones = new Label("Opciones");
        

        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> cmbOpciones = new ComboBox<>(opciones);
        Button btnAceptar = new Button("Crear");
        Label lblResultado = new Label();

        btnAceptar.setOnAction( e -> {
            String nombre = tfNombre.getText();
            String edad = tfEdad.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            if(nombre.isEmpty() || edad.isEmpty() || seleccion.isEmpty()){
                System.out.println("Todos los campos son obligatorios");
            } else{
                lblResultado.setText("Nombre " + nombre + "\nEdad " + edad + "\nOcupacion " + seleccion);
               lblResultado.setStyle("-fx-background-color: #43ce0e");
                form.setStyle("-fx-background-color: #3a871a");

            }
        });

        ;

        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnAceptar, 0, 3);
        form.add(lblResultado, 1, 4);

        Scene scene = new Scene(form, 500, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}