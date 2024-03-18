package Hg;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1013w;
import Mf.a0;
import Pf.AbstractC1146d;
import id.AbstractC3557B;
import java.util.List;
import kg.C4290b;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final y f7798Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        C4290b f6;
        a0 a0Var;
        Bg.A returnType;
        AbstractC1013w abstractC1013w = (AbstractC1013w) obj;
        AbstractC3557B.c0("$this$$receiver", abstractC1013w);
        AbstractC1146d W6 = abstractC1013w.W();
        if (W6 == null) {
            W6 = abstractC1013w.Z();
        }
        List list = z.f7799g;
        if (W6 != null) {
            Bg.A returnType2 = abstractC1013w.getReturnType();
            if (returnType2 != null) {
                Bg.A type = W6.getType();
                AbstractC3557B.b0("getType(...)", type);
                if (Bi.c.h1(returnType2, type)) {
                    return null;
                }
            }
            vg.f p02 = W6.p0();
            AbstractC3557B.b0("getValue(...)", p02);
            if (p02 instanceof vg.d) {
                AbstractC0997f abstractC0997f = ((vg.d) p02).f47532Y;
                if (abstractC0997f.H() && (f6 = AbstractC5493d.f(abstractC0997f)) != null) {
                    AbstractC1000i t02 = R4.b.t0(AbstractC5493d.j(abstractC0997f), f6);
                    if (t02 instanceof a0) {
                        a0Var = (a0) t02;
                    } else {
                        a0Var = null;
                    }
                    if (a0Var != null && (returnType = abstractC1013w.getReturnType()) != null && Bi.c.h1(returnType, ((zg.t) a0Var).x0())) {
                        return null;
                    }
                }
            }
        }
        return "receiver must be a supertype of the return type";
    }
}
