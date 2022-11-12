public class Rect {
    double width;
    double heght;
    String nameOfRect;

    double getArion(){
        return width*heght;
    }
    void magnify(double koeff){
        width *= koeff;
        heght *= koeff;
    }

}
