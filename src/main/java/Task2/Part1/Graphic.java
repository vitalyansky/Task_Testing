package Task2.Part1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

public class Graphic extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("График");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Количество чисел в файле");
        yAxis.setLabel("Время выполнения");

        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Точки");
        Speed.main(new String[] {});
        series.getData().add(new XYChart.Data<>(Speed.num[0], Speed.time[0]));
        series.getData().add(new XYChart.Data<>(Speed.num[1], Speed.time[1]));
        series.getData().add(new XYChart.Data<>(Speed.num[2], Speed.time[2]));
        series.getData().add(new XYChart.Data<>(Speed.num[3], Speed.time[3]));
        series.getData().add(new XYChart.Data<>(Speed.num[4], Speed.time[4]));
        series.getData().add(new XYChart.Data<>(Speed.num[5], Speed.time[5]));
        series.getData().add(new XYChart.Data<>(Speed.num[6], Speed.time[6]));
        lineChart.getData().add(series);

        Scene scene = new Scene(lineChart, 600, 600);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}