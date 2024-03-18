package y;

import L9.AbstractC0905k;
import L9.C0907m;
import L9.C0915v;
import Qg.AbstractC1207j;
import Qg.C1200f;
import Qg.C1202g;
import Rg.AbstractC1282c;
import Sg.AbstractC1389a;
import Z.C1733r0;
import Z.l1;
import Z8.C1830x0;
import ca.C2325q;
import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import jf.C3959i;
import kd.C4251o;
import kd.C4259w;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import oa.C4972C;
import of.EnumC5000a;
import rb.C5419i;
import rb.C5436z;
import wf.AbstractC6216a;
import xc.C6393b;
import yf.AbstractC6583a;
import z.C6729v0;

/* loaded from: classes.dex */
public final class F implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50092Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f50093Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f50094h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f50095i0;

    public /* synthetic */ F(Object obj, Object obj2, Object obj3, int i10) {
        this.f50092Y = i10;
        this.f50093Z = obj;
        this.f50094h0 = obj2;
        this.f50095i0 = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARN: Type inference failed for: r5v19, types: [Na.g, java.lang.Object] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        boolean z10;
        jf.y yVar;
        Object a5;
        String str;
        LinkedHashMap linkedHashMap;
        double d10;
        C5419i c5419i;
        Object obj2;
        int i10;
        AbstractC1207j abstractC1207j;
        C6393b c6393b;
        int i11;
        boolean z11;
        C4251o c4251o;
        int i12;
        C1200f c1200f;
        int i13;
        jf.y yVar2 = jf.y.f36177a;
        int i14 = this.f50092Y;
        Object obj3 = this.f50094h0;
        Object obj4 = this.f50095i0;
        Object obj5 = this.f50093Z;
        switch (i14) {
            case 0:
                C1733r0 c1733r0 = (C1733r0) obj5;
                if (((Boolean) obj).booleanValue()) {
                    C6729v0 c6729v0 = (C6729v0) obj3;
                    z10 = ((Boolean) ((wf.n) ((l1) obj4).getValue()).invoke(c6729v0.b(), c6729v0.f51386c.getValue())).booleanValue();
                } else {
                    z10 = false;
                }
                c1733r0.setValue(Boolean.valueOf(z10));
                return yVar2;
            case 1:
                AbstractC0905k abstractC0905k = (AbstractC0905k) obj;
                C4972C c4972c = (C4972C) obj5;
                Na.a aVar = c4972c.f41052g;
                String str2 = (String) obj3;
                boolean z12 = ((kotlin.jvm.internal.x) obj4).f37645Y;
                aVar.getClass();
                AbstractC3557B.c0("latencySessionId", str2);
                AbstractC3557B.c0("response", abstractC0905k);
                LinkedHashMap linkedHashMap2 = aVar.f12763b;
                Na.f fVar = (Na.f) linkedHashMap2.get(new Na.e(str2));
                if (fVar != null) {
                    boolean z13 = abstractC0905k instanceof C0915v;
                    List<Na.g> list = fVar.f12773f;
                    if (z13) {
                        Yg.p.Companion.getClass();
                        Yg.p pVar = new Yg.p(AbstractC6463a.n("instant(...)"));
                        long b10 = pVar.b(fVar.f12771d);
                        fVar.f12772e = b10;
                        fVar.f12770c = pVar.b(fVar.f12769b);
                        fVar.f12771d = pVar;
                        ?? obj6 = new Object();
                        obj6.f12775a = b10;
                        list.add(obj6);
                        fVar.f12774g = z12;
                    } else {
                        if (abstractC0905k instanceof C0907m) {
                            if (list.isEmpty()) {
                                yVar = yVar2;
                                linkedHashMap = linkedHashMap2;
                                str = str2;
                            } else {
                                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                                for (Na.g gVar : list) {
                                    arrayList.add(Long.valueOf(Mg.b.e(gVar.f12775a)));
                                    str2 = str2;
                                }
                                str = str2;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                yVar = yVar2;
                                linkedHashMap3.putAll(AbstractC4268D.a1(new C3959i("model", fVar.f12768a), new C3959i("token_count", Integer.valueOf(list.size())), new C3959i("first_token_lat", kf.t.f2(arrayList)), new C3959i("total_request_time", Long.valueOf(Mg.b.e(fVar.f12770c))), new C3959i("web_sockets", Boolean.valueOf(fVar.f12774g))));
                                List<Number> Z12 = kf.t.Z1(arrayList, 1);
                                if (!Z12.isEmpty()) {
                                    C3959i[] c3959iArr = new C3959i[7];
                                    Iterator it = Z12.iterator();
                                    if (it.hasNext()) {
                                        Comparable comparable = (Comparable) it.next();
                                        while (it.hasNext()) {
                                            Comparable comparable2 = (Comparable) it.next();
                                            if (comparable.compareTo(comparable2) < 0) {
                                                comparable = comparable2;
                                            }
                                        }
                                        c3959iArr[0] = new C3959i("max_token_lat", comparable);
                                        c3959iArr[1] = new C3959i("mean_token_lat", Double.valueOf(kf.t.W1(Z12)));
                                        List E22 = kf.t.E2(Z12);
                                        c3959iArr[2] = new C3959i("median_token_lat", Long.valueOf(((Number) E22.get(E22.size() / 2)).longValue()));
                                        Iterator it2 = Z12.iterator();
                                        if (it2.hasNext()) {
                                            Comparable comparable3 = (Comparable) it2.next();
                                            while (it2.hasNext()) {
                                                Comparable comparable4 = (Comparable) it2.next();
                                                if (comparable3.compareTo(comparable4) > 0) {
                                                    comparable3 = comparable4;
                                                }
                                            }
                                            c3959iArr[3] = new C3959i("min_token_lat", comparable3);
                                            c3959iArr[4] = new C3959i("p95_token_lat", Long.valueOf(R4.a.S(Z12, 95)));
                                            c3959iArr[5] = new C3959i("p99_token_lat", Long.valueOf(R4.a.S(Z12, 99)));
                                            double W12 = kf.t.W1(Z12);
                                            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(Z12, 10));
                                            for (Number number : Z12) {
                                                arrayList2.add(Double.valueOf(number.longValue() - W12));
                                                linkedHashMap2 = linkedHashMap2;
                                            }
                                            linkedHashMap = linkedHashMap2;
                                            ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
                                            Iterator it3 = arrayList2.iterator();
                                            while (it3.hasNext()) {
                                                double doubleValue = ((Number) it3.next()).doubleValue();
                                                arrayList3.add(Double.valueOf(doubleValue * doubleValue));
                                            }
                                            Iterator it4 = arrayList3.iterator();
                                            double d11 = 0.0d;
                                            int i15 = 0;
                                            while (it4.hasNext()) {
                                                d11 += ((Number) it4.next()).doubleValue();
                                                i15++;
                                                if (i15 < 0) {
                                                    AbstractC4344b.c1();
                                                    throw null;
                                                }
                                            }
                                            if (i15 == 0) {
                                                d10 = Double.NaN;
                                            } else {
                                                d10 = d11 / i15;
                                            }
                                            c3959iArr[6] = new C3959i("std_dev_token_lat", Double.valueOf(Math.sqrt(d10)));
                                            linkedHashMap3.putAll(AbstractC4268D.a1(c3959iArr));
                                        } else {
                                            throw new NoSuchElementException();
                                        }
                                    } else {
                                        throw new NoSuchElementException();
                                    }
                                } else {
                                    linkedHashMap = linkedHashMap2;
                                }
                                aVar.f12762a.b(C1830x0.f23419c, linkedHashMap3);
                            }
                            linkedHashMap.remove(new Na.e(str));
                        } else {
                            yVar = yVar2;
                            if (abstractC0905k instanceof L9.F) {
                                linkedHashMap2.remove(new Na.e(str2));
                            }
                        }
                        a5 = C4972C.a(c4972c, abstractC0905k, abstractC4825e);
                        if (a5 != EnumC5000a.f41328Y) {
                            return a5;
                        }
                        return yVar;
                    }
                }
                yVar = yVar2;
                a5 = C4972C.a(c4972c, abstractC0905k, abstractC4825e);
                if (a5 != EnumC5000a.f41328Y) {
                }
            case 2:
                Object a10 = Ga.E.a((Ga.E) obj5, (AbstractC1207j) obj3, (String) obj, (AbstractC6216a) obj4, abstractC4825e);
                if (a10 == EnumC5000a.f41328Y) {
                    return a10;
                }
                return yVar2;
            case 3:
                if (abstractC4825e instanceof C5419i) {
                    c5419i = (C5419i) abstractC4825e;
                    int i16 = c5419i.f44695Z;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c5419i.f44695Z = i16 - Integer.MIN_VALUE;
                        obj2 = c5419i.f44694Y;
                        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                        i10 = c5419i.f44695Z;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                                    return yVar2;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            abstractC1207j = c5419i.f44696h0;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            AbstractC1207j abstractC1207j2 = (AbstractC1207j) obj5;
                            c5419i.f44696h0 = abstractC1207j2;
                            c5419i.f44695Z = 1;
                            Object f6 = ((C5436z) obj3).f((C2325q) ((C3959i) obj).f36155Y, (wf.k) obj4, c5419i);
                            if (f6 != enumC5000a) {
                                obj2 = f6;
                                abstractC1207j = abstractC1207j2;
                            }
                            return enumC5000a;
                        }
                        if (obj2 == null) {
                            c5419i.f44696h0 = null;
                            c5419i.f44695Z = 2;
                            if (abstractC1207j.c(obj2, c5419i) != enumC5000a) {
                                return yVar2;
                            }
                            return enumC5000a;
                        }
                        return yVar2;
                    }
                }
                c5419i = new C5419i(this, abstractC4825e);
                obj2 = c5419i.f44694Y;
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                i10 = c5419i.f44695Z;
                if (i10 == 0) {
                }
                if (obj2 == null) {
                }
            case 4:
                if (abstractC4825e instanceof C6393b) {
                    c6393b = (C6393b) abstractC4825e;
                    int i17 = c6393b.f49791Z;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c6393b.f49791Z = i17 - Integer.MIN_VALUE;
                        Object obj7 = c6393b.f49790Y;
                        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                        i11 = c6393b.f49791Z;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj7);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj7);
                        AbstractC1207j abstractC1207j3 = (AbstractC1207j) obj5;
                        if (((Boolean) obj).booleanValue() && ((com.openai.experiment.G) ((xc.e) obj3).f49800a).c((ExperimentKey.BooleanKey) obj4)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z11);
                        c6393b.f49791Z = 1;
                        if (abstractC1207j3.c(valueOf, c6393b) == enumC5000a3) {
                            return enumC5000a3;
                        }
                        return yVar2;
                    }
                }
                c6393b = new C6393b(this, abstractC4825e);
                Object obj72 = c6393b.f49790Y;
                EnumC5000a enumC5000a32 = EnumC5000a.f41328Y;
                i11 = c6393b.f49791Z;
                if (i11 == 0) {
                }
                break;
            case 5:
                if (abstractC4825e instanceof C4251o) {
                    c4251o = (C4251o) abstractC4825e;
                    int i18 = c4251o.f37334Z;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c4251o.f37334Z = i18 - Integer.MIN_VALUE;
                        Object obj8 = c4251o.f37333Y;
                        EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                        i12 = c4251o.f37334Z;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj8);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj8);
                        AbstractC1207j abstractC1207j4 = (AbstractC1207j) obj5;
                        C4259w c4259w = (C4259w) obj;
                        if (AbstractC3557B.K(c4259w.f37365d, (String) obj3)) {
                            String str3 = (String) obj4;
                            if (str3 == null || AbstractC3557B.K(c4259w.f37364c, str3)) {
                                c4251o.f37334Z = 1;
                                if (abstractC1207j4.c(obj, c4251o) == enumC5000a4) {
                                    return enumC5000a4;
                                }
                                return yVar2;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                c4251o = new C4251o(this, abstractC4825e);
                Object obj82 = c4251o.f37333Y;
                EnumC5000a enumC5000a42 = EnumC5000a.f41328Y;
                i12 = c4251o.f37334Z;
                if (i12 == 0) {
                }
                break;
            case 6:
                if (abstractC4825e instanceof C1200f) {
                    c1200f = (C1200f) abstractC4825e;
                    int i19 = c1200f.f14841h0;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        c1200f.f14841h0 = i19 - Integer.MIN_VALUE;
                        Object obj9 = c1200f.f14839Y;
                        EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                        i13 = c1200f.f14841h0;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj9);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj9);
                        C1202g c1202g = (C1202g) obj5;
                        Object invoke = c1202g.f14848Z.invoke(obj);
                        kotlin.jvm.internal.B b11 = (kotlin.jvm.internal.B) obj3;
                        Object obj10 = b11.f37622Y;
                        if (obj10 == AbstractC1282c.f15530b || !((Boolean) c1202g.f14849h0.invoke(obj10, invoke)).booleanValue()) {
                            b11.f37622Y = invoke;
                            c1200f.f14841h0 = 1;
                            if (((AbstractC1207j) obj4).c(obj, c1200f) == enumC5000a5) {
                                return enumC5000a5;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                c1200f = new C1200f(this, abstractC4825e);
                Object obj92 = c1200f.f14839Y;
                EnumC5000a enumC5000a52 = EnumC5000a.f41328Y;
                i13 = c1200f.f14841h0;
                if (i13 == 0) {
                }
                break;
            default:
                Object Q12 = Bi.c.Q1((AbstractC4831k) obj5, obj, obj3, (wf.n) obj4, abstractC4825e);
                if (Q12 == EnumC5000a.f41328Y) {
                    return Q12;
                }
                return yVar2;
        }
    }

    public F(AbstractC1207j abstractC1207j, AbstractC4831k abstractC4831k) {
        this.f50092Y = 7;
        this.f50093Z = abstractC4831k;
        this.f50094h0 = AbstractC1389a.d(abstractC4831k);
        this.f50095i0 = new Rg.I(abstractC1207j, null);
    }
}
