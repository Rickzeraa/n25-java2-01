module javafx_wizard {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru to javafx.graphics, javafx.fxml;
}
