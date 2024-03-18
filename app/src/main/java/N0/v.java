package N0;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.C3970t;
import l8.AbstractC4344b;
import q0.C5251c;
import r0.K;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final v f12569Z = new v(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final v f12570h0 = new v(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final v f12571i0 = new v(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final v f12572j0 = new v(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final v f12573k0 = new v(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final v f12574l0 = new v(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final v f12575m0 = new v(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final v f12576n0 = new v(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final v f12577o0 = new v(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final v f12578p0 = new v(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final v f12579q0 = new v(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final v f12580r0 = new v(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final v f12581s0 = new v(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final v f12582t0 = new v(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final v f12583u0 = new v(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final v f12584v0 = new v(15);

    /* renamed from: w0  reason: collision with root package name */
    public static final v f12585w0 = new v(16);

    /* renamed from: x0  reason: collision with root package name */
    public static final v f12586x0 = new v(17);

    /* renamed from: y0  reason: collision with root package name */
    public static final v f12587y0 = new v(18);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12588Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10) {
        super(2);
        this.f12588Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        EnumC1048g enumC1048g;
        int i10 = 0;
        switch (this.f12588Y) {
            case 0:
                i0.d dVar = (i0.d) obj;
                C1046e c1046e = (C1046e) obj2;
                Object[] objArr = new Object[4];
                String str = c1046e.f12512Y;
                i0.r rVar = x.f12609a;
                objArr[0] = str;
                Collection collection = kf.v.f37483Y;
                Collection collection2 = c1046e.f12513Z;
                if (collection2 == null) {
                    collection2 = collection;
                }
                i0.r rVar2 = x.f12610b;
                objArr[1] = x.a(collection2, rVar2, dVar);
                Collection collection3 = c1046e.f12514h0;
                if (collection3 != null) {
                    collection = collection3;
                }
                objArr[2] = x.a(collection, rVar2, dVar);
                objArr[3] = x.a(c1046e.f12515i0, rVar2, dVar);
                return AbstractC4344b.M(objArr);
            case 1:
                i0.d dVar2 = (i0.d) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i10 < size) {
                    arrayList.add(x.a((C1045d) list.get(i10), x.f12611c, dVar2));
                    i10++;
                }
                return arrayList;
            case 2:
                i0.d dVar3 = (i0.d) obj;
                C1045d c1045d = (C1045d) obj2;
                Object obj3 = c1045d.f12508a;
                if (obj3 instanceof p) {
                    enumC1048g = EnumC1048g.f12517Y;
                } else if (obj3 instanceof y) {
                    enumC1048g = EnumC1048g.f12518Z;
                } else if (obj3 instanceof H) {
                    enumC1048g = EnumC1048g.f12519h0;
                } else if (obj3 instanceof G) {
                    enumC1048g = EnumC1048g.f12520i0;
                } else {
                    enumC1048g = EnumC1048g.f12521j0;
                }
                int ordinal = enumC1048g.ordinal();
                Object obj4 = c1045d.f12508a;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i0.r rVar3 = x.f12609a;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation", obj4);
                                obj4 = x.a((G) obj4, x.f12613e, dVar3);
                            }
                        } else {
                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation", obj4);
                            obj4 = x.a((H) obj4, x.f12612d, dVar3);
                        }
                    } else {
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle", obj4);
                        obj4 = x.a((y) obj4, x.f12615g, dVar3);
                    }
                } else {
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle", obj4);
                    obj4 = x.a((p) obj4, x.f12614f, dVar3);
                }
                return AbstractC4344b.M(enumC1048g, obj4, Integer.valueOf(c1045d.f12509b), Integer.valueOf(c1045d.f12510c), c1045d.f12511d);
            case 3:
                i0.d dVar4 = (i0.d) obj;
                return Float.valueOf(((Y0.a) obj2).f22014a);
            case 4:
                i0.d dVar5 = (i0.d) obj;
                return new C3970t(((r0.r) obj2).f44265a);
            case 5:
                i0.d dVar6 = (i0.d) obj;
                return Integer.valueOf(((S0.D) obj2).f15975Y);
            case 6:
                i0.d dVar7 = (i0.d) obj;
                List list2 = ((U0.d) obj2).f17383Y;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i10 < size2) {
                    arrayList2.add(x.a((U0.c) list2.get(i10), x.f12627s, dVar7));
                    i10++;
                }
                return arrayList2;
            case 7:
                i0.d dVar8 = (i0.d) obj;
                return ((U0.a) ((U0.c) obj2).f17382a).f17378a.toLanguageTag();
            case 8:
                i0.d dVar9 = (i0.d) obj;
                long j6 = ((C5251c) obj2).f43623a;
                if (C5251c.b(j6, C5251c.f43621d)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(C5251c.d(j6));
                i0.r rVar4 = x.f12609a;
                return AbstractC4344b.M(valueOf, Float.valueOf(C5251c.e(j6)));
            case 9:
                i0.d dVar10 = (i0.d) obj;
                p pVar = (p) obj2;
                Y0.i iVar = new Y0.i(pVar.f12549a);
                i0.r rVar5 = x.f12609a;
                Y0.k kVar = new Y0.k(pVar.f12550b);
                Object a5 = x.a(new Z0.n(pVar.f12551c), x.f12624p, dVar10);
                Y0.q qVar = Y0.q.f22042c;
                return AbstractC4344b.M(iVar, kVar, a5, x.a(pVar.f12552d, x.f12618j, dVar10));
            case 10:
                i0.d dVar11 = (i0.d) obj;
                K k10 = (K) obj2;
                return AbstractC4344b.M(x.a(new r0.r(k10.f44203a), x.f12623o, dVar11), x.a(new C5251c(k10.f44204b), x.f12625q, dVar11), Float.valueOf(k10.f44205c));
            case 11:
                i0.d dVar12 = (i0.d) obj;
                y yVar = (y) obj2;
                r0.r rVar6 = new r0.r(yVar.f12628a.b());
                i0.r rVar7 = x.f12623o;
                Object a10 = x.a(rVar6, rVar7, dVar12);
                Z0.n nVar = new Z0.n(yVar.f12629b);
                i0.r rVar8 = x.f12624p;
                Object a11 = x.a(nVar, rVar8, dVar12);
                S0.D d10 = S0.D.f15968Z;
                Object a12 = x.a(yVar.f12630c, x.f12619k, dVar12);
                Object a13 = x.a(new Z0.n(yVar.f12635h), rVar8, dVar12);
                Object a14 = x.a(yVar.f12636i, x.f12620l, dVar12);
                Object a15 = x.a(yVar.f12637j, x.f12617i, dVar12);
                Object a16 = x.a(yVar.f12638k, x.f12626r, dVar12);
                Object a17 = x.a(new r0.r(yVar.f12639l), rVar7, dVar12);
                Object a18 = x.a(yVar.f12640m, x.f12616h, dVar12);
                K k11 = K.f44202d;
                return AbstractC4344b.M(a10, a11, a12, yVar.f12631d, yVar.f12632e, -1, yVar.f12634g, a13, a14, a15, a16, a17, a18, x.a(yVar.f12641n, x.f12622n, dVar12));
            case 12:
                i0.d dVar13 = (i0.d) obj;
                return Integer.valueOf(((Y0.j) obj2).f22034a);
            case 13:
                i0.d dVar14 = (i0.d) obj;
                Y0.p pVar2 = (Y0.p) obj2;
                return AbstractC4344b.M(Float.valueOf(pVar2.f22040a), Float.valueOf(pVar2.f22041b));
            case 14:
                i0.d dVar15 = (i0.d) obj;
                Y0.q qVar2 = (Y0.q) obj2;
                Z0.n nVar2 = new Z0.n(qVar2.f22043a);
                i0.r rVar9 = x.f12624p;
                return AbstractC4344b.M(x.a(nVar2, rVar9, dVar15), x.a(new Z0.n(qVar2.f22044b), rVar9, dVar15));
            case 15:
                i0.d dVar16 = (i0.d) obj;
                long j10 = ((D) obj2).f12485a;
                int i11 = D.f12484c;
                Integer valueOf2 = Integer.valueOf((int) (j10 >> 32));
                i0.r rVar10 = x.f12609a;
                return AbstractC4344b.M(valueOf2, Integer.valueOf((int) (j10 & 4294967295L)));
            case 16:
                i0.d dVar17 = (i0.d) obj;
                long j11 = ((Z0.n) obj2).f22811a;
                Float valueOf3 = Float.valueOf(Z0.n.c(j11));
                i0.r rVar11 = x.f12609a;
                return AbstractC4344b.M(valueOf3, new Z0.o(Z0.n.b(j11)));
            case 17:
                i0.d dVar18 = (i0.d) obj;
                String str2 = ((G) obj2).f12490a;
                i0.r rVar12 = x.f12609a;
                return str2;
            default:
                i0.d dVar19 = (i0.d) obj;
                String str3 = ((H) obj2).f12491a;
                i0.r rVar13 = x.f12609a;
                return str3;
        }
    }
}
