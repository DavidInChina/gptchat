package Ve;

import livekit.org.webrtc.MediaStreamTrack;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1495e0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18750Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18751Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ MediaStreamTrack f18752h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495e0(C1503i0 c1503i0, MediaStreamTrack mediaStreamTrack, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18751Z = c1503i0;
        this.f18752h0 = mediaStreamTrack;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1495e0(this.f18751Z, this.f18752h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1495e0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18750Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1519y c1519y = this.f18751Z.f18790p;
            if (c1519y == null) {
                return null;
            }
            C1493d0 c1493d0 = new C1493d0(this.f18752h0, null);
            this.f18750Y = 1;
            obj = c1519y.h(c1493d0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return (jf.y) obj;
    }
}
