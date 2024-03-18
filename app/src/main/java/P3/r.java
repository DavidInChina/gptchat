package p3;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p2.C5059l;
import p2.C5065s;
import q1.AbstractC5260f;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class r implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final U3.e f42604a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42605b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42606c;

    /* renamed from: g  reason: collision with root package name */
    public long f42610g;

    /* renamed from: i  reason: collision with root package name */
    public String f42612i;

    /* renamed from: j  reason: collision with root package name */
    public L2.G f42613j;

    /* renamed from: k  reason: collision with root package name */
    public q f42614k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42615l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f42617n;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f42611h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    public final w f42607d = new w(7);

    /* renamed from: e  reason: collision with root package name */
    public final w f42608e = new w(8);

    /* renamed from: f  reason: collision with root package name */
    public final w f42609f = new w(6);

    /* renamed from: m  reason: collision with root package name */
    public long f42616m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public final s2.u f42618o = new s2.u();

    public r(U3.e eVar, boolean z10, boolean z11) {
        this.f42604a = eVar;
        this.f42605b = z10;
        this.f42606c = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!this.f42615l || this.f42614k.f42587c) {
            this.f42607d.a(bArr, i10, i11);
            this.f42608e.a(bArr, i10, i11);
        }
        this.f42609f.a(bArr, i10, i11);
        q qVar = this.f42614k;
        if (qVar.f42595k) {
            int i18 = i11 - i10;
            byte[] bArr2 = qVar.f42591g;
            int length = bArr2.length;
            int i19 = qVar.f42592h + i18;
            if (length < i19) {
                qVar.f42591g = Arrays.copyOf(bArr2, i19 * 2);
            }
            System.arraycopy(bArr, i10, qVar.f42591g, qVar.f42592h, i18);
            int i20 = qVar.f42592h + i18;
            qVar.f42592h = i20;
            byte[] bArr3 = qVar.f42591g;
            s2.t tVar = qVar.f42590f;
            tVar.f45186b = bArr3;
            tVar.f45188d = 0;
            tVar.f45187c = i20;
            tVar.f45189e = 0;
            tVar.a();
            if (tVar.d(8)) {
                tVar.r();
                int i21 = tVar.i(2);
                tVar.s(5);
                if (tVar.e()) {
                    tVar.l();
                    if (tVar.e()) {
                        int l10 = tVar.l();
                        if (!qVar.f42587c) {
                            qVar.f42595k = false;
                            p pVar = qVar.f42598n;
                            pVar.f42573e = l10;
                            pVar.f42570b = true;
                        } else if (tVar.e()) {
                            int l11 = tVar.l();
                            SparseArray sparseArray = qVar.f42589e;
                            if (sparseArray.indexOfKey(l11) < 0) {
                                qVar.f42595k = false;
                                return;
                            }
                            t2.e eVar = (t2.e) sparseArray.get(l11);
                            t2.f fVar = (t2.f) qVar.f42588d.get(eVar.f45650a);
                            if (fVar.f45661j) {
                                if (tVar.d(2)) {
                                    tVar.s(2);
                                } else {
                                    return;
                                }
                            }
                            int i22 = fVar.f45663l;
                            if (tVar.d(i22)) {
                                int i23 = tVar.i(i22);
                                if (!fVar.f45662k) {
                                    if (tVar.d(1)) {
                                        z12 = tVar.h();
                                        if (z12) {
                                            if (tVar.d(1)) {
                                                z11 = tVar.h();
                                                z10 = true;
                                                if (qVar.f42593i != 5) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (!z13) {
                                                    if (tVar.e()) {
                                                        i12 = tVar.l();
                                                    } else {
                                                        return;
                                                    }
                                                } else {
                                                    i12 = 0;
                                                }
                                                boolean z14 = eVar.f45651b;
                                                i13 = fVar.f45664m;
                                                if (i13 != 0) {
                                                    int i24 = fVar.f45665n;
                                                    if (tVar.d(i24)) {
                                                        i17 = tVar.i(i24);
                                                        if (z14 && !z12) {
                                                            if (tVar.e()) {
                                                                i14 = tVar.m();
                                                                i16 = 0;
                                                                i15 = 0;
                                                                p pVar2 = qVar.f42598n;
                                                                pVar2.f42571c = fVar;
                                                                pVar2.f42572d = i21;
                                                                pVar2.f42573e = l10;
                                                                pVar2.f42574f = i23;
                                                                pVar2.f42575g = l11;
                                                                pVar2.f42576h = z12;
                                                                pVar2.f42577i = z10;
                                                                pVar2.f42578j = z11;
                                                                pVar2.f42579k = z13;
                                                                pVar2.f42580l = i12;
                                                                pVar2.f42581m = i17;
                                                                pVar2.f42582n = i14;
                                                                pVar2.f42583o = i16;
                                                                pVar2.f42584p = i15;
                                                                pVar2.f42569a = true;
                                                                pVar2.f42570b = true;
                                                                qVar.f42595k = false;
                                                            }
                                                            return;
                                                        }
                                                        i16 = 0;
                                                    } else {
                                                        return;
                                                    }
                                                } else if (i13 == 1 && !fVar.f45666o) {
                                                    if (tVar.e()) {
                                                        int m10 = tVar.m();
                                                        if (z14 && !z12) {
                                                            if (tVar.e()) {
                                                                i15 = tVar.m();
                                                                i14 = 0;
                                                                i16 = m10;
                                                                i17 = 0;
                                                                p pVar22 = qVar.f42598n;
                                                                pVar22.f42571c = fVar;
                                                                pVar22.f42572d = i21;
                                                                pVar22.f42573e = l10;
                                                                pVar22.f42574f = i23;
                                                                pVar22.f42575g = l11;
                                                                pVar22.f42576h = z12;
                                                                pVar22.f42577i = z10;
                                                                pVar22.f42578j = z11;
                                                                pVar22.f42579k = z13;
                                                                pVar22.f42580l = i12;
                                                                pVar22.f42581m = i17;
                                                                pVar22.f42582n = i14;
                                                                pVar22.f42583o = i16;
                                                                pVar22.f42584p = i15;
                                                                pVar22.f42569a = true;
                                                                pVar22.f42570b = true;
                                                                qVar.f42595k = false;
                                                            }
                                                            return;
                                                        }
                                                        i16 = m10;
                                                        i17 = 0;
                                                    } else {
                                                        return;
                                                    }
                                                } else {
                                                    i17 = 0;
                                                    i16 = 0;
                                                }
                                                i15 = 0;
                                                i14 = 0;
                                                p pVar222 = qVar.f42598n;
                                                pVar222.f42571c = fVar;
                                                pVar222.f42572d = i21;
                                                pVar222.f42573e = l10;
                                                pVar222.f42574f = i23;
                                                pVar222.f42575g = l11;
                                                pVar222.f42576h = z12;
                                                pVar222.f42577i = z10;
                                                pVar222.f42578j = z11;
                                                pVar222.f42579k = z13;
                                                pVar222.f42580l = i12;
                                                pVar222.f42581m = i17;
                                                pVar222.f42582n = i14;
                                                pVar222.f42583o = i16;
                                                pVar222.f42584p = i15;
                                                pVar222.f42569a = true;
                                                pVar222.f42570b = true;
                                                qVar.f42595k = false;
                                            }
                                            return;
                                        }
                                        z11 = false;
                                    } else {
                                        return;
                                    }
                                } else {
                                    z12 = false;
                                    z11 = false;
                                }
                                z10 = z11;
                                if (qVar.f42593i != 5) {
                                }
                                if (!z13) {
                                }
                                boolean z142 = eVar.f45651b;
                                i13 = fVar.f45664m;
                                if (i13 != 0) {
                                }
                                i15 = 0;
                                i14 = 0;
                                p pVar2222 = qVar.f42598n;
                                pVar2222.f42571c = fVar;
                                pVar2222.f42572d = i21;
                                pVar2222.f42573e = l10;
                                pVar2222.f42574f = i23;
                                pVar2222.f42575g = l11;
                                pVar2222.f42576h = z12;
                                pVar2222.f42577i = z10;
                                pVar2222.f42578j = z11;
                                pVar2222.f42579k = z13;
                                pVar2222.f42580l = i12;
                                pVar2222.f42581m = i17;
                                pVar2222.f42582n = i14;
                                pVar2222.f42583o = i16;
                                pVar2222.f42584p = i15;
                                pVar2222.f42569a = true;
                                pVar2222.f42570b = true;
                                qVar.f42595k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e9, code lost:
        if (r2 != 1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
        if (r7.f42582n != r8.f42582n) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0248, code lost:
        if (r7.f42584p != r8.f42584p) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0256, code lost:
        if (r7.f42580l != r8.f42580l) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02aa A[ADDED_TO_REGION] */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        int i10;
        long j6;
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        w wVar;
        q qVar;
        boolean z10;
        boolean z11;
        int i15;
        boolean z12;
        boolean z13;
        int i16;
        q qVar2;
        int i17;
        int i18;
        long j10;
        int i19;
        int i20;
        Gi.e.o(this.f42613j);
        int i21 = AbstractC5530A.f45131a;
        int i22 = uVar.f45194b;
        int i23 = uVar.f45195c;
        byte[] bArr2 = uVar.f45193a;
        this.f42610g += uVar.a();
        this.f42613j.a(uVar.a(), uVar);
        while (true) {
            int b10 = t2.g.b(bArr2, i22, i23, this.f42611h);
            if (b10 == i23) {
                a(bArr2, i22, i23);
                return;
            }
            int i24 = b10 + 3;
            int i25 = bArr2[i24] & 31;
            int i26 = b10 - i22;
            if (i26 > 0) {
                a(bArr2, i22, b10);
            }
            int i27 = i23 - b10;
            long j11 = this.f42610g - i27;
            if (i26 < 0) {
                i10 = -i26;
            } else {
                i10 = 0;
            }
            long j12 = this.f42616m;
            boolean z14 = this.f42615l;
            w wVar2 = this.f42608e;
            w wVar3 = this.f42607d;
            if (!z14 || this.f42614k.f42587c) {
                wVar3.e(i10);
                wVar2.e(i10);
                if (!this.f42615l) {
                    if (wVar3.f42683e && wVar2.f42683e) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Arrays.copyOf((byte[]) wVar3.f42684f, wVar3.f42681c));
                        arrayList.add(Arrays.copyOf((byte[]) wVar2.f42684f, wVar2.f42681c));
                        i14 = i23;
                        t2.f d10 = t2.g.d((byte[]) wVar3.f42684f, 3, wVar3.f42681c);
                        bArr = bArr2;
                        i13 = i24;
                        s2.t tVar = new s2.t((byte[]) wVar2.f42684f, 4, wVar2.f42681c);
                        int l10 = tVar.l();
                        int l11 = tVar.l();
                        tVar.r();
                        t2.e eVar = new t2.e(l10, l11, tVar.h());
                        i12 = i25;
                        i11 = i27;
                        j6 = j11;
                        String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(d10.f45652a), Integer.valueOf(d10.f45653b), Integer.valueOf(d10.f45654c));
                        L2.G g10 = this.f42613j;
                        p2.r rVar = new p2.r();
                        rVar.f42227a = this.f42612i;
                        rVar.f42237k = "video/avc";
                        rVar.f42234h = format;
                        rVar.f42242p = d10.f45656e;
                        rVar.f42243q = d10.f45657f;
                        rVar.f42249w = new C5059l(d10.f45667p, d10.f45668q, d10.f45669r, d10.f45659h + 8, d10.f45660i + 8, null);
                        rVar.f42246t = d10.f45658g;
                        rVar.f42239m = arrayList;
                        g10.b(new C5065s(rVar));
                        this.f42615l = true;
                        this.f42614k.f42588d.append(d10.f45655d, d10);
                        this.f42614k.f42589e.append(l10, eVar);
                        wVar3.f();
                        wVar2.f();
                    }
                } else {
                    i11 = i27;
                    i14 = i23;
                    bArr = bArr2;
                    i13 = i24;
                    i12 = i25;
                    j6 = j11;
                    if (wVar3.f42683e) {
                        t2.f d11 = t2.g.d((byte[]) wVar3.f42684f, 3, wVar3.f42681c);
                        this.f42614k.f42588d.append(d11.f45655d, d11);
                        wVar3.f();
                    } else if (wVar2.f42683e) {
                        s2.t tVar2 = new s2.t((byte[]) wVar2.f42684f, 4, wVar2.f42681c);
                        int l12 = tVar2.l();
                        int l13 = tVar2.l();
                        tVar2.r();
                        this.f42614k.f42589e.append(l12, new t2.e(l12, l13, tVar2.h()));
                        wVar2.f();
                    }
                }
                wVar = this.f42609f;
                if (wVar.e(i10)) {
                    int i28 = wVar.f42681c;
                    s2.u uVar2 = this.f42618o;
                    uVar2.D(t2.g.e(i28, (byte[]) wVar.f42684f), (byte[]) wVar.f42684f);
                    uVar2.F(4);
                    AbstractC5260f.k(j12, uVar2, (L2.G[]) this.f42604a.f17401Z);
                }
                qVar = this.f42614k;
                z10 = this.f42615l;
                if (qVar.f42593i != 9) {
                    if (qVar.f42587c) {
                        p pVar = qVar.f42598n;
                        p pVar2 = qVar.f42597m;
                        if (pVar.f42569a) {
                            if (pVar2.f42569a) {
                                t2.f fVar = pVar.f42571c;
                                Gi.e.o(fVar);
                                t2.f fVar2 = pVar2.f42571c;
                                Gi.e.o(fVar2);
                                if (pVar.f42574f == pVar2.f42574f && pVar.f42575g == pVar2.f42575g && pVar.f42576h == pVar2.f42576h && ((!pVar.f42577i || !pVar2.f42577i || pVar.f42578j == pVar2.f42578j) && ((i19 = pVar.f42572d) == (i20 = pVar2.f42572d) || (i19 != 0 && i20 != 0)))) {
                                    int i29 = fVar2.f45664m;
                                    int i30 = fVar.f45664m;
                                    if (i30 == 0) {
                                        if (i29 == 0) {
                                            if (pVar.f42581m == pVar2.f42581m) {
                                            }
                                        }
                                    }
                                    if (i30 == 1) {
                                        if (i29 == 1) {
                                            if (pVar.f42583o == pVar2.f42583o) {
                                            }
                                        }
                                    }
                                    boolean z15 = pVar.f42579k;
                                    if (z15 == pVar2.f42579k) {
                                        if (z15) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (qVar.f42586b) {
                        p pVar3 = qVar.f42598n;
                        if (pVar3.f42570b && ((i18 = pVar3.f42573e) == 7 || i18 == 2)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = qVar.f42603s;
                    }
                    boolean z16 = qVar.f42602r;
                    i15 = qVar.f42593i;
                    if (i15 == 5 && (!z11 || i15 != 1)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    z13 = z12 | z16;
                    qVar.f42602r = z13;
                    if (z13) {
                        this.f42617n = false;
                    }
                    long j13 = this.f42616m;
                    if (this.f42615l || this.f42614k.f42587c) {
                        i16 = i12;
                        wVar3.g(i16);
                        wVar2.g(i16);
                    } else {
                        i16 = i12;
                    }
                    wVar.g(i16);
                    qVar2 = this.f42614k;
                    boolean z17 = this.f42617n;
                    qVar2.f42593i = i16;
                    qVar2.f42596l = j13;
                    qVar2.f42594j = j6;
                    qVar2.f42603s = z17;
                    if (qVar2.f42586b) {
                        i17 = 1;
                    } else {
                        i17 = 1;
                    }
                    if (qVar2.f42587c) {
                        if (i16 != 5 && i16 != i17) {
                            if (i16 != 2) {
                            }
                            p pVar4 = qVar2.f42597m;
                            qVar2.f42597m = qVar2.f42598n;
                            qVar2.f42598n = pVar4;
                            pVar4.f42570b = false;
                            pVar4.f42569a = false;
                            qVar2.f42592h = 0;
                            qVar2.f42595k = true;
                            i23 = i14;
                            bArr2 = bArr;
                            i22 = i13;
                        }
                        p pVar42 = qVar2.f42597m;
                        qVar2.f42597m = qVar2.f42598n;
                        qVar2.f42598n = pVar42;
                        pVar42.f42570b = false;
                        pVar42.f42569a = false;
                        qVar2.f42592h = 0;
                        qVar2.f42595k = true;
                        i23 = i14;
                        bArr2 = bArr;
                        i22 = i13;
                    }
                    i23 = i14;
                    bArr2 = bArr;
                    i22 = i13;
                }
                if (z10 && qVar.f42599o) {
                    long j14 = qVar.f42594j;
                    int i31 = i11 + ((int) (j6 - j14));
                    j10 = qVar.f42601q;
                    if (j10 != -9223372036854775807L) {
                        qVar.f42585a.e(j10, qVar.f42602r ? 1 : 0, (int) (j14 - qVar.f42600p), i31, null);
                    }
                }
                qVar.f42600p = qVar.f42594j;
                qVar.f42601q = qVar.f42596l;
                qVar.f42602r = false;
                qVar.f42599o = true;
                if (qVar.f42586b) {
                }
                boolean z162 = qVar.f42602r;
                i15 = qVar.f42593i;
                if (i15 == 5) {
                }
                z12 = true;
                z13 = z12 | z162;
                qVar.f42602r = z13;
                if (z13) {
                }
                long j132 = this.f42616m;
                if (this.f42615l) {
                }
                i16 = i12;
                wVar3.g(i16);
                wVar2.g(i16);
                wVar.g(i16);
                qVar2 = this.f42614k;
                boolean z172 = this.f42617n;
                qVar2.f42593i = i16;
                qVar2.f42596l = j132;
                qVar2.f42594j = j6;
                qVar2.f42603s = z172;
                if (qVar2.f42586b) {
                }
                if (qVar2.f42587c) {
                }
                i23 = i14;
                bArr2 = bArr;
                i22 = i13;
            }
            i11 = i27;
            i14 = i23;
            bArr = bArr2;
            i13 = i24;
            i12 = i25;
            j6 = j11;
            wVar = this.f42609f;
            if (wVar.e(i10)) {
            }
            qVar = this.f42614k;
            z10 = this.f42615l;
            if (qVar.f42593i != 9) {
            }
            if (z10) {
                long j142 = qVar.f42594j;
                int i312 = i11 + ((int) (j6 - j142));
                j10 = qVar.f42601q;
                if (j10 != -9223372036854775807L) {
                }
            }
            qVar.f42600p = qVar.f42594j;
            qVar.f42601q = qVar.f42596l;
            qVar.f42602r = false;
            qVar.f42599o = true;
            if (qVar.f42586b) {
            }
            boolean z1622 = qVar.f42602r;
            i15 = qVar.f42593i;
            if (i15 == 5) {
            }
            z12 = true;
            z13 = z12 | z1622;
            qVar.f42602r = z13;
            if (z13) {
            }
            long j1322 = this.f42616m;
            if (this.f42615l) {
            }
            i16 = i12;
            wVar3.g(i16);
            wVar2.g(i16);
            wVar.g(i16);
            qVar2 = this.f42614k;
            boolean z1722 = this.f42617n;
            qVar2.f42593i = i16;
            qVar2.f42596l = j1322;
            qVar2.f42594j = j6;
            qVar2.f42603s = z1722;
            if (qVar2.f42586b) {
            }
            if (qVar2.f42587c) {
            }
            i23 = i14;
            bArr2 = bArr;
            i22 = i13;
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42610g = 0L;
        this.f42617n = false;
        this.f42616m = -9223372036854775807L;
        t2.g.a(this.f42611h);
        this.f42607d.f();
        this.f42608e.f();
        this.f42609f.f();
        q qVar = this.f42614k;
        if (qVar != null) {
            qVar.f42595k = false;
            qVar.f42599o = false;
            p pVar = qVar.f42598n;
            pVar.f42570b = false;
            pVar.f42569a = false;
        }
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
        Gi.e.o(this.f42613j);
        int i10 = AbstractC5530A.f45131a;
        if (z10) {
            q qVar = this.f42614k;
            long j6 = this.f42610g;
            qVar.f42594j = j6;
            long j10 = qVar.f42601q;
            if (j10 != -9223372036854775807L) {
                boolean z11 = qVar.f42602r;
                qVar.f42585a.e(j10, z11 ? 1 : 0, (int) (j6 - qVar.f42600p), 0, null);
            }
            qVar.f42599o = false;
        }
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        boolean z10;
        if (j6 != -9223372036854775807L) {
            this.f42616m = j6;
        }
        boolean z11 = this.f42617n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42617n = z10 | z11;
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42612i = h10.d();
        h10.i();
        L2.G f6 = sVar.f(h10.f42432c, 2);
        this.f42613j = f6;
        this.f42614k = new q(f6, this.f42605b, this.f42606c);
        this.f42604a.e(sVar, h10);
    }
}
