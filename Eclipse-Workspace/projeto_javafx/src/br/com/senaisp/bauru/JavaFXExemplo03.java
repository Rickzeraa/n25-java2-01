package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXExemplo03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		 LinearGradient lg = new LinearGradient(
				//StartX, StartY, EndX, EndY, Proporcional,
				//Forma Ciclos gradiente, Stops
				0, 1, 1, 0, true, CycleMethod.NO_CYCLE, 
				new Stop[] {
						new Stop(0,Color.BLACK),
						new Stop(0.5, Color.YELLOW),
						new Stop(1,Color.BLUE)
				});
		 RadialGradient rg = new RadialGradient(
				 //Startx, StartY, EndX, EndY, Raio, Proporcional
				 //Forma Ciclos gradiente, Stops
				 0, 0, 0.5, 1,
				 0, true, CycleMethod.NO_CYCLE,
				 new Stop[] {
					 new Stop(0,Color.YELLOW),
					 new Stop(0.25,Color.RED),
					 new Stop(0.5,Color.TRANSPARENT)
				 });
		//Criar o trinagulo
		Polygon triangulo = new Polygon(new double[] {
			210.0, 10.0,
			210.0, 210.0,
			10.0, 210.0
		});
		triangulo.setFill(lg);
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
