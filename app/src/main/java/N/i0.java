package N;

import A.A0;
import A.N0;
import A.P0;
import A.R0;
import Z.AbstractC1710f0;
import android.os.Build;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12353Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z0.b f12354Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f12355h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Z0.b bVar, AbstractC1710f0 abstractC1710f0, int i10) {
        super(1);
        this.f12353Y = i10;
        this.f12354Z = bVar;
        this.f12355h0 = abstractC1710f0;
    }

    public final AbstractC4326r a(AbstractC6216a abstractC6216a) {
        N0 n02 = R0.f106a;
        N0 n03 = P0.f102a;
        int i10 = this.f12353Y;
        Z0.b bVar = this.f12354Z;
        AbstractC1710f0 abstractC1710f0 = this.f12355h0;
        switch (i10) {
            case 1:
                G.X x10 = new G.X(abstractC6216a, 2);
                i0 i0Var = new i0(bVar, abstractC1710f0, 0);
                if (A0.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        n02 = n03;
                    }
                    return A0.b(x10, i0Var, n02);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                G.X x11 = new G.X(abstractC6216a, 3);
                i0 i0Var2 = new i0(bVar, abstractC1710f0, 2);
                if (A0.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        n02 = n03;
                    }
                    return A0.b(x11, i0Var2, n02);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    public final void c(long j6) {
        int i10 = this.f12353Y;
        AbstractC1710f0 abstractC1710f0 = this.f12355h0;
        Z0.b bVar = this.f12354Z;
        switch (i10) {
            case 0:
                abstractC1710f0.setValue(new Z0.k(Ng.H.c(bVar.a0(Z0.g.b(j6)), bVar.a0(Z0.g.a(j6)))));
                return;
            default:
                abstractC1710f0.setValue(new Z0.k(Ng.H.c(bVar.a0(Z0.g.b(j6)), bVar.a0(Z0.g.a(j6)))));
                return;
        }
    }

    @Override // wf.k
    public final /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12353Y) {
            case 0:
                c(((Z0.g) obj).f22795a);
                return yVar;
            case 1:
                return a((AbstractC6216a) obj);
            case 2:
                c(((Z0.g) obj).f22795a);
                return yVar;
            default:
                return a((AbstractC6216a) obj);
        }
    }
}
