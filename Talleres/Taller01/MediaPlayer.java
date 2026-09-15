public class MediaPlayer {
 
    public enum PlaybackState {
        PLAYING,
        STOPPED
    }
 
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;
    private static final int VOLUME_STEP = 5;
 
    private int volume;
    private PlaybackState playbackState;
 
    public MediaPlayer() {
        this.volume = 50;
        this.playbackState = PlaybackState.STOPPED;
    }
 
    public int getVolume() {
        return volume;
    }
 
    public PlaybackState getPlaybackState() {
        return playbackState;
    }
 
    public boolean increaseVolume() {
        if (volume + VOLUME_STEP <= MAX_VOLUME) {
            volume += VOLUME_STEP;
            return true;
        }
        return false;
    }
 
    public boolean decreaseVolume() {
        if (volume - VOLUME_STEP >= MIN_VOLUME) {
            volume -= VOLUME_STEP;
            return true;
        }
        return false;
    }
 
    public void play() {
        this.playbackState = PlaybackState.PLAYING;
    }
 
    public void stop() {
        this.playbackState = PlaybackState.STOPPED;
    }
}