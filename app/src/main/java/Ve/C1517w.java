package Ve;

import livekit.org.webrtc.PeerConnection;
import wf.AbstractC6216a;

/* renamed from: Ve.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1517w extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1519y f18910Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ PeerConnection.RTCConfiguration f18911Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1517w(C1519y c1519y, PeerConnection.RTCConfiguration rTCConfiguration) {
        super(0);
        this.f18910Y = c1519y;
        this.f18911Z = rTCConfiguration;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return Boolean.valueOf(this.f18910Y.f18921c.setConfiguration(this.f18911Z));
    }
}
