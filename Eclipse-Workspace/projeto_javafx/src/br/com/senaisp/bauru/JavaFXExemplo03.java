package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXExemplo03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		//Criar o trinagulo
		Polygon triangulo = new Polygon(new double[] {
			210.0, 10.0,
			210.0, 210.0,
			10.0, 210.0
		});
		triangulo.setFill(Color.rgb(0,0,255,0.5));
		triangulo.setLayoutX(50);
		triangulo.setLayoutY(50);
		//Adicionando o triangulo ao group
		noRoot.getChildren().addAll(triangulo);
		//Criando a cena
		Scene cena = new Scene(noRoot,400,400,Color.BLACK);
		primaryStage.setTitle("Formas em JavaFX");
		primaryStage.setScene(cena);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
