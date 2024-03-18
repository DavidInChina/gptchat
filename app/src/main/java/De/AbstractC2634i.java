package de;

import E.g0;
import E.i0;
import H0.AbstractC0701r0;
import M3.H;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import Z.r;
import ee.q;
import id.AbstractC3557B;
import java.util.ArrayList;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import y.AbstractC6463a;
import y.C6468f;
import z.C6686a;

/* renamed from: de.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2634i {

    /* renamed from: a  reason: collision with root package name */
    public static final float f28237a = 96;

    /* renamed from: b  reason: collision with root package name */
    public static final float f28238b = 48;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC4326r abstractC4326r, o oVar, C2635j c2635j, AbstractC2630e abstractC2630e, g0 g0Var, n nVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i13;
        Object obj6;
        n nVar2;
        g0 g0Var2;
        AbstractC2630e abstractC2630e2;
        C2635j c2635j2;
        o oVar2;
        AbstractC4326r abstractC4326r2;
        int i14;
        o oVar3;
        Object obj7;
        Object obj8;
        n nVar3;
        Object obj9;
        q qVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC3557B.c0("content", kVar);
        r rVar = (r) abstractC1725n;
        rVar.X(-1347423246);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            obj = abstractC4326r;
        } else if ((i10 & 14) == 0) {
            obj = abstractC4326r;
            if (rVar.g(obj)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            obj = abstractC4326r;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                obj2 = oVar;
                if (rVar.g(obj2)) {
                    i20 = 32;
                    i12 |= i20;
                }
            } else {
                obj2 = oVar;
            }
            i20 = 16;
            i12 |= i20;
        } else {
            obj2 = oVar;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                obj3 = c2635j;
                if (rVar.g(obj3)) {
                    i19 = 256;
                    i12 |= i19;
                }
            } else {
                obj3 = c2635j;
            }
            i19 = 128;
            i12 |= i19;
        } else {
            obj3 = c2635j;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                obj4 = abstractC2630e;
                if (rVar.g(obj4)) {
                    i18 = 2048;
                    i12 |= i18;
                }
            } else {
                obj4 = abstractC2630e;
            }
            i18 = 1024;
            i12 |= i18;
        } else {
            obj4 = abstractC2630e;
        }
        int i23 = i11 & 16;
        if (i23 != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            obj5 = g0Var;
            if (rVar.g(obj5)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
            i13 = i11 & 32;
            if (i13 == 0) {
                i12 |= 196608;
            } else if ((458752 & i10) == 0) {
                obj6 = nVar;
                if (rVar.g(obj6)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
                if ((i11 & 64) != 0) {
                    i15 = 1572864;
                } else {
                    if ((3670016 & i10) == 0) {
                        if (rVar.i(kVar)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                    }
                    if ((2995931 & i12) != 599186 && rVar.B()) {
                        rVar.P();
                        abstractC4326r2 = obj;
                        oVar2 = obj2;
                        c2635j2 = obj3;
                        abstractC2630e2 = obj4;
                        g0Var2 = obj5;
                        nVar2 = obj6;
                    } else {
                        rVar.R();
                        i14 = i10 & 1;
                        Object obj10 = C1723m.f22654Y;
                        if (i14 == 0 && !rVar.A()) {
                            rVar.P();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            abstractC4326r2 = obj;
                            oVar3 = obj2;
                            obj8 = obj5;
                        } else {
                            if (i22 == 0) {
                                abstractC4326r2 = C4323o.f37719b;
                            } else {
                                abstractC4326r2 = obj;
                            }
                            if ((i11 & 2) == 0) {
                                rVar.W(2086301451);
                                p pVar = p.f28252Y;
                                rVar.W(-492369756);
                                Object K10 = rVar.K();
                                if (K10 == obj10) {
                                    K10 = new o(pVar);
                                    rVar.h0(K10);
                                }
                                rVar.t(false);
                                oVar3 = (o) K10;
                                rVar.t(false);
                                i12 &= -113;
                            } else {
                                oVar3 = obj2;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                                obj3 = Ad.l.P0(0, 0);
                            }
                            obj4 = obj4;
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                obj4 = new C2629d(C2628c.f28218Z, C2628c.f28219h0);
                            }
                            if (i23 == 0) {
                                float f6 = 0;
                                obj7 = new i0(f6, f6, f6, f6);
                            } else {
                                obj7 = obj5;
                            }
                            if (i13 == 0) {
                                nVar3 = n.f28246Y;
                                obj8 = obj7;
                                Object obj11 = obj4;
                                int i24 = i12;
                                obj9 = obj11;
                                rVar.u();
                                m mVar = new m();
                                kVar.invoke(mVar);
                                Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                                ?? obj12 = new Object();
                                ?? obj13 = new Object();
                                E9.f.k(mVar.f28245b, new Oc.c(obj12, 7, obj13));
                                Integer valueOf = Integer.valueOf(obj12.f37647Y);
                                Integer valueOf2 = Integer.valueOf(obj13.f37647Y);
                                int intValue = valueOf.intValue();
                                int intValue2 = valueOf2.intValue();
                                AbstractC3557B.c0("<this>", obj9);
                                AbstractC3557B.c0("density", bVar);
                                if (!(obj9 instanceof C2629d)) {
                                    ArrayList arrayList = new ArrayList(intValue);
                                    int i25 = 0;
                                    while (i25 < intValue) {
                                        arrayList.add(Float.valueOf(bVar.R(((Z0.e) ((C2629d) obj9).f28222a.invoke(Integer.valueOf(i25))).f22788Y)));
                                        i25++;
                                        intValue = intValue;
                                        obj8 = obj8;
                                    }
                                    g0 g0Var3 = obj8;
                                    ArrayList arrayList2 = new ArrayList(intValue2);
                                    int i26 = 0;
                                    while (i26 < intValue2) {
                                        arrayList2.add(Float.valueOf(bVar.R(((Z0.e) ((C2629d) obj9).f28223b.invoke(Integer.valueOf(i26))).f22788Y)));
                                        i26++;
                                        obj9 = obj9;
                                    }
                                    Object obj14 = obj9;
                                    l lVar = new l(arrayList, arrayList2);
                                    rVar.W(-492369756);
                                    Object K11 = rVar.K();
                                    if (K11 == obj10) {
                                        K11 = AbstractC4828h.Z(Float.valueOf(0.0f), o1.f22665a);
                                        rVar.h0(K11);
                                    }
                                    rVar.t(false);
                                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K11;
                                    oVar3.getClass();
                                    oVar3.f28249b = lVar;
                                    AbstractC3557B.c0("<set-?>", obj3);
                                    oVar3.f28250c = obj3;
                                    AbstractC3557B.c0("<this>", nVar3);
                                    int ordinal = nVar3.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal != 1) {
                                            if (ordinal == 2) {
                                                qVar = q.f29340h0;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            qVar = q.f29339Z;
                                        }
                                    } else {
                                        qVar = q.f29338Y;
                                    }
                                    q qVar2 = qVar;
                                    rVar.W(-208451227);
                                    boolean g10 = rVar.g(abstractC1710f0);
                                    Object K12 = rVar.K();
                                    if (g10 || K12 == obj10) {
                                        K12 = AbstractC6463a.h(abstractC1710f0, 19, rVar);
                                    }
                                    rVar.t(false);
                                    H.f(androidx.compose.ui.layout.a.k(abstractC4326r2, (wf.k) K12), oVar3.f28251d, g0Var3, qVar2, new C6686a(abstractC1710f0, lVar, mVar, obj3, 17), rVar, (i24 >> 6) & 896, 0);
                                    oVar2 = oVar3;
                                    c2635j2 = obj3;
                                    abstractC2630e2 = obj14;
                                    nVar2 = nVar3;
                                    g0Var2 = g0Var3;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                obj8 = obj7;
                            }
                        }
                        nVar3 = obj6;
                        Object obj112 = obj4;
                        int i242 = i12;
                        obj9 = obj112;
                        rVar.u();
                        m mVar2 = new m();
                        kVar.invoke(mVar2);
                        Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                        ?? obj122 = new Object();
                        ?? obj132 = new Object();
                        E9.f.k(mVar2.f28245b, new Oc.c(obj122, 7, obj132));
                        Integer valueOf3 = Integer.valueOf(obj122.f37647Y);
                        Integer valueOf22 = Integer.valueOf(obj132.f37647Y);
                        int intValue3 = valueOf3.intValue();
                        int intValue22 = valueOf22.intValue();
                        AbstractC3557B.c0("<this>", obj9);
                        AbstractC3557B.c0("density", bVar2);
                        if (!(obj9 instanceof C2629d)) {
                        }
                    }
                    C1741v0 v10 = rVar.v();
                    if (v10 != null) {
                        v10.f22739d = new C6468f(abstractC4326r2, oVar2, c2635j2, abstractC2630e2, g0Var2, nVar2, kVar, i10, i11);
                        return;
                    }
                    return;
                }
                i12 |= i15;
                if ((2995931 & i12) != 599186) {
                }
                rVar.R();
                i14 = i10 & 1;
                Object obj102 = C1723m.f22654Y;
                if (i14 == 0) {
                }
                if (i22 == 0) {
                }
                if ((i11 & 2) == 0) {
                }
                if ((i11 & 4) != 0) {
                }
                obj4 = obj4;
                if ((i11 & 8) != 0) {
                }
                if (i23 == 0) {
                }
                if (i13 == 0) {
                }
            }
            obj6 = nVar;
            if ((i11 & 64) != 0) {
            }
            i12 |= i15;
            if ((2995931 & i12) != 599186) {
            }
            rVar.R();
            i14 = i10 & 1;
            Object obj1022 = C1723m.f22654Y;
            if (i14 == 0) {
            }
            if (i22 == 0) {
            }
            if ((i11 & 2) == 0) {
            }
            if ((i11 & 4) != 0) {
            }
            obj4 = obj4;
            if ((i11 & 8) != 0) {
            }
            if (i23 == 0) {
            }
            if (i13 == 0) {
            }
        }
        obj5 = g0Var;
        i13 = i11 & 32;
        if (i13 == 0) {
        }
        obj6 = nVar;
        if ((i11 & 64) != 0) {
        }
        i12 |= i15;
        if ((2995931 & i12) != 599186) {
        }
        rVar.R();
        i14 = i10 & 1;
        Object obj10222 = C1723m.f22654Y;
        if (i14 == 0) {
        }
        if (i22 == 0) {
        }
        if ((i11 & 2) == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        obj4 = obj4;
        if ((i11 & 8) != 0) {
        }
        if (i23 == 0) {
        }
        if (i13 == 0) {
        }
    }
}
