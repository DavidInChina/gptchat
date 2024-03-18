package B;

import B0.C0194k;
import B0.C0196m;
import B0.EnumC0195l;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q0.C5251c;
import wf.AbstractC6216a;
import z.C6686a;

/* renamed from: B.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0170v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0123f0 f1534a = new C0123f0(1);

    /* renamed from: b  reason: collision with root package name */
    public static final C0123f0 f1535b = new C0123f0(2);

    /* renamed from: c  reason: collision with root package name */
    public static final C0123f0 f1536c = new C0123f0(0);

    /* renamed from: d  reason: collision with root package name */
    public static final float f1537d = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if ((!q0.C5251c.b(r9.y.Q0(r7, true), q0.C5251c.f43619b)) != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r15v9, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:21:0x005a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(long j6, B0.N n10, AbstractC4825e abstractC4825e) {
        C0126g0 c0126g0;
        int i10;
        B0.N n11;
        kotlin.jvm.internal.A a5;
        int size;
        int i11;
        Object obj;
        B0.u uVar;
        Object obj2;
        if (abstractC4825e instanceof C0126g0) {
            C0126g0 c0126g02 = (C0126g0) abstractC4825e;
            int i12 = c0126g02.f1327i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0126g02.f1327i0 = i12 - Integer.MIN_VALUE;
                c0126g0 = c0126g02;
                Object obj3 = c0126g0.f1326h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0126g0.f1327i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a5 = c0126g0.f1325Z;
                        B0.N n12 = c0126g0.f1324Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj3);
                        n11 = n12;
                        C0194k c0194k = (C0194k) obj3;
                        List list = c0194k.f1652a;
                        size = list.size();
                        int i13 = 0;
                        i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                obj = list.get(i11);
                                if (B0.t.a(((B0.u) obj).f1670a, a5.f37621Y)) {
                                    break;
                                }
                                i11++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        uVar = (B0.u) obj;
                        if (uVar == null) {
                            if (r9.y.Y(uVar)) {
                                List list2 = c0194k.f1652a;
                                int size2 = list2.size();
                                while (true) {
                                    if (i13 < size2) {
                                        obj2 = list2.get(i13);
                                        if (((B0.u) obj2).f1673d) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                B0.u uVar2 = (B0.u) obj2;
                                if (uVar2 != null) {
                                    a5.f37621Y = uVar2.f1670a;
                                    n11 = n11;
                                    c0126g0.f1324Y = n11;
                                    c0126g0.f1325Z = a5;
                                    c0126g0.f1327i0 = 1;
                                    obj3 = n11.c(EnumC0195l.f1657Z, c0126g0);
                                    if (obj3 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                }
                            } else {
                                n11 = n11;
                            }
                            C0194k c0194k2 = (C0194k) obj3;
                            List list3 = c0194k2.f1652a;
                            size = list3.size();
                            int i132 = 0;
                            i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                }
                                i11++;
                            }
                            uVar = (B0.u) obj;
                            if (uVar == null) {
                                uVar = null;
                            }
                        }
                        if (uVar == null && !uVar.b()) {
                            return uVar;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj3);
                if (i(n10.f1614j0.f1619u0, j6)) {
                    return null;
                }
                ?? obj4 = new Object();
                obj4.f37621Y = j6;
                a5 = obj4;
                n11 = n10;
                c0126g0.f1324Y = n11;
                c0126g0.f1325Z = a5;
                c0126g0.f1327i0 = 1;
                obj3 = n11.c(EnumC0195l.f1657Z, c0126g0);
                if (obj3 == enumC5000a) {
                }
                C0194k c0194k22 = (C0194k) obj3;
                List list32 = c0194k22.f1652a;
                size = list32.size();
                int i1322 = 0;
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                    }
                    i11++;
                }
                uVar = (B0.u) obj;
                if (uVar == null) {
                }
                return uVar == null ? null : null;
            }
        }
        c0126g0 = new AbstractC5156c(abstractC4825e);
        Object obj32 = c0126g0.f1326h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0126g0.f1327i0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r10v6, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r12v10, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010c -> B:44:0x0112). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0145 -> B:51:0x014a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x016e -> B:54:0x0152). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(B0.N n10, long j6, int i10, C0153p0 c0153p0, AbstractC4825e abstractC4825e) {
        C0129h0 c0129h0;
        int i11;
        float f6;
        B0.N n11;
        long j10;
        Object obj;
        C0123f0 c0123f0;
        kotlin.jvm.internal.A a5;
        wf.n nVar;
        List list;
        int size;
        int i12;
        ?? r16;
        B0.u uVar;
        Object obj2;
        List list2;
        int i13;
        C0123f0 c0123f02;
        kotlin.jvm.internal.A a10;
        C0153p0 c0153p02;
        if (abstractC4825e instanceof C0129h0) {
            C0129h0 c0129h02 = (C0129h0) abstractC4825e;
            int i14 = c0129h02.f1347n0;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0129h02.f1347n0 = i14 - Integer.MIN_VALUE;
                c0129h0 = c0129h02;
                Object obj3 = c0129h0.f1346m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c0129h0.f1347n0;
                int i15 = 1;
                B0.u uVar2 = null;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            long j11 = c0129h0.f1345l0;
                            float f10 = c0129h0.f1344k0;
                            B0.u uVar3 = c0129h0.f1343j0;
                            kotlin.jvm.internal.A a11 = c0129h0.f1342i0;
                            B0.N n12 = c0129h0.f1341h0;
                            ?? r12 = c0129h0.f1340Z;
                            ?? r13 = c0129h0.f1339Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            j10 = j11;
                            float f11 = f10;
                            char c10 = 2;
                            n11 = n12;
                            C0123f0 c0123f03 = r12;
                            C0153p0 c0153p03 = r13;
                            kotlin.jvm.internal.A a12 = a11;
                            if (!uVar3.b()) {
                                f6 = f11;
                                C0153p0 c0153p04 = c0153p03;
                                kotlin.jvm.internal.A a13 = a12;
                                C0123f0 c0123f04 = c0123f03;
                                i15 = 1;
                                C0153p0 c0153p05 = c0153p04;
                                kotlin.jvm.internal.A a14 = a13;
                                C0123f0 c0123f05 = c0123f04;
                                uVar2 = null;
                                c0153p02 = c0153p05;
                                a10 = a14;
                                c0123f02 = c0123f05;
                                c0129h0.f1339Y = c0153p02;
                                c0129h0.f1340Z = c0123f02;
                                c0129h0.f1341h0 = n11;
                                c0129h0.f1342i0 = a10;
                                c0129h0.f1343j0 = uVar2;
                                c0129h0.f1344k0 = f6;
                                c0129h0.f1345l0 = j10;
                                c0129h0.f1347n0 = i15;
                                obj = n11.c(EnumC0195l.f1657Z, c0129h0);
                                nVar = c0153p02;
                                a5 = a10;
                                c0123f0 = c0123f02;
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                C0194k c0194k = (C0194k) obj;
                                list = c0194k.f1652a;
                                size = list.size();
                                int i16 = 0;
                                i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        r16 = list.get(i12);
                                        list2 = list;
                                        i13 = size;
                                        if (B0.t.a(((B0.u) r16).f1670a, a5.f37621Y)) {
                                            break;
                                        }
                                        i12++;
                                        list = list2;
                                        size = i13;
                                    } else {
                                        r16 = 0;
                                        break;
                                    }
                                }
                                uVar = r16;
                                if (uVar != null && !uVar.b()) {
                                    if (!r9.y.Y(uVar)) {
                                        List list3 = c0194k.f1652a;
                                        int size2 = list3.size();
                                        while (true) {
                                            if (i16 < size2) {
                                                obj2 = list3.get(i16);
                                                if (((B0.u) obj2).f1673d) {
                                                    break;
                                                }
                                                i16++;
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        B0.u uVar4 = (B0.u) obj2;
                                        if (uVar4 != null) {
                                            a5.f37621Y = uVar4.f1670a;
                                            i15 = 1;
                                            c0153p05 = nVar;
                                            a14 = a5;
                                            c0123f05 = c0123f0;
                                            uVar2 = null;
                                            c0153p02 = c0153p05;
                                            a10 = a14;
                                            c0123f02 = c0123f05;
                                            c0129h0.f1339Y = c0153p02;
                                            c0129h0.f1340Z = c0123f02;
                                            c0129h0.f1341h0 = n11;
                                            c0129h0.f1342i0 = a10;
                                            c0129h0.f1343j0 = uVar2;
                                            c0129h0.f1344k0 = f6;
                                            c0129h0.f1345l0 = j10;
                                            c0129h0.f1347n0 = i15;
                                            obj = n11.c(EnumC0195l.f1657Z, c0129h0);
                                            nVar = c0153p02;
                                            a5 = a10;
                                            c0123f0 = c0123f02;
                                            if (obj == enumC5000a) {
                                            }
                                            C0194k c0194k2 = (C0194k) obj;
                                            list = c0194k2.f1652a;
                                            size = list.size();
                                            int i162 = 0;
                                            i12 = 0;
                                            while (true) {
                                                if (i12 < size) {
                                                }
                                                i12++;
                                                list = list2;
                                                size = i13;
                                            }
                                            uVar = r16;
                                            if (uVar != null) {
                                                if (!r9.y.Y(uVar)) {
                                                    j10 = C5251c.h(j10, C5251c.g(uVar.f1672c, uVar.f1676g));
                                                    C0123f0 c0123f06 = c0123f0;
                                                    if (c0123f06.a(j10) < f6) {
                                                        EnumC0195l enumC0195l = EnumC0195l.f1658h0;
                                                        c0129h0.f1339Y = nVar;
                                                        c0129h0.f1340Z = c0123f06;
                                                        c0129h0.f1341h0 = n11;
                                                        c0129h0.f1342i0 = a5;
                                                        c0129h0.f1343j0 = uVar;
                                                        c0129h0.f1344k0 = f6;
                                                        c0129h0.f1345l0 = j10;
                                                        c10 = 2;
                                                        c0129h0.f1347n0 = 2;
                                                        if (n11.c(enumC0195l, c0129h0) == enumC5000a) {
                                                            return enumC5000a;
                                                        }
                                                        float f12 = f6;
                                                        uVar3 = uVar;
                                                        f11 = f12;
                                                        c0153p03 = nVar;
                                                        a12 = a5;
                                                        c0123f03 = c0123f06;
                                                        if (!uVar3.b()) {
                                                        }
                                                    } else {
                                                        c10 = 2;
                                                        nVar.invoke(uVar, new Float(C5251c.d(c0123f06.b(f6, j10))));
                                                        if (uVar.b()) {
                                                            return uVar;
                                                        }
                                                        j10 = C5251c.f43619b;
                                                        c0153p04 = nVar;
                                                        a13 = a5;
                                                        c0123f04 = c0123f06;
                                                        i15 = 1;
                                                        C0153p0 c0153p052 = c0153p04;
                                                        kotlin.jvm.internal.A a142 = a13;
                                                        C0123f0 c0123f052 = c0123f04;
                                                        uVar2 = null;
                                                        c0153p02 = c0153p052;
                                                        a10 = a142;
                                                        c0123f02 = c0123f052;
                                                        c0129h0.f1339Y = c0153p02;
                                                        c0129h0.f1340Z = c0123f02;
                                                        c0129h0.f1341h0 = n11;
                                                        c0129h0.f1342i0 = a10;
                                                        c0129h0.f1343j0 = uVar2;
                                                        c0129h0.f1344k0 = f6;
                                                        c0129h0.f1345l0 = j10;
                                                        c0129h0.f1347n0 = i15;
                                                        obj = n11.c(EnumC0195l.f1657Z, c0129h0);
                                                        nVar = c0153p02;
                                                        a5 = a10;
                                                        c0123f0 = c0123f02;
                                                        if (obj == enumC5000a) {
                                                        }
                                                        C0194k c0194k22 = (C0194k) obj;
                                                        list = c0194k22.f1652a;
                                                        size = list.size();
                                                        int i1622 = 0;
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < size) {
                                                            }
                                                            i12++;
                                                            list = list2;
                                                            size = i13;
                                                        }
                                                        uVar = r16;
                                                        if (uVar != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j12 = c0129h0.f1345l0;
                    float f13 = c0129h0.f1344k0;
                    kotlin.jvm.internal.A a15 = c0129h0.f1342i0;
                    B0.N n13 = c0129h0.f1341h0;
                    ?? r11 = c0129h0.f1340Z;
                    wf.n nVar2 = c0129h0.f1339Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    obj = obj3;
                    j10 = j12;
                    nVar = nVar2;
                    f6 = f13;
                    n11 = n13;
                    a5 = a15;
                    c0123f0 = r11;
                    C0194k c0194k222 = (C0194k) obj;
                    list = c0194k222.f1652a;
                    size = list.size();
                    int i16222 = 0;
                    i12 = 0;
                    while (true) {
                        if (i12 < size) {
                        }
                        i12++;
                        list = list2;
                        size = i13;
                    }
                    uVar = r16;
                    if (uVar != null) {
                    }
                    return null;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj3);
                C0123f0 c0123f07 = f1534a;
                n11 = n10;
                if (i(n11.f1614j0.f1619u0, j6)) {
                    return null;
                }
                f6 = j(n10.e(), i10);
                ?? obj4 = new Object();
                obj4.f37621Y = j6;
                c0123f02 = c0123f07;
                j10 = C5251c.f43619b;
                c0153p02 = c0153p0;
                a10 = obj4;
                c0129h0.f1339Y = c0153p02;
                c0129h0.f1340Z = c0123f02;
                c0129h0.f1341h0 = n11;
                c0129h0.f1342i0 = a10;
                c0129h0.f1343j0 = uVar2;
                c0129h0.f1344k0 = f6;
                c0129h0.f1345l0 = j10;
                c0129h0.f1347n0 = i15;
                obj = n11.c(EnumC0195l.f1657Z, c0129h0);
                nVar = c0153p02;
                a5 = a10;
                c0123f0 = c0123f02;
                if (obj == enumC5000a) {
                }
                C0194k c0194k2222 = (C0194k) obj;
                list = c0194k2222.f1652a;
                size = list.size();
                int i162222 = 0;
                i12 = 0;
                while (true) {
                    if (i12 < size) {
                    }
                    i12++;
                    list = list2;
                    size = i13;
                }
                uVar = r16;
                if (uVar != null) {
                }
                return null;
            }
        }
        c0129h0 = new AbstractC5156c(abstractC4825e);
        Object obj32 = c0129h0.f1346m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c0129h0.f1347n0;
        int i152 = 1;
        B0.u uVar22 = null;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r11v0, types: [B0.N] */
    /* JADX WARN: Type inference failed for: r12v8, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.internal.B] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j6, B0.N n10, AbstractC4825e abstractC4825e) {
        C0132i0 c0132i0;
        int i10;
        B0.u uVar;
        Object obj;
        try {
            if (abstractC4825e instanceof C0132i0) {
                C0132i0 c0132i02 = (C0132i0) abstractC4825e;
                int i11 = c0132i02.f1356i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0132i02.f1356i0 = i11 - Integer.MIN_VALUE;
                    c0132i0 = c0132i02;
                    Object obj2 = c0132i0.f1355h0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c0132i0.f1356i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            kotlin.jvm.internal.B b10 = c0132i0.f1354Z;
                            uVar = c0132i0.f1353Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            j6 = b10;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        if (i(n10.f1614j0.f1619u0, j6)) {
                            return null;
                        }
                        List list = n10.f1614j0.f1619u0.f1652a;
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                obj = list.get(i12);
                                if (B0.t.a(((B0.u) obj).f1670a, j6)) {
                                    break;
                                }
                                i12++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        uVar = (B0.u) obj;
                        if (uVar == null) {
                            return null;
                        }
                        ?? obj3 = new Object();
                        ?? obj4 = new Object();
                        obj4.f37622Y = uVar;
                        long b11 = n10.e().b();
                        C0135j0 c0135j0 = new C0135j0(obj4, obj3, null);
                        c0132i0.f1353Y = uVar;
                        c0132i0.f1354Z = obj3;
                        c0132i0.f1356i0 = 1;
                        Object f6 = n10.f(b11, c0135j0, c0132i0);
                        j6 = f6;
                        if (f6 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return null;
                }
            }
            if (i10 == 0) {
            }
            return null;
        } catch (C0196m unused) {
            B0.u uVar2 = (B0.u) j6.f37622Y;
            if (uVar2 == null) {
                return uVar;
            }
            return uVar2;
        }
        c0132i0 = new AbstractC5156c(abstractC4825e);
        Object obj22 = c0132i0.f1355h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0132i0.f1356i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r10v6, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r12v10, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010c -> B:44:0x0112). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0145 -> B:51:0x014a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x016e -> B:54:0x0152). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(B0.N n10, long j6, int i10, C0153p0 c0153p0, AbstractC4825e abstractC4825e) {
        C0138k0 c0138k0;
        int i11;
        float f6;
        B0.N n11;
        long j10;
        Object obj;
        C0123f0 c0123f0;
        kotlin.jvm.internal.A a5;
        wf.n nVar;
        List list;
        int size;
        int i12;
        ?? r16;
        B0.u uVar;
        Object obj2;
        List list2;
        int i13;
        C0123f0 c0123f02;
        kotlin.jvm.internal.A a10;
        C0153p0 c0153p02;
        if (abstractC4825e instanceof C0138k0) {
            C0138k0 c0138k02 = (C0138k0) abstractC4825e;
            int i14 = c0138k02.f1395n0;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0138k02.f1395n0 = i14 - Integer.MIN_VALUE;
                c0138k0 = c0138k02;
                Object obj3 = c0138k0.f1394m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c0138k0.f1395n0;
                int i15 = 1;
                B0.u uVar2 = null;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            long j11 = c0138k0.f1393l0;
                            float f10 = c0138k0.f1392k0;
                            B0.u uVar3 = c0138k0.f1391j0;
                            kotlin.jvm.internal.A a11 = c0138k0.f1390i0;
                            B0.N n12 = c0138k0.f1389h0;
                            ?? r12 = c0138k0.f1388Z;
                            ?? r13 = c0138k0.f1387Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            j10 = j11;
                            float f11 = f10;
                            char c10 = 2;
                            n11 = n12;
                            C0123f0 c0123f03 = r12;
                            C0153p0 c0153p03 = r13;
                            kotlin.jvm.internal.A a12 = a11;
                            if (!uVar3.b()) {
                                f6 = f11;
                                C0153p0 c0153p04 = c0153p03;
                                kotlin.jvm.internal.A a13 = a12;
                                C0123f0 c0123f04 = c0123f03;
                                i15 = 1;
                                C0153p0 c0153p05 = c0153p04;
                                kotlin.jvm.internal.A a14 = a13;
                                C0123f0 c0123f05 = c0123f04;
                                uVar2 = null;
                                c0153p02 = c0153p05;
                                a10 = a14;
                                c0123f02 = c0123f05;
                                c0138k0.f1387Y = c0153p02;
                                c0138k0.f1388Z = c0123f02;
                                c0138k0.f1389h0 = n11;
                                c0138k0.f1390i0 = a10;
                                c0138k0.f1391j0 = uVar2;
                                c0138k0.f1392k0 = f6;
                                c0138k0.f1393l0 = j10;
                                c0138k0.f1395n0 = i15;
                                obj = n11.c(EnumC0195l.f1657Z, c0138k0);
                                nVar = c0153p02;
                                a5 = a10;
                                c0123f0 = c0123f02;
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                C0194k c0194k = (C0194k) obj;
                                list = c0194k.f1652a;
                                size = list.size();
                                int i16 = 0;
                                i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        r16 = list.get(i12);
                                        list2 = list;
                                        i13 = size;
                                        if (B0.t.a(((B0.u) r16).f1670a, a5.f37621Y)) {
                                            break;
                                        }
                                        i12++;
                                        list = list2;
                                        size = i13;
                                    } else {
                                        r16 = 0;
                                        break;
                                    }
                                }
                                uVar = r16;
                                if (uVar != null && !uVar.b()) {
                                    if (!r9.y.Y(uVar)) {
                                        List list3 = c0194k.f1652a;
                                        int size2 = list3.size();
                                        while (true) {
                                            if (i16 < size2) {
                                                obj2 = list3.get(i16);
                                                if (((B0.u) obj2).f1673d) {
                                                    break;
                                                }
                                                i16++;
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        B0.u uVar4 = (B0.u) obj2;
                                        if (uVar4 != null) {
                                            a5.f37621Y = uVar4.f1670a;
                                            i15 = 1;
                                            c0153p05 = nVar;
                                            a14 = a5;
                                            c0123f05 = c0123f0;
                                            uVar2 = null;
                                            c0153p02 = c0153p05;
                                            a10 = a14;
                                            c0123f02 = c0123f05;
                                            c0138k0.f1387Y = c0153p02;
                                            c0138k0.f1388Z = c0123f02;
                                            c0138k0.f1389h0 = n11;
                                            c0138k0.f1390i0 = a10;
                                            c0138k0.f1391j0 = uVar2;
                                            c0138k0.f1392k0 = f6;
                                            c0138k0.f1393l0 = j10;
                                            c0138k0.f1395n0 = i15;
                                            obj = n11.c(EnumC0195l.f1657Z, c0138k0);
                                            nVar = c0153p02;
                                            a5 = a10;
                                            c0123f0 = c0123f02;
                                            if (obj == enumC5000a) {
                                            }
                                            C0194k c0194k2 = (C0194k) obj;
                                            list = c0194k2.f1652a;
                                            size = list.size();
                                            int i162 = 0;
                                            i12 = 0;
                                            while (true) {
                                                if (i12 < size) {
                                                }
                                                i12++;
                                                list = list2;
                                                size = i13;
                                            }
                                            uVar = r16;
                                            if (uVar != null) {
                                                if (!r9.y.Y(uVar)) {
                                                    j10 = C5251c.h(j10, C5251c.g(uVar.f1672c, uVar.f1676g));
                                                    C0123f0 c0123f06 = c0123f0;
                                                    if (c0123f06.a(j10) < f6) {
                                                        EnumC0195l enumC0195l = EnumC0195l.f1658h0;
                                                        c0138k0.f1387Y = nVar;
                                                        c0138k0.f1388Z = c0123f06;
                                                        c0138k0.f1389h0 = n11;
                                                        c0138k0.f1390i0 = a5;
                                                        c0138k0.f1391j0 = uVar;
                                                        c0138k0.f1392k0 = f6;
                                                        c0138k0.f1393l0 = j10;
                                                        c10 = 2;
                                                        c0138k0.f1395n0 = 2;
                                                        if (n11.c(enumC0195l, c0138k0) == enumC5000a) {
                                                            return enumC5000a;
                                                        }
                                                        float f12 = f6;
                                                        uVar3 = uVar;
                                                        f11 = f12;
                                                        c0153p03 = nVar;
                                                        a12 = a5;
                                                        c0123f03 = c0123f06;
                                                        if (!uVar3.b()) {
                                                        }
                                                    } else {
                                                        c10 = 2;
                                                        nVar.invoke(uVar, new Float(C5251c.e(c0123f06.b(f6, j10))));
                                                        if (uVar.b()) {
                                                            return uVar;
                                                        }
                                                        j10 = C5251c.f43619b;
                                                        c0153p04 = nVar;
                                                        a13 = a5;
                                                        c0123f04 = c0123f06;
                                                        i15 = 1;
                                                        C0153p0 c0153p052 = c0153p04;
                                                        kotlin.jvm.internal.A a142 = a13;
                                                        C0123f0 c0123f052 = c0123f04;
                                                        uVar2 = null;
                                                        c0153p02 = c0153p052;
                                                        a10 = a142;
                                                        c0123f02 = c0123f052;
                                                        c0138k0.f1387Y = c0153p02;
                                                        c0138k0.f1388Z = c0123f02;
                                                        c0138k0.f1389h0 = n11;
                                                        c0138k0.f1390i0 = a10;
                                                        c0138k0.f1391j0 = uVar2;
                                                        c0138k0.f1392k0 = f6;
                                                        c0138k0.f1393l0 = j10;
                                                        c0138k0.f1395n0 = i15;
                                                        obj = n11.c(EnumC0195l.f1657Z, c0138k0);
                                                        nVar = c0153p02;
                                                        a5 = a10;
                                                        c0123f0 = c0123f02;
                                                        if (obj == enumC5000a) {
                                                        }
                                                        C0194k c0194k22 = (C0194k) obj;
                                                        list = c0194k22.f1652a;
                                                        size = list.size();
                                                        int i1622 = 0;
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < size) {
                                                            }
                                                            i12++;
                                                            list = list2;
                                                            size = i13;
                                                        }
                                                        uVar = r16;
                                                        if (uVar != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j12 = c0138k0.f1393l0;
                    float f13 = c0138k0.f1392k0;
                    kotlin.jvm.internal.A a15 = c0138k0.f1390i0;
                    B0.N n13 = c0138k0.f1389h0;
                    ?? r11 = c0138k0.f1388Z;
                    wf.n nVar2 = c0138k0.f1387Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    obj = obj3;
                    j10 = j12;
                    nVar = nVar2;
                    f6 = f13;
                    n11 = n13;
                    a5 = a15;
                    c0123f0 = r11;
                    C0194k c0194k222 = (C0194k) obj;
                    list = c0194k222.f1652a;
                    size = list.size();
                    int i16222 = 0;
                    i12 = 0;
                    while (true) {
                        if (i12 < size) {
                        }
                        i12++;
                        list = list2;
                        size = i13;
                    }
                    uVar = r16;
                    if (uVar != null) {
                    }
                    return null;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj3);
                C0123f0 c0123f07 = f1535b;
                n11 = n10;
                if (i(n11.f1614j0.f1619u0, j6)) {
                    return null;
                }
                f6 = j(n10.e(), i10);
                ?? obj4 = new Object();
                obj4.f37621Y = j6;
                c0123f02 = c0123f07;
                j10 = C5251c.f43619b;
                c0153p02 = c0153p0;
                a10 = obj4;
                c0138k0.f1387Y = c0153p02;
                c0138k0.f1388Z = c0123f02;
                c0138k0.f1389h0 = n11;
                c0138k0.f1390i0 = a10;
                c0138k0.f1391j0 = uVar2;
                c0138k0.f1392k0 = f6;
                c0138k0.f1393l0 = j10;
                c0138k0.f1395n0 = i15;
                obj = n11.c(EnumC0195l.f1657Z, c0138k0);
                nVar = c0153p02;
                a5 = a10;
                c0123f0 = c0123f02;
                if (obj == enumC5000a) {
                }
                C0194k c0194k2222 = (C0194k) obj;
                list = c0194k2222.f1652a;
                size = list.size();
                int i162222 = 0;
                i12 = 0;
                while (true) {
                    if (i12 < size) {
                    }
                    i12++;
                    list = list2;
                    size = i13;
                }
                uVar = r16;
                if (uVar != null) {
                }
                return null;
            }
        }
        c0138k0 = new AbstractC5156c(abstractC4825e);
        Object obj32 = c0138k0.f1394m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c0138k0.f1395n0;
        int i152 = 1;
        B0.u uVar22 = null;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r12v10, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010a -> B:44:0x0110). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0143 -> B:51:0x0148). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x016c -> B:54:0x0150). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(B0.N n10, long j6, gc.l lVar, AbstractC4825e abstractC4825e) {
        C0141l0 c0141l0;
        int i10;
        float f6;
        B0.N n11;
        long j10;
        Object obj;
        C0123f0 c0123f0;
        kotlin.jvm.internal.A a5;
        wf.n nVar;
        List list;
        int size;
        int i11;
        ?? r16;
        B0.u uVar;
        Object obj2;
        List list2;
        int i12;
        C0123f0 c0123f02;
        kotlin.jvm.internal.A a10;
        gc.l lVar2;
        if (abstractC4825e instanceof C0141l0) {
            C0141l0 c0141l02 = (C0141l0) abstractC4825e;
            int i13 = c0141l02.f1410n0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0141l02.f1410n0 = i13 - Integer.MIN_VALUE;
                c0141l0 = c0141l02;
                Object obj3 = c0141l0.f1409m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0141l0.f1410n0;
                int i14 = 1;
                B0.u uVar2 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            long j11 = c0141l0.f1408l0;
                            float f10 = c0141l0.f1407k0;
                            B0.u uVar3 = c0141l0.f1406j0;
                            kotlin.jvm.internal.A a11 = c0141l0.f1405i0;
                            B0.N n12 = c0141l0.f1404h0;
                            ?? r12 = c0141l0.f1403Z;
                            ?? r13 = c0141l0.f1402Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            j10 = j11;
                            float f11 = f10;
                            char c10 = 2;
                            n11 = n12;
                            C0123f0 c0123f03 = r12;
                            gc.l lVar3 = r13;
                            kotlin.jvm.internal.A a12 = a11;
                            if (!uVar3.b()) {
                                f6 = f11;
                                gc.l lVar4 = lVar3;
                                kotlin.jvm.internal.A a13 = a12;
                                C0123f0 c0123f04 = c0123f03;
                                i14 = 1;
                                gc.l lVar5 = lVar4;
                                kotlin.jvm.internal.A a14 = a13;
                                C0123f0 c0123f05 = c0123f04;
                                uVar2 = null;
                                lVar2 = lVar5;
                                a10 = a14;
                                c0123f02 = c0123f05;
                                c0141l0.f1402Y = lVar2;
                                c0141l0.f1403Z = c0123f02;
                                c0141l0.f1404h0 = n11;
                                c0141l0.f1405i0 = a10;
                                c0141l0.f1406j0 = uVar2;
                                c0141l0.f1407k0 = f6;
                                c0141l0.f1408l0 = j10;
                                c0141l0.f1410n0 = i14;
                                obj = n11.c(EnumC0195l.f1657Z, c0141l0);
                                nVar = lVar2;
                                a5 = a10;
                                c0123f0 = c0123f02;
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                C0194k c0194k = (C0194k) obj;
                                list = c0194k.f1652a;
                                size = list.size();
                                int i15 = 0;
                                i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        r16 = list.get(i11);
                                        list2 = list;
                                        i12 = size;
                                        if (B0.t.a(((B0.u) r16).f1670a, a5.f37621Y)) {
                                            break;
                                        }
                                        i11++;
                                        list = list2;
                                        size = i12;
                                    } else {
                                        r16 = 0;
                                        break;
                                    }
                                }
                                uVar = r16;
                                if (uVar != null && !uVar.b()) {
                                    if (!r9.y.Y(uVar)) {
                                        List list3 = c0194k.f1652a;
                                        int size2 = list3.size();
                                        while (true) {
                                            if (i15 < size2) {
                                                obj2 = list3.get(i15);
                                                if (((B0.u) obj2).f1673d) {
                                                    break;
                                                }
                                                i15++;
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        B0.u uVar4 = (B0.u) obj2;
                                        if (uVar4 != null) {
                                            a5.f37621Y = uVar4.f1670a;
                                            i14 = 1;
                                            lVar5 = nVar;
                                            a14 = a5;
                                            c0123f05 = c0123f0;
                                            uVar2 = null;
                                            lVar2 = lVar5;
                                            a10 = a14;
                                            c0123f02 = c0123f05;
                                            c0141l0.f1402Y = lVar2;
                                            c0141l0.f1403Z = c0123f02;
                                            c0141l0.f1404h0 = n11;
                                            c0141l0.f1405i0 = a10;
                                            c0141l0.f1406j0 = uVar2;
                                            c0141l0.f1407k0 = f6;
                                            c0141l0.f1408l0 = j10;
                                            c0141l0.f1410n0 = i14;
                                            obj = n11.c(EnumC0195l.f1657Z, c0141l0);
                                            nVar = lVar2;
                                            a5 = a10;
                                            c0123f0 = c0123f02;
                                            if (obj == enumC5000a) {
                                            }
                                            C0194k c0194k2 = (C0194k) obj;
                                            list = c0194k2.f1652a;
                                            size = list.size();
                                            int i152 = 0;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 < size) {
                                                }
                                                i11++;
                                                list = list2;
                                                size = i12;
                                            }
                                            uVar = r16;
                                            if (uVar != null) {
                                                if (!r9.y.Y(uVar)) {
                                                    j10 = C5251c.h(j10, C5251c.g(uVar.f1672c, uVar.f1676g));
                                                    C0123f0 c0123f06 = c0123f0;
                                                    if (c0123f06.a(j10) < f6) {
                                                        EnumC0195l enumC0195l = EnumC0195l.f1658h0;
                                                        c0141l0.f1402Y = nVar;
                                                        c0141l0.f1403Z = c0123f06;
                                                        c0141l0.f1404h0 = n11;
                                                        c0141l0.f1405i0 = a5;
                                                        c0141l0.f1406j0 = uVar;
                                                        c0141l0.f1407k0 = f6;
                                                        c0141l0.f1408l0 = j10;
                                                        c10 = 2;
                                                        c0141l0.f1410n0 = 2;
                                                        if (n11.c(enumC0195l, c0141l0) == enumC5000a) {
                                                            return enumC5000a;
                                                        }
                                                        float f12 = f6;
                                                        uVar3 = uVar;
                                                        f11 = f12;
                                                        lVar3 = nVar;
                                                        a12 = a5;
                                                        c0123f03 = c0123f06;
                                                        if (!uVar3.b()) {
                                                        }
                                                    } else {
                                                        c10 = 2;
                                                        nVar.invoke(uVar, new Float(C5251c.e(c0123f06.b(f6, j10))));
                                                        if (uVar.b()) {
                                                            return uVar;
                                                        }
                                                        j10 = C5251c.f43619b;
                                                        lVar4 = nVar;
                                                        a13 = a5;
                                                        c0123f04 = c0123f06;
                                                        i14 = 1;
                                                        gc.l lVar52 = lVar4;
                                                        kotlin.jvm.internal.A a142 = a13;
                                                        C0123f0 c0123f052 = c0123f04;
                                                        uVar2 = null;
                                                        lVar2 = lVar52;
                                                        a10 = a142;
                                                        c0123f02 = c0123f052;
                                                        c0141l0.f1402Y = lVar2;
                                                        c0141l0.f1403Z = c0123f02;
                                                        c0141l0.f1404h0 = n11;
                                                        c0141l0.f1405i0 = a10;
                                                        c0141l0.f1406j0 = uVar2;
                                                        c0141l0.f1407k0 = f6;
                                                        c0141l0.f1408l0 = j10;
                                                        c0141l0.f1410n0 = i14;
                                                        obj = n11.c(EnumC0195l.f1657Z, c0141l0);
                                                        nVar = lVar2;
                                                        a5 = a10;
                                                        c0123f0 = c0123f02;
                                                        if (obj == enumC5000a) {
                                                        }
                                                        C0194k c0194k22 = (C0194k) obj;
                                                        list = c0194k22.f1652a;
                                                        size = list.size();
                                                        int i1522 = 0;
                                                        i11 = 0;
                                                        while (true) {
                                                            if (i11 < size) {
                                                            }
                                                            i11++;
                                                            list = list2;
                                                            size = i12;
                                                        }
                                                        uVar = r16;
                                                        if (uVar != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j12 = c0141l0.f1408l0;
                    float f13 = c0141l0.f1407k0;
                    kotlin.jvm.internal.A a15 = c0141l0.f1405i0;
                    B0.N n13 = c0141l0.f1404h0;
                    ?? r11 = c0141l0.f1403Z;
                    wf.n nVar2 = c0141l0.f1402Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    obj = obj3;
                    j10 = j12;
                    nVar = nVar2;
                    f6 = f13;
                    n11 = n13;
                    a5 = a15;
                    c0123f0 = r11;
                    C0194k c0194k222 = (C0194k) obj;
                    list = c0194k222.f1652a;
                    size = list.size();
                    int i15222 = 0;
                    i11 = 0;
                    while (true) {
                        if (i11 < size) {
                        }
                        i11++;
                        list = list2;
                        size = i12;
                    }
                    uVar = r16;
                    if (uVar != null) {
                    }
                    return null;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj3);
                C0123f0 c0123f07 = f1535b;
                n11 = n10;
                if (i(n11.f1614j0.f1619u0, j6)) {
                    return null;
                }
                f6 = j(n10.e(), 1);
                ?? obj4 = new Object();
                obj4.f37621Y = j6;
                c0123f02 = c0123f07;
                j10 = C5251c.f43619b;
                lVar2 = lVar;
                a10 = obj4;
                c0141l0.f1402Y = lVar2;
                c0141l0.f1403Z = c0123f02;
                c0141l0.f1404h0 = n11;
                c0141l0.f1405i0 = a10;
                c0141l0.f1406j0 = uVar2;
                c0141l0.f1407k0 = f6;
                c0141l0.f1408l0 = j10;
                c0141l0.f1410n0 = i14;
                obj = n11.c(EnumC0195l.f1657Z, c0141l0);
                nVar = lVar2;
                a5 = a10;
                c0123f0 = c0123f02;
                if (obj == enumC5000a) {
                }
                C0194k c0194k2222 = (C0194k) obj;
                list = c0194k2222.f1652a;
                size = list.size();
                int i152222 = 0;
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                    }
                    i11++;
                    list = list2;
                    size = i12;
                }
                uVar = r16;
                if (uVar != null) {
                }
                return null;
            }
        }
        c0141l0 = new AbstractC5156c(abstractC4825e);
        Object obj32 = c0141l0.f1409m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0141l0.f1410n0;
        int i142 = 1;
        B0.u uVar22 = null;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [B.v] */
    public static Object f(B0.A a5, C6686a c6686a, AbstractC6216a abstractC6216a, wf.n nVar, AbstractC4825e abstractC4825e, int i10) {
        C6686a c6686a2 = c6686a;
        if ((i10 & 1) != 0) {
            c6686a2 = C0169v.f1528h0;
        }
        Object q10 = Df.H.q(a5, new C0150o0(c6686a2, nVar, C0144m0.f1414Z, abstractC6216a, null), abstractC4825e);
        if (q10 != EnumC5000a.f41328Y) {
            return jf.y.f36177a;
        }
        return q10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(B0.N n10, long j6, wf.k kVar, AbstractC4825e abstractC4825e) {
        C0161s0 c0161s0;
        int i10;
        B0.u uVar;
        if (abstractC4825e instanceof C0161s0) {
            C0161s0 c0161s02 = (C0161s0) abstractC4825e;
            int i11 = c0161s02.f1490i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0161s02.f1490i0 = i11 - Integer.MIN_VALUE;
                c0161s0 = c0161s02;
                Object obj = c0161s0.f1489h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0161s0.f1490i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        wf.k kVar2 = c0161s0.f1488Z;
                        B0.N n11 = c0161s0.f1487Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        kVar = kVar2;
                        n10 = n11;
                        uVar = (B0.u) obj;
                        if (uVar == null) {
                            if (r9.y.Y(uVar)) {
                                return Boolean.TRUE;
                            }
                            kVar.invoke(uVar);
                            j6 = uVar.f1670a;
                            c0161s0.f1487Y = n10;
                            c0161s0.f1488Z = kVar;
                            c0161s0.f1490i0 = 1;
                            obj = a(j6, n10, c0161s0);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            uVar = (B0.u) obj;
                            if (uVar == null) {
                                return Boolean.FALSE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0161s0.f1487Y = n10;
                    c0161s0.f1488Z = kVar;
                    c0161s0.f1490i0 = 1;
                    obj = a(j6, n10, c0161s0);
                    if (obj == enumC5000a) {
                    }
                    uVar = (B0.u) obj;
                    if (uVar == null) {
                    }
                }
            }
        }
        c0161s0 = new AbstractC5156c(abstractC4825e);
        Object obj2 = c0161s0.f1489h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0161s0.f1490i0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if ((!r0) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [wf.k] */
    /* JADX WARN: Type inference failed for: r1v8, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [wf.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:23:0x0076). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(B0.N n10, long j6, C0147n0 c0147n0, AbstractC4825e abstractC4825e) {
        C0164t0 c0164t0;
        int i10;
        B0.u uVar;
        B0.N n11;
        C0164t0 c0164t02;
        C0147n0 c0147n02;
        Object obj;
        B0.N n12;
        long j10;
        boolean z10;
        Object obj2;
        kotlin.jvm.internal.A a5;
        Object c10;
        C0147n0 c0147n03;
        if (abstractC4825e instanceof C0164t0) {
            C0164t0 c0164t03 = (C0164t0) abstractC4825e;
            int i11 = c0164t03.f1502k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0164t03.f1502k0 = i11 - Integer.MIN_VALUE;
                c0164t0 = c0164t03;
                Object obj3 = c0164t0.f1501j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0164t0.f1502k0;
                boolean z11 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kotlin.jvm.internal.A a10 = c0164t0.f1500i0;
                        n11 = c0164t0.f1499h0;
                        B0.N n13 = c0164t0.f1498Z;
                        ?? r92 = c0164t0.f1497Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj3);
                        c0164t02 = c0164t0;
                        c0147n02 = r92;
                        kotlin.jvm.internal.A a11 = a10;
                        C0194k c0194k = (C0194k) obj3;
                        List list = c0194k.f1652a;
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                obj = list.get(i12);
                                if (B0.t.a(((B0.u) obj).f1670a, a11.f37621Y)) {
                                    break;
                                }
                                i12++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        B0.u uVar2 = (B0.u) obj;
                        if (uVar2 == null) {
                            if (r9.y.Y(uVar2)) {
                                List list2 = c0194k.f1652a;
                                int size2 = list2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        obj2 = list2.get(i13);
                                        if (((B0.u) obj2).f1673d) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                B0.u uVar3 = (B0.u) obj2;
                                if (uVar3 != null) {
                                    a11.f37621Y = uVar3.f1670a;
                                    n12 = n13;
                                    c0147n02 = c0147n02;
                                    a5 = a11;
                                    c0164t02.f1497Y = c0147n02;
                                    c0164t02.f1498Z = n12;
                                    c0164t02.f1499h0 = n11;
                                    c0164t02.f1500i0 = a5;
                                    c0164t02.f1502k0 = 1;
                                    c10 = n11.c(EnumC0195l.f1657Z, c0164t02);
                                    if (c10 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    n13 = n12;
                                    obj3 = c10;
                                    a11 = a5;
                                }
                            } else if (C5251c.d(r9.y.Q0(uVar2, true)) == 0.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            C0194k c0194k2 = (C0194k) obj3;
                            List list3 = c0194k2.f1652a;
                            int size3 = list3.size();
                            int i122 = 0;
                            while (true) {
                                if (i122 >= size3) {
                                }
                                i122++;
                            }
                            B0.u uVar22 = (B0.u) obj;
                            if (uVar22 == null) {
                                uVar22 = null;
                            }
                        }
                        if (uVar22 != null && !uVar22.b()) {
                            if (r9.y.Y(uVar22)) {
                                uVar = uVar22;
                                if (uVar == null) {
                                    z11 = false;
                                }
                                return Boolean.valueOf(z11);
                            }
                            c0147n02.invoke(uVar22);
                            n12 = n13;
                            j10 = uVar22.f1670a;
                            c0147n03 = c0147n02;
                            ?? obj4 = new Object();
                            obj4.f37621Y = j10;
                            n11 = n12;
                            c0147n02 = c0147n03;
                            a5 = obj4;
                            c0164t02.f1497Y = c0147n02;
                            c0164t02.f1498Z = n12;
                            c0164t02.f1499h0 = n11;
                            c0164t02.f1500i0 = a5;
                            c0164t02.f1502k0 = 1;
                            c10 = n11.c(EnumC0195l.f1657Z, c0164t02);
                            if (c10 == enumC5000a) {
                            }
                        }
                        uVar = null;
                        if (uVar == null) {
                        }
                        return Boolean.valueOf(z11);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj3);
                n12 = n10;
                j10 = j6;
                if (!i(n12.f1614j0.f1619u0, j10)) {
                    c0164t02 = c0164t0;
                    c0147n03 = c0147n0;
                    ?? obj42 = new Object();
                    obj42.f37621Y = j10;
                    n11 = n12;
                    c0147n02 = c0147n03;
                    a5 = obj42;
                    c0164t02.f1497Y = c0147n02;
                    c0164t02.f1498Z = n12;
                    c0164t02.f1499h0 = n11;
                    c0164t02.f1500i0 = a5;
                    c0164t02.f1502k0 = 1;
                    c10 = n11.c(EnumC0195l.f1657Z, c0164t02);
                    if (c10 == enumC5000a) {
                    }
                }
                uVar = null;
                if (uVar == null) {
                }
                return Boolean.valueOf(z11);
            }
        }
        c0164t0 = new AbstractC5156c(abstractC4825e);
        Object obj32 = c0164t0.f1501j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0164t0.f1502k0;
        boolean z112 = true;
        if (i10 == 0) {
        }
    }

    public static final boolean i(C0194k c0194k, long j6) {
        Object obj;
        List list = c0194k.f1652a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (B0.t.a(((B0.u) obj).f1670a, j6)) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        B0.u uVar = (B0.u) obj;
        if (uVar != null && uVar.f1673d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float j(H0.Y0 y02, int i10) {
        if (B0.s.b(i10, 2)) {
            return y02.e() * f1537d;
        }
        return y02.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if ((!r0) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:23:0x0076). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(B0.N n10, long j6, wf.k kVar, AbstractC4825e abstractC4825e) {
        C0167u0 c0167u0;
        int i10;
        B0.u uVar;
        B0.N n11;
        C0167u0 c0167u02;
        wf.k kVar2;
        Object obj;
        B0.N n12;
        long j10;
        boolean z10;
        Object obj2;
        kotlin.jvm.internal.A a5;
        Object c10;
        if (abstractC4825e instanceof C0167u0) {
            C0167u0 c0167u03 = (C0167u0) abstractC4825e;
            int i11 = c0167u03.f1526k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0167u03.f1526k0 = i11 - Integer.MIN_VALUE;
                c0167u0 = c0167u03;
                Object obj3 = c0167u0.f1525j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0167u0.f1526k0;
                boolean z11 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kotlin.jvm.internal.A a10 = c0167u0.f1524i0;
                        n11 = c0167u0.f1523h0;
                        B0.N n13 = c0167u0.f1522Z;
                        wf.k kVar3 = c0167u0.f1521Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj3);
                        c0167u02 = c0167u0;
                        kVar2 = kVar3;
                        kotlin.jvm.internal.A a11 = a10;
                        C0194k c0194k = (C0194k) obj3;
                        List list = c0194k.f1652a;
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                obj = list.get(i12);
                                if (B0.t.a(((B0.u) obj).f1670a, a11.f37621Y)) {
                                    break;
                                }
                                i12++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        B0.u uVar2 = (B0.u) obj;
                        if (uVar2 == null) {
                            if (r9.y.Y(uVar2)) {
                                List list2 = c0194k.f1652a;
                                int size2 = list2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        obj2 = list2.get(i13);
                                        if (((B0.u) obj2).f1673d) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                B0.u uVar3 = (B0.u) obj2;
                                if (uVar3 != null) {
                                    a11.f37621Y = uVar3.f1670a;
                                    n12 = n13;
                                    a5 = a11;
                                    c0167u02.f1521Y = kVar2;
                                    c0167u02.f1522Z = n12;
                                    c0167u02.f1523h0 = n11;
                                    c0167u02.f1524i0 = a5;
                                    c0167u02.f1526k0 = 1;
                                    c10 = n11.c(EnumC0195l.f1657Z, c0167u02);
                                    if (c10 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    n13 = n12;
                                    obj3 = c10;
                                    a11 = a5;
                                }
                            } else if (C5251c.e(r9.y.Q0(uVar2, true)) == 0.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            C0194k c0194k2 = (C0194k) obj3;
                            List list3 = c0194k2.f1652a;
                            int size3 = list3.size();
                            int i122 = 0;
                            while (true) {
                                if (i122 >= size3) {
                                }
                                i122++;
                            }
                            B0.u uVar22 = (B0.u) obj;
                            if (uVar22 == null) {
                                uVar22 = null;
                            }
                        }
                        if (uVar22 != null && !uVar22.b()) {
                            if (r9.y.Y(uVar22)) {
                                uVar = uVar22;
                                if (uVar == null) {
                                    z11 = false;
                                }
                                return Boolean.valueOf(z11);
                            }
                            kVar2.invoke(uVar22);
                            n12 = n13;
                            j10 = uVar22.f1670a;
                            ?? obj4 = new Object();
                            obj4.f37621Y = j10;
                            n11 = n12;
                            a5 = obj4;
                            c0167u02.f1521Y = kVar2;
                            c0167u02.f1522Z = n12;
                            c0167u02.f1523h0 = n11;
                            c0167u02.f1524i0 = a5;
                            c0167u02.f1526k0 = 1;
                            c10 = n11.c(EnumC0195l.f1657Z, c0167u02);
                            if (c10 == enumC5000a) {
                            }
                        }
                        uVar = null;
                        if (uVar == null) {
                        }
                        return Boolean.valueOf(z11);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj3);
                n12 = n10;
                j10 = j6;
                if (!i(n12.f1614j0.f1619u0, j10)) {
                    c0167u02 = c0167u0;
                    kVar2 = kVar;
                    ?? obj42 = new Object();
                    obj42.f37621Y = j10;
                    n11 = n12;
                    a5 = obj42;
                    c0167u02.f1521Y = kVar2;
                    c0167u02.f1522Z = n12;
                    c0167u02.f1523h0 = n11;
                    c0167u02.f1524i0 = a5;
                    c0167u02.f1526k0 = 1;
                    c10 = n11.c(EnumC0195l.f1657Z, c0167u02);
                    if (c10 == enumC5000a) {
                    }
                }
                uVar = null;
                if (uVar == null) {
                }
                return Boolean.valueOf(z11);
            }
        }
        c0167u0 = new AbstractC5156c(abstractC4825e);
        Object obj32 = c0167u0.f1525j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0167u0.f1526k0;
        boolean z112 = true;
        if (i10 == 0) {
        }
    }
}
