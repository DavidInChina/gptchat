package Z;

import A.C0043t;
import Ng.C1072l;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: Z.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728o0 implements AbstractC1700a0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1700a0 f22663Y;

    /* renamed from: Z  reason: collision with root package name */
    public final X f22664Z = new X();

    public C1728o0(AbstractC1700a0 abstractC1700a0) {
        this.f22663Y = abstractC1700a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:32:0x008c, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // Z.AbstractC1700a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(wf.k kVar, AbstractC4825e abstractC4825e) {
        C1726n0 c1726n0;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        C1728o0 c1728o0;
        Object obj2;
        if (abstractC4825e instanceof C1726n0) {
            c1726n0 = (C1726n0) abstractC4825e;
            int i11 = c1726n0.f22660j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1726n0.f22660j0 = i11 - Integer.MIN_VALUE;
                obj = c1726n0.f22658h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c1726n0.f22660j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = c1726n0.f22657Z;
                    c1728o0 = c1726n0.f22656Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    X x10 = this.f22664Z;
                    c1726n0.f22656Y = this;
                    c1726n0.f22657Z = kVar;
                    c1726n0.f22660j0 = 1;
                    if (x10.a()) {
                        obj2 = jf.y.f36177a;
                    } else {
                        C1072l c1072l = new C1072l(1, AbstractC5260f.z(c1726n0));
                        c1072l.u();
                        synchronized (x10.f22583a) {
                            x10.f22584b.add(c1072l);
                        }
                        c1072l.w(new C0043t(x10, 12, c1072l));
                        obj2 = c1072l.t();
                        if (obj2 == enumC5000a) {
                            com.google.android.gms.internal.play_billing.N.k0(c1726n0);
                        }
                        if (obj2 != enumC5000a) {
                            obj2 = jf.y.f36177a;
                        }
                    }
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    c1728o0 = this;
                }
                AbstractC1700a0 abstractC1700a0 = c1728o0.f22663Y;
                c1726n0.f22656Y = null;
                c1726n0.f22657Z = null;
                c1726n0.f22660j0 = 2;
                obj = abstractC1700a0.S(kVar, c1726n0);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        c1726n0 = new C1726n0(this, abstractC4825e);
        obj = c1726n0.f22658h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c1726n0.f22660j0;
        if (i10 == 0) {
        }
        AbstractC1700a0 abstractC1700a02 = c1728o0.f22663Y;
        c1726n0.f22656Y = null;
        c1726n0.f22657Z = null;
        c1726n0.f22660j0 = 2;
        obj = abstractC1700a02.S(kVar, c1726n0);
        if (obj != enumC5000a) {
        }
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
        return C1723m.f22655Z;
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
