package df;

import livekit.org.webrtc.PeerConnection;

/* renamed from: df.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2639d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f28264a;

    static {
        int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
        try {
            iArr[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f28264a = iArr;
    }
}
