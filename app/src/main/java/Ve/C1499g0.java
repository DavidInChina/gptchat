package Ve;

import df.AbstractC2645j;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1499g0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18761Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ve.g0, pf.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f18761Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1499g0) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        SessionDescription localDescription = ((PeerConnection) this.f18761Y).getLocalDescription();
        if (localDescription != null) {
            return AbstractC2645j.a(localDescription);
        }
        return null;
    }
}
