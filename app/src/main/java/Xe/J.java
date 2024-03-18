package Xe;

import id.AbstractC3557B;
import java.util.ArrayList;
import livekit.org.webrtc.VideoTrack;

/* loaded from: classes.dex */
public abstract class J extends z {

    /* renamed from: h  reason: collision with root package name */
    public final VideoTrack f21881h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f21882i = new ArrayList();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String str, VideoTrack videoTrack) {
        super(str, 2, videoTrack);
        AbstractC3557B.c0("rtcTrack", videoTrack);
        this.f21881h = videoTrack;
    }

    @Override // Xe.z
    public void c() {
        ef.e.a(new zc.u(16, this));
        super.c();
    }

    /* renamed from: d */
    public VideoTrack b() {
        return this.f21881h;
    }
}
