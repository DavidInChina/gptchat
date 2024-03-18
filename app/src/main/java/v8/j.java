package V8;

import B.B0;
import B0.C0194k;
import B0.EnumC0195l;
import B0.N;
import B0.u;
import java.util.List;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final B0 f18485a = new B0(5, null);

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
    public static final Object a(N n10, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        int size;
        int i11;
        int i12;
        int size2;
        if (abstractC4825e instanceof b) {
            b bVar2 = (b) abstractC4825e;
            int i13 = bVar2.f18444h0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar2.f18444h0 = i13 - Integer.MIN_VALUE;
                bVar = bVar2;
                Object obj = bVar.f18443Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f18444h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N n11 = bVar.f18442Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        n10 = n11;
                        C0194k c0194k = (C0194k) obj;
                        List list = c0194k.f1652a;
                        size = list.size();
                        i11 = 0;
                        for (i12 = 0; i12 < size; i12++) {
                            ((u) list.get(i12)).a();
                        }
                        List list2 = c0194k.f1652a;
                        size2 = list2.size();
                        while (i11 < size2) {
                            if (((u) list2.get(i11)).f1673d) {
                                bVar.f18442Y = n10;
                                bVar.f18444h0 = 1;
                                obj = n10.c(EnumC0195l.f1657Z, bVar);
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
                        return y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                bVar.f18442Y = n10;
                bVar.f18444h0 = 1;
                obj = n10.c(EnumC0195l.f1657Z, bVar);
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
                return y.f36177a;
            }
        }
        bVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = bVar.f18443Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f18444h0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        r15 = r9.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r2 >= r15) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        r7 = (B0.u) r9.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r7.b() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r9.y.E0(r7, r14.f1614j0.f1623y0, r14.d()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        r15 = B0.EnumC0195l.f1658h0;
        r0.f18482Y = r14;
        r0.f18484h0 = 2;
        r15 = r14.c(r15, r0);
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r15 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0098 -> B:34:0x009b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(N n10, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        N n11;
        C0194k c0194k;
        int size;
        int i11;
        if (abstractC4825e instanceof i) {
            i iVar2 = (i) abstractC4825e;
            int i12 = iVar2.f18484h0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar2.f18484h0 = i12 - Integer.MIN_VALUE;
                iVar = iVar2;
                Object obj = iVar.f18483Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f18484h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N n12 = iVar.f18482Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            n10 = n12;
                            List list = ((C0194k) obj).f1652a;
                            int size2 = list.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                if (((u) list.get(i13)).b()) {
                                    break;
                                }
                            }
                            EnumC0195l enumC0195l = EnumC0195l.f1657Z;
                            iVar.f18482Y = n10;
                            iVar.f18484h0 = 1;
                            obj = n10.c(enumC0195l, iVar);
                            n11 = n10;
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            c0194k = (C0194k) obj;
                            List list2 = c0194k.f1652a;
                            size = list2.size();
                            i11 = 0;
                            while (true) {
                                List list3 = c0194k.f1652a;
                                if (i11 < size) {
                                    if (!r9.y.X((u) list2.get(i11))) {
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
                        N n13 = iVar.f18482Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        n11 = n13;
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
                    EnumC0195l enumC0195l2 = EnumC0195l.f1657Z;
                    iVar.f18482Y = n10;
                    iVar.f18484h0 = 1;
                    obj = n10.c(enumC0195l2, iVar);
                    n11 = n10;
                    if (obj == enumC5000a) {
                    }
                    c0194k = (C0194k) obj;
                    List list222 = c0194k.f1652a;
                    size = list222.size();
                    i11 = 0;
                    while (true) {
                        List list322 = c0194k.f1652a;
                        if (i11 < size) {
                        }
                        i11++;
                    }
                }
            }
        }
        iVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = iVar.f18483Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f18484h0;
        if (i10 == 0) {
        }
    }
}
