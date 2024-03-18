package Ve;

import af.C1988e;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18716Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18717Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ve.Z, pf.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f18717Z = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18716Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            MediaConstraints mediaConstraints = new MediaConstraints();
            this.f18716Y = 1;
            C1988e c1988e = new C1988e();
            ((PeerConnection) this.f18717Z).createAnswer(c1988e, mediaConstraints);
            obj = c1988e.a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
