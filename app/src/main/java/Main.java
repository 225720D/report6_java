import jp.ac.uryukyu.ie.e225720.*;

public class Main {
    public static void main(String[] args) throws Exception {
        QMaker qMaker = new QMaker();
        Qstart qstart = new Qstart();
        qstart.start();
        qMaker.quizList();

    }
}
