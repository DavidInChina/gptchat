package y;

import F.C0535i;
import cb.C2350T;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3959i;
import l8.AbstractC4344b;
import q0.C5251c;
import uc.C5885c;
import yf.AbstractC6583a;

/* renamed from: y.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6461B extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50084Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f50085Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6461B(int i10, List list) {
        super(1);
        this.f50084Y = i10;
        this.f50085Z = list;
    }

    public final ic.P a(ic.P p10) {
        switch (this.f50084Y) {
            case 11:
                AbstractC3557B.c0("$this$setState", p10);
                return ic.P.e(p10, null, false, false, this.f50085Z, null, false, null, null, 247);
            case 12:
                AbstractC3557B.c0("$this$setState", p10);
                return ic.P.e(p10, null, false, false, null, null, false, this.f50085Z, null, 191);
            case 13:
                AbstractC3557B.c0("$this$setState", p10);
                return ic.P.e(p10, null, false, false, this.f50085Z, null, false, null, null, 247);
            default:
                AbstractC3557B.c0("$this$setState", p10);
                return ic.P.e(p10, null, false, false, this.f50085Z, null, false, null, null, 247);
        }
    }

    public final void c(E0.c0 c0Var) {
        int i10 = this.f50084Y;
        List<C3959i> list = this.f50085Z;
        switch (i10) {
            case 0:
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    E0.c0.d(c0Var, (E0.d0) list.get(i11), 0, 0);
                }
                return;
            case 1:
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    E0.c0.g(c0Var, (E0.d0) list.get(i12), 0, 0);
                }
                return;
            case 2:
                if (list != null) {
                    int size3 = list.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        C3959i c3959i = (C3959i) list.get(i13);
                        E0.c0.f(c0Var, (E0.d0) c3959i.f36155Y, ((Z0.i) c3959i.f36156Z).f22799a);
                    }
                    return;
                }
                return;
            case 3:
                int size4 = list.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    E0.c0.d(c0Var, (E0.d0) list.get(i14), 0, 0);
                }
                return;
            case 4:
            default:
                AbstractC3557B.c0("$this$layout", c0Var);
                for (C3959i c3959i2 : list) {
                    long j6 = ((C5251c) c3959i2.f36156Z).f43623a;
                    for (E0.d0 d0Var : (List) c3959i2.f36155Y) {
                        E0.c0.g(c0Var, d0Var, (int) C5251c.d(j6), (int) C5251c.e(j6));
                    }
                }
                return;
            case 5:
                int size5 = list.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    E0.c0.h(c0Var, (E0.d0) list.get(i15), 0, 0);
                }
                return;
            case 6:
                int size6 = list.size();
                for (int i16 = 0; i16 < size6; i16++) {
                    E0.c0.g(c0Var, (E0.d0) list.get(i16), 0, 0);
                }
                return;
            case 7:
                int u02 = AbstractC4344b.u0(list);
                if (u02 >= 0) {
                    int i17 = 0;
                    while (true) {
                        E0.c0.g(c0Var, (E0.d0) list.get(i17), 0, 0);
                        if (i17 != u02) {
                            i17++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f50084Y;
        List<C2350T> list = this.f50085Z;
        switch (i10) {
            case 0:
                c((E0.c0) obj);
                return yVar;
            case 1:
                c((E0.c0) obj);
                return yVar;
            case 2:
                c((E0.c0) obj);
                return yVar;
            case 3:
                c((E0.c0) obj);
                return yVar;
            case 4:
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((wf.k) list.get(i11)).invoke(obj);
                }
                return yVar;
            case 5:
                c((E0.c0) obj);
                return yVar;
            case 6:
                c((E0.c0) obj);
                return yVar;
            case 7:
                c((E0.c0) obj);
                return yVar;
            case 8:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 8:
                        list.get(intValue);
                        break;
                    default:
                        list.get(intValue);
                        break;
                }
                return null;
            case 9:
                bb.m0 m0Var = (bb.m0) obj;
                AbstractC3557B.c0("$this$setState", m0Var);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (C2350T c2350t : list) {
                    arrayList.add(Bi.c.K1(c2350t));
                }
                return bb.m0.e(m0Var, arrayList, null, null, null, 14);
            case 10:
                gc.o oVar = (gc.o) obj;
                AbstractC3557B.c0("$this$setState", oVar);
                return gc.o.e(oVar, null, list, 1);
            case 11:
                return a((ic.P) obj);
            case 12:
                return a((ic.P) obj);
            case 13:
                return a((ic.P) obj);
            case 14:
                return a((ic.P) obj);
            case 15:
                C5885c c5885c = (C5885c) obj;
                AbstractC3557B.c0("features", c5885c);
                return C5885c.a(c5885c, null, kf.t.w2(list, c5885c.f46631b), 1);
            case 16:
                Cd.X x10 = (Cd.X) obj;
                AbstractC3557B.c0("$this$setState", x10);
                return Cd.X.e(x10, null, null, false, false, false, false, kf.t.y2(list), null, null, 7167);
            case 17:
                int intValue2 = ((Number) obj).intValue();
                switch (i10) {
                    case 8:
                        list.get(intValue2);
                        break;
                    default:
                        list.get(intValue2);
                        break;
                }
                return null;
            case 18:
                F.B b10 = (F.B) obj;
                AbstractC3557B.c0("$this$LazyColumn", b10);
                ((C0535i) b10).l0(list.size(), null, new C6461B(17, list), new C3288a(new ib.k(1, list), true, -1091073711));
                return yVar;
            default:
                c((E0.c0) obj);
                return yVar;
        }
    }
}
