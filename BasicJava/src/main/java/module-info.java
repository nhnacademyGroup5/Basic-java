module com.nhnacademy.groupstudy{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    // javafx를 실행시키기 위한 작업
    opens com.nhnacademy.groupstudy.basicjava to javafx.fxml;
    exports com.nhnacademy.groupstudy.basicjava;
    exports com.nhnacademy.groupstudy.chapter4.jinwoo.mosaic;

    // example
//    opens com.nhnacademy.groupstudy.chapter1 to javafx.fxml;
//    exports com.nhnacademy.groupstudy.chapter1;
}