package F;

import E0.d0;
import G.C0549d;
import G.C0558m;
import G.C0559n;
import G.C0565u;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kf.AbstractC4268D;
import z.AbstractC6659E;

/* renamed from: F.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538l {

    /* renamed from: b  reason: collision with root package name */
    public G.H f4934b;

    /* renamed from: c  reason: collision with root package name */
    public int f4935c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4933a = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f4936d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f4937e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4938f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4939g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4940h = new ArrayList();

    public static void a(A a5, int i10, C0536j c0536j) {
        long c10;
        long j6;
        long j10;
        G.r[] rVarArr;
        A a10 = a5;
        int i11 = 0;
        long b10 = a10.b(0);
        long j11 = 4294967295L;
        if (a10.f4828c) {
            int i12 = Z0.i.f22798c;
            c10 = kotlin.jvm.internal.m.c((int) (b10 >> 32), i10);
        } else {
            int i13 = Z0.i.f22798c;
            c10 = kotlin.jvm.internal.m.c(i10, (int) (b10 & 4294967295L));
        }
        G.r[] rVarArr2 = c0536j.f4930a;
        int length = rVarArr2.length;
        int i14 = 0;
        while (i11 < length) {
            G.r rVar = rVarArr2[i11];
            int i15 = i14 + 1;
            if (rVar != null) {
                long b11 = a10.b(i14);
                int i16 = Z0.i.f22798c;
                rVarArr = rVarArr2;
                long c11 = kotlin.jvm.internal.m.c(((int) (b11 >> 32)) - ((int) (b10 >> 32)), ((int) (b11 & 4294967295L)) - ((int) (b10 & 4294967295L)));
                j6 = b10;
                j10 = 4294967295L;
                rVar.f5556f = kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (c11 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (c11 & 4294967295L)));
            } else {
                j6 = b10;
                j10 = j11;
                rVarArr = rVarArr2;
            }
            i11++;
            a10 = a5;
            rVarArr2 = rVarArr;
            i14 = i15;
            j11 = j10;
            b10 = j6;
        }
    }

    /* JADX WARN: Type inference failed for: r4v35, types: [F.j, java.lang.Object] */
    public final void b(int i10, int i11, int i12, ArrayList arrayList, v vVar, boolean z10, boolean z11, boolean z12, Ng.F f6) {
        LinkedHashMap linkedHashMap;
        int i13;
        int i14;
        long j6;
        boolean z13;
        ArrayList arrayList2;
        ArrayList arrayList3;
        G.H h10;
        G.H h11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i15;
        int i16;
        Iterator it;
        ArrayList arrayList6;
        ArrayList arrayList7;
        boolean z14;
        int i17;
        int i18;
        int i19;
        G.H h12;
        boolean z15;
        LinkedHashMap linkedHashMap2;
        int i20;
        G.r[] rVarArr;
        int i21;
        G.H h13;
        LinkedHashMap linkedHashMap3;
        boolean z16;
        int i22;
        long j10;
        G.r[] rVarArr2;
        C0565u c0565u;
        C0565u c0565u2;
        ArrayList arrayList8 = arrayList;
        Ng.F f10 = f6;
        G.H h14 = this.f4934b;
        G.H h15 = vVar.f4978a.f4950d;
        this.f4934b = h15;
        int size = arrayList.size();
        int i23 = 0;
        loop0: while (true) {
            linkedHashMap = this.f4933a;
            if (i23 < size) {
                A a5 = (A) arrayList8.get(i23);
                int size2 = a5.f4827b.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object u10 = ((d0) a5.f4827b.get(i24)).u();
                    int i25 = size;
                    if (u10 instanceof C0565u) {
                        c0565u2 = (C0565u) u10;
                    } else {
                        c0565u2 = null;
                    }
                    if (c0565u2 != null) {
                        break loop0;
                    }
                    i24++;
                    size = i25;
                }
                i23++;
            } else if (linkedHashMap.isEmpty()) {
                linkedHashMap.clear();
                this.f4934b = C0549d.f5492b;
                this.f4935c = -1;
                return;
            }
        }
        int i26 = this.f4935c;
        A a10 = (A) kf.t.h2(arrayList);
        if (a10 != null) {
            i13 = a10.f4826a;
        } else {
            i13 = 0;
        }
        this.f4935c = i13;
        if (z10) {
            i14 = i12;
        } else {
            i14 = i11;
        }
        if (z10) {
            j6 = kotlin.jvm.internal.m.c(0, i10);
        } else {
            j6 = kotlin.jvm.internal.m.c(i10, 0);
        }
        if (!z11 && z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        LinkedHashSet linkedHashSet = this.f4936d;
        linkedHashSet.addAll(linkedHashMap.keySet());
        int size3 = arrayList.size();
        int i27 = 0;
        while (true) {
            arrayList2 = this.f4938f;
            arrayList3 = this.f4937e;
            h10 = h15;
            if (i27 >= size3) {
                break;
            }
            A a11 = (A) arrayList8.get(i27);
            int i28 = size3;
            linkedHashSet.remove(a11.f4837l);
            List list = a11.f4827b;
            int size4 = list.size();
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            int i29 = 0;
            while (true) {
                if (i29 < size4) {
                    int i30 = size4;
                    Object u11 = ((d0) list.get(i29)).u();
                    List list2 = list;
                    if (u11 instanceof C0565u) {
                        c0565u = (C0565u) u11;
                    } else {
                        c0565u = null;
                    }
                    if (c0565u != null) {
                        z14 = true;
                        break;
                    }
                    i29++;
                    list = list2;
                    size4 = i30;
                } else {
                    z14 = false;
                    break;
                }
            }
            Object obj = a11.f4837l;
            if (z14) {
                C0536j c0536j = (C0536j) linkedHashMap.get(obj);
                if (c0536j == null) {
                    ?? obj2 = new Object();
                    obj2.f4930a = AbstractC0539m.f4941a;
                    obj2.a(a11, f10);
                    linkedHashMap.put(obj, obj2);
                    if (h14 != null) {
                        i22 = h14.c(obj);
                    } else {
                        i22 = -1;
                    }
                    if (a11.f4826a != i22 && i22 != -1) {
                        if (i22 < i26) {
                            arrayList3.add(a11);
                        } else {
                            arrayList2.add(a11);
                        }
                        i18 = i27;
                        i19 = i26;
                        i17 = i14;
                    } else {
                        long b10 = a11.b(0);
                        if (a11.f4828c) {
                            int i31 = Z0.i.f22798c;
                            i19 = i26;
                            i17 = i14;
                            j10 = b10 & 4294967295L;
                        } else {
                            i19 = i26;
                            i17 = i14;
                            int i32 = Z0.i.f22798c;
                            j10 = b10 >> 32;
                        }
                        a(a11, (int) j10, obj2);
                        if (i22 == -1 && h14 != null) {
                            for (G.r rVar : obj2.f4930a) {
                                if (rVar != null) {
                                    AbstractC6659E abstractC6659E = rVar.f5552b;
                                    if (!((Boolean) rVar.f5555e.getValue()).booleanValue() && abstractC6659E != null) {
                                        rVar.a(true);
                                        rVar.f5560j.i(0.0f);
                                        Ad.l.O0(rVar.f5551a, null, null, new C0558m(rVar, abstractC6659E, null), 3);
                                    }
                                }
                            }
                        }
                        i18 = i27;
                    }
                    G.H h16 = h14;
                    z15 = z13;
                    linkedHashMap2 = linkedHashMap;
                    h12 = h16;
                } else {
                    i19 = i26;
                    i17 = i14;
                    if (z13) {
                        c0536j.a(a11, f10);
                        G.r[] rVarArr3 = c0536j.f4930a;
                        int length = rVarArr3.length;
                        int i33 = 0;
                        while (i33 < length) {
                            G.r rVar2 = rVarArr3[i33];
                            if (rVar2 != null) {
                                linkedHashMap3 = linkedHashMap;
                                rVarArr = rVarArr3;
                                i20 = length;
                                if (!Z0.i.a(rVar2.f5556f, G.r.f5549m)) {
                                    long j11 = rVar2.f5556f;
                                    h13 = h14;
                                    z16 = z13;
                                    i21 = i27;
                                    rVar2.f5556f = kotlin.jvm.internal.m.c(((int) (j11 >> 32)) + ((int) (j6 >> 32)), ((int) (j11 & 4294967295L)) + ((int) (j6 & 4294967295L)));
                                    i33++;
                                    z13 = z16;
                                    h14 = h13;
                                    i27 = i21;
                                    rVarArr3 = rVarArr;
                                    length = i20;
                                    linkedHashMap = linkedHashMap3;
                                } else {
                                    i21 = i27;
                                    h13 = h14;
                                }
                            } else {
                                i21 = i27;
                                rVarArr = rVarArr3;
                                i20 = length;
                                linkedHashMap3 = linkedHashMap;
                                h13 = h14;
                            }
                            z16 = z13;
                            i33++;
                            z13 = z16;
                            h14 = h13;
                            i27 = i21;
                            rVarArr3 = rVarArr;
                            length = i20;
                            linkedHashMap = linkedHashMap3;
                        }
                        i18 = i27;
                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                        h12 = h14;
                        z15 = z13;
                        c(a11);
                        linkedHashMap2 = linkedHashMap4;
                    } else {
                        i18 = i27;
                        LinkedHashMap linkedHashMap5 = linkedHashMap;
                        h12 = h14;
                        z15 = z13;
                        linkedHashMap2 = linkedHashMap5;
                    }
                }
            } else {
                i18 = i27;
                i19 = i26;
                i17 = i14;
                G.H h17 = h14;
                z15 = z13;
                linkedHashMap2 = linkedHashMap;
                h12 = h17;
                linkedHashMap2.remove(obj);
            }
            arrayList8 = arrayList;
            size3 = i28;
            f10 = f6;
            i27 = i18 + 1;
            i26 = i19;
            h15 = h10;
            linkedHashSet = linkedHashSet2;
            i14 = i17;
            G.H h18 = h12;
            linkedHashMap = linkedHashMap2;
            z13 = z15;
            h14 = h18;
        }
        int i34 = i14;
        LinkedHashSet linkedHashSet3 = linkedHashSet;
        G.H h19 = h14;
        boolean z17 = z13;
        LinkedHashMap linkedHashMap6 = linkedHashMap;
        if (z17 && h19 != null) {
            if (arrayList3.size() > 1) {
                h11 = h19;
                kf.r.K1(arrayList3, new C0537k(h11, 2));
            } else {
                h11 = h19;
            }
            int size5 = arrayList3.size();
            int i35 = 0;
            for (int i36 = 0; i36 < size5; i36++) {
                A a12 = (A) arrayList3.get(i36);
                i35 += a12.f4842q;
                a(a12, 0 - i35, (C0536j) AbstractC4268D.Z0(a12.f4837l, linkedHashMap6));
                c(a12);
            }
            if (arrayList2.size() > 1) {
                kf.r.K1(arrayList2, new C0537k(h11, 0));
            }
            int size6 = arrayList2.size();
            int i37 = 0;
            for (int i38 = 0; i38 < size6; i38++) {
                A a13 = (A) arrayList2.get(i38);
                int i39 = i34 + i37;
                i37 += a13.f4842q;
                a(a13, i39, (C0536j) AbstractC4268D.Z0(a13.f4837l, linkedHashMap6));
                c(a13);
            }
        } else {
            h11 = h19;
        }
        Iterator it2 = linkedHashSet3.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList4 = this.f4940h;
            arrayList5 = this.f4939g;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            G.H h20 = h10;
            int c10 = h20.c(next);
            if (c10 == -1) {
                linkedHashMap6.remove(next);
                it = it2;
                arrayList6 = arrayList2;
                arrayList7 = arrayList3;
            } else {
                arrayList7 = arrayList3;
                A a14 = vVar.a(c10);
                a14.f4844s = true;
                G.r[] rVarArr4 = ((C0536j) AbstractC4268D.Z0(next, linkedHashMap6)).f4930a;
                int length2 = rVarArr4.length;
                it = it2;
                int i40 = 0;
                while (true) {
                    if (i40 < length2) {
                        arrayList6 = arrayList2;
                        G.r rVar3 = rVarArr4[i40];
                        if (rVar3 != null && ((Boolean) rVar3.f5554d.getValue()).booleanValue()) {
                            break;
                        }
                        i40++;
                        arrayList2 = arrayList6;
                    } else {
                        arrayList6 = arrayList2;
                        if (h11 != null && c10 == h11.c(next)) {
                            linkedHashMap6.remove(next);
                        }
                    }
                }
                if (c10 < this.f4935c) {
                    arrayList5.add(a14);
                } else {
                    arrayList4.add(a14);
                }
            }
            it2 = it;
            h10 = h20;
            arrayList3 = arrayList7;
            arrayList2 = arrayList6;
        }
        ArrayList arrayList9 = arrayList2;
        ArrayList arrayList10 = arrayList3;
        G.H h21 = h10;
        if (arrayList5.size() > 1) {
            kf.r.K1(arrayList5, new C0537k(h21, 3));
        }
        int size7 = arrayList5.size();
        int i41 = 0;
        int i42 = 0;
        while (i42 < size7) {
            A a15 = (A) arrayList5.get(i42);
            i41 += a15.f4842q;
            if (z11) {
                i16 = ((A) kf.t.f2(arrayList)).f4840o - i41;
            } else {
                i16 = 0 - i41;
            }
            ArrayList arrayList11 = arrayList9;
            a15.d(i16, i11, i12);
            if (z17) {
                c(a15);
            }
            i42++;
            arrayList9 = arrayList11;
        }
        ArrayList arrayList12 = arrayList9;
        if (arrayList4.size() > 1) {
            kf.r.K1(arrayList4, new C0537k(h21, 1));
        }
        int size8 = arrayList4.size();
        int i43 = 0;
        for (int i44 = 0; i44 < size8; i44++) {
            A a16 = (A) arrayList4.get(i44);
            if (z11) {
                A a17 = (A) kf.t.o2(arrayList);
                i15 = a17.f4840o + a17.f4842q + i43;
            } else {
                i15 = i34 + i43;
            }
            i43 += a16.f4842q;
            a16.d(i15, i11, i12);
            if (z17) {
                c(a16);
            }
        }
        AbstractC3557B.c0("<this>", arrayList5);
        Collections.reverse(arrayList5);
        arrayList.addAll(0, arrayList5);
        arrayList.addAll(arrayList4);
        arrayList10.clear();
        arrayList12.clear();
        arrayList5.clear();
        arrayList4.clear();
        linkedHashSet3.clear();
    }

    public final void c(A a5) {
        G.r rVar;
        A a10 = a5;
        G.r[] rVarArr = ((C0536j) AbstractC4268D.Z0(a10.f4837l, this.f4933a)).f4930a;
        int length = rVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            G.r rVar2 = rVarArr[i10];
            int i12 = i11 + 1;
            if (rVar2 != null) {
                long b10 = a10.b(i11);
                long j6 = rVar2.f5556f;
                if (!Z0.i.a(j6, G.r.f5549m) && !Z0.i.a(j6, b10)) {
                    long c10 = kotlin.jvm.internal.m.c(((int) (b10 >> 32)) - ((int) (j6 >> 32)), ((int) (b10 & 4294967295L)) - ((int) (j6 & 4294967295L)));
                    AbstractC6659E abstractC6659E = rVar2.f5553c;
                    if (abstractC6659E != null) {
                        long j10 = ((Z0.i) rVar2.f5559i.getValue()).f22799a;
                        long c11 = kotlin.jvm.internal.m.c(((int) (j10 >> 32)) - ((int) (c10 >> 32)), ((int) (j10 & 4294967295L)) - ((int) (4294967295L & c10)));
                        rVar = rVar2;
                        rVar.c(c11);
                        rVar.b(true);
                        Ad.l.O0(rVar.f5551a, null, null, new C0559n(rVar, abstractC6659E, c11, null), 3);
                        rVar.f5556f = b10;
                    }
                }
                rVar = rVar2;
                rVar.f5556f = b10;
            }
            i10++;
            a10 = a5;
            i11 = i12;
        }
    }
}
