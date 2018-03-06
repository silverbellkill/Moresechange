import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] morese = {"・－", "－・・・", "－・－・", "－・・", "・", "・・－・", "－－・", "・・・・", "・・", "・－－－",
                "－・－", "・－・・", "－－", "－・", "－－－", "・－－・", "－－・－", "・－・", "・・・", "－", "・・－",
                "・・・－", "・－－", "－・・－", "－・－－", "－－・・"};
        String moresechange="";

        String input = JOptionPane.showInputDialog(""); //다이얼로그 창으로 입력 받음

        for (int i = 0; i < input.length(); i++) {  //input 글자수 만큼 반복
            char ch = input.charAt(i);             //charAt(i)를 통해서 한글자씩 가지고 옴

            if ('a'<=ch || ch>='z'){               //a에서 z까지 확인
                moresechange +=morese[ch-'a'];      //morese배열 ch-a를 한다 a가입력이 되면 a-a =0 0번째배열 이 들어간다
            }

        }
        System.out.println("입력한 값은 = "+input);
        System.out.println("모스부호 변환값 = "+moresechange);

    }
}
