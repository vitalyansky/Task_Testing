module HSETests {
    requires javafx.controls;
    requires javafx.fxml;

    opens Task2.Part1 to javafx.fxml;
    exports Task2.Part1;
}
