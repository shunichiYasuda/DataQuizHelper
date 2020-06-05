module com.genSci.tools.DataQuizHelper {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.genSci.tools.DataQuizHelper to javafx.fxml;
    exports com.genSci.tools.DataQuizHelper;
}