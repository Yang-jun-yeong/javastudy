package MusicPlayer;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {

	MP3Player mp3 = new MP3Player();
	//�뷡�� ��������� �ƴ��� Ȯ�� �� �뷡�� ���ߴ� ���
	//-musicStop() : void(�����ü��)
	
	public void musicStop() {
		if(mp3.isPlaying()) {
			
		}
	}



	//�������� �����Ű�� ���
	public int preMusic(int index,ArrayList<Music> musicList) {
		
		index--;
        
        if(index == -1) {
           index = musicList.size()-1;
        }
        
        mp3.play(musicList.get(index).getPath());
        
        return index;
		
	}

	//������
	public int nextMusic(int index, ArrayList<Music>musicList) {
		 index++;
		if(index == musicList.size()) {
            index = 0;
         }
         
         mp3.play(musicList.get(index).getPath());
         
         return index;
	}
}