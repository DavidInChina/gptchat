package g2;

import Z8.AbstractC1809m0;
import Z8.L0;
import na.C4760i0;
import wf.AbstractC6216a;

/* renamed from: g2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3148f extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31084Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ng.F f31085Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31086h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3148f(Ng.F f6, wf.k kVar, int i10) {
        super(0);
        this.f31084Y = i10;
        this.f31085Z = f6;
        this.f31086h0 = kVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Ng.F f6 = this.f31085Z;
        int i10 = this.f31084Y;
        wf.k kVar = this.f31086h0;
        switch (i10) {
            case 0:
                Ad.l.O0(f6, null, null, new C3147e(kVar, null), 3);
                return;
            default:
                AbstractC1809m0.a().b(L0.f23259c, kf.w.f37484Y);
                Ad.l.O0(f6, null, null, new C4760i0(kVar, null), 3);
                return;
        }
    }
}
