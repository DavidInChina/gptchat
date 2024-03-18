package p3;

import java.util.Collections;
import p2.C5059l;
import p2.C5065s;
import q1.AbstractC5260f;
import s2.AbstractC5530A;
import s2.AbstractC5533c;

/* loaded from: classes.dex */
public final class t implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final U3.e f42632a;

    /* renamed from: b  reason: collision with root package name */
    public String f42633b;

    /* renamed from: c  reason: collision with root package name */
    public L2.G f42634c;

    /* renamed from: d  reason: collision with root package name */
    public s f42635d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42636e;

    /* renamed from: l  reason: collision with root package name */
    public long f42643l;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f42637f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final w f42638g = new w(32);

    /* renamed from: h  reason: collision with root package name */
    public final w f42639h = new w(33);

    /* renamed from: i  reason: collision with root package name */
    public final w f42640i = new w(34);

    /* renamed from: j  reason: collision with root package name */
    public final w f42641j = new w(39);

    /* renamed from: k  reason: collision with root package name */
    public final w f42642k = new w(40);

    /* renamed from: m  reason: collision with root package name */
    public long f42644m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public final s2.u f42645n = new s2.u();

    public t(U3.e eVar) {
        this.f42632a = eVar;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        boolean z10;
        s sVar = this.f42635d;
        if (sVar.f42624f) {
            int i12 = sVar.f42622d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sVar.f42625g = z10;
                sVar.f42624f = false;
            } else {
                sVar.f42622d = (i11 - i10) + i12;
            }
        }
        if (!this.f42636e) {
            this.f42638g.a(bArr, i10, i11);
            this.f42639h.a(bArr, i10, i11);
            this.f42640i.a(bArr, i10, i11);
        }
        this.f42641j.a(bArr, i10, i11);
        this.f42642k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022d A[SYNTHETIC] */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        int i10;
        int i11;
        boolean z10;
        w wVar;
        w wVar2;
        w wVar3;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        boolean e10;
        w wVar4;
        int i16;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        s2.u uVar2 = uVar;
        Gi.e.o(this.f42634c);
        int i17 = AbstractC5530A.f45131a;
        while (uVar.a() > 0) {
            int i18 = uVar2.f45194b;
            int i19 = uVar2.f45195c;
            byte[] bArr2 = uVar2.f45193a;
            this.f42643l += uVar.a();
            this.f42634c.a(uVar.a(), uVar2);
            while (i18 < i19) {
                int b10 = t2.g.b(bArr2, i18, i19, this.f42637f);
                if (b10 == i19) {
                    a(bArr2, i18, i19);
                    return;
                }
                int i20 = b10 + 3;
                int i21 = (bArr2[i20] & 126) >> 1;
                int i22 = b10 - i18;
                if (i22 > 0) {
                    a(bArr2, i18, b10);
                }
                int i23 = i19 - b10;
                long j6 = this.f42643l - i23;
                if (i22 < 0) {
                    i10 = -i22;
                } else {
                    i10 = 0;
                }
                long j10 = this.f42644m;
                s sVar = this.f42635d;
                boolean z15 = this.f42636e;
                if (sVar.f42628j && sVar.f42625g) {
                    sVar.f42631m = sVar.f42621c;
                    sVar.f42628j = false;
                } else if (sVar.f42626h || sVar.f42625g) {
                    if (z15 && sVar.f42627i) {
                        i11 = i20;
                        sVar.a(((int) (j6 - sVar.f42620b)) + i23);
                    } else {
                        i11 = i20;
                    }
                    sVar.f42629k = sVar.f42620b;
                    sVar.f42630l = sVar.f42623e;
                    sVar.f42631m = sVar.f42621c;
                    sVar.f42627i = true;
                    z10 = this.f42636e;
                    w wVar5 = this.f42640i;
                    w wVar6 = this.f42639h;
                    w wVar7 = this.f42638g;
                    if (!z10) {
                        wVar7.e(i10);
                        wVar6.e(i10);
                        wVar5.e(i10);
                        if (wVar7.f42683e && wVar6.f42683e && wVar5.f42683e) {
                            L2.G g10 = this.f42634c;
                            String str = this.f42633b;
                            i14 = i19;
                            int i24 = wVar7.f42681c;
                            bArr = bArr2;
                            i13 = i11;
                            byte[] bArr3 = new byte[wVar6.f42681c + i24 + wVar5.f42681c];
                            i12 = i23;
                            System.arraycopy((byte[]) wVar7.f42684f, 0, bArr3, 0, i24);
                            i15 = i21;
                            System.arraycopy((byte[]) wVar6.f42684f, 0, bArr3, wVar7.f42681c, wVar6.f42681c);
                            System.arraycopy((byte[]) wVar5.f42684f, 0, bArr3, wVar7.f42681c + wVar6.f42681c, wVar5.f42681c);
                            t2.d c10 = t2.g.c((byte[]) wVar6.f42684f, 3, wVar6.f42681c);
                            wVar3 = wVar5;
                            wVar2 = wVar6;
                            wVar = wVar7;
                            String a5 = AbstractC5533c.a(c10.f45636a, c10.f45638c, c10.f45639d, c10.f45643h, c10.f45637b, c10.f45642g);
                            p2.r rVar = new p2.r();
                            rVar.f42227a = str;
                            rVar.f42237k = "video/hevc";
                            rVar.f42234h = a5;
                            rVar.f42242p = c10.f45644i;
                            rVar.f42243q = c10.f45645j;
                            rVar.f42249w = new C5059l(c10.f45647l, c10.f45648m, c10.f45649n, c10.f45640e + 8, c10.f45641f + 8, null);
                            rVar.f42246t = c10.f45646k;
                            rVar.f42239m = Collections.singletonList(bArr3);
                            g10.b(new C5065s(rVar));
                            this.f42636e = true;
                            w wVar8 = this.f42641j;
                            e10 = wVar8.e(i10);
                            U3.e eVar = this.f42632a;
                            s2.u uVar3 = this.f42645n;
                            if (e10) {
                                uVar3.D(t2.g.e(wVar8.f42681c, (byte[]) wVar8.f42684f), (byte[]) wVar8.f42684f);
                                uVar3.G(5);
                                AbstractC5260f.k(j10, uVar3, (L2.G[]) eVar.f17401Z);
                            }
                            wVar4 = this.f42642k;
                            if (wVar4.e(i10)) {
                                uVar3.D(t2.g.e(wVar4.f42681c, (byte[]) wVar4.f42684f), (byte[]) wVar4.f42684f);
                                uVar3.G(5);
                                AbstractC5260f.k(j10, uVar3, (L2.G[]) eVar.f17401Z);
                            }
                            long j11 = this.f42644m;
                            s sVar2 = this.f42635d;
                            boolean z16 = this.f42636e;
                            sVar2.f42625g = false;
                            sVar2.f42626h = false;
                            sVar2.f42623e = j11;
                            sVar2.f42622d = 0;
                            sVar2.f42620b = j6;
                            i16 = i15;
                            if (i16 >= 32 || i16 == 40) {
                                z12 = false;
                            } else {
                                if (sVar2.f42627i && !sVar2.f42628j) {
                                    if (z16) {
                                        sVar2.a(i12);
                                    }
                                    z12 = false;
                                    sVar2.f42627i = false;
                                } else {
                                    z12 = false;
                                }
                                if ((32 <= i16 && i16 <= 35) || i16 == 39) {
                                    z11 = true;
                                    sVar2.f42626h = !sVar2.f42628j;
                                    sVar2.f42628j = true;
                                    if (i16 < 16 && i16 <= 21) {
                                        z13 = z11;
                                    } else {
                                        z13 = z12;
                                    }
                                    sVar2.f42621c = z13;
                                    if (z13 && i16 > 9) {
                                        z14 = z12;
                                    } else {
                                        z14 = z11;
                                    }
                                    sVar2.f42624f = z14;
                                    if (this.f42636e) {
                                        wVar.g(i16);
                                        wVar2.g(i16);
                                        wVar3.g(i16);
                                    }
                                    wVar8.g(i16);
                                    wVar4.g(i16);
                                    i19 = i14;
                                    bArr2 = bArr;
                                    i18 = i13;
                                }
                            }
                            z11 = true;
                            if (i16 < 16) {
                            }
                            z13 = z12;
                            sVar2.f42621c = z13;
                            if (z13) {
                            }
                            z14 = z11;
                            sVar2.f42624f = z14;
                            if (this.f42636e) {
                            }
                            wVar8.g(i16);
                            wVar4.g(i16);
                            i19 = i14;
                            bArr2 = bArr;
                            i18 = i13;
                        }
                    }
                    i12 = i23;
                    i14 = i19;
                    bArr = bArr2;
                    wVar3 = wVar5;
                    i15 = i21;
                    i13 = i11;
                    wVar2 = wVar6;
                    wVar = wVar7;
                    w wVar82 = this.f42641j;
                    e10 = wVar82.e(i10);
                    U3.e eVar2 = this.f42632a;
                    s2.u uVar32 = this.f42645n;
                    if (e10) {
                    }
                    wVar4 = this.f42642k;
                    if (wVar4.e(i10)) {
                    }
                    long j112 = this.f42644m;
                    s sVar22 = this.f42635d;
                    boolean z162 = this.f42636e;
                    sVar22.f42625g = false;
                    sVar22.f42626h = false;
                    sVar22.f42623e = j112;
                    sVar22.f42622d = 0;
                    sVar22.f42620b = j6;
                    i16 = i15;
                    if (i16 >= 32) {
                    }
                    z12 = false;
                    z11 = true;
                    if (i16 < 16) {
                    }
                    z13 = z12;
                    sVar22.f42621c = z13;
                    if (z13) {
                    }
                    z14 = z11;
                    sVar22.f42624f = z14;
                    if (this.f42636e) {
                    }
                    wVar82.g(i16);
                    wVar4.g(i16);
                    i19 = i14;
                    bArr2 = bArr;
                    i18 = i13;
                }
                i11 = i20;
                z10 = this.f42636e;
                w wVar52 = this.f42640i;
                w wVar62 = this.f42639h;
                w wVar72 = this.f42638g;
                if (!z10) {
                }
                i12 = i23;
                i14 = i19;
                bArr = bArr2;
                wVar3 = wVar52;
                i15 = i21;
                i13 = i11;
                wVar2 = wVar62;
                wVar = wVar72;
                w wVar822 = this.f42641j;
                e10 = wVar822.e(i10);
                U3.e eVar22 = this.f42632a;
                s2.u uVar322 = this.f42645n;
                if (e10) {
                }
                wVar4 = this.f42642k;
                if (wVar4.e(i10)) {
                }
                long j1122 = this.f42644m;
                s sVar222 = this.f42635d;
                boolean z1622 = this.f42636e;
                sVar222.f42625g = false;
                sVar222.f42626h = false;
                sVar222.f42623e = j1122;
                sVar222.f42622d = 0;
                sVar222.f42620b = j6;
                i16 = i15;
                if (i16 >= 32) {
                }
                z12 = false;
                z11 = true;
                if (i16 < 16) {
                }
                z13 = z12;
                sVar222.f42621c = z13;
                if (z13) {
                }
                z14 = z11;
                sVar222.f42624f = z14;
                if (this.f42636e) {
                }
                wVar822.g(i16);
                wVar4.g(i16);
                i19 = i14;
                bArr2 = bArr;
                i18 = i13;
            }
            uVar2 = uVar;
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42643l = 0L;
        this.f42644m = -9223372036854775807L;
        t2.g.a(this.f42637f);
        this.f42638g.f();
        this.f42639h.f();
        this.f42640i.f();
        this.f42641j.f();
        this.f42642k.f();
        s sVar = this.f42635d;
        if (sVar != null) {
            sVar.f42624f = false;
            sVar.f42625g = false;
            sVar.f42626h = false;
            sVar.f42627i = false;
            sVar.f42628j = false;
        }
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
        Gi.e.o(this.f42634c);
        int i10 = AbstractC5530A.f45131a;
        if (z10) {
            s sVar = this.f42635d;
            sVar.f42620b = this.f42643l;
            sVar.a(0);
            sVar.f42627i = false;
        }
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42644m = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42633b = h10.d();
        h10.i();
        L2.G f6 = sVar.f(h10.f42432c, 2);
        this.f42634c = f6;
        this.f42635d = new s(f6);
        this.f42632a.e(sVar, h10);
    }
}
