package B;

import B0.C0194k;
import B0.EnumC0195l;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public abstract class Z1 {

    /* renamed from: a */
    public static final B0 f1251a = new B0(3, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[LOOP:0: B:18:0x004b->B:19:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:17:0x0041). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(B0.N n10, AbstractC4825e abstractC4825e) {
        D1 d12;
        int i10;
        int size;
        int i11;
        int i12;
        int size2;
        if (abstractC4825e instanceof D1) {
            D1 d13 = (D1) abstractC4825e;
            int i13 = d13.f1056h0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                d13.f1056h0 = i13 - Integer.MIN_VALUE;
                d12 = d13;
                Object obj = d12.f1055Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = d12.f1056h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        B0.N n11 = d12.f1054Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        n10 = n11;
                        C0194k c0194k = (C0194k) obj;
                        List list = c0194k.f1652a;
                        size = list.size();
                        i11 = 0;
                        for (i12 = 0; i12 < size; i12++) {
                            ((B0.u) list.get(i12)).a();
                        }
                        List list2 = c0194k.f1652a;
                        size2 = list2.size();
                        while (i11 < size2) {
                            if (((B0.u) list2.get(i11)).f1673d) {
                                d12.f1054Y = n10;
                                d12.f1056h0 = 1;
                                obj = n10.c(EnumC0195l.f1657Z, d12);
                                n10 = n10;
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                C0194k c0194k2 = (C0194k) obj;
                                List list3 = c0194k2.f1652a;
                                size = list3.size();
                                i11 = 0;
                                while (i12 < size) {
                                }
                                List list22 = c0194k2.f1652a;
                                size2 = list22.size();
                                while (i11 < size2) {
                                }
                            } else {
                                i11++;
                            }
                        }
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                d12.f1054Y = n10;
                d12.f1056h0 = 1;
                obj = n10.c(EnumC0195l.f1657Z, d12);
                n10 = n10;
                if (obj == enumC5000a) {
                }
                C0194k c0194k22 = (C0194k) obj;
                List list32 = c0194k22.f1652a;
                size = list32.size();
                i11 = 0;
                while (i12 < size) {
                }
                List list222 = c0194k22.f1652a;
                size2 = list222.size();
                while (i11 < size2) {
                }
                return jf.y.f36177a;
            }
        }
        d12 = new AbstractC5156c(abstractC4825e);
        Object obj2 = d12.f1055Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = d12.f1056h0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(B0.N n10, boolean z10, EnumC0195l enumC0195l, AbstractC4825e abstractC4825e) {
        B1 b1;
        int i10;
        int size;
        int i11;
        if (abstractC4825e instanceof B1) {
            B1 b12 = (B1) abstractC4825e;
            int i12 = b12.f1038j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                b12.f1038j0 = i12 - Integer.MIN_VALUE;
                b1 = b12;
                Object obj = b1.f1037i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = b1.f1038j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        boolean z11 = b1.f1036h0;
                        EnumC0195l enumC0195l2 = b1.f1035Z;
                        B0.N n11 = b1.f1034Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        z10 = z11;
                        n10 = n11;
                        enumC0195l = enumC0195l2;
                        C0194k c0194k = (C0194k) obj;
                        List list = c0194k.f1652a;
                        size = list.size();
                        i11 = 0;
                        while (i11 < size) {
                            B0.u uVar = (B0.u) list.get(i11);
                            if (z10) {
                                if (!uVar.b() && !uVar.f1677h && uVar.f1673d) {
                                    i11++;
                                }
                                b1.f1034Y = n10;
                                b1.f1035Z = enumC0195l;
                                b1.f1036h0 = z10;
                                b1.f1038j0 = 1;
                                obj = n10.c(enumC0195l, b1);
                                if (obj == enumC5000a) {
                                }
                            } else if (!r9.y.W(uVar)) {
                                b1.f1034Y = n10;
                                b1.f1035Z = enumC0195l;
                                b1.f1036h0 = z10;
                                b1.f1038j0 = 1;
                                obj = n10.c(enumC0195l, b1);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                            } else {
                                i11++;
                            }
                            C0194k c0194k2 = (C0194k) obj;
                            List list2 = c0194k2.f1652a;
                            size = list2.size();
                            i11 = 0;
                            while (i11 < size) {
                            }
                        }
                        return c0194k2.f1652a.get(0);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                b1.f1034Y = n10;
                b1.f1035Z = enumC0195l;
                b1.f1036h0 = z10;
                b1.f1038j0 = 1;
                obj = n10.c(enumC0195l, b1);
                if (obj == enumC5000a) {
                }
                C0194k c0194k22 = (C0194k) obj;
                List list22 = c0194k22.f1652a;
                size = list22.size();
                i11 = 0;
                while (i11 < size) {
                }
                return c0194k22.f1652a.get(0);
            }
        }
        b1 = new AbstractC5156c(abstractC4825e);
        Object obj2 = b1.f1037i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = b1.f1038j0;
        if (i10 == 0) {
        }
    }

    public static /* synthetic */ Object c(B0.N n10, AbstractC4825e abstractC4825e, int i10) {
        boolean z10 = true;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        return b(n10, z10, EnumC0195l.f1657Z, abstractC4825e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [B.B0] */
    public static Object d(B0.A a5, wf.k kVar, na.L0 l02, wf.k kVar2, AbstractC4825e abstractC4825e, int i10) {
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        wf.k kVar3 = kVar;
        na.L0 l03 = l02;
        if ((i10 & 4) != 0) {
            l03 = f1251a;
        }
        Object e02 = Ad.l.e0(new X1(a5, null, kVar3, null, kVar2, l03), abstractC4825e);
        if (e02 != EnumC5000a.f41328Y) {
            return jf.y.f36177a;
        }
        return e02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        r0 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r9 >= r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
        r10 = (B0.u) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r10.b() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r9.y.E0(r10, r8.f1614j0.f1623y0, r8.d()) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
        r0 = B0.EnumC0195l.f1658h0;
        r1.f1243Y = r8;
        r1.f1244Z = r3;
        r1.f1246i0 = 2;
        r0 = r8.c(r0, r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00af -> B:13:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(B0.N n10, EnumC0195l enumC0195l, AbstractC4825e abstractC4825e) {
        Y1 y12;
        int i10;
        B0.N n11;
        EnumC0195l enumC0195l2;
        Y1 y13;
        C0194k c0194k;
        int size;
        int i11;
        Y1 y14;
        EnumC0195l enumC0195l3;
        B0.N n12;
        Object c10;
        if (abstractC4825e instanceof Y1) {
            Y1 y15 = (Y1) abstractC4825e;
            int i12 = y15.f1246i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                y15.f1246i0 = i12 - Integer.MIN_VALUE;
                y12 = y15;
                Object obj = y12.f1245h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = y12.f1246i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            enumC0195l2 = y12.f1244Z;
                            n11 = y12.f1243Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            Y1 y16 = y12;
                            EnumC0195l enumC0195l4 = enumC0195l2;
                            y14 = y16;
                            enumC0195l3 = enumC0195l4;
                            List list = ((C0194k) obj).f1652a;
                            int size2 = list.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                if (((B0.u) list.get(i13)).b()) {
                                    return null;
                                }
                            }
                            n12 = n11;
                            y14.f1243Y = n12;
                            y14.f1244Z = enumC0195l3;
                            y14.f1246i0 = 1;
                            c10 = n12.c(enumC0195l3, y14);
                            if (c10 != enumC5000a) {
                                return enumC5000a;
                            }
                            n11 = n12;
                            obj = c10;
                            Y1 y17 = y14;
                            enumC0195l2 = enumC0195l3;
                            y13 = y17;
                            c0194k = (C0194k) obj;
                            List list2 = c0194k.f1652a;
                            size = list2.size();
                            i11 = 0;
                            while (true) {
                                List list3 = c0194k.f1652a;
                                if (i11 < size) {
                                    if (!r9.y.X((B0.u) list2.get(i11))) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    return list3.get(0);
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        enumC0195l2 = y12.f1244Z;
                        n11 = y12.f1243Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        y13 = y12;
                        c0194k = (C0194k) obj;
                        List list22 = c0194k.f1652a;
                        size = list22.size();
                        i11 = 0;
                        while (true) {
                            List list32 = c0194k.f1652a;
                            if (i11 < size) {
                            }
                            i11++;
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    n12 = n10;
                    y14 = y12;
                    enumC0195l3 = enumC0195l;
                    y14.f1243Y = n12;
                    y14.f1244Z = enumC0195l3;
                    y14.f1246i0 = 1;
                    c10 = n12.c(enumC0195l3, y14);
                    if (c10 != enumC5000a) {
                    }
                }
            }
        }
        y12 = new AbstractC5156c(abstractC4825e);
        Object obj2 = y12.f1245h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = y12.f1246i0;
        if (i10 == 0) {
        }
    }
}
