package Xe;

import Sg.C1394f;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.VideoTrack;

/* loaded from: classes.dex */
public final class s extends J {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f21926j;

    /* renamed from: k  reason: collision with root package name */
    public final C1394f f21927k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f21928l;

    /* renamed from: m  reason: collision with root package name */
    public final u f21929m = new u(0, 0);

    /* renamed from: n  reason: collision with root package name */
    public final RtpReceiver f21930n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(VideoTrack videoTrack, boolean z10, Ng.B b10, RtpReceiver rtpReceiver) {
        super("", videoTrack);
        AbstractC3557B.c0("rtcTrack", videoTrack);
        AbstractC3557B.c0("dispatcher", b10);
        AbstractC3557B.c0("receiver", rtpReceiver);
        this.f21926j = z10;
        this.f21927k = Ad.l.g(b10.plus(Bi.c.z()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f21928l = linkedHashMap;
        linkedHashMap.values();
        this.f21930n = rtpReceiver;
    }

    @Override // Xe.z
    public final void a() {
        super.a();
        Ad.l.P(this.f21927k, null);
    }

    @Override // Xe.J, Xe.z
    public final void c() {
        super.c();
        LinkedHashMap linkedHashMap = this.f21928l;
        Iterator it = linkedHashMap.values().iterator();
        if (!it.hasNext()) {
            linkedHashMap.clear();
        } else {
            AbstractC2469q0.p(it.next());
            throw null;
        }
    }
}
