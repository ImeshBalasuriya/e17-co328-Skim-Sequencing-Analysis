module com.skimsequence.skimsequence {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.skimsequence.skimsequence to javafx.fxml;
    exports com.skimsequence.skimsequence;
}