package Z1;

import androidx.glance.appwidget.protobuf.AbstractC2061v;
import b2.C2109d;
import b2.C2110e;
import b2.C2111f;
import b2.C2112g;
import b2.C2114i;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Z1.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1767i0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f22979Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j0 f22980Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767i0(j0 j0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22980Z = j0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1767i0 c1767i0 = new C1767i0(this.f22980Z, abstractC4825e);
        c1767i0.f22979Y = obj;
        return c1767i0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1767i0) create((C2110e) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C2110e c2110e = (C2110e) this.f22979Y;
        AbstractC2061v abstractC2061v = (AbstractC2061v) c2110e.d(5);
        if (!abstractC2061v.f25276Y.equals(c2110e)) {
            abstractC2061v.e();
            AbstractC2061v.f(abstractC2061v.f25277Z, c2110e);
        }
        C2109d c2109d = (C2109d) abstractC2061v;
        int s10 = ((C2110e) c2109d.f25277Z).s();
        c2109d.e();
        C2110e.p((C2110e) c2109d.f25277Z, s10);
        c2109d.e();
        C2110e.o((C2110e) c2109d.f25277Z);
        j0 j0Var = this.f22980Z;
        for (Map.Entry entry : j0Var.f22989b.entrySet()) {
            C2114i c2114i = (C2114i) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (j0Var.f22992e.contains(new Integer(intValue))) {
                C2111f r10 = C2112g.r();
                r10.e();
                C2112g.n((C2112g) r10.f25277Z, c2114i);
                r10.e();
                C2112g.o((C2112g) r10.f25277Z, intValue);
                c2109d.e();
                C2110e.n((C2110e) c2109d.f25277Z, (C2112g) r10.c());
            }
        }
        return c2109d.c();
    }
}
