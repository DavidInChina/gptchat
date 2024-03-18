package N;

import Ng.AbstractC1073l0;
import Ng.D0;
import Qg.AbstractC1207j;
import Qg.F0;
import Z.l1;
import aa.C1939b;
import aa.EnumC1938a;
import ca.C2325q;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import lh.C4489h;
import lh.C4491j;
import nd.C4812a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5251c;
import rb.C5413c;
import rb.C5436z;
import rc.C5452a;
import rc.C5470t;
import rc.C5472v;
import rd.AbstractC5482f;
import rd.C5480d;
import wd.C6168C;
import wd.C6189g;
import wd.C6195j;
import wd.C6205s;
import wd.EnumC6181c;
import xc.C6392a;
import xc.C6395d;
import z.AbstractC6657D;
import z.C6694e;
import z.C6735y0;

/* loaded from: classes.dex */
public final class W implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12262Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f12263Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f12264h0;

    public /* synthetic */ W(Object obj, int i10, Object obj2) {
        this.f12262Y = i10;
        this.f12264h0 = obj;
        this.f12263Z = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i10, AbstractC4825e abstractC4825e) {
        Qg.y0 y0Var;
        int i11;
        if (abstractC4825e instanceof Qg.y0) {
            y0Var = (Qg.y0) abstractC4825e;
            int i12 = y0Var.f14953h0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                y0Var.f14953h0 = i12 - Integer.MIN_VALUE;
                Object obj = y0Var.f14951Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = y0Var.f14953h0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (i10 > 0) {
                        Object obj2 = this.f12264h0;
                        if (!((kotlin.jvm.internal.x) obj2).f37645Y) {
                            ((kotlin.jvm.internal.x) obj2).f37645Y = true;
                            Qg.u0 u0Var = Qg.u0.f14928Y;
                            y0Var.f14953h0 = 1;
                            if (((AbstractC1207j) this.f12263Z).c(u0Var, y0Var) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                    }
                }
                return yVar;
            }
        }
        y0Var = new Qg.y0(this, abstractC4825e);
        Object obj3 = y0Var.f14951Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = y0Var.f14953h0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        return yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
        if (r1 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0164, code lost:
        if (r2 == r6) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020a  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v29, types: [nf.k, Ng.G, nf.e] */
    /* JADX WARN: Type inference failed for: r8v31 */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        float f6;
        Ia.i iVar;
        int i10;
        C5413c c5413c;
        int i11;
        ha.M m10;
        ha.X x10;
        C5452a c5452a;
        int i12;
        C4812a c4812a;
        C5470t c5470t;
        int i13;
        String str;
        rc.a0 a0Var;
        int i14;
        Boolean bool;
        boolean z10;
        C6392a c6392a;
        int i15;
        boolean z11;
        Set set;
        C6395d c6395d;
        int i16;
        String str2;
        C5480d c5480d;
        int i17;
        Object obj2;
        Dd.V v10;
        EnumC5000a enumC5000a;
        int i18;
        AbstractC1207j abstractC1207j;
        Ed.h hVar;
        Ed.i a5;
        F0 f02;
        Object value;
        C4491j c4491j;
        AbstractC1073l0 abstractC1073l0;
        jf.y yVar = jf.y.f36177a;
        int i19 = 3;
        int i20 = this.f12262Y;
        ?? r82 = 0;
        Object obj3 = this.f12263Z;
        Object obj4 = this.f12264h0;
        switch (i20) {
            case 0:
                long j6 = ((C5251c) obj).f43623a;
                C6694e c6694e = (C6694e) obj4;
                if (R4.b.z1(((C5251c) c6694e.e()).f43623a) && R4.b.z1(j6) && C5251c.e(((C5251c) c6694e.e()).f43623a) != C5251c.e(j6)) {
                    Ad.l.O0((Ng.F) obj3, null, null, new V(c6694e, j6, null), 3);
                    return yVar;
                }
                Object f10 = c6694e.f(new C5251c(j6), abstractC4825e);
                if (f10 == EnumC5000a.f41328Y) {
                    return f10;
                }
                return yVar;
            case 1:
                D.k kVar = (D.k) obj;
                if (kVar instanceof D.p) {
                    ((V.u) obj4).e((D.p) kVar, (Ng.F) obj3);
                } else if (kVar instanceof D.q) {
                    ((V.u) obj4).g(((D.q) kVar).f3193a);
                } else if (kVar instanceof D.o) {
                    ((V.u) obj4).g(((D.o) kVar).f3191a);
                } else {
                    Ng.F f11 = (Ng.F) obj3;
                    V.B b10 = ((V.u) obj4).f17979Y;
                    b10.getClass();
                    boolean z12 = kVar instanceof D.h;
                    Object obj5 = b10.f17897d;
                    if (z12) {
                        ((List) obj5).add(kVar);
                    } else if (kVar instanceof D.i) {
                        ((List) obj5).remove(((D.i) kVar).f3185a);
                    } else if (kVar instanceof D.d) {
                        ((List) obj5).add(kVar);
                    } else if (kVar instanceof D.e) {
                        ((List) obj5).remove(((D.e) kVar).f3178a);
                    } else if (kVar instanceof D.b) {
                        ((List) obj5).add(kVar);
                    } else if (kVar instanceof D.c) {
                        ((List) obj5).remove(((D.c) kVar).f3177a);
                    } else if (kVar instanceof D.a) {
                        ((List) obj5).remove(((D.a) kVar).f3176a);
                    }
                    D.k kVar2 = (D.k) kf.t.p2((List) obj5);
                    if (!AbstractC3557B.K((D.k) b10.f17898e, kVar2)) {
                        if (kVar2 != null) {
                            Object obj6 = b10.f17895b;
                            if (z12) {
                                f6 = ((V.h) ((l1) obj6).getValue()).f17934c;
                            } else if (kVar instanceof D.d) {
                                f6 = ((V.h) ((l1) obj6).getValue()).f17933b;
                            } else if (kVar instanceof D.b) {
                                f6 = ((V.h) ((l1) obj6).getValue()).f17932a;
                            } else {
                                f6 = 0.0f;
                            }
                            C6735y0 c6735y0 = V.v.f17980a;
                            boolean z13 = kVar2 instanceof D.h;
                            C6735y0 c6735y02 = V.v.f17980a;
                            if (!z13) {
                                if (kVar2 instanceof D.d) {
                                    c6735y02 = new C6735y0(45, AbstractC6657D.f51128d, 2);
                                } else if (kVar2 instanceof D.b) {
                                    c6735y02 = new C6735y0(45, AbstractC6657D.f51128d, 2);
                                }
                            }
                            Ad.l.O0(f11, null, null, new V.z(b10, f6, c6735y02, null), 3);
                        } else {
                            D.k kVar3 = (D.k) b10.f17898e;
                            C6735y0 c6735y03 = V.v.f17980a;
                            boolean z14 = kVar3 instanceof D.h;
                            C6735y0 c6735y04 = V.v.f17980a;
                            if (!z14 && !(kVar3 instanceof D.d) && (kVar3 instanceof D.b)) {
                                c6735y04 = new C6735y0(150, AbstractC6657D.f51128d, 2);
                            }
                            Ad.l.O0(f11, null, null, new V.A(b10, c6735y04, null), 3);
                        }
                        b10.f17898e = kVar2;
                    }
                }
                return yVar;
            case 2:
                ((Q3.e) obj4).e((U3.q) obj3, (Q3.c) obj);
                return yVar;
            case 3:
                Object c10 = ((AbstractC1207j) obj4).c(((wf.k) obj3).invoke(obj), abstractC4825e);
                if (c10 == EnumC5000a.f41328Y) {
                    return c10;
                }
                return yVar;
            case 4:
                if (abstractC4825e instanceof Ia.i) {
                    iVar = (Ia.i) abstractC4825e;
                    int i21 = iVar.f8512Z;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        iVar.f8512Z = i21 - Integer.MIN_VALUE;
                        Object obj7 = iVar.f8511Y;
                        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                        i10 = iVar.f8512Z;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj7);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj7);
                        Object obj8 = ((Map) obj).get(new C6168C((String) obj3));
                        iVar.f8512Z = 1;
                        if (((AbstractC1207j) obj4).c(obj8, iVar) == enumC5000a2) {
                            return enumC5000a2;
                        }
                        return yVar;
                    }
                }
                iVar = new Ia.i(this, abstractC4825e);
                Object obj72 = iVar.f8511Y;
                EnumC5000a enumC5000a22 = EnumC5000a.f41328Y;
                i10 = iVar.f8512Z;
                if (i10 == 0) {
                }
            case 5:
                Jc.B b11 = (Jc.B) obj;
                if (b11 instanceof Jc.A) {
                    Object c11 = ((AbstractC1207j) obj4).c(new Ic.f(((Jc.A) b11).f9037a), abstractC4825e);
                    if (c11 == EnumC5000a.f41328Y) {
                        return c11;
                    }
                    return yVar;
                } else if (b11 instanceof Jc.z) {
                    ((kotlin.jvm.internal.B) obj3).f37622Y = ((Jc.z) b11).f9078a;
                    return yVar;
                } else {
                    return yVar;
                }
            case 6:
                if (abstractC4825e instanceof C5413c) {
                    c5413c = (C5413c) abstractC4825e;
                    int i22 = c5413c.f44673Z;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        c5413c.f44673Z = i22 - Integer.MIN_VALUE;
                        Object obj9 = c5413c.f44672Y;
                        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                        i11 = c5413c.f44673Z;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj9);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj9);
                        AbstractC1207j abstractC1207j2 = (AbstractC1207j) obj4;
                        C3959i c3959i = (C3959i) obj;
                        C2325q c2325q = (C2325q) c3959i.f36155Y;
                        C2969F c2969f = (C2969F) c3959i.f36156Z;
                        if (c2325q != null) {
                            C5436z c5436z = (C5436z) obj3;
                            if (!Lg.n.n2((String) c5436z.f44772e.getValue())) {
                                C1939b c1939b = c2325q.f26412g;
                                if (AbstractC3557B.K(c1939b.f24021a.f32018b, (String) c5436z.f44772e.getValue())) {
                                    if (c1939b.f24023c == EnumC1938a.f24019i0) {
                                        if (c2969f != null && (x10 = c2969f.f30021n) != null) {
                                            m10 = x10.f32047d;
                                        } else {
                                            m10 = null;
                                        }
                                        if (m10 != null) {
                                            c5413c.f44673Z = 1;
                                            if (abstractC1207j2.c(obj, c5413c) == enumC5000a3) {
                                                return enumC5000a3;
                                            }
                                            return yVar;
                                        }
                                        return yVar;
                                    }
                                    return yVar;
                                }
                                return yVar;
                            }
                            return yVar;
                        }
                        return yVar;
                    }
                }
                c5413c = new C5413c(this, abstractC4825e);
                Object obj92 = c5413c.f44672Y;
                EnumC5000a enumC5000a32 = EnumC5000a.f41328Y;
                i11 = c5413c.f44673Z;
                if (i11 == 0) {
                }
                break;
            case 7:
                if (abstractC4825e instanceof C5452a) {
                    c5452a = (C5452a) abstractC4825e;
                    int i23 = c5452a.f44838Z;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c5452a.f44838Z = i23 - Integer.MIN_VALUE;
                        Object obj10 = c5452a.f44837Y;
                        EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                        i12 = c5452a.f44838Z;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj10);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj10);
                        AbstractC1207j abstractC1207j3 = (AbstractC1207j) obj4;
                        xd.e eVar = (xd.e) obj;
                        if (eVar != null) {
                            c4812a = new C4812a((nd.h) obj3, eVar.b(), eVar.f49809a);
                        } else {
                            c4812a = null;
                        }
                        c5452a.f44838Z = 1;
                        if (abstractC1207j3.c(c4812a, c5452a) == enumC5000a4) {
                            return enumC5000a4;
                        }
                        return yVar;
                    }
                }
                c5452a = new C5452a(this, abstractC4825e);
                Object obj102 = c5452a.f44837Y;
                EnumC5000a enumC5000a42 = EnumC5000a.f41328Y;
                i12 = c5452a.f44838Z;
                if (i12 == 0) {
                }
            case 8:
                if (abstractC4825e instanceof C5470t) {
                    c5470t = (C5470t) abstractC4825e;
                    int i24 = c5470t.f44926Z;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c5470t.f44926Z = i24 - Integer.MIN_VALUE;
                        Object obj11 = c5470t.f44925Y;
                        EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                        i13 = c5470t.f44926Z;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj11);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj11);
                        AbstractC1207j abstractC1207j4 = (AbstractC1207j) obj4;
                        xd.e eVar2 = (xd.e) obj;
                        C6195j c6195j = (C6195j) ((C5472v) obj3).f44938h.getValue();
                        if (c6195j != null) {
                            str = c6195j.f48426a;
                        } else {
                            str = null;
                        }
                        xd.e c12 = eVar2.c(str);
                        c5470t.f44926Z = 1;
                        if (abstractC1207j4.c(c12, c5470t) == enumC5000a5) {
                            return enumC5000a5;
                        }
                        return yVar;
                    }
                }
                c5470t = new C5470t(this, abstractC4825e);
                Object obj112 = c5470t.f44925Y;
                EnumC5000a enumC5000a52 = EnumC5000a.f41328Y;
                i13 = c5470t.f44926Z;
                if (i13 == 0) {
                }
            case 9:
                if (abstractC4825e instanceof rc.a0) {
                    a0Var = (rc.a0) abstractC4825e;
                    int i25 = a0Var.f44841Z;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        a0Var.f44841Z = i25 - Integer.MIN_VALUE;
                        Object obj12 = a0Var.f44840Y;
                        EnumC5000a enumC5000a6 = EnumC5000a.f41328Y;
                        i14 = a0Var.f44841Z;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj12);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj12);
                        AbstractC1207j abstractC1207j5 = (AbstractC1207j) obj4;
                        rc.Z z15 = (rc.Z) ((Map) obj).get((zd.k) obj3);
                        if (z15 == null) {
                            bool = Boolean.FALSE;
                        } else {
                            if (z15.f44834a && !z15.f44835b && !z15.f44836c) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool = Boolean.valueOf(z10);
                        }
                        a0Var.f44841Z = 1;
                        if (abstractC1207j5.c(bool, a0Var) == enumC5000a6) {
                            return enumC5000a6;
                        }
                        return yVar;
                    }
                }
                a0Var = new rc.a0(this, abstractC4825e);
                Object obj122 = a0Var.f44840Y;
                EnumC5000a enumC5000a62 = EnumC5000a.f41328Y;
                i14 = a0Var.f44841Z;
                if (i14 == 0) {
                }
                break;
            case 10:
                if (abstractC4825e instanceof C6392a) {
                    c6392a = (C6392a) abstractC4825e;
                    int i26 = c6392a.f49788Z;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        c6392a.f49788Z = i26 - Integer.MIN_VALUE;
                        Object obj13 = c6392a.f49787Y;
                        EnumC5000a enumC5000a7 = EnumC5000a.f41328Y;
                        i15 = c6392a.f49788Z;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj13);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj13);
                        AbstractC1207j abstractC1207j6 = (AbstractC1207j) obj4;
                        C6189g c6189g = ((C6205s) obj).f48457a;
                        if (c6189g != null && (set = c6189g.f48415f) != null) {
                            z11 = set.contains((EnumC6181c) obj3);
                        } else {
                            z11 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z11);
                        c6392a.f49788Z = 1;
                        if (abstractC1207j6.c(valueOf, c6392a) == enumC5000a7) {
                            return enumC5000a7;
                        }
                        return yVar;
                    }
                }
                c6392a = new C6392a(this, abstractC4825e);
                Object obj132 = c6392a.f49787Y;
                EnumC5000a enumC5000a72 = EnumC5000a.f41328Y;
                i15 = c6392a.f49788Z;
                if (i15 == 0) {
                }
                break;
            case 11:
                if (abstractC4825e instanceof C6395d) {
                    c6395d = (C6395d) abstractC4825e;
                    int i27 = c6395d.f49798Z;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c6395d.f49798Z = i27 - Integer.MIN_VALUE;
                        Object obj14 = c6395d.f49797Y;
                        EnumC5000a enumC5000a8 = EnumC5000a.f41328Y;
                        i16 = c6395d.f49798Z;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj14);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj14);
                        AbstractC1207j abstractC1207j7 = (AbstractC1207j) obj4;
                        C6205s c6205s = (C6205s) obj;
                        String a10 = c6205s.a();
                        if (a10 == null) {
                            str2 = null;
                        } else {
                            str2 = a10;
                        }
                        C4812a c4812a2 = (C4812a) obj3;
                        if (AbstractC3557B.K(str2, c4812a2.f40276c) && AbstractC3557B.K(c6205s.f48458b.f48352a, c4812a2.f40277d)) {
                            c6395d.f49798Z = 1;
                            if (abstractC1207j7.c(obj, c6395d) == enumC5000a8) {
                                return enumC5000a8;
                            }
                            return yVar;
                        }
                        return yVar;
                    }
                }
                c6395d = new C6395d(this, abstractC4825e);
                Object obj142 = c6395d.f49797Y;
                EnumC5000a enumC5000a82 = EnumC5000a.f41328Y;
                i16 = c6395d.f49798Z;
                if (i16 == 0) {
                }
                break;
            case 12:
                if (abstractC4825e instanceof C5480d) {
                    c5480d = (C5480d) abstractC4825e;
                    int i28 = c5480d.f44951Z;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        c5480d.f44951Z = i28 - Integer.MIN_VALUE;
                        Object obj15 = c5480d.f44950Y;
                        EnumC5000a enumC5000a9 = EnumC5000a.f41328Y;
                        i17 = c5480d.f44951Z;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj15);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj15);
                        AbstractC1207j abstractC1207j8 = (AbstractC1207j) obj4;
                        P1.f fVar = AbstractC5482f.f44956f;
                        P1.b bVar = (P1.b) ((P1.h) obj);
                        bVar.getClass();
                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, fVar);
                        String str3 = (String) bVar.f13775a.get(fVar);
                        if (str3 == null || (obj2 = ((AbstractC5482f) obj3).f44957a.a(str3)) == null) {
                            obj2 = ((AbstractC5482f) obj3).f44958b;
                        }
                        c5480d.f44951Z = 1;
                        if (abstractC1207j8.c(obj2, c5480d) == enumC5000a9) {
                            return enumC5000a9;
                        }
                        return yVar;
                    }
                }
                c5480d = new C5480d(this, abstractC4825e);
                Object obj152 = c5480d.f44950Y;
                EnumC5000a enumC5000a92 = EnumC5000a.f41328Y;
                i17 = c5480d.f44951Z;
                if (i17 == 0) {
                }
                break;
            case 13:
                if (abstractC4825e instanceof Dd.V) {
                    v10 = (Dd.V) abstractC4825e;
                    int i29 = v10.f3543Z;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        v10.f3543Z = i29 - Integer.MIN_VALUE;
                        Object obj16 = v10.f3542Y;
                        enumC5000a = EnumC5000a.f41328Y;
                        i18 = v10.f3543Z;
                        if (i18 == 0) {
                            if (i18 != 1) {
                                if (i18 == 2) {
                                    com.google.android.gms.internal.play_billing.N.B0(obj16);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            hVar = v10.f3546j0;
                            abstractC1207j = v10.f3544h0;
                            com.google.android.gms.internal.play_billing.N.B0(obj16);
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj16);
                            abstractC1207j = (AbstractC1207j) obj4;
                            zd.q qVar = ((zd.g) obj).f51969e;
                            if (qVar != null) {
                                Ed.i.Companion.getClass();
                                a5 = Ed.h.c(qVar);
                                break;
                            }
                            hVar = Ed.i.Companion;
                            Lc.e eVar3 = ((Dd.W) obj3).f3548b;
                            v10.f3544h0 = abstractC1207j;
                            v10.f3546j0 = hVar;
                            v10.f3543Z = 1;
                            obj16 = eVar3.a(v10);
                            break;
                        }
                        hVar.getClass();
                        a5 = Ed.h.a((String) obj16);
                        v10.f3544h0 = null;
                        v10.f3546j0 = null;
                        v10.f3543Z = 2;
                        if (abstractC1207j.c(a5, v10) != enumC5000a) {
                            return yVar;
                        }
                        return enumC5000a;
                    }
                }
                v10 = new Dd.V(this, abstractC4825e);
                Object obj162 = v10.f3542Y;
                enumC5000a = EnumC5000a.f41328Y;
                i18 = v10.f3543Z;
                if (i18 == 0) {
                }
                hVar.getClass();
                a5 = Ed.h.a((String) obj162);
                v10.f3544h0 = null;
                v10.f3546j0 = null;
                v10.f3543Z = 2;
                if (abstractC1207j.c(a5, v10) != enumC5000a) {
                }
                return enumC5000a;
            case 14:
                return a(((Number) obj).intValue(), abstractC4825e);
            default:
                List list = (List) obj;
                lh.q qVar2 = (lh.q) obj4;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i30 = 0; i30 < size; i30++) {
                    Object obj17 = list.get(i30);
                    if (!((Map) qVar2.f38502d.getValue()).containsKey((lh.r) obj17)) {
                        arrayList.add(obj17);
                    }
                }
                Ng.F f12 = (Ng.F) obj3;
                int size2 = arrayList.size();
                int i31 = 0;
                while (i31 < size2) {
                    lh.r rVar = (lh.r) arrayList.get(i31);
                    D0 O02 = Ad.l.O0(f12, r82, r82, new C4489h(qVar2, rVar, r82), i19);
                    F0 f03 = qVar2.f38502d;
                    while (true) {
                        Object value2 = f03.getValue();
                        if (f03.e(value2, AbstractC4268D.g1((Map) value2, new C3959i(rVar, new C4491j(O02))))) {
                            break;
                        }
                    }
                    i31++;
                    i19 = 3;
                    r82 = 0;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj18 : ((Map) qVar2.f38502d.getValue()).keySet()) {
                    if (!list.contains((lh.r) obj18)) {
                        arrayList2.add(obj18);
                    }
                }
                int size3 = arrayList2.size();
                int i32 = 0;
                while (true) {
                    f02 = qVar2.f38502d;
                    if (i32 < size3) {
                        Object obj19 = ((Map) f02.getValue()).get((lh.r) arrayList2.get(i32));
                        if (obj19 instanceof C4491j) {
                            c4491j = (C4491j) obj19;
                        } else {
                            c4491j = null;
                        }
                        if (c4491j != null && (abstractC1073l0 = c4491j.f38484a) != null) {
                            abstractC1073l0.k(null);
                        }
                        i32++;
                    }
                }
                do {
                    value = f02.getValue();
                } while (!f02.e(value, AbstractC4268D.b1(kf.t.P2(arrayList2), (Map) value)));
                return yVar;
        }
    }
}
