/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package proy.controladoras;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author laura
 */
public class Main extends Application {

    private static Stage primaryStage;
    private static BorderPane mainLayout;
    private static Main instance;
    public static String TextAlert;

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void ShowAlert(String text) throws IOException {
        TextAlert = text;
        VBox ErrorAlert = FXMLLoader.load(getClass().getResource("../interfaces/MensajeDeError.fxml"));
        Stage informationView = new Stage();
        informationView.initModality(Modality.WINDOW_MODAL);
        informationView.setScene(new Scene(ErrorAlert));
        informationView.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        mainLayout = FXMLLoader.load(getClass().getResource("../interfaces/Init.fxml"));
        primaryStage.setTitle("Login Hospital");
        primaryStage.setScene(new Scene(mainLayout));
        primaryStage.show();
    }

    public void ShowLogin() throws IOException {
        BorderPane Loginview = FXMLLoader.load(getClass().getResource("../interfaces/Login.fxml"));
        mainLayout.setCenter(Loginview);
    }

    public void ShowInit() throws IOException {
        BorderPane Initview = FXMLLoader.load(getClass().getResource("../interfaces/Init.fxml"));
        mainLayout.setCenter(Initview);
    }

    public void ShowMenu() throws IOException {
        BorderPane Menuview = FXMLLoader.load(getClass().getResource("../interfaces/Menu.fxml"));
        mainLayout.setCenter(Menuview);
    }

    public void ShowRegister() throws IOException {
        BorderPane Registerview = FXMLLoader.load(getClass().getResource("../interfaces/Register.fxml"));
        mainLayout.setCenter(Registerview);
    }

    public void ShowHistoria() throws IOException {
        BorderPane Historiaview = FXMLLoader.load(getClass().getResource("../interfaces/Historia.fxml"));
        mainLayout.setCenter(Historiaview);
    }

    public void ShowCita() throws IOException {
        BorderPane Citaview = FXMLLoader.load(getClass().getResource("../interfaces/Cita.fxml"));
        mainLayout.setCenter(Citaview);
    }

    public void ShowChequearHistoria() throws IOException {
        BorderPane ChequearHistoriaview = FXMLLoader.load(getClass().getResource("../interfaces/ChequearHistoria.fxml"));
        mainLayout.setCenter(ChequearHistoriaview);
    }

    public void ShowActHistoria() throws IOException {
        BorderPane ActHistoriaview = FXMLLoader.load(getClass().getResource("../interfaces/ActHistoria.fxml"));
        mainLayout.setCenter(ActHistoriaview);
    }

    public void ShowCreateHistoria() throws IOException {
        BorderPane CreateHistoriaview = FXMLLoader.load(getClass().getResource("../interfaces/CreateHistoria.fxml"));
        mainLayout.setCenter(CreateHistoriaview);
    }

    public void ShowAgenCita() throws IOException {
        BorderPane AgenCitaview = FXMLLoader.load(getClass().getResource("../interfaces/AgenCita.fxml"));
        mainLayout.setCenter(AgenCitaview);
    }

    public void ShowActCita() throws IOException {
        BorderPane ActCitaview = FXMLLoader.load(getClass().getResource("../interfaces/ActCita.fxml"));
        mainLayout.setCenter(ActCitaview);
    }

    public void ShowCheckCita() throws IOException {
        BorderPane CheckCitaview = FXMLLoader.load(getClass().getResource("../interfaces/CheckCita.fxml"));
        mainLayout.setCenter(CheckCitaview);
    }
}
