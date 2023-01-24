package jp.ac.uryukyu.ie.e225720;

public class Qsolve {
    QList qList = new QList();
    QComparison qComparison = new QComparison();

    void solve(int i) {
        qComparison.input();
        if (qList.Select_Array.indexOf(qList.answer[qList.Q_ArrayIndex.indexOf(qList.Q_ArrayShuffle.get(i))])
                + 1 == qComparison.Select_Answer) {
            System.out.println("正解！！");
        } else {
            System.out.println("残念！！不正解");
            System.out
                    .println("正解は"
                            + (qList.Select_Array
                                    .indexOf(qList.answer[qList.Q_ArrayIndex.indexOf(qList.Q_ArrayShuffle.get(i))]) + 1)
                            + "の"
                            + qList.answer[qList.Q_ArrayIndex.indexOf(qList.Q_ArrayShuffle.get(i))]);
        }

    }
}
