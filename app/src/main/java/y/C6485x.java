package y;

import Z.l1;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.AbstractC6717p0;

/* renamed from: y.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6485x extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50310Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f50311Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50312h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6485x(Object obj, int i10, Object obj2) {
        super(1);
        this.f50310Y = i10;
        this.f50311Z = obj;
        this.f50312h0 = obj2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        int i10 = this.f50310Y;
        Object obj2 = this.f50312h0;
        Object obj3 = this.f50311Z;
        switch (i10) {
            case 0:
                AbstractC6717p0 abstractC6717p0 = (AbstractC6717p0) obj;
                C6460A c6460a = (C6460A) obj3;
                l1 l1Var = (l1) c6460a.f50082e.get(abstractC6717p0.a());
                long j10 = 0;
                if (l1Var != null) {
                    j6 = ((Z0.k) l1Var.getValue()).f22804a;
                } else {
                    j6 = 0;
                }
                l1 l1Var2 = (l1) c6460a.f50082e.get(abstractC6717p0.c());
                if (l1Var2 != null) {
                    j10 = ((Z0.k) l1Var2.getValue()).f22804a;
                }
                p0 p0Var = (p0) ((C6486y) obj2).f50314c.getValue();
                if (p0Var != null) {
                    AbstractC6659E abstractC6659E = (AbstractC6659E) p0Var.f50272b.invoke(new Z0.k(j6), new Z0.k(j10));
                    if (abstractC6659E != null) {
                        return abstractC6659E;
                    }
                }
                return AbstractC6696f.u(0.0f, 0.0f, null, 7);
            default:
                float h10 = ((O) obj2).f50136c.h();
                ((E0.c0) obj).getClass();
                E0.c0.c((E0.d0) obj3, 0, 0, h10);
                return jf.y.f36177a;
        }
    }
}
