package Ve;

import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1518x extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f18913Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f18914Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18915h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518x(wf.n nVar, C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18914Z = nVar;
        this.f18915h0 = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1518x(this.f18914Z, this.f18915h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1518x) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18913Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            PeerConnection peerConnection = this.f18915h0.f18921c;
            this.f18913Y = 1;
            obj = this.f18914Z.invoke(peerConnection, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
