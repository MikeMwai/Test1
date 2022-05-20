package com.example.calculator;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AreaCalc extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        //Node
        Text operations_label=new Text("Operations");   //Operations label

        Button rectangle_button=new Button("Rectangle"); //Sum Button
        Button triangle_button=new Button("Triangle"); //Difference Button
        Button circle_button=new Button("Circle"); //Average Button

        GridPane gridpane=new GridPane();   //Container
        gridpane.setMinSize(800,400);
        gridpane.setVgap(20);
        gridpane.setHgap(40);
        gridpane.setAlignment(Pos.CENTER);

        gridpane.add(operations_label,1,5);

        HBox vbButtons=new HBox();
        vbButtons.setSpacing(10);
        vbButtons.setPadding(new Insets(0,0,0,0));
        vbButtons.getChildren().addAll(rectangle_button,triangle_button,circle_button);
        gridpane.add(vbButtons,2,5,2,1);

        //Event handling for buttons
        rectangle_button.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                Stage stage1=new Stage();
                try {
                    new Rectangle().start(stage1);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        triangle_button.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                Triangle triangle=new Triangle();
            }
        });

        circle_button.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {

            }
        });

        //Scene
        Scene scene=new Scene(gridpane);  //This is the scene

        //Stage
        stage.setScene(scene);
        stage.show();
        stage.setTitle("AREA CALCULATOR");

    }

    public class Rectangle extends Application
{

    @Override
    public void start(Stage stage1) throws Exception
    {
        //Node
        Text Length_label=new Text("Length:");  //Length label
        Text Width_label=new Text("Width: ");   //Width label
        Text answer_label=new Text("Area: ");   //area label
        Text results_label=new Text("*****"); //Asterisks label

        TextField length=new TextField();  //Length textfield
        TextField width=new TextField();  //Width textfield

        GridPane gridpane=new GridPane();   //Container
        gridpane.setMinSize(800,400);
        gridpane.setVgap(20);
        gridpane.setHgap(40);
        gridpane.setAlignment(Pos.CENTER);

        gridpane.add(Length_label, 1,1);
        gridpane.add(Width_label,3,1);
        gridpane.add(answer_label,1,4);
        gridpane.add(results_label,2,4);

        gridpane.add(length,2,1);
        gridpane.add(width,4,1);

        String lnum=length.getText();
        String wnum=width.getText();


        Double lnumber=Double.parseDouble(lnum);
        Double wnumber=Double.parseDouble(wnum);
        Double area=lnumber*wnumber;
        String result=Double.toString(area);

        results_label.setText(result);

        length.setOnKeyReleased((new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent keyEvent)
            {
                String input=length.getText();
                //regex string
                if(! input.matches("\\d{0,7}([\\.]\\d{0,4})?"))
                {
                    length.setText("");
                }
            }
        }));

        width.setOnKeyReleased((new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent keyEvent)
            {
                String input=width.getText();
                //regex string
                if(! input.matches("\\d{0,7}([\\.]\\d{0,4})?"))
                {
                    width.setText("");
                }
            }
        }));

        //Scene
        Scene scene1=new Scene(gridpane);  //This is the scene

        //Stage
        stage1.setScene(scene1);
        stage1.show();
        stage1.setTitle("Rectangle");

    }
}

    public class Triangle extends Application
    {

        @Override
        public void start(Stage stage2) throws Exception
        {
            //Node
            Text Base_label=new Text("Base: "); //Base label
            Text Height_label=new Text("Height: "); //Height label
            Text answer_label=new Text("Area: ");   //area label
            Text results_label=new Text("*****"); //Asterisks label

            TextField base=new TextField();  //Base textfield
            TextField height=new TextField();  //Height textfield

            GridPane gridpane=new GridPane();   //Container
            gridpane.setMinSize(800,400);
            gridpane.setVgap(20);
            gridpane.setHgap(40);
            gridpane.setAlignment(Pos.CENTER);

            gridpane.add(Base_label,1,2);
            gridpane.add(Height_label,3,2);
            gridpane.add(answer_label,1,4);
            gridpane.add(results_label,2,4);

            gridpane.add(base,2,2);
            gridpane.add(height,4,2);

            String bnum = base.getText();
            String hnum = height.getText();


            Double bnumber = Double.parseDouble(bnum);
            Double hnumber = Double.parseDouble(hnum);
            Double area =0.5*bnumber*hnumber;
            String result = Double.toString(area);

            results_label.setText(result);

            base.setOnKeyReleased((new EventHandler<KeyEvent>()
            {
                @Override
                public void handle(KeyEvent keyEvent)
                {
                    String input=base.getText();
                    //regex string
                    if(! input.matches("\\d{0,7}([\\.]\\d{0,4})?"))
                    {
                        base.setText("");
                    }
                }
            }));

            height.setOnKeyReleased((new EventHandler<KeyEvent>()
            {
                @Override
                public void handle(KeyEvent keyEvent)
                {
                    String input=height.getText();
                    //regex string
                    if(! input.matches("\\d{0,7}([\\.]\\d{0,4})?"))
                    {
                        height.setText("");
                    }
                }
            }));

            //Scene
            Scene scene2=new Scene(gridpane);  //This is the scene

            //Stage
            stage2.setScene(scene2);
            stage2.show();
            stage2.setTitle("Triangle");
        }
    }

    public class Circle extends Application
    {

        @Override
        public void start(Stage stage3) throws Exception
        {
            //Node
            Text Radius_label=new Text("Radius: "); //Radius label
            Text answer_label=new Text("Area: ");   //area label
            Text results_label=new Text("*****"); //Asterisks label

            TextField radius=new TextField();  //Radius textfield


            GridPane gridpane=new GridPane();   //Container
            gridpane.setMinSize(800,400);
            gridpane.setVgap(20);
            gridpane.setHgap(40);
            gridpane.setAlignment(Pos.CENTER);

            gridpane.add(Radius_label,1,3);
            gridpane.add(answer_label,1,4);

            gridpane.add(radius,2,3);

            Double rnumber=Double.parseDouble(radius.getText());
            String result=Double.toString(0.5*3.14*(rnumber*rnumber));
            results_label.setText(result);

            radius.setOnKeyReleased((new EventHandler<KeyEvent>()
            {
                @Override
                public void handle(KeyEvent keyEvent)
                {
                    String input=radius.getText();
                    //regex string
                    if(! input.matches("\\d{0,7}([\\.]\\d{0,4})?"))
                    {
                        radius.setText("");
                    }
                }
            }));

            //Scene
            Scene scene3=new Scene(gridpane);  //This is the scene

            //Stage
            stage3.setScene(scene3);
            stage3.show();
            stage3.setTitle("Circle");
        }
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
