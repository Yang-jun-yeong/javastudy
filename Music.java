package MusicPlayer;

public class Music {

   // �ʵ�
   // ���� : singer
   // ���� : title
   // �÷��� �ð� : playTime
   // ��� : path
   private String singer;
   private String title;
   private int playTime;// �ʴ��� �ʱ�ȭ
   private String path;
   
   // ������ : 4���� �Ű������� ������ ������
   public Music(String path, String title, String singer, int playTime) {
      this.path = path;
      this.title = title;
      this.singer = singer;
      this.playTime = playTime;
   }

   public String getSinger() {
      return singer;
   }

   public String getTitle() {
      return title;
   }

   public int getPlayTime() {
      return playTime;
   }

   public String getPath() {
      return path;
   }
   
   public void showMusic() {
      System.out.println(title+":"+singer+","+playTime/60+"��"+playTime%60+"��");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   // 4�� �ʵ忡���� getter....
   
   
}
