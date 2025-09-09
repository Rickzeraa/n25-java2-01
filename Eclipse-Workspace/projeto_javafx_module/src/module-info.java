module projeto_javafx_module {
	requires javafx.graphics;
	requires javafx.media;
	requires javafx.controls;
	
	opens br.com.senaisp.bauru.classes to javafx.graphics,
	javafx.media, javafx.controls;
}