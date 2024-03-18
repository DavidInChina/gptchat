package Pf;

import Bg.o0;
import Mf.AbstractC1000i;
import id.AbstractC3557B;
import kg.C4291c;

/* renamed from: Pf.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1147e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14088Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1158p f14089Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1147e(AbstractC1158p abstractC1158p, int i10) {
        super(1);
        this.f14088Y = i10;
        this.f14089Z = abstractC1158p;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f14088Y;
        AbstractC1158p abstractC1158p = this.f14089Z;
        switch (i10) {
            case 0:
                ((Cg.h) ((Cg.i) obj)).getClass();
                AbstractC3557B.c0("descriptor", (AbstractC1149g) abstractC1158p);
                return null;
            case 1:
                o0 o0Var = (o0) obj;
                AbstractC3557B.Z(o0Var);
                if (!Bi.c.g1(o0Var)) {
                    AbstractC1149g abstractC1149g = (AbstractC1149g) abstractC1158p;
                    AbstractC1000i k10 = o0Var.y0().k();
                    if ((k10 instanceof Mf.b0) && !AbstractC3557B.K(((Mf.b0) k10).mo20k(), abstractC1149g)) {
                        z10 = true;
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            default:
                C4291c c4291c = (C4291c) obj;
                AbstractC3557B.c0("fqName", c4291c);
                G g10 = (G) abstractC1158p;
                ((K) g10.f13996k0).getClass();
                Ag.u uVar = g10.f13993h0;
                AbstractC3557B.c0("storageManager", uVar);
                return new A(g10, c4291c, uVar);
        }
    }
}
