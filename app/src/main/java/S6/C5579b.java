package s6;

import I8.w;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jf.y;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import o6.C4929h;
import p5.EnumC5090b;
import q5.C5271a;
import q5.C5272b;
import t5.AbstractC5675a;
import t5.AbstractC5676b;
import wf.n;
import x6.AbstractC6287d;
import x6.AbstractC6301h1;
import x6.C6285c0;
import x6.C6303i0;
import x6.C6309k0;
import x6.C6328q1;
import x6.C6336t1;
import x6.C6345w1;
import x6.C6348x1;
import x6.C6354z1;
import x6.EnumC6279a0;
import x6.EnumC6288d0;
import x6.I;
import x6.I1;
import x6.L;
import x6.N;
import x6.O;
import x6.S;
import x6.T;
import x6.U;
import x6.V;
import x6.V1;
import x6.X;
import x6.Y;
import x6.Y1;
import x6.Z;
import x6.a2;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* renamed from: s6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5579b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ c f45408Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f45409Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f45410h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Long f45411i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f45412j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ String f45413k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ a2 f45414l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f45415m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC5675a f45416n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ long f45417o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5579b(c cVar, String str, String str2, Long l10, String str3, String str4, a2 a2Var, float f6, AbstractC5675a abstractC5675a, long j6) {
        super(2);
        this.f45408Y = cVar;
        this.f45409Z = str;
        this.f45410h0 = str2;
        this.f45411i0 = l10;
        this.f45412j0 = str3;
        this.f45413k0 = str4;
        this.f45414l0 = a2Var;
        this.f45415m0 = f6;
        this.f45416n0 = abstractC5675a;
        this.f45417o0 = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    @Override // wf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        O o10;
        Map linkedHashMap;
        Map linkedHashMap2;
        String str;
        boolean z10;
        String str2;
        int i10;
        int i11;
        int i12;
        C6303i0 c6303i0;
        C6348x1 c6348x1;
        String str3;
        String str4;
        String str5;
        String T;
        int i13;
        int[] h10;
        int i14;
        String str6;
        String str7;
        ArrayList arrayList;
        String str8;
        String str9;
        C5271a c5271a = (C5271a) obj;
        AbstractC5676b abstractC5676b = (AbstractC5676b) obj2;
        AbstractC3557B.c0("datadogContext", c5271a);
        AbstractC3557B.c0("eventBatchWriter", abstractC5676b);
        long longValue = this.f45411i0.longValue();
        c cVar = this.f45408Y;
        cVar.getClass();
        a2 a2Var = this.f45414l0;
        C6336t1 c6336t1 = a2Var.f49242j;
        if (c6336t1 != null) {
            int i02 = AbstractC6287d.i0(c6336t1.f49440a.name());
            List<I1> list = c6336t1.f49441b;
            if (list != null) {
                arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (I1 i15 : list) {
                    arrayList.add(EnumC6279a0.valueOf(i15.name()));
                }
            } else {
                arrayList = null;
            }
            C6328q1 c6328q1 = c6336t1.f49443d;
            if (c6328q1 != null) {
                str8 = c6328q1.f49422a;
            } else {
                str8 = null;
            }
            if (c6328q1 != null) {
                str9 = c6328q1.f49423b;
            } else {
                str9 = null;
            }
            o10 = new O(i02, arrayList, 0, new L(str8, str9));
        } else {
            o10 = null;
        }
        C6345w1 c6345w1 = a2Var.f49249q;
        if (c6345w1 == null || (linkedHashMap = c6345w1.f49468a) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map map = linkedHashMap;
        V1 v12 = a2Var.f49241i;
        if (v12 == null || (linkedHashMap2 = v12.f49120d) == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        Map map2 = linkedHashMap2;
        if (v12 != null) {
            str = v12.f49117a;
        } else {
            str = null;
        }
        if (str == null) {
            if (v12 != null) {
                str6 = v12.f49118b;
            } else {
                str6 = null;
            }
            if (str6 == null) {
                if (v12 != null) {
                    str7 = v12.f49119c;
                } else {
                    str7 = null;
                }
                if (str7 == null && !(!map2.isEmpty())) {
                    z10 = false;
                    str2 = this.f45409Z;
                    if (str2 == null) {
                        try {
                        } catch (Exception e10) {
                            P4.a.m0(cVar.f45419a, 5, EnumC5090b.f42740h0, new C4929h(str2, 5), e10, false, 48);
                            i13 = 7;
                        }
                        for (int i16 : AbstractC6708l.h(9)) {
                            if (AbstractC3557B.K(AbstractC6287d.i(i16), str2)) {
                                i13 = i16;
                                i10 = i13;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } else {
                        i10 = 7;
                    }
                    long j6 = longValue + c5271a.f43903i.f43935d;
                    I i17 = new I(a2Var.f49234b.f49414a);
                    Y y10 = new Y(a2Var.f49238f.f49124a, 1, null);
                    i11 = a2Var.f49239g;
                    if (i11 == 0 && (T = new w(AbstractC6301h1.j(i11)).T()) != null) {
                        i12 = AbstractC4344b.q1(T, cVar.f45419a);
                    } else {
                        i12 = 0;
                    }
                    Y1 y12 = a2Var.f49240h;
                    Z z11 = new Z(y12.f49171a, y12.f49172b, y12.f49173c, y12.f49174d, 16);
                    if (z10) {
                        c6303i0 = null;
                    } else {
                        if (v12 != null) {
                            str3 = v12.f49117a;
                        } else {
                            str3 = null;
                        }
                        if (v12 != null) {
                            str4 = v12.f49118b;
                        } else {
                            str4 = null;
                        }
                        if (v12 != null) {
                            str5 = v12.f49119c;
                        } else {
                            str5 = null;
                        }
                        c6303i0 = new C6303i0(str3, str4, str5, map2);
                    }
                    C5272b c5272b = c5271a.f43906l;
                    C6309k0 c6309k0 = new C6309k0(j6, i17, a2Var.f49235c, a2Var.f49236d, y10, i12, z11, c6303i0, o10, null, new C6285c0(c5272b.f43915f, c5272b.f43917h, null, c5272b.f43916g), new V(AbstractC4344b.i1(c5272b.f43913d), c5272b.f43910a, c5272b.f43912c, c5272b.f43911b, c5272b.f43918i), new T(new U(EnumC6288d0.PLAN_1, 0), new N(Float.valueOf(this.f45415m0), null), null), new S(map), null, new X(this.f45410h0, 2, this.f45412j0, Boolean.TRUE, this.f45413k0, i10, null, null, 64337), null, 1448976);
                    AbstractC5675a abstractC5675a = this.f45416n0;
                    abstractC5675a.e(abstractC5676b, c6309k0);
                    if (this.f45417o0 - a2Var.f49233a < c.f45418c) {
                        C6348x1 c6348x12 = y12.f49156A;
                        if (c6348x12 != null) {
                            c6348x1 = new C6348x1(c6348x12.f49471a + 1);
                        } else {
                            c6348x1 = new C6348x1(1L);
                        }
                        Y1 a5 = Y1.a(y12, null, Boolean.FALSE, c6348x1, -142606337);
                        C6354z1 c6354z1 = a2Var.f49248p;
                        abstractC5675a.e(abstractC5676b, a2.a(a2Var, a5, null, new C6354z1(c6354z1.f49491a, c6354z1.f49492b, c6354z1.f49493c, c6354z1.f49494d + 1, c6354z1.f49495e, c6354z1.f49496f), null, 1015679));
                    }
                    return y.f36177a;
                }
            }
        }
        z10 = true;
        str2 = this.f45409Z;
        if (str2 == null) {
        }
        long j62 = longValue + c5271a.f43903i.f43935d;
        I i172 = new I(a2Var.f49234b.f49414a);
        Y y102 = new Y(a2Var.f49238f.f49124a, 1, null);
        i11 = a2Var.f49239g;
        if (i11 == 0) {
        }
        i12 = 0;
        Y1 y122 = a2Var.f49240h;
        Z z112 = new Z(y122.f49171a, y122.f49172b, y122.f49173c, y122.f49174d, 16);
        if (z10) {
        }
        C5272b c5272b2 = c5271a.f43906l;
        C6309k0 c6309k02 = new C6309k0(j62, i172, a2Var.f49235c, a2Var.f49236d, y102, i12, z112, c6303i0, o10, null, new C6285c0(c5272b2.f43915f, c5272b2.f43917h, null, c5272b2.f43916g), new V(AbstractC4344b.i1(c5272b2.f43913d), c5272b2.f43910a, c5272b2.f43912c, c5272b2.f43911b, c5272b2.f43918i), new T(new U(EnumC6288d0.PLAN_1, 0), new N(Float.valueOf(this.f45415m0), null), null), new S(map), null, new X(this.f45410h0, 2, this.f45412j0, Boolean.TRUE, this.f45413k0, i10, null, null, 64337), null, 1448976);
        AbstractC5675a abstractC5675a2 = this.f45416n0;
        abstractC5675a2.e(abstractC5676b, c6309k02);
        if (this.f45417o0 - a2Var.f49233a < c.f45418c) {
        }
        return y.f36177a;
    }
}
