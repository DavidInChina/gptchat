package Z1;

import G0.C0571a;
import Ng.AbstractC1070k;
import Ng.C1072l;
import h0.C3288a;
import java.util.concurrent.atomic.AtomicReference;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: Z1.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774p implements A {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f23048Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Pg.A f23049Z;

    public C1774p(AtomicReference atomicReference, Pg.A a5) {
        this.f23048Y = atomicReference;
        this.f23049Z = a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C3288a c3288a, AbstractC4825e abstractC4825e) {
        C1773o c1773o;
        int i10;
        if (abstractC4825e instanceof C1773o) {
            c1773o = (C1773o) abstractC4825e;
            int i11 = c1773o.f23044h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1773o.f23044h0 = i11 - Integer.MIN_VALUE;
                Object obj = c1773o.f23042Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1773o.f23044h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c1773o.getClass();
                    AtomicReference atomicReference = this.f23048Y;
                    c1773o.getClass();
                    Pg.A a5 = this.f23049Z;
                    c1773o.getClass();
                    c1773o.f23044h0 = 1;
                    C1072l c1072l = new C1072l(1, AbstractC5260f.z(c1773o));
                    c1072l.u();
                    c1072l.w(new C0571a(10, a5));
                    AbstractC1070k abstractC1070k = (AbstractC1070k) atomicReference.getAndSet(c1072l);
                    if (abstractC1070k != null) {
                        abstractC1070k.s(null);
                    }
                    ((Pg.p) a5).t(c3288a);
                    Object t10 = c1072l.t();
                    if (t10 == enumC5000a) {
                        com.google.android.gms.internal.play_billing.N.k0(c1773o);
                    }
                    if (t10 == enumC5000a) {
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
        c1773o = new C1773o(this, abstractC4825e);
        Object obj2 = c1773o.f23042Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1773o.f23044h0;
        if (i10 == 0) {
        }
        throw new RuntimeException();
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return AbstractC4344b.j0(this, obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return C1783z.f23135Y;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.L0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return AbstractC4344b.Q0(this, abstractC4831k);
    }
}
