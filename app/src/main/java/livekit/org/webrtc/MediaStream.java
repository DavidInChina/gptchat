package livekit.org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaStream {
    private static final String TAG = "MediaStream";
    private long nativeStream;
    public final List<AudioTrack> audioTracks = new ArrayList();
    public final List<VideoTrack> videoTracks = new ArrayList();
    public final List<VideoTrack> preservedVideoTracks = new ArrayList();

    @CalledByNative
    public MediaStream(long j6) {
        this.nativeStream = j6;
    }

    private void checkMediaStreamExists() {
        if (this.nativeStream != 0) {
            return;
        }
        throw new IllegalStateException("MediaStream has been disposed.");
    }

    private static native boolean nativeAddAudioTrackToNativeStream(long j6, long j10);

    private static native boolean nativeAddVideoTrackToNativeStream(long j6, long j10);

    private static native String nativeGetId(long j6);

    private static native boolean nativeRemoveAudioTrack(long j6, long j10);

    private static native boolean nativeRemoveVideoTrack(long j6, long j10);

    private static void removeMediaStreamTrack(List<? extends MediaStreamTrack> list, long j6) {
        Iterator<? extends MediaStreamTrack> it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack next = it.next();
            if (next.getNativeMediaStreamTrack() == j6) {
                next.dispose();
                it.remove();
                return;
            }
        }
        Logging.e(TAG, "Couldn't not find track");
    }

    @CalledByNative
    public void addNativeAudioTrack(long j6) {
        this.audioTracks.add(new AudioTrack(j6));
    }

    @CalledByNative
    public void addNativeVideoTrack(long j6) {
        this.videoTracks.add(new VideoTrack(j6));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            this.preservedVideoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeAudioTrack())) {
            this.audioTracks.add(audioTrack);
            return true;
        }
        return false;
    }

    @CalledByNative
    public void dispose() {
        checkMediaStreamExists();
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack(this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0L;
    }

    public String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    @CalledByNative
    public void removeAudioTrack(long j6) {
        removeMediaStreamTrack(this.audioTracks, j6);
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeAudioTrack());
    }

    @CalledByNative
    public void removeVideoTrack(long j6) {
        removeMediaStreamTrack(this.videoTracks, j6);
    }

    public String toString() {
        String id2 = getId();
        int size = this.audioTracks.size();
        int size2 = this.videoTracks.size();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append(":A=");
        sb2.append(size);
        sb2.append(":V=");
        return android.gov.nist.core.a.l(sb2, size2, "]");
    }

    public boolean addTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            this.videoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeVideoTrack());
    }
}
