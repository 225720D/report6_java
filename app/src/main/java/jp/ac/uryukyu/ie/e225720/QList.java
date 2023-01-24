package jp.ac.uryukyu.ie.e225720;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QList {
    QComparison qComparison = new QComparison();
    /**
     * 問題集,答えのリスト
     * ＋シャッフルに使うリスト
     */
    public String[] questions = { "cat", "dog", "bat", "eagle", "lion", "tiger", "bird", "rabbit" };
    public ArrayList<String> Q_ArrayShuffle = new ArrayList(Arrays.asList(questions));
    public ArrayList<String> Q_ArrayIndex = new ArrayList(Arrays.asList(questions));
    public String[] answer = { "ねこ", "イッヌ", "コウモリ", "鷹", "シーサー", "虎", "鳥", "うさぎ" };
    public ArrayList<String> A_Array = new ArrayList(Arrays.asList(answer));
    public ArrayList<String> Select_Array = new ArrayList();

    void shuffleQ_Array() {
        Collections.shuffle(Q_ArrayShuffle);
    }

    void shuffleA_Array() {
        Collections.shuffle(A_Array);
    }

    void shuffle_Select_Array() {
        Collections.shuffle(Select_Array);
    }

    /**
     * @param i 選択肢
     */
    public void select(int i) {
        Select_Array.add(answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))]);
        shuffleA_Array();
        for (int p = 0; p < 3; p++) {
            Select_Array.add(A_Array.get(p));
        }
        shuffle_Select_Array();
    }

    /**
     * @param i 重複をなくす
     */
    void remove(int i) {
        String remove_answer;
        remove_answer = answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))];
        A_Array.remove(remove_answer);
    }

    void move(int i) {
        String remove_answer;
        remove_answer = answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))];
        A_Array.add(remove_answer);
    }

    void solve(int i) {
        qComparison.input();
        if (Select_Array.indexOf(answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))])
                + 1 == qComparison.Select_Answer) {
            System.out.println("正解！！");
        } else {
            System.out.println("残念！！不正解");
            System.out
                    .println("正解は" + (Select_Array.indexOf(answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))]) + 1)
                            + "の"
                            + answer[Q_ArrayIndex.indexOf(Q_ArrayShuffle.get(i))]);
        }

    }

}
