package N0;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3970t;
import q0.C5251c;
import r0.K;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final w f12589Z = new w(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final w f12590h0 = new w(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final w f12591i0 = new w(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final w f12592j0 = new w(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final w f12593k0 = new w(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final w f12594l0 = new w(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final w f12595m0 = new w(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final w f12596n0 = new w(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final w f12597o0 = new w(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final w f12598p0 = new w(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final w f12599q0 = new w(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final w f12600r0 = new w(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final w f12601s0 = new w(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final w f12602t0 = new w(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final w f12603u0 = new w(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final w f12604v0 = new w(15);

    /* renamed from: w0  reason: collision with root package name */
    public static final w f12605w0 = new w(16);

    /* renamed from: x0  reason: collision with root package name */
    public static final w f12606x0 = new w(17);

    /* renamed from: y0  reason: collision with root package name */
    public static final w f12607y0 = new w(18);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12608Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10) {
        super(1);
        this.f12608Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        C1045d c1045d;
        EnumC1048g enumC1048g;
        Integer num;
        Integer num2;
        String str2;
        U0.c cVar;
        Float f6;
        Y0.i iVar;
        Y0.k kVar;
        Z0.n nVar;
        r0.r rVar;
        C5251c c5251c;
        r0.r rVar2;
        Z0.n nVar2;
        S0.D d10;
        S0.z zVar;
        S0.A a5;
        String str3;
        Z0.n nVar3;
        Y0.a aVar;
        Y0.p pVar;
        U0.d dVar;
        r0.r rVar3;
        Y0.j jVar;
        Z0.n nVar4;
        Integer num3;
        Float f10;
        int i10 = 0;
        List list3 = null;
        String str4 = null;
        String str5 = null;
        Z0.o oVar = null;
        Integer num4 = null;
        r11 = null;
        Z0.n nVar5 = null;
        r11 = null;
        K k10 = null;
        Float f11 = null;
        r11 = null;
        Y0.q qVar = null;
        Float f12 = null;
        String str6 = null;
        r11 = null;
        G g10 = null;
        r11 = null;
        H h10 = null;
        r11 = null;
        y yVar = null;
        r11 = null;
        p pVar2 = null;
        list3 = null;
        switch (this.f12608Y) {
            case 0:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list4 = (List) obj;
                Object obj2 = list4.get(1);
                i0.r rVar4 = x.f12610b;
                Boolean bool = Boolean.FALSE;
                if (AbstractC3557B.K(obj2, bool) || obj2 == null) {
                    list = null;
                } else {
                    list = (List) rVar4.f32435b.invoke(obj2);
                }
                Object obj3 = list4.get(2);
                if (AbstractC3557B.K(obj3, bool) || obj3 == null) {
                    list2 = null;
                } else {
                    list2 = (List) rVar4.f32435b.invoke(obj3);
                }
                Object obj4 = list4.get(0);
                if (obj4 != null) {
                    str = (String) obj4;
                } else {
                    str = null;
                }
                AbstractC3557B.Z(str);
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                if (list2 == null || list2.isEmpty()) {
                    list2 = null;
                }
                Object obj5 = list4.get(3);
                if (!AbstractC3557B.K(obj5, bool) && obj5 != null) {
                    list3 = (List) rVar4.f32435b.invoke(obj5);
                }
                return new C1046e(str, list, list2, list3);
            case 1:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i10 < size) {
                    Object obj6 = list5.get(i10);
                    i0.r rVar5 = x.f12611c;
                    if (AbstractC3557B.K(obj6, Boolean.FALSE) || obj6 == null) {
                        c1045d = null;
                    } else {
                        c1045d = (C1045d) rVar5.f32435b.invoke(obj6);
                    }
                    AbstractC3557B.Z(c1045d);
                    arrayList.add(c1045d);
                    i10++;
                }
                return arrayList;
            case 2:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                if (obj7 != null) {
                    enumC1048g = (EnumC1048g) obj7;
                } else {
                    enumC1048g = null;
                }
                AbstractC3557B.Z(enumC1048g);
                Object obj8 = list6.get(2);
                if (obj8 != null) {
                    num = (Integer) obj8;
                } else {
                    num = null;
                }
                AbstractC3557B.Z(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                if (obj9 != null) {
                    num2 = (Integer) obj9;
                } else {
                    num2 = null;
                }
                AbstractC3557B.Z(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                if (obj10 != null) {
                    str2 = (String) obj10;
                } else {
                    str2 = null;
                }
                AbstractC3557B.Z(str2);
                int ordinal = enumC1048g.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    Object obj11 = list6.get(1);
                                    if (obj11 != null) {
                                        str6 = (String) obj11;
                                    }
                                    AbstractC3557B.Z(str6);
                                    return new C1045d(intValue, intValue2, str6, str2);
                                }
                                throw new RuntimeException();
                            }
                            Object obj12 = list6.get(1);
                            i0.r rVar6 = x.f12613e;
                            if (!AbstractC3557B.K(obj12, Boolean.FALSE) && obj12 != null) {
                                g10 = (G) rVar6.f32435b.invoke(obj12);
                            }
                            AbstractC3557B.Z(g10);
                            return new C1045d(intValue, intValue2, g10, str2);
                        }
                        Object obj13 = list6.get(1);
                        i0.r rVar7 = x.f12612d;
                        if (!AbstractC3557B.K(obj13, Boolean.FALSE) && obj13 != null) {
                            h10 = (H) rVar7.f32435b.invoke(obj13);
                        }
                        AbstractC3557B.Z(h10);
                        return new C1045d(intValue, intValue2, h10, str2);
                    }
                    Object obj14 = list6.get(1);
                    i0.r rVar8 = x.f12615g;
                    if (!AbstractC3557B.K(obj14, Boolean.FALSE) && obj14 != null) {
                        yVar = (y) rVar8.f32435b.invoke(obj14);
                    }
                    AbstractC3557B.Z(yVar);
                    return new C1045d(intValue, intValue2, yVar, str2);
                }
                Object obj15 = list6.get(1);
                i0.r rVar9 = x.f12614f;
                if (!AbstractC3557B.K(obj15, Boolean.FALSE) && obj15 != null) {
                    pVar2 = (p) rVar9.f32435b.invoke(obj15);
                }
                AbstractC3557B.Z(pVar2);
                return new C1045d(intValue, intValue2, pVar2, str2);
            case 3:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Float", obj);
                return new Y0.a(((Float) obj).floatValue());
            case 4:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.ULong", obj);
                return new r0.r(((C3970t) obj).f36172Y);
            case 5:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj);
                return new S0.D(((Integer) obj).intValue());
            case 6:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list7.size());
                int size2 = list7.size();
                while (i10 < size2) {
                    Object obj16 = list7.get(i10);
                    i0.r rVar10 = x.f12627s;
                    if (AbstractC3557B.K(obj16, Boolean.FALSE) || obj16 == null) {
                        cVar = null;
                    } else {
                        cVar = (U0.c) rVar10.f32435b.invoke(obj16);
                    }
                    AbstractC3557B.Z(cVar);
                    arrayList2.add(cVar);
                    i10++;
                }
                return new U0.d(arrayList2);
            case 7:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj);
                return new U0.c(U0.g.f17385a.r((String) obj));
            case 8:
                if (AbstractC3557B.K(obj, Boolean.FALSE)) {
                    return new C5251c(C5251c.f43621d);
                }
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list8 = (List) obj;
                Object obj17 = list8.get(0);
                if (obj17 != null) {
                    f6 = (Float) obj17;
                } else {
                    f6 = null;
                }
                AbstractC3557B.Z(f6);
                float floatValue = f6.floatValue();
                Object obj18 = list8.get(1);
                if (obj18 != null) {
                    f12 = (Float) obj18;
                }
                AbstractC3557B.Z(f12);
                return new C5251c(R4.b.r(floatValue, f12.floatValue()));
            case 9:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list9 = (List) obj;
                Object obj19 = list9.get(0);
                if (obj19 != null) {
                    iVar = (Y0.i) obj19;
                } else {
                    iVar = null;
                }
                AbstractC3557B.Z(iVar);
                Object obj20 = list9.get(1);
                if (obj20 != null) {
                    kVar = (Y0.k) obj20;
                } else {
                    kVar = null;
                }
                AbstractC3557B.Z(kVar);
                Object obj21 = list9.get(2);
                Z0.o[] oVarArr = Z0.n.f22809b;
                i0.r rVar11 = x.f12624p;
                Boolean bool2 = Boolean.FALSE;
                if (AbstractC3557B.K(obj21, bool2) || obj21 == null) {
                    nVar = null;
                } else {
                    nVar = (Z0.n) rVar11.f32435b.invoke(obj21);
                }
                AbstractC3557B.Z(nVar);
                Object obj22 = list9.get(3);
                Y0.q qVar2 = Y0.q.f22042c;
                i0.r rVar12 = x.f12618j;
                if (!AbstractC3557B.K(obj22, bool2) && obj22 != null) {
                    qVar = (Y0.q) rVar12.f32435b.invoke(obj22);
                }
                return new p(iVar.f22030a, kVar.f22035a, nVar.f22811a, qVar, 496);
            case 10:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                int i11 = r0.r.f44264l;
                i0.r rVar13 = x.f12623o;
                Boolean bool3 = Boolean.FALSE;
                if (AbstractC3557B.K(obj23, bool3) || obj23 == null) {
                    rVar = null;
                } else {
                    rVar = (r0.r) rVar13.f32435b.invoke(obj23);
                }
                AbstractC3557B.Z(rVar);
                Object obj24 = list10.get(1);
                int i12 = C5251c.f43622e;
                i0.r rVar14 = x.f12625q;
                if (AbstractC3557B.K(obj24, bool3) || obj24 == null) {
                    c5251c = null;
                } else {
                    c5251c = (C5251c) rVar14.f32435b.invoke(obj24);
                }
                AbstractC3557B.Z(c5251c);
                Object obj25 = list10.get(2);
                if (obj25 != null) {
                    f11 = (Float) obj25;
                }
                AbstractC3557B.Z(f11);
                return new K(rVar.f44265a, c5251c.f43623a, f11.floatValue());
            case 11:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list11 = (List) obj;
                Object obj26 = list11.get(0);
                int i13 = r0.r.f44264l;
                i0.r rVar15 = x.f12623o;
                Boolean bool4 = Boolean.FALSE;
                if (AbstractC3557B.K(obj26, bool4) || obj26 == null) {
                    rVar2 = null;
                } else {
                    rVar2 = (r0.r) rVar15.f32435b.invoke(obj26);
                }
                AbstractC3557B.Z(rVar2);
                Object obj27 = list11.get(1);
                Z0.o[] oVarArr2 = Z0.n.f22809b;
                i0.r rVar16 = x.f12624p;
                if (AbstractC3557B.K(obj27, bool4) || obj27 == null) {
                    nVar2 = null;
                } else {
                    nVar2 = (Z0.n) rVar16.f32435b.invoke(obj27);
                }
                AbstractC3557B.Z(nVar2);
                Object obj28 = list11.get(2);
                S0.D d11 = S0.D.f15968Z;
                i0.r rVar17 = x.f12619k;
                if (AbstractC3557B.K(obj28, bool4) || obj28 == null) {
                    d10 = null;
                } else {
                    d10 = (S0.D) rVar17.f32435b.invoke(obj28);
                }
                Object obj29 = list11.get(3);
                if (obj29 != null) {
                    zVar = (S0.z) obj29;
                } else {
                    zVar = null;
                }
                Object obj30 = list11.get(4);
                if (obj30 != null) {
                    a5 = (S0.A) obj30;
                } else {
                    a5 = null;
                }
                Object obj31 = list11.get(6);
                if (obj31 != null) {
                    str3 = (String) obj31;
                } else {
                    str3 = null;
                }
                Object obj32 = list11.get(7);
                if (AbstractC3557B.K(obj32, bool4) || obj32 == null) {
                    nVar3 = null;
                } else {
                    nVar3 = (Z0.n) rVar16.f32435b.invoke(obj32);
                }
                AbstractC3557B.Z(nVar3);
                Object obj33 = list11.get(8);
                i0.r rVar18 = x.f12620l;
                if (AbstractC3557B.K(obj33, bool4) || obj33 == null) {
                    aVar = null;
                } else {
                    aVar = (Y0.a) rVar18.f32435b.invoke(obj33);
                }
                Object obj34 = list11.get(9);
                i0.r rVar19 = x.f12617i;
                if (AbstractC3557B.K(obj34, bool4) || obj34 == null) {
                    pVar = null;
                } else {
                    pVar = (Y0.p) rVar19.f32435b.invoke(obj34);
                }
                Object obj35 = list11.get(10);
                i0.r rVar20 = x.f12626r;
                if (AbstractC3557B.K(obj35, bool4) || obj35 == null) {
                    dVar = null;
                } else {
                    dVar = (U0.d) rVar20.f32435b.invoke(obj35);
                }
                Object obj36 = list11.get(11);
                if (AbstractC3557B.K(obj36, bool4) || obj36 == null) {
                    rVar3 = null;
                } else {
                    rVar3 = (r0.r) rVar15.f32435b.invoke(obj36);
                }
                AbstractC3557B.Z(rVar3);
                Object obj37 = list11.get(12);
                i0.r rVar21 = x.f12616h;
                if (AbstractC3557B.K(obj37, bool4) || obj37 == null) {
                    jVar = null;
                } else {
                    jVar = (Y0.j) rVar21.f32435b.invoke(obj37);
                }
                Object obj38 = list11.get(13);
                K k11 = K.f44202d;
                i0.r rVar22 = x.f12622n;
                if (!AbstractC3557B.K(obj38, bool4) && obj38 != null) {
                    k10 = (K) rVar22.f32435b.invoke(obj38);
                }
                return new y(rVar2.f44265a, nVar2.f22811a, d10, zVar, a5, null, str3, nVar3.f22811a, aVar, pVar, dVar, rVar3.f44265a, jVar, k10, 49184);
            case 12:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj);
                return new Y0.j(((Integer) obj).intValue());
            case 13:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>", obj);
                List list12 = (List) obj;
                return new Y0.p(((Number) list12.get(0)).floatValue(), ((Number) list12.get(1)).floatValue());
            case 14:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list13 = (List) obj;
                Object obj39 = list13.get(0);
                Z0.o[] oVarArr3 = Z0.n.f22809b;
                i0.r rVar23 = x.f12624p;
                Boolean bool5 = Boolean.FALSE;
                if (AbstractC3557B.K(obj39, bool5) || obj39 == null) {
                    nVar4 = null;
                } else {
                    nVar4 = (Z0.n) rVar23.f32435b.invoke(obj39);
                }
                AbstractC3557B.Z(nVar4);
                Object obj40 = list13.get(1);
                if (!AbstractC3557B.K(obj40, bool5) && obj40 != null) {
                    nVar5 = (Z0.n) rVar23.f32435b.invoke(obj40);
                }
                AbstractC3557B.Z(nVar5);
                return new Y0.q(nVar4.f22811a, nVar5.f22811a);
            case 15:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list14 = (List) obj;
                Object obj41 = list14.get(0);
                if (obj41 != null) {
                    num3 = (Integer) obj41;
                } else {
                    num3 = null;
                }
                AbstractC3557B.Z(num3);
                int intValue3 = num3.intValue();
                Object obj42 = list14.get(1);
                if (obj42 != null) {
                    num4 = (Integer) obj42;
                }
                AbstractC3557B.Z(num4);
                return new D(U3.f.e(intValue3, num4.intValue()));
            case 16:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list15 = (List) obj;
                Object obj43 = list15.get(0);
                if (obj43 != null) {
                    f10 = (Float) obj43;
                } else {
                    f10 = null;
                }
                AbstractC3557B.Z(f10);
                float floatValue2 = f10.floatValue();
                Object obj44 = list15.get(1);
                if (obj44 != null) {
                    oVar = (Z0.o) obj44;
                }
                AbstractC3557B.Z(oVar);
                return new Z0.n(M3.H.b0(floatValue2, oVar.f22812a));
            case 17:
                if (obj != null) {
                    str5 = (String) obj;
                }
                AbstractC3557B.Z(str5);
                return new G(str5);
            default:
                if (obj != null) {
                    str4 = (String) obj;
                }
                AbstractC3557B.Z(str4);
                return new H(str4);
        }
    }
}
