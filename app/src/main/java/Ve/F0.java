package Ve;

import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class F0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f18653a;

    static {
        int[] iArr = new int[MediaStreamTrack.MediaType.values().length];
        try {
            iArr[MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18653a = iArr;
    }
}
