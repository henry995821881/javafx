package cn.tzy.fx.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	
	
	/**
	 * 添加css
	 * 
	 * 
	 * 如何将我们的CSS样式文件添加上去呢？
1. 在主程序的start()方法中添加一句代码：scene.getStylesheets().add(
getClass().getResource("MainStyle.css")
.toExternalForm());
2. 在我们的FXML文件中给根布局控件GridPane添加属性stylesheets="@MainStyle.css"即可，注意是@后面跟我们的CSS文件路径全名称。
	 * 
	 */
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
            Scene scene = new Scene(root, 400, 320);
            
            
            scene.getStylesheets().add(
            		getClass().getResource("MainStyle.css")
            		.toExternalForm());
            
            primaryStage.setScene(scene);
            primaryStage.setTitle("Hello World");
            primaryStage.setResizable(false);
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images/earth.png")));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }


}