module marsdevfx {
    requires javafx.graphics;
    requires javafx.controls;
    requires org.controlsfx.controls;

    opens com.marsdev.javafx.samples.controlsfx to javafx.graphics;
}