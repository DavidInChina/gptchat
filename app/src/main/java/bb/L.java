package bb;

import Uc.AbstractC1438x;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import cb.C2356Z;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import rc.C5472v;

/* loaded from: classes.dex */
public final class L extends E {

    /* renamed from: j  reason: collision with root package name */
    public final Va.e f25732j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(androidx.lifecycle.P p10, Va.e eVar, xd.b bVar) {
        super(new C2152D(AbstractC1438x.o1(p10), null, null, null, null, false, null, false, false));
        Uc.z.f17704l.getClass();
        this.f25732j = eVar;
        L4.a.E0(L4.a.I0(new F(this, null), ((C5472v) bVar).f44936f), AbstractC4828h.Q(this));
        h(new G(this, null));
        h(new H(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(L l10, AbstractC4825e abstractC4825e) {
        K k10;
        int i10;
        C2356Z c2356z;
        wd.v0 v0Var;
        l10.getClass();
        if (abstractC4825e instanceof K) {
            k10 = (K) abstractC4825e;
            int i11 = k10.f25731j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k10.f25731j0 = i11 - Integer.MIN_VALUE;
                Object obj = k10.f25729h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = k10.f25731j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        C2356Z c2356z2 = k10.f25728Z;
                        L l11 = k10.f25727Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        c2356z = c2356z2;
                        l10 = l11;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C2152D c2152d = (C2152D) l10.f808e.getValue();
                    Integer num = c2152d.f25695c;
                    if (num != null) {
                        Integer num2 = new Integer(num.intValue());
                        c2356z = new C2356Z(num2, c2152d.f25697e, Boolean.valueOf(c2152d.f25698f));
                        l10.l(C2170j.f25840j0);
                        AbstractC1805k0 a5 = AbstractC1809m0.a();
                        Z8.P p10 = Z8.P.f23266c;
                        String str = c2152d.f25693a;
                        a5.b(p10, AbstractC4268D.a1(new C3959i("gizmo_id", new wd.O(str)), new C3959i("rating", String.valueOf(num2))));
                        k10.f25727Y = l10;
                        k10.f25728Z = c2356z;
                        k10.f25731j0 = 1;
                        obj = ((Ya.r) l10.f25732j).l(c2356z, str, k10);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    jf.y yVar2 = (jf.y) ((wd.u0) v0Var).f48468a;
                    l10.f(C2182w.f25914a);
                    Integer num3 = c2356z.f26500a;
                    if (num3 != null && num3.intValue() >= 4) {
                        l10.f(C2181v.f25909a);
                    }
                } else if (v0Var instanceof wd.q0) {
                    l10.g(new Ad.q((wd.q0) v0Var));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                l10.l(C2170j.f25841k0);
                return yVar;
            }
        }
        k10 = new K(l10, abstractC4825e);
        Object obj2 = k10.f25729h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = k10.f25731j0;
        jf.y yVar3 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        l10.l(C2170j.f25841k0);
        return yVar3;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2151C abstractC2151C = (AbstractC2151C) iVar;
        AbstractC3557B.c0("intent", abstractC2151C);
        if (AbstractC3557B.K(abstractC2151C, C2185z.f25926a)) {
            h(new I(this, null));
        } else if (abstractC2151C instanceof C2184y) {
            l(new J(abstractC2151C, 0));
        } else if (abstractC2151C instanceof C2149A) {
            l(new J(abstractC2151C, 1));
        } else if (abstractC2151C instanceof C2150B) {
            l(new J(abstractC2151C, 2));
        } else {
            throw new RuntimeException();
        }
    }
}
