package Dh;

import Bh.AbstractC0263p;
import Bh.W;
import Bh.Z;
import Eh.g0;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import Qh.C1226d;
import Qh.C1242u;
import Qh.C1246y;
import Qh.F;
import Qh.H;
import Qh.b0;
import java.util.Collections;
import java.util.List;
import wh.AbstractC6256u;
import wh.C6247l;
import yh.C6633q0;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class f extends Enum implements g {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f3715Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final e f3716Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ f[] f3717h0;

    static {
        a aVar = new a();
        f3715Y = aVar;
        f fVar = new f() { // from class: Dh.b
            @Override // Dh.f
            public final List a(AbstractC0263p abstractC0263p) {
                List list;
                l1.a L10 = abstractC0263p.L();
                if (L10 == null) {
                    list = new AbstractC1239q(1);
                } else {
                    list = (AbstractC6256u) ((AbstractC1239q) L10.i()).f(F.CONSTRUCTOR.f14964Z.b(new C1246y(new C1226d())).b(new b0(abstractC0263p)));
                }
                if (list.size() == 1) {
                    return Collections.singletonList(new C6247l("<init>", 1, C6633q0.i1(Void.TYPE)));
                }
                throw new IllegalArgumentException(abstractC0263p.L() + " declares no constructor that is visible to " + abstractC0263p);
            }

            @Override // Dh.f
            public final W b(W w10) {
                return w10.a(new C1242u(F.CONSTRUCTOR.f14964Z), new Z(g0.f4785Y));
            }
        };
        f fVar2 = new f() { // from class: Dh.c
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [Qh.q] */
            @Override // Dh.f
            public final List a(AbstractC0263p abstractC0263p) {
                AbstractC6256u abstractC6256u;
                l1.a L10 = abstractC0263p.L();
                if (L10 == null) {
                    abstractC6256u = new AbstractC1239q(1);
                } else {
                    abstractC6256u = (AbstractC6256u) ((AbstractC1239q) L10.i()).f(F.CONSTRUCTOR.f14964Z.b(new b0(abstractC0263p)));
                }
                return abstractC6256u.b(AbstractC1235m.a(abstractC0263p));
            }

            @Override // Dh.f
            public final W b(W w10) {
                return w10.a(new C1242u(F.CONSTRUCTOR.f14964Z), new Z(g0.f4785Y));
            }
        };
        f fVar3 = new f() { // from class: Dh.d
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [Qh.q] */
            @Override // Dh.f
            public final List a(AbstractC0263p abstractC0263p) {
                AbstractC6256u abstractC6256u;
                l1.a L10 = abstractC0263p.L();
                if (L10 == null) {
                    abstractC6256u = new AbstractC1239q(1);
                } else {
                    abstractC6256u = (AbstractC6256u) ((AbstractC1239q) L10.i()).f(H.PUBLIC.f14972h0.b(F.CONSTRUCTOR.f14964Z));
                }
                return abstractC6256u.b(AbstractC1235m.a(abstractC0263p));
            }

            @Override // Dh.f
            public final W b(W w10) {
                return w10.a(new C1242u(F.CONSTRUCTOR.f14964Z), new Z(g0.f4785Y));
            }
        };
        e eVar = new e();
        f3716Z = eVar;
        f3717h0 = new f[]{aVar, fVar, fVar2, fVar3, eVar};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f3717h0.clone();
    }

    public abstract List a(AbstractC0263p abstractC0263p);

    public abstract W b(W w10);

    public int c(int i10) {
        return i10;
    }
}
