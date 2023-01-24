package jp.ac.uryukyu.ie.e225720;

public class QMaker {
    QList qList = new QList();
    QComparison qComparison = new QComparison();
    Qstart qstart = new Qstart();
    Qsolve qsolve = new Qsolve();

    public void quizList() {
        qList.shuffleQ_Array();

        qstart.start();

        for (int i = 0; i < qList.questions.length; i++) {
            qList.remove(i);
            qList.select(i);
            qList.move(i);
            System.out.println("");
            System.out.println(i + 1 + "問目");
            System.out.println(qList.Q_ArrayShuffle.get(i));
            for (int j = 0; j < 4; j++) {
                System.out.println(j + 1 + "," + qList.Select_Array.get(j));
            }
            qsolve.solve(i);
            qList.Select_Array.clear();
        }
    }
}
