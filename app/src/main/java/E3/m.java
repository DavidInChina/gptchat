package e3;

import L2.A;
import L2.AbstractC0881b;
import L2.B;
import L2.C;
import L2.G;
import L2.H;
import L2.x;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p2.C5065s;
import p2.L;
import p2.M;
import p2.O;
import p2.Y;
import s2.AbstractC5530A;
import s2.u;
import t2.C5664a;

/* loaded from: classes.dex */
public final class m implements L2.q, B {

    /* renamed from: a  reason: collision with root package name */
    public final int f28872a;

    /* renamed from: j  reason: collision with root package name */
    public int f28881j;

    /* renamed from: k  reason: collision with root package name */
    public long f28882k;

    /* renamed from: l  reason: collision with root package name */
    public int f28883l;

    /* renamed from: m  reason: collision with root package name */
    public u f28884m;

    /* renamed from: o  reason: collision with root package name */
    public int f28886o;

    /* renamed from: p  reason: collision with root package name */
    public int f28887p;

    /* renamed from: q  reason: collision with root package name */
    public int f28888q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f28889r;

    /* renamed from: u  reason: collision with root package name */
    public long[][] f28892u;

    /* renamed from: v  reason: collision with root package name */
    public int f28893v;

    /* renamed from: w  reason: collision with root package name */
    public long f28894w;

    /* renamed from: x  reason: collision with root package name */
    public int f28895x;

    /* renamed from: i  reason: collision with root package name */
    public int f28880i = 0;

    /* renamed from: g  reason: collision with root package name */
    public final o f28878g = new o();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f28879h = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final u f28876e = new u(16);

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f28877f = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final u f28873b = new u(t2.g.f45670a);

    /* renamed from: c  reason: collision with root package name */
    public final u f28874c = new u(4);

    /* renamed from: d  reason: collision with root package name */
    public final u f28875d = new u();

    /* renamed from: n  reason: collision with root package name */
    public int f28885n = -1;

    /* renamed from: s  reason: collision with root package name */
    public L2.s f28890s = L2.s.f10638m;

    /* renamed from: t  reason: collision with root package name */
    public l[] f28891t = new l[0];

    public m(int i10) {
        this.f28872a = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // L2.q
    public final int a(L2.r rVar, I2.i iVar) {
        boolean z10;
        int i10;
        long j6;
        ArrayList arrayList;
        char c10;
        char c11;
        int i11;
        boolean z11;
        boolean z12;
        C2791a c2791a;
        while (true) {
            int i12 = this.f28880i;
            ArrayDeque arrayDeque = this.f28877f;
            int i13 = 4;
            boolean z13 = false;
            u uVar = this.f28875d;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            ArrayList arrayList2 = this.f28879h;
                            o oVar = this.f28878g;
                            int i14 = oVar.f28901b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    ArrayList arrayList3 = oVar.f28900a;
                                    short s10 = 2816;
                                    char c12 = '\u0b03';
                                    short s11 = 2192;
                                    if (i14 != 2) {
                                        if (i14 == 3) {
                                            long o10 = rVar.o();
                                            int h10 = (int) ((rVar.h() - rVar.o()) - oVar.f28902c);
                                            u uVar2 = new u(h10);
                                            rVar.readFully(uVar2.f45193a, 0, h10);
                                            int i15 = 0;
                                            while (i15 < arrayList3.size()) {
                                                n nVar = (n) arrayList3.get(i15);
                                                ArrayList arrayList4 = arrayList3;
                                                uVar2.F((int) (nVar.f28896a - o10));
                                                uVar2.G(i13);
                                                int i16 = uVar2.i();
                                                Charset charset = w8.e.f48221c;
                                                String s12 = uVar2.s(i16, charset);
                                                switch (s12.hashCode()) {
                                                    case -1711564334:
                                                        if (s12.equals("SlowMotion_Data")) {
                                                            c10 = 0;
                                                            break;
                                                        }
                                                        c10 = '\uffff';
                                                        break;
                                                    case -1332107749:
                                                        if (s12.equals("Super_SlowMotion_Edit_Data")) {
                                                            c10 = 1;
                                                            break;
                                                        }
                                                        c10 = '\uffff';
                                                        break;
                                                    case -1251387154:
                                                        if (s12.equals("Super_SlowMotion_Data")) {
                                                            c10 = 2;
                                                            break;
                                                        }
                                                        c10 = '\uffff';
                                                        break;
                                                    case -830665521:
                                                        if (s12.equals("Super_SlowMotion_Deflickering_On")) {
                                                            c10 = 3;
                                                            break;
                                                        }
                                                        c10 = '\uffff';
                                                        break;
                                                    case 1760745220:
                                                        if (s12.equals("Super_SlowMotion_BGM")) {
                                                            c10 = 4;
                                                            break;
                                                        }
                                                        c10 = '\uffff';
                                                        break;
                                                    default:
                                                        c10 = '\uffff';
                                                        break;
                                                }
                                                switch (c10) {
                                                    case 0:
                                                        c11 = '\u0890';
                                                        break;
                                                    case 1:
                                                        c11 = c12;
                                                        break;
                                                    case 2:
                                                        c11 = '\u0b00';
                                                        break;
                                                    case 3:
                                                        c11 = '\u0b04';
                                                        break;
                                                    case 4:
                                                        c11 = '\u0b01';
                                                        break;
                                                    default:
                                                        throw O.a("Invalid SEF name", null);
                                                }
                                                int i17 = nVar.f28897b - (i16 + 8);
                                                if (c11 != '\u0890') {
                                                    if (c11 != '\u0b00' && c11 != '\u0b01' && c11 != c12 && c11 != '\u0b04') {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    List a5 = o.f28899e.a(uVar2.s(i17, charset));
                                                    for (int i18 = 0; i18 < a5.size(); i18++) {
                                                        List a10 = o.f28898d.a((CharSequence) a5.get(i18));
                                                        if (a10.size() == 3) {
                                                            try {
                                                                arrayList5.add(new Z2.b(Long.parseLong((String) a10.get(0)), 1 << (Integer.parseInt((String) a10.get(2)) - 1), Long.parseLong((String) a10.get(1))));
                                                            } catch (NumberFormatException e10) {
                                                                throw O.a(null, e10);
                                                            }
                                                        } else {
                                                            throw O.a(null, null);
                                                        }
                                                    }
                                                    arrayList2.add(new Z2.c(arrayList5));
                                                }
                                                i15++;
                                                arrayList3 = arrayList4;
                                                i13 = 4;
                                                c12 = '\u0b03';
                                            }
                                            iVar.f7995b = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        ArrayList arrayList6 = arrayList3;
                                        long h11 = rVar.h();
                                        int i19 = oVar.f28902c - 20;
                                        u uVar3 = new u(i19);
                                        rVar.readFully(uVar3.f45193a, 0, i19);
                                        int i20 = 0;
                                        while (i20 < i19 / 12) {
                                            uVar3.G(2);
                                            short k10 = uVar3.k();
                                            if (k10 != s11 && k10 != s10) {
                                                if (k10 != 2817) {
                                                    if (k10 != 2819 && k10 != 2820) {
                                                        uVar3.G(8);
                                                        arrayList = arrayList6;
                                                        i20++;
                                                        arrayList6 = arrayList;
                                                        s11 = 2192;
                                                        s10 = 2816;
                                                    }
                                                    arrayList = arrayList6;
                                                    arrayList.add(new n((h11 - oVar.f28902c) - uVar3.i(), uVar3.i()));
                                                    i20++;
                                                    arrayList6 = arrayList;
                                                    s11 = 2192;
                                                    s10 = 2816;
                                                }
                                            }
                                            arrayList = arrayList6;
                                            arrayList.add(new n((h11 - oVar.f28902c) - uVar3.i(), uVar3.i()));
                                            i20++;
                                            arrayList6 = arrayList;
                                            s11 = 2192;
                                            s10 = 2816;
                                        }
                                        ArrayList arrayList7 = arrayList6;
                                        if (arrayList7.isEmpty()) {
                                            iVar.f7995b = 0L;
                                        } else {
                                            oVar.f28901b = 3;
                                            iVar.f7995b = ((n) arrayList7.get(0)).f28896a;
                                        }
                                    }
                                } else {
                                    u uVar4 = new u(8);
                                    rVar.readFully(uVar4.f45193a, 0, 8);
                                    oVar.f28902c = uVar4.i() + 8;
                                    if (uVar4.g() != 1397048916) {
                                        iVar.f7995b = 0L;
                                    } else {
                                        iVar.f7995b = rVar.o() - (oVar.f28902c - 12);
                                        oVar.f28901b = 2;
                                    }
                                }
                                i10 = 1;
                            } else {
                                long h12 = rVar.h();
                                if (h12 != -1 && h12 >= 8) {
                                    j6 = h12 - 8;
                                } else {
                                    j6 = 0;
                                }
                                iVar.f7995b = j6;
                                i10 = 1;
                                oVar.f28901b = 1;
                            }
                            if (iVar.f7995b == 0) {
                                this.f28880i = 0;
                                this.f28883l = 0;
                            }
                            return i10;
                        }
                        throw new IllegalStateException();
                    }
                    long o11 = rVar.o();
                    if (this.f28885n == -1) {
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        int i21 = 0;
                        int i22 = -1;
                        int i23 = -1;
                        boolean z14 = true;
                        boolean z15 = true;
                        while (true) {
                            l[] lVarArr = this.f28891t;
                            if (i21 >= lVarArr.length) {
                                break;
                            }
                            l lVar = lVarArr[i21];
                            int i24 = lVar.f28871e;
                            s sVar = lVar.f28868b;
                            if (i24 != sVar.f28937b) {
                                long j13 = sVar.f28938c[i24];
                                long[][] jArr = this.f28892u;
                                int i25 = AbstractC5530A.f45131a;
                                long j14 = jArr[i21][i24];
                                long j15 = j13 - o11;
                                if (j15 >= 0 && j15 < 262144) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if ((!z10 && z15) || (z10 == z15 && j15 < j12)) {
                                    i23 = i21;
                                    z15 = z10;
                                    j11 = j14;
                                    j12 = j15;
                                }
                                if (j14 < j10) {
                                    i22 = i21;
                                    z14 = z10;
                                    j10 = j14;
                                }
                            }
                            i21++;
                        }
                        if (j10 == Long.MAX_VALUE || !z14 || j11 < j10 + 10485760) {
                            i22 = i23;
                        }
                        this.f28885n = i22;
                        if (i22 == -1) {
                            return -1;
                        }
                    }
                    l lVar2 = this.f28891t[this.f28885n];
                    G g10 = lVar2.f28869c;
                    int i26 = lVar2.f28871e;
                    s sVar2 = lVar2.f28868b;
                    long j16 = sVar2.f28938c[i26];
                    int i27 = sVar2.f28939d[i26];
                    long j17 = (j16 - o11) + this.f28886o;
                    if (j17 >= 0 && j17 < 262144) {
                        p pVar = lVar2.f28867a;
                        if (pVar.f28909g == 1) {
                            j17 += 8;
                            i27 -= 8;
                        }
                        rVar.l((int) j17);
                        int i28 = pVar.f28912j;
                        H h13 = lVar2.f28870d;
                        if (i28 != 0) {
                            u uVar5 = this.f28874c;
                            byte[] bArr = uVar5.f45193a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i29 = 4 - i28;
                            while (this.f28887p < i27) {
                                int i30 = this.f28888q;
                                if (i30 == 0) {
                                    rVar.readFully(bArr, i29, i28);
                                    this.f28886o += i28;
                                    uVar5.F(0);
                                    int g11 = uVar5.g();
                                    if (g11 >= 0) {
                                        this.f28888q = g11;
                                        u uVar6 = this.f28873b;
                                        uVar6.F(0);
                                        g10.a(4, uVar6);
                                        this.f28887p += 4;
                                        i27 += i29;
                                    } else {
                                        throw O.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int c13 = g10.c(rVar, i30, false);
                                    this.f28886o += c13;
                                    this.f28887p += c13;
                                    this.f28888q -= c13;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(pVar.f28908f.f42319q0)) {
                                if (this.f28887p == 0) {
                                    AbstractC0881b.b(i27, uVar);
                                    g10.a(7, uVar);
                                    this.f28887p += 7;
                                }
                                i27 += 7;
                            } else if (h13 != null) {
                                h13.c(rVar);
                            }
                            while (true) {
                                int i31 = this.f28887p;
                                if (i31 >= i27) {
                                    break;
                                }
                                int c14 = g10.c(rVar, i27 - i31, false);
                                this.f28886o += c14;
                                this.f28887p += c14;
                                this.f28888q -= c14;
                            }
                        }
                        int i32 = i27;
                        long j18 = sVar2.f28941f[i26];
                        int i33 = sVar2.f28942g[i26];
                        if (h13 != null) {
                            h13.b(g10, j18, i33, i32, 0, null);
                            if (i26 + 1 == sVar2.f28937b) {
                                h13.a(g10, null);
                            }
                        } else {
                            g10.e(j18, i33, i32, 0, null);
                        }
                        lVar2.f28871e++;
                        this.f28885n = -1;
                        this.f28886o = 0;
                        this.f28887p = 0;
                        this.f28888q = 0;
                        return 0;
                    }
                    iVar.f7995b = j16;
                    return 1;
                }
                long j19 = this.f28882k - this.f28883l;
                long o12 = rVar.o() + j19;
                u uVar7 = this.f28884m;
                if (uVar7 != null) {
                    rVar.readFully(uVar7.f45193a, this.f28883l, (int) j19);
                    if (this.f28881j == 1718909296) {
                        this.f28889r = true;
                        uVar7.F(8);
                        int g12 = uVar7.g();
                        if (g12 != 1751476579) {
                            if (g12 != 1903435808) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            uVar7.G(4);
                            while (true) {
                                if (uVar7.a() > 0) {
                                    int g13 = uVar7.g();
                                    if (g13 != 1751476579) {
                                        if (g13 != 1903435808) {
                                            i11 = 0;
                                            continue;
                                        } else {
                                            i11 = 1;
                                            continue;
                                        }
                                    } else {
                                        i11 = 2;
                                        continue;
                                    }
                                    if (i11 != 0) {
                                        break;
                                    }
                                } else {
                                    i11 = 0;
                                    break;
                                }
                            }
                        }
                        this.f28895x = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C2791a) arrayDeque.peek()).f28799i0.add(new C2792b(this.f28881j, uVar7));
                    }
                } else {
                    if (!this.f28889r && this.f28881j == 1835295092) {
                        this.f28895x = 1;
                    }
                    if (j19 < 262144) {
                        rVar.l((int) j19);
                    } else {
                        iVar.f7995b = rVar.o() + j19;
                        z13 = true;
                    }
                }
                k(o12);
                if (z13 && this.f28880i != 2) {
                    return 1;
                }
            } else {
                int i34 = this.f28883l;
                u uVar8 = this.f28876e;
                if (i34 == 0) {
                    if (!rVar.b(uVar8.f45193a, 0, 8, true)) {
                        return -1;
                    }
                    this.f28883l = 8;
                    uVar8.F(0);
                    this.f28882k = uVar8.v();
                    this.f28881j = uVar8.g();
                }
                long j20 = this.f28882k;
                if (j20 == 1) {
                    rVar.readFully(uVar8.f45193a, 8, 8);
                    this.f28883l += 8;
                    this.f28882k = uVar8.y();
                } else if (j20 == 0) {
                    long h14 = rVar.h();
                    if (h14 == -1 && (c2791a = (C2791a) arrayDeque.peek()) != null) {
                        h14 = c2791a.f28798h0;
                    }
                    if (h14 != -1) {
                        this.f28882k = (h14 - rVar.o()) + this.f28883l;
                    }
                }
                long j21 = this.f28882k;
                int i35 = this.f28883l;
                if (j21 >= i35) {
                    int i36 = this.f28881j;
                    if (i36 != 1836019574 && i36 != 1953653099 && i36 != 1835297121 && i36 != 1835626086 && i36 != 1937007212 && i36 != 1701082227 && i36 != 1835365473) {
                        if (i36 != 1835296868 && i36 != 1836476516 && i36 != 1751411826 && i36 != 1937011556 && i36 != 1937011827 && i36 != 1937011571 && i36 != 1668576371 && i36 != 1701606260 && i36 != 1937011555 && i36 != 1937011578 && i36 != 1937013298 && i36 != 1937007471 && i36 != 1668232756 && i36 != 1953196132 && i36 != 1718909296 && i36 != 1969517665 && i36 != 1801812339 && i36 != 1768715124) {
                            rVar.o();
                            this.f28884m = null;
                            this.f28880i = 1;
                        } else {
                            if (i35 == 8) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            Gi.e.n(z11);
                            if (this.f28882k <= 2147483647L) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            Gi.e.n(z12);
                            u uVar9 = new u((int) this.f28882k);
                            System.arraycopy(uVar8.f45193a, 0, uVar9.f45193a, 0, 8);
                            this.f28884m = uVar9;
                            this.f28880i = 1;
                        }
                    } else {
                        long o13 = rVar.o();
                        long j22 = this.f28882k;
                        long j23 = this.f28883l;
                        long j24 = (o13 + j22) - j23;
                        if (j22 != j23 && this.f28881j == 1835365473) {
                            uVar.C(8);
                            rVar.n(uVar.f45193a, 0, 8);
                            byte[] bArr2 = e.f28811a;
                            int i37 = uVar.f45194b;
                            uVar.G(4);
                            if (uVar.g() != 1751411826) {
                                i37 += 4;
                            }
                            uVar.F(i37);
                            rVar.l(uVar.f45194b);
                            rVar.k();
                        }
                        arrayDeque.push(new C2791a(this.f28881j, j24));
                        if (this.f28882k == this.f28883l) {
                            k(j24);
                        } else {
                            this.f28880i = 0;
                            this.f28883l = 0;
                        }
                    }
                } else {
                    throw O.b("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        this.f28890s = sVar;
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        return k.g(rVar, false, false);
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        l[] lVarArr;
        this.f28877f.clear();
        this.f28883l = 0;
        this.f28885n = -1;
        this.f28886o = 0;
        this.f28887p = 0;
        this.f28888q = 0;
        if (j6 == 0) {
            if (this.f28880i != 3) {
                this.f28880i = 0;
                this.f28883l = 0;
                return;
            }
            o oVar = this.f28878g;
            oVar.f28900a.clear();
            oVar.f28901b = 0;
            this.f28879h.clear();
            return;
        }
        for (l lVar : this.f28891t) {
            s sVar = lVar.f28868b;
            int e10 = AbstractC5530A.e(sVar.f28941f, j10, false);
            while (true) {
                if (e10 >= 0) {
                    if ((sVar.f28942g[e10] & 1) != 0) {
                        break;
                    }
                    e10--;
                } else {
                    e10 = -1;
                    break;
                }
            }
            if (e10 == -1) {
                e10 = sVar.a(j10);
            }
            lVar.f28871e = e10;
            H h10 = lVar.f28870d;
            if (h10 != null) {
                h10.f10534b = false;
                h10.f10535c = 0;
            }
        }
    }

    @Override // L2.B
    public final A i(long j6) {
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        int[] iArr;
        long j14;
        int a5;
        m mVar = this;
        long j15 = j6;
        l[] lVarArr = mVar.f28891t;
        int length = lVarArr.length;
        C c10 = C.f10519c;
        if (length == 0) {
            return new A(c10, c10);
        }
        int i10 = mVar.f28893v;
        boolean z11 = false;
        if (i10 != -1) {
            s sVar = lVarArr[i10].f28868b;
            int e10 = AbstractC5530A.e(sVar.f28941f, j15, false);
            while (true) {
                if (e10 >= 0) {
                    if ((sVar.f28942g[e10] & 1) != 0) {
                        break;
                    }
                    e10--;
                } else {
                    e10 = -1;
                    break;
                }
            }
            if (e10 == -1) {
                e10 = sVar.a(j15);
            }
            if (e10 == -1) {
                return new A(c10, c10);
            }
            long[] jArr = sVar.f28941f;
            long j16 = jArr[e10];
            long[] jArr2 = sVar.f28938c;
            j10 = jArr2[e10];
            if (j16 < j15 && e10 < sVar.f28937b - 1 && (a5 = sVar.a(j15)) != -1 && a5 != e10) {
                j14 = jArr[a5];
                j11 = jArr2[a5];
            } else {
                j14 = -9223372036854775807L;
                j11 = -1;
            }
            j12 = j14;
            j15 = j16;
        } else {
            j10 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
            j11 = -1;
        }
        int i11 = 0;
        long j17 = j10;
        while (true) {
            l[] lVarArr2 = mVar.f28891t;
            if (i11 >= lVarArr2.length) {
                break;
            }
            if (i11 != mVar.f28893v) {
                s sVar2 = lVarArr2[i11].f28868b;
                int e11 = AbstractC5530A.e(sVar2.f28941f, j15, z11);
                while (true) {
                    iArr = sVar2.f28942g;
                    if (e11 >= 0) {
                        if ((iArr[e11] & 1) != 0) {
                            break;
                        }
                        e11--;
                    } else {
                        e11 = -1;
                        break;
                    }
                }
                if (e11 == -1) {
                    e11 = sVar2.a(j15);
                }
                long[] jArr3 = sVar2.f28938c;
                if (e11 == -1) {
                    j13 = j15;
                } else {
                    j13 = j15;
                    j17 = Math.min(jArr3[e11], j17);
                }
                if (j12 != -9223372036854775807L) {
                    z10 = false;
                    int e12 = AbstractC5530A.e(sVar2.f28941f, j12, false);
                    while (true) {
                        if (e12 >= 0) {
                            if ((iArr[e12] & 1) != 0) {
                                break;
                            }
                            e12--;
                        } else {
                            e12 = -1;
                            break;
                        }
                    }
                    if (e12 == -1) {
                        e12 = sVar2.a(j12);
                    }
                    if (e12 != -1) {
                        j11 = Math.min(jArr3[e12], j11);
                    }
                } else {
                    z10 = false;
                }
            } else {
                j13 = j15;
                z10 = z11;
            }
            i11++;
            mVar = this;
            z11 = z10;
            j15 = j13;
        }
        C c11 = new C(j15, j17);
        if (j12 == -9223372036854775807L) {
            return new A(c11, c11);
        }
        return new A(c11, new C(j12, j11));
    }

    @Override // L2.B
    public final long j() {
        return this.f28894w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
        r13 = r10.f45194b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
        if (r13 >= r11) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ca, code lost:
        r19 = r10.g();
        r0 = r10.g();
        r10.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01db, code lost:
        if (r0 != 1835360622) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dd, code lost:
        r12 = r10.q(r19 - 12);
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e9, code lost:
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
        if (r0 != 1851878757) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f2, code lost:
        r2 = r10.q(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fd, code lost:
        if (r0 != 1684108385) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ff, code lost:
        r6 = r19;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0203, code lost:
        r10.G(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0208, code lost:
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020c, code lost:
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020e, code lost:
        if (r12 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0210, code lost:
        if (r2 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0213, code lost:
        if (r5 != (-1)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0216, code lost:
        r10.F(r5);
        r10.G(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0228, code lost:
        r12 = new Y2.k(r12, r2, r10.q(r6 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022b, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022c, code lost:
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0236, code lost:
        r2 = 16777215 & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x023d, code lost:
        if (r2 != 6516084) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023f, code lost:
        r12 = e3.k.a(r12, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0247, code lost:
        if (r2 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024c, code lost:
        if (r2 != 7631467) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0253, code lost:
        if (r2 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0258, code lost:
        if (r2 != 7828084) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x025f, code lost:
        if (r2 != 6578553) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0261, code lost:
        r12 = e3.k.d(r12, r10, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026b, code lost:
        if (r2 != 4280916) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026d, code lost:
        r12 = e3.k.d(r12, r10, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0277, code lost:
        if (r2 != 7630703) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0279, code lost:
        r12 = e3.k.d(r12, r10, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0283, code lost:
        if (r2 != 6384738) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0285, code lost:
        r12 = e3.k.d(r12, r10, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028f, code lost:
        if (r2 != 7108978) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0291, code lost:
        r12 = e3.k.d(r12, r10, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029b, code lost:
        if (r2 != 6776174) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x029d, code lost:
        r12 = e3.k.d(r12, r10, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a5, code lost:
        if (r2 != 6779504) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a7, code lost:
        r12 = e3.k.d(r12, r10, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02af, code lost:
        s2.p.b("MetadataUtil", "Skipped unknown metadata entry: " + x2.AbstractC6266a.f(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c2, code lost:
        r10.F(r11);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c7, code lost:
        r12 = e3.k.d(r12, r10, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02cf, code lost:
        r12 = e3.k.d(r12, r10, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d7, code lost:
        if (r12 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02d9, code lost:
        r4.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02dc, code lost:
        r5 = r26;
        r6 = r27;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ea, code lost:
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02ed, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ee, code lost:
        r27 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02f7, code lost:
        if (r4.isEmpty() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02fa, code lost:
        r12 = new p2.M(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0319, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        r10.F(r5);
        r5 = r5 + r13;
        r10.G(r12);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        r11 = r10.f45194b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r11 >= r5) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r11 = r10.g() + r11;
        r12 = r10.g();
        r2 = (r12 >> 24) & 255;
        r26 = r5;
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r2 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (r2 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r12 != 1735291493) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r0 = e3.k.f(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (r0 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
        if (r0 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
        r0 = e3.k.f28865a[r0 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r2 = new Y2.o("TCON", null, x8.N.u0(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        s2.p.g("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r10.F(r11);
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
        if (r12 != 1684632427) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
        r12 = e3.k.c(r12, r10, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
        if (r12 != 1953655662) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
        r12 = e3.k.c(r12, r10, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
        if (r12 != 1953329263) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
        r12 = e3.k.e(r12, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r12 != 1668311404) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012c, code lost:
        r12 = e3.k.e(r12, "TCMP", r10, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
        if (r12 != 1668249202) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0139, code lost:
        r12 = e3.k.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
        if (r12 != 1631670868) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0143, code lost:
        r12 = e3.k.d(r12, r10, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
        if (r12 != 1936682605) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
        r12 = e3.k.d(r12, r10, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
        if (r12 != 1936679276) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
        r12 = e3.k.d(r12, r10, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0165, code lost:
        if (r12 != 1936679282) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
        r12 = e3.k.d(r12, r10, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0171, code lost:
        if (r12 != 1936679265) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0173, code lost:
        r12 = e3.k.d(r12, r10, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017d, code lost:
        if (r12 != 1936679791) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017f, code lost:
        r12 = e3.k.d(r12, r10, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0189, code lost:
        if (r12 != 1920233063) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
        r12 = e3.k.e(r12, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
        if (r12 != 1885823344) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0199, code lost:
        r12 = e3.k.e(r12, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a6, code lost:
        if (r12 != 1936683886) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
        r12 = e3.k.d(r12, r10, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
        if (r12 != 1953919848) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b5, code lost:
        r12 = e3.k.d(r12, r10, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
        if (r12 != 757935405) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c2, code lost:
        r2 = null;
        r12 = null;
        r5 = -1;
        r6 = -1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0638 A[LOOP:11: B:298:0x0636->B:299:0x0638, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x065e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j6) {
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList;
        ArrayDeque arrayDeque;
        M m10;
        int i12;
        M m11;
        long j10;
        M m12;
        ArrayList arrayList2;
        char c10;
        M m13;
        M m14;
        int i13;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList4;
        M m15;
        int i17;
        M m16;
        int i18;
        M m17;
        int i19;
        int i20;
        int i21;
        int i22;
        M m18;
        int i23;
        C5664a c5664a;
        ArrayList arrayList5;
        ArrayDeque arrayDeque2;
        M m19;
        M c11;
        M m20;
        float f6;
        M m21;
        int i24 = 4;
        int i25 = 0;
        int i26 = 1;
        while (true) {
            ArrayDeque arrayDeque3 = this.f28877f;
            if (arrayDeque3.isEmpty() || ((C2791a) arrayDeque3.peek()).f28798h0 != j6) {
                break;
            }
            C2791a c2791a = (C2791a) arrayDeque3.pop();
            if (c2791a.f48626Z == 1836019574) {
                ArrayList arrayList6 = new ArrayList();
                if (this.f28895x == i26) {
                    z10 = i26;
                } else {
                    z10 = i25;
                }
                x xVar = new x();
                C2792b j11 = c2791a.j(1969517665);
                int i27 = 1751411826;
                int i28 = 8;
                int i29 = 1768715124;
                int i30 = 1835365473;
                if (j11 != null) {
                    byte[] bArr = e.f28811a;
                    u uVar = j11.f28801h0;
                    uVar.F(8);
                    m10 = new M(new L[i25]);
                    while (uVar.a() >= i28) {
                        int i31 = uVar.f45194b;
                        int g10 = uVar.g();
                        int g11 = uVar.g();
                        if (g11 == i30) {
                            uVar.F(i31);
                            int i32 = i31 + g10;
                            uVar.G(i28);
                            int i33 = uVar.f45194b;
                            uVar.G(i24);
                            if (uVar.g() != i27) {
                                i33 += i24;
                            }
                            uVar.F(i33);
                            while (true) {
                                int i34 = uVar.f45194b;
                                if (i34 < i32) {
                                    int g12 = uVar.g();
                                    if (uVar.g() == i29) {
                                        break;
                                    }
                                    uVar.F(i34 + g12);
                                    i29 = 1768715124;
                                    i28 = 8;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    arrayList5 = arrayList6;
                                    break;
                                }
                            }
                            c11 = m10.c(m21);
                        } else {
                            arrayDeque2 = arrayDeque3;
                            arrayList5 = arrayList6;
                            if (g11 == 1936553057) {
                                uVar.F(i31);
                                int i35 = i31 + g10;
                                uVar.G(12);
                                while (true) {
                                    int i36 = uVar.f45194b;
                                    if (i36 >= i35) {
                                        break;
                                    }
                                    int g13 = uVar.g();
                                    if (uVar.g() == 1935766900) {
                                        if (g13 >= 14) {
                                            uVar.G(5);
                                            int u10 = uVar.u();
                                            if (u10 == 12 || u10 == 13) {
                                                if (u10 == 12) {
                                                    f6 = 240.0f;
                                                } else {
                                                    f6 = 120.0f;
                                                }
                                                uVar.G(1);
                                                m20 = new M(new Z2.d(uVar.u(), f6));
                                            }
                                        }
                                    } else {
                                        uVar.F(i36 + g13);
                                    }
                                }
                                m20 = null;
                                c11 = m10.c(m20);
                            } else if (g11 == -1451722374) {
                                short r10 = uVar.r();
                                uVar.G(2);
                                String s10 = uVar.s(r10, w8.e.f48221c);
                                int max = Math.max(s10.lastIndexOf(43), s10.lastIndexOf(45));
                                try {
                                    m19 = new M(new t2.b(Float.parseFloat(s10.substring(0, max)), Float.parseFloat(s10.substring(max, s10.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    m19 = null;
                                }
                                c11 = m10.c(m19);
                            } else {
                                uVar.F(i31 + g10);
                                arrayDeque3 = arrayDeque2;
                                arrayList6 = arrayList5;
                                i24 = 4;
                                i29 = 1768715124;
                                i27 = 1751411826;
                                i28 = 8;
                                i30 = 1835365473;
                            }
                        }
                        m10 = c11;
                        uVar.F(i31 + g10);
                        arrayDeque3 = arrayDeque2;
                        arrayList6 = arrayList5;
                        i24 = 4;
                        i29 = 1768715124;
                        i27 = 1751411826;
                        i28 = 8;
                        i30 = 1835365473;
                    }
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList6;
                    xVar.b(m10);
                    i12 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList6;
                    i12 = 1835365473;
                    m10 = null;
                }
                C2791a i37 = c2791a.i(i12);
                if (i37 != null) {
                    byte[] bArr2 = e.f28811a;
                    C2792b j12 = i37.j(1751411826);
                    C2792b j13 = i37.j(1801812339);
                    C2792b j14 = i37.j(1768715124);
                    if (j12 != null && j13 != null && j14 != null) {
                        u uVar2 = j12.f28801h0;
                        uVar2.F(16);
                        if (uVar2.g() == 1835299937) {
                            u uVar3 = j13.f28801h0;
                            uVar3.F(12);
                            int g14 = uVar3.g();
                            String[] strArr = new String[g14];
                            for (int i38 = 0; i38 < g14; i38++) {
                                int g15 = uVar3.g();
                                uVar3.G(4);
                                strArr[i38] = uVar3.s(g15 - 8, w8.e.f48221c);
                            }
                            u uVar4 = j14.f28801h0;
                            uVar4.F(8);
                            ArrayList arrayList7 = new ArrayList();
                            for (int i39 = 8; uVar4.a() > i39; i39 = 8) {
                                int i40 = uVar4.f45194b;
                                int g16 = uVar4.g();
                                int g17 = uVar4.g() - 1;
                                if (g17 >= 0 && g17 < g14) {
                                    String str = strArr[g17];
                                    int i41 = i40 + g16;
                                    while (true) {
                                        int i42 = uVar4.f45194b;
                                        if (i42 < i41) {
                                            int g18 = uVar4.g();
                                            if (uVar4.g() == 1684108385) {
                                                int g19 = uVar4.g();
                                                int g20 = uVar4.g();
                                                int i43 = g18 - 16;
                                                byte[] bArr3 = new byte[i43];
                                                i23 = g14;
                                                uVar4.e(bArr3, 0, i43);
                                                c5664a = new C5664a(str, bArr3, g20, g19);
                                                break;
                                            }
                                            uVar4.F(i42 + g18);
                                        } else {
                                            i23 = g14;
                                            c5664a = null;
                                            break;
                                        }
                                    }
                                    if (c5664a != null) {
                                        arrayList7.add(c5664a);
                                    }
                                } else {
                                    i23 = g14;
                                    android.gov.nist.core.a.v("Skipped metadata with unknown key index: ", g17, "AtomParsers");
                                }
                                uVar4.F(i40 + g16);
                                g14 = i23;
                            }
                            if (!arrayList7.isEmpty()) {
                                m18 = new M(arrayList7);
                                m11 = m18;
                            }
                        }
                    }
                    m18 = null;
                    m11 = m18;
                } else {
                    m11 = null;
                }
                C2792b j15 = c2791a.j(1836476516);
                j15.getClass();
                M m22 = new M(e.d(j15.f28801h0));
                char c12 = '\b';
                int i44 = -1;
                i10 = 4;
                ArrayList g21 = e.g(c2791a, xVar, -9223372036854775807L, null, false, z10, new Y(3));
                int size = g21.size();
                long j16 = -9223372036854775807L;
                int i45 = -1;
                long j17 = -9223372036854775807L;
                int i46 = 0;
                while (true) {
                    j10 = 0;
                    if (i46 >= size) {
                        break;
                    }
                    s sVar = (s) g21.get(i46);
                    if (sVar.f28937b == 0) {
                        m12 = m11;
                        m13 = m22;
                        m14 = m10;
                        arrayList2 = g21;
                        c10 = c12;
                        arrayList3 = arrayList;
                        i14 = -1;
                        i13 = 1;
                    } else {
                        p pVar = sVar.f28936a;
                        m13 = m22;
                        m14 = m10;
                        long j18 = pVar.f28907e;
                        if (j18 == j16) {
                            j18 = sVar.f28943h;
                        }
                        j17 = Math.max(j17, j18);
                        L2.s sVar2 = this.f28890s;
                        int i47 = pVar.f28904b;
                        l lVar = new l(pVar, sVar, sVar2.f(i46, i47));
                        C5065s c5065s = pVar.f28908f;
                        arrayList2 = g21;
                        boolean equals = "audio/true-hd".equals(c5065s.f42319q0);
                        int i48 = sVar.f28940e;
                        if (equals) {
                            i15 = i48 * 16;
                        } else {
                            i15 = i48 + 30;
                        }
                        p2.r b10 = c5065s.b();
                        b10.f42238l = i15;
                        if (i47 == 2) {
                            c10 = '\b';
                            if ((this.f28872a & 8) != 0) {
                                if (i45 == -1) {
                                    i22 = 1;
                                } else {
                                    i22 = 2;
                                }
                                b10.f42231e = c5065s.f42312j0 | i22;
                            }
                            if (j18 > 0) {
                                int i49 = sVar.f28937b;
                                if (i49 > 1) {
                                    b10.f42244r = i49 / (((float) j18) / 1000000.0f);
                                } else {
                                    i16 = 1;
                                    if (i47 == i16 && (i20 = xVar.f10656a) != -1 && (i21 = xVar.f10657b) != -1) {
                                        b10.f42220A = i20;
                                        b10.f42221B = i21;
                                    }
                                    M[] mArr = new M[3];
                                    arrayList4 = this.f28879h;
                                    if (!arrayList4.isEmpty()) {
                                        i17 = 0;
                                        m15 = null;
                                    } else {
                                        m15 = new M(arrayList4);
                                        i17 = 0;
                                    }
                                    mArr[i17] = m15;
                                    mArr[1] = m14;
                                    mArr[2] = m13;
                                    m16 = new M(new L[i17]);
                                    if (m11 != null) {
                                        int i50 = 0;
                                        while (true) {
                                            L[] lArr = m11.f41915Y;
                                            if (i50 >= lArr.length) {
                                                break;
                                            }
                                            L l10 = lArr[i50];
                                            if (l10 instanceof C5664a) {
                                                C5664a c5664a2 = (C5664a) l10;
                                                m17 = m11;
                                                if (c5664a2.f45627Y.equals("com.android.capture.fps")) {
                                                    if (i47 == 2) {
                                                        i19 = 1;
                                                        m16 = m16.a(c5664a2);
                                                    } else {
                                                        i19 = 1;
                                                    }
                                                } else {
                                                    i19 = 1;
                                                    m16 = m16.a(c5664a2);
                                                }
                                            } else {
                                                m17 = m11;
                                                i19 = 1;
                                            }
                                            i50 += i19;
                                            m11 = m17;
                                        }
                                    }
                                    m12 = m11;
                                    for (i18 = 0; i18 < 3; i18++) {
                                        m16 = m16.c(mArr[i18]);
                                    }
                                    if (m16.f41915Y.length > 0) {
                                        b10.f42235i = m16;
                                    }
                                    lVar.f28869c.b(new C5065s(b10));
                                    if (i47 != 2) {
                                        i14 = -1;
                                        if (i45 == -1) {
                                            i45 = arrayList.size();
                                        }
                                    } else {
                                        i14 = -1;
                                    }
                                    arrayList3 = arrayList;
                                    arrayList3.add(lVar);
                                    i13 = 1;
                                }
                            }
                        } else {
                            c10 = '\b';
                        }
                        i16 = 1;
                        if (i47 == i16) {
                            b10.f42220A = i20;
                            b10.f42221B = i21;
                        }
                        M[] mArr2 = new M[3];
                        arrayList4 = this.f28879h;
                        if (!arrayList4.isEmpty()) {
                        }
                        mArr2[i17] = m15;
                        mArr2[1] = m14;
                        mArr2[2] = m13;
                        m16 = new M(new L[i17]);
                        if (m11 != null) {
                        }
                        m12 = m11;
                        while (i18 < 3) {
                        }
                        if (m16.f41915Y.length > 0) {
                        }
                        lVar.f28869c.b(new C5065s(b10));
                        if (i47 != 2) {
                        }
                        arrayList3 = arrayList;
                        arrayList3.add(lVar);
                        i13 = 1;
                    }
                    i46 += i13;
                    i44 = i14;
                    arrayList = arrayList3;
                    m10 = m14;
                    m22 = m13;
                    c12 = c10;
                    g21 = arrayList2;
                    m11 = m12;
                    j16 = -9223372036854775807L;
                }
                int i51 = i44;
                this.f28893v = i45;
                this.f28894w = j17;
                l[] lVarArr = (l[]) arrayList.toArray(new l[0]);
                this.f28891t = lVarArr;
                long[][] jArr = new long[lVarArr.length];
                int[] iArr = new int[lVarArr.length];
                long[] jArr2 = new long[lVarArr.length];
                boolean[] zArr = new boolean[lVarArr.length];
                for (int i52 = 0; i52 < lVarArr.length; i52++) {
                    jArr[i52] = new long[lVarArr[i52].f28868b.f28937b];
                    jArr2[i52] = lVarArr[i52].f28868b.f28941f[0];
                }
                int i53 = 0;
                while (i53 < lVarArr.length) {
                    int i54 = i51;
                    long j19 = Long.MAX_VALUE;
                    for (int i55 = 0; i55 < lVarArr.length; i55++) {
                        if (!zArr[i55]) {
                            long j20 = jArr2[i55];
                            if (j20 <= j19) {
                                i54 = i55;
                                j19 = j20;
                            }
                        }
                    }
                    int i56 = iArr[i54];
                    long[] jArr3 = jArr[i54];
                    jArr3[i56] = j10;
                    s sVar3 = lVarArr[i54].f28868b;
                    j10 += sVar3.f28939d[i56];
                    int i57 = i56 + 1;
                    iArr[i54] = i57;
                    if (i57 < jArr3.length) {
                        jArr2[i54] = sVar3.f28941f[i57];
                    } else {
                        zArr[i54] = true;
                        i53++;
                    }
                }
                i11 = 1;
                this.f28892u = jArr;
                this.f28890s.d();
                this.f28890s.b(this);
                arrayDeque.clear();
                this.f28880i = 2;
            } else {
                i10 = i24;
                i11 = i26;
                if (!arrayDeque3.isEmpty()) {
                    ((C2791a) arrayDeque3.peek()).f28800j0.add(c2791a);
                }
            }
            i26 = i11;
            i24 = i10;
            i25 = 0;
        }
        if (this.f28880i != 2) {
            this.f28880i = 0;
            this.f28883l = 0;
        }
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
