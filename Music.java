package MusicPlayer;

public class Music {

   // 필드
   // 가수 : singer
   // 제목 : title
   // 플레이 시간 : playTime
   // 경로 : path
   private String singer;
   private String title;
   private int playTime;// 초단위 초기화
   private String path;
   
   // 생성자 : 4개의 매개변수를 가지는 생성자
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
      System.out.println(title+":"+singer+","+playTime/60+"분"+playTime%60+"초");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   // 4개 필드에대한 getter....
   
   
}
