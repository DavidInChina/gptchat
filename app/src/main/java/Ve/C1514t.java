package Ve;

import af.C1988e;
import cf.AbstractC2406e;
import cf.C2404c;
import java.util.Iterator;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1514t extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f18902Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1519y f18903Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ SessionDescription f18904h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514t(C1519y c1519y, SessionDescription sessionDescription, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18903Z = c1519y;
        this.f18904h0 = sessionDescription;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1514t(this.f18903Z, this.f18904h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1514t) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18902Y;
        C1519y c1519y = this.f18903Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            PeerConnection peerConnection = c1519y.f18921c;
            this.f18902Y = 1;
            C1988e c1988e = new C1988e();
            peerConnection.setRemoteDescription(c1988e, this.f18904h0);
            obj = c1988e.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        AbstractC2406e abstractC2406e = (AbstractC2406e) obj;
        if (abstractC2406e instanceof C2404c) {
            Iterator it = c1519y.f18922d.iterator();
            while (it.hasNext()) {
                c1519y.f18921c.addIceCandidate((IceCandidate) it.next());
            }
            c1519y.f18922d.clear();
            c1519y.f18923e = false;
        }
        return abstractC2406e;
    }
}
