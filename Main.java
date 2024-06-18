package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

   public static void main(String[] args) {

      // 1) �ܺ� ���̺귯�� �����ϱ� - player.jar
      
      MP3Player mp3 = new MP3Player();
      Controller con = new Controller();
      //Controller�� ����� ���� ����� Main���� ������ ����Ϸ���
      //��ü������ �̷�������Ѵ�.
      
      
      // mp3.play("C:\\Users\\user\\Desktop\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");

      // ��� + ���ϸ� + Ȯ���� : path
      // mp3.stop();
      
      // �뷡 �Ѱ�
      // ����, �뷡����, �÷��̽ð�, ���
      // -> Music
      
      
      // Music Ŭ������ ����ؼ� 10���� ��ü������ �����غ���
      // music1 ~ music10
      
        String defaultPath = "C:\\Users\\user\\Desktop\\music\\";
        Music m1 = new Music(defaultPath + "Anne Marie - 2002.mp3", "2002", "Anne Marie", 257);
        Music m2 = new Music(defaultPath + "Billie Eilish - bad guy.mp3", "bad guy", "Billie Eilish", 277);
        Music m3 = new Music(defaultPath + "Carmen Twillie, Lebo M. - Circle of Life.mp3", "Circle of Life", "Carmen Twillie, Lebo M.", 257);
        Music m4 = new Music(defaultPath + "CHUNG HA - ���� 12��.mp3", "���� 12��", "CHUNG HA", 182);
        Music m5 = new Music(defaultPath + "Idina Menzel - Let It Go.mp3", "Let It Go", "Idina Menzel", 126);
        Music m6 = new Music(defaultPath + "Itzy - Dalla Dalla.mp3", "Dalla Dalla", "Itzy", 233);
        Music m7 = new Music(defaultPath + "JENNIE - SOLO.mp3", "SOLO", "JENNIE", 198);
        Music m8 = new Music(defaultPath + "Mena Massoud, Naomi Scott - A Whole New World.mp3", "Mena Massoud, Naomi Scott", "A Whole New World", 222);
        Music m9 = new Music(defaultPath + "Rain - ��.mp3", "��", "Rain", 237);
        Music m10 = new Music(defaultPath + "TWICE - FANCY.mp3", "FANCY", "TWICE", 114);

      
      // 1) Music �ڷ����� �����ϴ� ArrayList�� �ϳ� ������ּ���
      // musicList��� �̸����� ������ּ���
      
        ArrayList<Music> musicList = new ArrayList<>();
        
      // 2) music1 ~ music10 ArrayList�� ����ֱ�
      musicList.add(m1);
      musicList.add(m2);
      musicList.add(m3);
      musicList.add(m4);
      musicList.add(m5);
      musicList.add(m6);
      musicList.add(m7);
      musicList.add(m8);
      musicList.add(m9);
      musicList.add(m10);
      
      // System.out.println(musicList.get(0).getSinger());
      
      Scanner sc = new Scanner(System.in);
      
      // ���� ��뷡�� ������� ����Ǵ� ���� index
      int index = 0;
      
      while(true) {
         System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >> ");
         int select = sc.nextInt();
         if(select == 1) {
            // �뷡 ���
            // console
            // �뷡 ���� - ���� �̸�, 4�� 30��
            
            // ù��° �뷡�� ����� �� �ֵ��� ���������!
            mp3.play(musicList.get(index).getPath());
            
            // ��¹� ���� ������� �뷡�� ���� ������ ��������
//            System.out.print(musicList.get(index).getTitle()+"-");
//            System.out.print(musicList.get(index).getSinger()+",");
//            System.out.print(musicList.get(index).getPlayTime()/60+"��");
//            System.out.print(musicList.get(index).getPlayTime()%60+"��");
//            System.out.println();
            
            musicList.get(index).showMusic();
            
            
            
         }else if(select == 2) {
            // �뷡 ���� - stop
            
        	 //musicStop();
           con.musicStop();
            // NullPointerException
            
         }else if(select == 3) {
            // �뷡 ������
            
            // ���� ������� �뷡�� ������, ���߰�
            // isPlaying - �뷡�� ��� : true, ���� : false
            con.musicStop();
            index = con.preMusic(index,musicList);
            // ���� �ε����� �������� -1�� ��ġ�� �ִ� �뷡�� ��� �ǵ��� ������
            // ��, ù��° ��� (index�� 0�϶�) �������� ������
            // ������ ���� ����� �� �ֵ��� ������
            
            
            // ��¹� ���� ������� �뷡�� ���� ������ ��������
//            System.out.print(musicList.get(index).getTitle()+"-");
//            System.out.print(musicList.get(index).getSinger()+",");
//            System.out.print(musicList.get(index).getPlayTime()/60+"��");
//            System.out.print(musicList.get(index).getPlayTime()%60+"��");
//            System.out.println();
            musicList.get(index).showMusic();
            // ���������� ���� ����ɶ� �뷡�� ���� ������ ��µǵ��� ������
            // �뷡 ���� - ���� �̸�, 4�� 30��
            
         }else if(select == 4) {
            // ������ ���
            
            // ���� ������� �뷡�� ������, ���߰�
            con.musicStop();
           
            // 9 10
           index = con.nextMusic(index,musicList);
            
            // ��¹� ���� ������� �뷡�� ���� ������ ��������
//            System.out.print(musicList.get(index).getTitle()+"-");
//            System.out.print(musicList.get(index).getSinger()+",");
//            System.out.print(musicList.get(index).getPlayTime()/60+"��");
//            System.out.print(musicList.get(index).getPlayTime()%60+"��");
//            System.out.println();
            musicList.get(index).showMusic();
            
            // ���� �ε����� �������� +1�� ��ġ�� �ִ� �뷡�� ��� �ǵ��� ������
            // ��, ������ ��� (index�� 9�϶�) �������� ������
            // ù��° ���� ����� �� �ֵ��� ������
            
            // ���������� ���� ����ɶ� �뷡�� ���� ������ ��µǵ��� ������
            // �뷡 ���� - ���� �̸�, 4�� 30��
         }else {
            System.out.println("���α׷� ����");
            break;
         }
      }
      
      
      
   }

}
