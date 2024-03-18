package Ve;

import livekit.org.webrtc.MediaConstraints;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1510o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18832Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18833Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18834h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510o(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18834h0 = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1510o c1510o = new C1510o(this.f18834h0, abstractC4825e);
        c1510o.f18833Z = obj;
        return c1510o;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1510o) create((MediaConstraints) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18832Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            MediaConstraints mediaConstraints = (MediaConstraints) this.f18833Z;
            C1519y c1519y = this.f18834h0;
            if (mediaConstraints != null) {
                this.f18832Y = 1;
                if (c1519y.b(mediaConstraints, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                this.f18832Y = 2;
                if (c1519y.b(new MediaConstraints(), this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
