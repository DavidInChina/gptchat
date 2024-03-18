package Ve;

import af.C1988e;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18713Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18714Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ SessionDescription f18715h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(SessionDescription sessionDescription, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18715h0 = sessionDescription;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Y y10 = new Y(this.f18715h0, abstractC4825e);
        y10.f18714Z = obj;
        return y10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18713Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f18713Y = 1;
            C1988e c1988e = new C1988e();
            ((PeerConnection) this.f18714Z).setLocalDescription(c1988e, this.f18715h0);
            obj = c1988e.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
