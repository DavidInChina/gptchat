package W;

import h.C3277c;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5653l;
import t0.C5654m;

/* renamed from: W.h2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559h2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20115Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f20116Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20117h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1559h2(Object obj, int i10, Object obj2) {
        super(1);
        this.f20115Y = i10;
        this.f20116Z = obj;
        this.f20117h0 = obj2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f20115Y;
        Object obj2 = this.f20117h0;
        Object obj3 = this.f20116Z;
        switch (i10) {
            case 0:
                Z.N n10 = (Z.N) obj;
                R1 r12 = (R1) obj3;
                r12.f19599t0.addView(r12, r12.f19600u0);
                r12.h((Z0.l) obj2);
                return new C3277c(6, r12);
            case 1:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                float R10 = abstractC5650i.R(K2.f19295c);
                Z.l1 l1Var = (Z.l1) obj3;
                float f6 = 2;
                float f10 = R10 / f6;
                AbstractC5648g.c(abstractC5650i, ((r0.r) l1Var.getValue()).f44265a, abstractC5650i.R(X.y.f21713a / f6) - f10, 0L, new C5654m(R10, 0.0f, 0, 0, 30), 108);
                Z.l1 l1Var2 = (Z.l1) obj2;
                if (Float.compare(((Z0.e) l1Var2.getValue()).f22788Y, 0) > 0) {
                    AbstractC5648g.c(abstractC5650i, ((r0.r) l1Var.getValue()).f44265a, abstractC5650i.R(((Z0.e) l1Var2.getValue()).f22788Y) - f10, 0L, C5653l.f45622a, 108);
                }
                return yVar;
            default:
                ((C1594o2) obj3).f20258a.setValue(new E.F((E.A0) obj2, (E.A0) obj));
                return yVar;
        }
    }
}
