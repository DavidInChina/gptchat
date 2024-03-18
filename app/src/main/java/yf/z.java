package Yf;

import Mf.P;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22403Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f22404Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Sf.w f22405h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f22406i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(B b10, Sf.w wVar, kotlin.jvm.internal.B b11, int i10) {
        super(0);
        this.f22403Y = i10;
        this.f22404Z = b10;
        this.f22405h0 = wVar;
        this.f22406i0 = b11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f22403Y;
        kotlin.jvm.internal.B b10 = this.f22406i0;
        Sf.w wVar = this.f22405h0;
        B b11 = this.f22404Z;
        switch (i10) {
            case 0:
                ((Vf.h) ((Xf.a) b11.f22292b.f45394a).f21959h).getClass();
                AbstractC3557B.c0("field", wVar);
                AbstractC3557B.c0("descriptor", (P) b10.f37622Y);
                return null;
            default:
                Ag.u e10 = b11.f22292b.e();
                z zVar = new z(b11, wVar, b10, 0);
                Ag.q qVar = (Ag.q) e10;
                qVar.getClass();
                return new Ag.j(qVar, zVar);
        }
    }
}
