package Ve;

import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class H extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1503i0 f18657Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f18658Z;

    /* renamed from: h0  reason: collision with root package name */
    public PeerConnection.RTCConfiguration f18659h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f18660i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18661j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f18662k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18661j0 = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18660i0 = obj;
        this.f18662k0 |= Integer.MIN_VALUE;
        return this.f18661j0.c(null, null, this);
    }
}
