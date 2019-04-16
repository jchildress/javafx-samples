module marsdevfx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.web;
    requires transitive javafx.swing;
    requires org.scenicview.scenicview;
    requires org.controlsfx.controls;

    opens com.marsdev.javafx.samples.controlsfx to javafx.graphics;
}