package re;

import Fe.g;
import Kg.m;
import Kg.p;
import Ng.F;
import Ng.H;
import Pg.C;
import Pg.z;
import Q1.u;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.C1212o;
import Qg.C1213p;
import Qg.C1215s;
import Rg.AbstractC1282c;
import Ug.h;
import Ug.i;
import Z0.j;
import com.google.android.gms.internal.play_billing.N;
import e9.C2814g;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import jf.y;
import kh.l;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.B;
import lh.AbstractC4471A;
import lh.C4481K;
import lh.q;
import lh.r;
import lh.s;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5254f;
import rb.C5426p;
import ve.AbstractC6034c;
import wf.k;
import wf.o;
import z.AbstractC6708l;

/* renamed from: re.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5487e extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44970Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f44971Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f44972h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44973i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f44974j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f44975k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f44976l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f44977m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5487e(Object obj, Object obj2, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f44970Y = i10;
        this.f44976l0 = obj;
        this.f44977m0 = obj2;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = y.f36177a;
        int i10 = this.f44970Y;
        Object obj4 = this.f44977m0;
        Object obj5 = this.f44976l0;
        switch (i10) {
            case 0:
                C5487e c5487e = new C5487e((C5488f) obj5, (ge.d) obj4, (AbstractC4825e) obj3, 0);
                c5487e.f44974j0 = (Ie.e) obj;
                c5487e.f44975k0 = (AbstractC6034c) obj2;
                return c5487e.invokeSuspend(yVar);
            case 1:
                C5487e c5487e2 = new C5487e((k) obj5, (AbstractC1206i) obj4, (AbstractC4825e) obj3, 1);
                c5487e2.f44974j0 = (F) obj;
                c5487e2.f44975k0 = (AbstractC1207j) obj2;
                return c5487e2.invokeSuspend(yVar);
            default:
                C5487e c5487e3 = new C5487e((AbstractC4825e) obj3, (AbstractC4471A) this.f44974j0, (AbstractC1206i) this.f44975k0, (q) obj5, (l) obj4);
                c5487e3.f44971Z = (AbstractC1207j) obj;
                c5487e3.f44972h0 = obj2;
                return c5487e3.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0313  */
    /* JADX WARN: Type inference failed for: r8v12, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0310 -> B:58:0x0219). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C4832l c4832l;
        Ie.e eVar;
        AbstractC6034c abstractC6034c;
        AbstractC6034c abstractC6034c2;
        F f6;
        A a5;
        AbstractC1207j abstractC1207j;
        C c10;
        B b10;
        B b11;
        C c11;
        Ug.f fVar;
        Object obj2;
        A a10;
        Object obj3;
        y yVar;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        y yVar2 = y.f36177a;
        int i14 = this.f44970Y;
        Object obj4 = this.f44977m0;
        Object obj5 = this.f44976l0;
        switch (i14) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i15 = this.f44973i0;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f6 = (F) this.f44972h0;
                        abstractC6034c2 = (AbstractC6034c) this.f44971Z;
                        abstractC6034c = (AbstractC6034c) this.f44975k0;
                        eVar = (Ie.e) this.f44974j0;
                        N.B0(obj);
                        c4832l = obj;
                        Ad.l.O0(f6, c4832l, null, new C5486d(abstractC6034c2, (C5488f) obj5, null), 2);
                        this.f44974j0 = null;
                        this.f44975k0 = null;
                        this.f44971Z = null;
                        this.f44972h0 = null;
                        this.f44973i0 = 2;
                        if (eVar.d(abstractC6034c, this) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                } else {
                    N.B0(obj);
                    eVar = (Ie.e) this.f44974j0;
                    AbstractC6034c abstractC6034c3 = (AbstractC6034c) this.f44975k0;
                    k kVar = ((C5488f) obj5).f44980b;
                    if (kVar == null || ((Boolean) kVar.invoke(abstractC6034c3.b())).booleanValue()) {
                        x c12 = abstractC6034c3.c();
                        AbstractC3557B.c0("<this>", c12);
                        io.ktor.utils.io.internal.e eVar2 = io.ktor.utils.io.internal.f.f33454c;
                        t tVar = new t(true, eVar2, 8);
                        t tVar2 = new t(true, eVar2, 8);
                        Ad.l.O0(abstractC6034c3, null, null, new g(c12, tVar, tVar2, null), 3).V(new Oc.c(tVar, 14, tVar2));
                        abstractC6034c = AbstractC3557B.N2(abstractC6034c3.b(), tVar2).d();
                        abstractC6034c2 = AbstractC3557B.N2(abstractC6034c3.b(), tVar).d();
                        f6 = (ge.d) obj4;
                        this.f44974j0 = eVar;
                        this.f44975k0 = abstractC6034c;
                        this.f44971Z = abstractC6034c2;
                        this.f44972h0 = f6;
                        this.f44973i0 = 1;
                        AbstractC6708l.e(getContext().get(Vg.a.f18960Y));
                        C4832l c4832l2 = C4832l.f40334Y;
                        c4832l = c4832l2;
                        if (c4832l2 == enumC5000a) {
                            return enumC5000a;
                        }
                        Ad.l.O0(f6, c4832l, null, new C5486d(abstractC6034c2, (C5488f) obj5, null), 2);
                        this.f44974j0 = null;
                        this.f44975k0 = null;
                        this.f44971Z = null;
                        this.f44972h0 = null;
                        this.f44973i0 = 2;
                        if (eVar.d(abstractC6034c, this) == enumC5000a) {
                        }
                    }
                }
                return yVar2;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i16 = this.f44973i0;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            b11 = (B) this.f44971Z;
                            c11 = (C) this.f44975k0;
                            N.B0(obj);
                            abstractC1207j = (AbstractC1207j) this.f44974j0;
                            c10 = c11;
                            b10 = b11;
                            obj3 = b10.f37622Y;
                            if (obj3 != AbstractC1282c.f15532d) {
                                ?? obj6 = new Object();
                                a5 = obj6;
                                if (obj3 != null) {
                                    k kVar2 = (k) obj5;
                                    u uVar = AbstractC1282c.f15530b;
                                    if (obj3 == uVar) {
                                        obj3 = null;
                                    }
                                    long longValue = ((Number) kVar2.invoke(obj3)).longValue();
                                    obj6.f37621Y = longValue;
                                    int i17 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                    a5 = obj6;
                                    if (i17 >= 0) {
                                        if (i17 == 0) {
                                            Object obj7 = b10.f37622Y;
                                            if (obj7 == uVar) {
                                                obj7 = null;
                                            }
                                            this.f44974j0 = abstractC1207j;
                                            this.f44975k0 = c10;
                                            this.f44971Z = b10;
                                            this.f44972h0 = obj6;
                                            this.f44973i0 = 1;
                                            if (abstractC1207j.c(obj7, this) != enumC5000a2) {
                                                a10 = obj6;
                                                b10.f37622Y = null;
                                                a5 = a10;
                                            } else {
                                                return enumC5000a2;
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
                                    }
                                }
                                b11 = b10;
                                c11 = c10;
                                AbstractC1207j abstractC1207j2 = abstractC1207j;
                                fVar = new Ug.f(getContext());
                                if (b11.f37622Y == null) {
                                    long j6 = a5.f37621Y;
                                    C1212o c1212o = new C1212o(null, b11, abstractC1207j2);
                                    Ug.b bVar = new Ug.b(j6);
                                    Ug.a aVar = Ug.a.f17852Y;
                                    Ad.l.M(3, aVar);
                                    fVar.j(new Ug.d(fVar, bVar, aVar, h.f17877Y, i.f17882e, c1212o, null), false);
                                }
                                fVar.i(c11.c(), new C1213p(null, b11, abstractC1207j2));
                                this.f44974j0 = abstractC1207j2;
                                this.f44975k0 = c11;
                                this.f44971Z = b11;
                                this.f44972h0 = null;
                                this.f44973i0 = 2;
                                if (!(Ug.f.f17871k0.get(fVar) instanceof Ug.d)) {
                                    obj2 = fVar.e(this);
                                } else {
                                    obj2 = fVar.f(this);
                                }
                                if (obj2 == enumC5000a2) {
                                    abstractC1207j = abstractC1207j2;
                                    c10 = c11;
                                    b10 = b11;
                                    obj3 = b10.f37622Y;
                                    if (obj3 != AbstractC1282c.f15532d) {
                                        return yVar2;
                                    }
                                } else {
                                    return enumC5000a2;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a10 = (A) this.f44972h0;
                        b10 = (B) this.f44971Z;
                        c10 = (C) this.f44975k0;
                        abstractC1207j = (AbstractC1207j) this.f44974j0;
                        N.B0(obj);
                        b10.f37622Y = null;
                        a5 = a10;
                        b11 = b10;
                        c11 = c10;
                        AbstractC1207j abstractC1207j22 = abstractC1207j;
                        fVar = new Ug.f(getContext());
                        if (b11.f37622Y == null) {
                        }
                        fVar.i(c11.c(), new C1213p(null, b11, abstractC1207j22));
                        this.f44974j0 = abstractC1207j22;
                        this.f44975k0 = c11;
                        this.f44971Z = b11;
                        this.f44972h0 = null;
                        this.f44973i0 = 2;
                        if (!(Ug.f.f17871k0.get(fVar) instanceof Ug.d)) {
                        }
                        if (obj2 == enumC5000a2) {
                        }
                    }
                } else {
                    N.B0(obj);
                    z s12 = A7.b.s1((F) this.f44974j0, 0, new C1215s((AbstractC1206i) obj4, null), 3);
                    abstractC1207j = (AbstractC1207j) this.f44975k0;
                    b10 = new Object();
                    c10 = s12;
                    obj3 = b10.f37622Y;
                    if (obj3 != AbstractC1282c.f15532d) {
                    }
                }
            default:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                int i18 = this.f44973i0;
                if (i18 != 0) {
                    if (i18 == 1) {
                        N.B0(obj);
                        yVar = yVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    AbstractC1207j abstractC1207j3 = (AbstractC1207j) this.f44971Z;
                    long j10 = ((Z0.k) this.f44972h0).f22804a;
                    long d10 = ((AbstractC4471A) this.f44974j0).d();
                    int i19 = (int) (j10 >> 32);
                    int i20 = (int) (j10 & 4294967295L);
                    long c13 = H.c(i19 / 2, i20 / 2);
                    if (Ad.l.w0(j10) > 0.0f) {
                        float f10 = i19;
                        int i21 = (int) (d10 >> 32);
                        int i22 = (int) (d10 & 4294967295L);
                        int W6 = Bi.c.W(Math.min(f10 / i21, i20 / i22));
                        r rVar = new r(W6, Df.H.i(Z0.i.f22797b, d10));
                        Kg.k g1 = m.g1(p.c1(new lh.t(W6), C4481K.f38454Y), 1);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = g1.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i23 = ((lh.t) next).f38507a;
                            long z12 = H.z(d10);
                            y yVar3 = yVar2;
                            float f11 = i23 / W6;
                            long i24 = AbstractC4828h.i(C5254f.d(z12) * f11, f11 * C5254f.b(z12));
                            long c14 = H.c((int) C5254f.d(i24), (int) C5254f.b(i24));
                            long j11 = d10;
                            int i25 = (int) (c13 >> 32);
                            if (i21 < i25) {
                                i10 = i25;
                            } else {
                                i10 = i21;
                            }
                            int i26 = (int) (c13 & 4294967295L);
                            if (i22 < i26) {
                                i11 = i26;
                            } else {
                                i11 = i22;
                            }
                            long c15 = H.c(i10, i11);
                            EnumC5000a enumC5000a4 = enumC5000a3;
                            AbstractC1207j abstractC1207j4 = abstractC1207j3;
                            int i27 = W6;
                            long c16 = H.c(N.p((int) (c14 >> 32), i25, (int) (c15 >> 32)), N.p((int) (c14 & 4294967295L), i26, (int) (c15 & 4294967295L)));
                            int i28 = (int) (c16 >> 32);
                            int i29 = i21 / i28;
                            int i30 = (int) (c16 & 4294967295L);
                            int i31 = i22 / i30;
                            ArrayList arrayList = new ArrayList(i29 * i31);
                            int i32 = 0;
                            while (i32 < i29) {
                                int i33 = i21;
                                int i34 = 0;
                                while (i34 < i31) {
                                    int i35 = i22;
                                    if (i32 == i29 - 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    int i36 = i29;
                                    int i37 = i31;
                                    if (i34 == i31 - 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    Iterator it2 = it;
                                    EnumC5000a enumC5000a5 = enumC5000a4;
                                    int i38 = i32 * i28;
                                    Object obj8 = obj5;
                                    int i39 = i34 * i30;
                                    if (z10) {
                                        i12 = i33;
                                    } else {
                                        i12 = (i32 + 1) * i28;
                                    }
                                    if (z11) {
                                        i13 = i35;
                                    } else {
                                        i13 = (i34 + 1) * i30;
                                    }
                                    arrayList.add(new r(i23, new j(i38, i39, i12, i13)));
                                    i34++;
                                    i22 = i35;
                                    i29 = i36;
                                    i31 = i37;
                                    it = it2;
                                    enumC5000a4 = enumC5000a5;
                                    obj5 = obj8;
                                }
                                i32++;
                                i21 = i33;
                            }
                            linkedHashMap.put(next, arrayList);
                            yVar2 = yVar3;
                            d10 = j11;
                            abstractC1207j3 = abstractC1207j4;
                            W6 = i27;
                            enumC5000a3 = enumC5000a4;
                        }
                        yVar = yVar2;
                        EnumC5000a enumC5000a6 = enumC5000a3;
                        AbstractC1207j abstractC1207j5 = abstractC1207j3;
                        q qVar = (q) obj5;
                        C2814g q02 = L4.a.q0((AbstractC1206i) this.f44975k0, L4.a.i0(new C5426p(qVar.f38502d, 25)), new kh.q(new s(rVar, linkedHashMap), qVar, j10, (AbstractC4471A) this.f44974j0, (l) obj4, null));
                        this.f44973i0 = 1;
                        if (L4.a.j0(this, q02, abstractC1207j5) == enumC5000a6) {
                            return enumC5000a6;
                        }
                    } else {
                        throw new IllegalStateException(R.a.r("Can't calculate a sample size for ", Z0.k.b(j10)).toString());
                    }
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5487e(AbstractC4825e abstractC4825e, AbstractC4471A abstractC4471A, AbstractC1206i abstractC1206i, q qVar, l lVar) {
        super(3, abstractC4825e);
        this.f44970Y = 2;
        this.f44974j0 = abstractC4471A;
        this.f44975k0 = abstractC1206i;
        this.f44976l0 = qVar;
        this.f44977m0 = lVar;
    }
}
