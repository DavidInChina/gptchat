package Ve;

import livekit.LivekitRtc$SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1501h0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18767Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18768Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501h0(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18768Z = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1501h0(this.f18768Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1501h0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18767Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1519y c1519y = this.f18768Z.f18791q;
            if (c1519y == 0) {
                return null;
            }
            ?? abstractC5163j = new AbstractC5163j(2, null);
            this.f18767Y = 1;
            obj = c1519y.h(abstractC5163j, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return (LivekitRtc$SessionDescription) obj;
    }
}
