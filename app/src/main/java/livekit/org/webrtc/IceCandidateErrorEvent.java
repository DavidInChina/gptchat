package livekit.org.webrtc;

/* loaded from: classes2.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    @CalledByNative
    public IceCandidateErrorEvent(String str, int i10, String str2, int i11, String str3) {
        this.address = str;
        this.port = i10;
        this.url = str2;
        this.errorCode = i11;
        this.errorText = str3;
    }
}
