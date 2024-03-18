package V;

import A.AbstractC0042s0;
import Ng.F;
import Z.AbstractC1710f0;
import q0.C5254f;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5643b;
import z.C6694e;

/* loaded from: classes2.dex */
public abstract class u implements AbstractC0042s0 {

    /* renamed from: Y  reason: collision with root package name */
    public final B f17979Y;

    public u(boolean z10, AbstractC1710f0 abstractC1710f0) {
        this.f17979Y = new B(z10, abstractC1710f0);
    }

    public abstract void e(D.p pVar, F f6);

    public final void f(AbstractC5650i abstractC5650i, float f6, long j6) {
        float R10;
        B b10 = this.f17979Y;
        b10.getClass();
        if (Float.isNaN(f6)) {
            R10 = q.a(abstractC5650i, b10.f17894a, abstractC5650i.g());
        } else {
            R10 = abstractC5650i.R(f6);
        }
        float f10 = R10;
        float floatValue = ((Number) ((C6694e) b10.f17896c).e()).floatValue();
        if (floatValue > 0.0f) {
            long b11 = r0.r.b(j6, floatValue);
            if (b10.f17894a) {
                float d10 = C5254f.d(abstractC5650i.g());
                float b12 = C5254f.b(abstractC5650i.g());
                C5643b V10 = abstractC5650i.V();
                long b13 = V10.b();
                V10.a().h();
                V10.f45609a.a(0.0f, 0.0f, d10, b12, 1);
                AbstractC5648g.c(abstractC5650i, b11, f10, 0L, null, 124);
                V10.a().q();
                V10.c(b13);
                return;
            }
            AbstractC5648g.c(abstractC5650i, b11, f10, 0L, null, 124);
        }
    }

    public abstract void g(D.p pVar);
}
