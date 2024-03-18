package p3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: p3.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5077E implements AbstractC5074B {

    /* renamed from: Y  reason: collision with root package name */
    public final s2.t f42407Y = new s2.t(new byte[5], 0);

    /* renamed from: Z  reason: collision with root package name */
    public final SparseArray f42408Z = new SparseArray();

    /* renamed from: h0  reason: collision with root package name */
    public final SparseIntArray f42409h0 = new SparseIntArray();

    /* renamed from: i0  reason: collision with root package name */
    public final int f42410i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ F f42411j0;

    public C5077E(F f6, int i10) {
        this.f42411j0 = f6;
        this.f42410i0 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
        if (r28.u() == 21) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f2, code lost:
        if (r4.b(64) == false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Type inference failed for: r0v30, types: [p3.C] */
    /* JADX WARN: Type inference failed for: r0v33, types: [p3.C] */
    /* JADX WARN: Type inference failed for: r10v8, types: [U3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [U3.e, java.lang.Object] */
    @Override // p3.AbstractC5074B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        int i10;
        s2.z zVar;
        s2.s sVar;
        int i11;
        int i12;
        char c10;
        x xVar;
        x xVar2;
        x xVar3;
        x xVar4;
        int i13;
        s2.z zVar2;
        if (uVar.u() != 2) {
            return;
        }
        F f6 = this.f42411j0;
        f6.getClass();
        int i14 = 0;
        s2.z zVar3 = (s2.z) f6.f42412a.get(0);
        if ((uVar.u() & 128) == 0) {
            return;
        }
        uVar.G(1);
        int z10 = uVar.z();
        int i15 = 3;
        uVar.G(3);
        s2.t tVar = this.f42407Y;
        uVar.e(tVar.f45186b, 0, 2);
        tVar.p(0);
        tVar.s(3);
        int i16 = 13;
        f6.f42427p = tVar.i(13);
        uVar.e(tVar.f45186b, 0, 2);
        tVar.p(0);
        int i17 = 4;
        tVar.s(4);
        uVar.G(tVar.i(12));
        SparseArray sparseArray = this.f42408Z;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f42409h0;
        sparseIntArray.clear();
        int a5 = uVar.a();
        while (true) {
            SparseBooleanArray sparseBooleanArray = f6.f42417f;
            if (a5 > 0) {
                uVar.e(tVar.f45186b, i14, 5);
                tVar.p(i14);
                int i18 = tVar.i(8);
                tVar.s(i15);
                int i19 = tVar.i(i16);
                tVar.s(i17);
                int i20 = tVar.i(12);
                int i21 = uVar.f45194b;
                int i22 = i21 + i20;
                x xVar5 = null;
                String str = null;
                ArrayList arrayList = null;
                int i23 = -1;
                while (uVar.f45194b < i22) {
                    int u10 = uVar.u();
                    int u11 = uVar.f45194b + uVar.u();
                    if (u11 > i22) {
                        s2.z zVar4 = zVar3;
                        int i24 = z10;
                        s2.t tVar2 = tVar;
                        uVar.F(i22);
                        String str2 = str;
                        sVar = new s2.s(i23, str2, arrayList, Arrays.copyOfRange(uVar.f45193a, i21, i22));
                        if (i18 != 6 || i18 == 5) {
                            i18 = sVar.f45181a;
                        }
                        a5 -= i20 + 5;
                        if (!sparseBooleanArray.get(i19)) {
                            c10 = 2;
                            i12 = 3;
                            i11 = 4;
                        } else {
                            C5084g c5084g = f6.f42415d;
                            if (i18 != 2) {
                                c5084g.getClass();
                                i12 = 3;
                                if (i18 != 3) {
                                    if (i18 != 4) {
                                        if (i18 != 21) {
                                            if (i18 != 27) {
                                                if (i18 != 36) {
                                                    if (i18 != 89) {
                                                        if (i18 != 138) {
                                                            if (i18 != 172) {
                                                                if (i18 != 257) {
                                                                    if (i18 != 134) {
                                                                        if (i18 != 135) {
                                                                            switch (i18) {
                                                                                case 15:
                                                                                    c10 = 2;
                                                                                    if (!c5084g.b(2)) {
                                                                                        xVar3 = new x(new C5083f(str2, false));
                                                                                        xVar5 = xVar3;
                                                                                    }
                                                                                    xVar2 = xVar5;
                                                                                    break;
                                                                                case 16:
                                                                                    xVar4 = new x(new o(new J(c5084g.a(sVar))));
                                                                                    c10 = 2;
                                                                                    xVar2 = xVar4;
                                                                                    break;
                                                                                case 17:
                                                                                    if (!c5084g.b(2)) {
                                                                                        xVar5 = new x(new u(str2));
                                                                                    }
                                                                                    xVar4 = xVar5;
                                                                                    c10 = 2;
                                                                                    xVar2 = xVar4;
                                                                                    break;
                                                                                default:
                                                                                    switch (i18) {
                                                                                        case 128:
                                                                                            c10 = 2;
                                                                                            break;
                                                                                        case 129:
                                                                                            break;
                                                                                        case 130:
                                                                                            break;
                                                                                        default:
                                                                                            xVar4 = xVar5;
                                                                                            c10 = 2;
                                                                                            xVar2 = xVar4;
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        }
                                                                        c10 = 2;
                                                                        xVar2 = new x(new C5079b(str2));
                                                                    } else {
                                                                        c10 = 2;
                                                                        if (!c5084g.b(16)) {
                                                                            xVar3 = new C5075C(new U3.u("application/x-scte35"));
                                                                            xVar5 = xVar3;
                                                                        }
                                                                        xVar2 = xVar5;
                                                                    }
                                                                } else {
                                                                    c10 = 2;
                                                                    xVar2 = new C5075C(new U3.u("application/vnd.dvb.ait"));
                                                                }
                                                            } else {
                                                                c10 = 2;
                                                                xVar2 = new x(new C5081d(str2));
                                                            }
                                                        }
                                                        c10 = 2;
                                                        xVar2 = new x(new C5085h(str2));
                                                    } else {
                                                        c10 = 2;
                                                        xVar2 = new x(new C5086i((List) sVar.f45183c));
                                                    }
                                                } else {
                                                    c10 = 2;
                                                    List a10 = c5084g.a(sVar);
                                                    ?? obj = new Object();
                                                    obj.f17400Y = a10;
                                                    obj.f17401Z = new L2.G[a10.size()];
                                                    xVar2 = new x(new t(obj));
                                                }
                                                i11 = 4;
                                                xVar = xVar2;
                                            } else {
                                                c10 = 2;
                                                i11 = 4;
                                                if (!c5084g.b(4)) {
                                                    List a11 = c5084g.a(sVar);
                                                    ?? obj2 = new Object();
                                                    obj2.f17400Y = a11;
                                                    obj2.f17401Z = new L2.G[a11.size()];
                                                    xVar5 = new x(new r(obj2, c5084g.b(1), c5084g.b(8)));
                                                }
                                                xVar = xVar5;
                                            }
                                        } else {
                                            c10 = 2;
                                            i11 = 4;
                                            xVar = new x(new C5086i());
                                        }
                                        sparseIntArray.put(i19, i19);
                                        sparseArray.put(i19, xVar);
                                    } else {
                                        i11 = 4;
                                        c10 = 2;
                                    }
                                } else {
                                    c10 = 2;
                                    i11 = 4;
                                }
                                xVar = new x(new v(str2));
                                sparseIntArray.put(i19, i19);
                                sparseArray.put(i19, xVar);
                            } else {
                                c10 = 2;
                                i12 = 3;
                            }
                            i11 = 4;
                            xVar = new x(new l(new J(c5084g.a(sVar))));
                            sparseIntArray.put(i19, i19);
                            sparseArray.put(i19, xVar);
                        }
                        i15 = i12;
                        i17 = i11;
                        zVar3 = zVar4;
                        tVar = tVar2;
                        z10 = i24;
                        i14 = 0;
                        i16 = 13;
                    } else {
                        s2.t tVar3 = tVar;
                        if (u10 == 5) {
                            long v10 = uVar.v();
                            if (v10 == 1094921523) {
                                i23 = 129;
                            } else if (v10 == 1161904947) {
                                i23 = 135;
                            } else {
                                if (v10 != 1094921524) {
                                    if (v10 == 1212503619) {
                                        i23 = 36;
                                    }
                                }
                                i23 = 172;
                            }
                            zVar2 = zVar3;
                            i13 = z10;
                        } else if (u10 == 106) {
                            i13 = z10;
                            i23 = 129;
                            zVar2 = zVar3;
                        } else if (u10 == 122) {
                            zVar2 = zVar3;
                            i13 = z10;
                            i23 = 135;
                        } else {
                            if (u10 != 127) {
                                if (u10 == 123) {
                                    zVar2 = zVar3;
                                    i13 = z10;
                                    i23 = 138;
                                } else if (u10 == 10) {
                                    str = uVar.s(3, w8.e.f48221c).trim();
                                } else if (u10 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (uVar.f45194b < u11) {
                                        String trim = uVar.s(3, w8.e.f48221c).trim();
                                        uVar.u();
                                        s2.z zVar5 = zVar3;
                                        byte[] bArr = new byte[4];
                                        uVar.e(bArr, 0, 4);
                                        arrayList2.add(new G(trim, bArr));
                                        zVar3 = zVar5;
                                        z10 = z10;
                                    }
                                    zVar2 = zVar3;
                                    i13 = z10;
                                    arrayList = arrayList2;
                                    i23 = 89;
                                } else {
                                    zVar2 = zVar3;
                                    i13 = z10;
                                    if (u10 == 111) {
                                        i23 = 257;
                                    }
                                }
                            }
                            zVar2 = zVar3;
                            i13 = z10;
                        }
                        uVar.G(u11 - uVar.f45194b);
                        zVar3 = zVar2;
                        tVar = tVar3;
                        z10 = i13;
                    }
                }
                s2.z zVar42 = zVar3;
                int i242 = z10;
                s2.t tVar22 = tVar;
                uVar.F(i22);
                String str22 = str;
                sVar = new s2.s(i23, str22, arrayList, Arrays.copyOfRange(uVar.f45193a, i21, i22));
                if (i18 != 6) {
                }
                i18 = sVar.f45181a;
                a5 -= i20 + 5;
                if (!sparseBooleanArray.get(i19)) {
                }
                i15 = i12;
                i17 = i11;
                zVar3 = zVar42;
                tVar = tVar22;
                z10 = i242;
                i14 = 0;
                i16 = 13;
            } else {
                s2.z zVar6 = zVar3;
                int i25 = z10;
                int size = sparseIntArray.size();
                int i26 = 0;
                while (true) {
                    SparseArray sparseArray2 = f6.f42416e;
                    if (i26 < size) {
                        int keyAt = sparseIntArray.keyAt(i26);
                        int valueAt = sparseIntArray.valueAt(i26);
                        sparseBooleanArray.put(keyAt, true);
                        f6.f42418g.put(valueAt, true);
                        I i27 = (I) sparseArray.valueAt(i26);
                        if (i27 != null) {
                            if (i27 != f6.f42426o) {
                                L2.s sVar2 = f6.f42421j;
                                i10 = i25;
                                H h10 = new H(i10, keyAt, 8192);
                                zVar = zVar6;
                                i27.c(zVar, sVar2, h10);
                            } else {
                                zVar = zVar6;
                                i10 = i25;
                            }
                            sparseArray2.put(valueAt, i27);
                        } else {
                            zVar = zVar6;
                            i10 = i25;
                        }
                        i26++;
                        zVar6 = zVar;
                        i25 = i10;
                    } else {
                        sparseArray2.remove(this.f42410i0);
                        f6.f42422k = 0;
                        f6.f42421j.d();
                        f6.f42423l = true;
                        return;
                    }
                }
            }
        }
    }

    @Override // p3.AbstractC5074B
    public final void c(s2.z zVar, L2.s sVar, H h10) {
    }
}
