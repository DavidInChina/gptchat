package N2;

import I2.i;
import L2.G;
import L2.q;
import L2.r;
import L2.s;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import p2.C5065s;
import p2.N;
import p2.O;
import s2.AbstractC5530A;
import s2.p;
import s2.u;
import x8.L;

/* loaded from: classes2.dex */
public final class b implements q {

    /* renamed from: c  reason: collision with root package name */
    public int f12647c;

    /* renamed from: e  reason: collision with root package name */
    public c f12649e;

    /* renamed from: h  reason: collision with root package name */
    public long f12652h;

    /* renamed from: i  reason: collision with root package name */
    public e f12653i;

    /* renamed from: m  reason: collision with root package name */
    public int f12657m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12658n;

    /* renamed from: a  reason: collision with root package name */
    public final u f12645a = new u(12);

    /* renamed from: b  reason: collision with root package name */
    public final J2.g f12646b = new Object();

    /* renamed from: d  reason: collision with root package name */
    public s f12648d = new Cf.h(0);

    /* renamed from: g  reason: collision with root package name */
    public e[] f12651g = new e[0];

    /* renamed from: k  reason: collision with root package name */
    public long f12655k = -1;

    /* renamed from: l  reason: collision with root package name */
    public long f12656l = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f12654j = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f12650f = -9223372036854775807L;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        boolean z10;
        e eVar;
        long j6;
        e[] eVarArr;
        e eVar2;
        int i10;
        e[] eVarArr2;
        boolean z11;
        int i11;
        int i12 = 0;
        if (this.f12652h != -1) {
            long o10 = rVar.o();
            long j10 = this.f12652h;
            if (j10 >= o10 && j10 <= 262144 + o10) {
                rVar.l((int) (j10 - o10));
            } else {
                iVar.f7995b = j10;
                z10 = true;
                this.f12652h = -1L;
                if (!z10) {
                    return 1;
                }
                int i13 = this.f12647c;
                e eVar3 = null;
                int i14 = 2;
                int i15 = 8;
                J2.g gVar = this.f12646b;
                u uVar = this.f12645a;
                switch (i13) {
                    case 0:
                        if (g(rVar)) {
                            rVar.l(12);
                            this.f12647c = 1;
                            return 0;
                        }
                        throw O.a("AVI Header List not found", null);
                    case 1:
                        rVar.readFully(uVar.f45193a, 0, 12);
                        uVar.F(0);
                        gVar.getClass();
                        gVar.f8749a = uVar.i();
                        gVar.f8750b = uVar.i();
                        gVar.f8751c = 0;
                        if (gVar.f8749a == 1414744396) {
                            int i16 = uVar.i();
                            gVar.f8751c = i16;
                            if (i16 == 1819436136) {
                                this.f12654j = gVar.f8750b;
                                this.f12647c = 2;
                                return 0;
                            }
                            throw O.a("hdrl expected, found: " + gVar.f8751c, null);
                        }
                        throw O.a("LIST expected, found: " + gVar.f8749a, null);
                    case 2:
                        int i17 = this.f12654j - 4;
                        u uVar2 = new u(i17);
                        rVar.readFully(uVar2.f45193a, 0, i17);
                        f b10 = f.b(1819436136, uVar2);
                        int i18 = b10.f12680b;
                        if (i18 == 1819436136) {
                            c cVar = (c) b10.a(c.class);
                            if (cVar != null) {
                                this.f12649e = cVar;
                                this.f12650f = cVar.f12661c * cVar.f12659a;
                                ArrayList arrayList = new ArrayList();
                                L listIterator = b10.f12679a.listIterator(0);
                                int i19 = 0;
                                while (listIterator.hasNext()) {
                                    a aVar = (a) listIterator.next();
                                    if (aVar.getType() == 1819440243) {
                                        f fVar = (f) aVar;
                                        int i20 = i19 + 1;
                                        d dVar = (d) fVar.a(d.class);
                                        g gVar2 = (g) fVar.a(g.class);
                                        if (dVar == null) {
                                            p.g("AviExtractor", "Missing Stream Header");
                                        } else if (gVar2 == null) {
                                            p.g("AviExtractor", "Missing Stream Format");
                                        } else {
                                            int i21 = AbstractC5530A.f45131a;
                                            long I10 = AbstractC5530A.I(dVar.f12665d, dVar.f12663b * 1000000, dVar.f12664c, RoundingMode.FLOOR);
                                            C5065s c5065s = gVar2.f12681a;
                                            p2.r b11 = c5065s.b();
                                            b11.f42227a = Integer.toString(i19);
                                            int i22 = dVar.f12666e;
                                            if (i22 != 0) {
                                                b11.f42238l = i22;
                                            }
                                            h hVar = (h) fVar.a(h.class);
                                            if (hVar != null) {
                                                b11.f42228b = hVar.f12682a;
                                            }
                                            int f6 = N.f(c5065s.f42319q0);
                                            if (f6 == 1 || f6 == i14) {
                                                G f10 = this.f12648d.f(i19, f6);
                                                f10.b(new C5065s(b11));
                                                eVar = new e(i19, f6, I10, dVar.f12665d, f10);
                                                this.f12650f = I10;
                                                if (eVar != null) {
                                                    arrayList.add(eVar);
                                                }
                                                i19 = i20;
                                            }
                                        }
                                        eVar = null;
                                        if (eVar != null) {
                                        }
                                        i19 = i20;
                                    }
                                    i14 = 2;
                                }
                                this.f12651g = (e[]) arrayList.toArray(new e[0]);
                                this.f12648d.d();
                                this.f12647c = 3;
                                return 0;
                            }
                            throw O.a("AviHeader not found", null);
                        }
                        throw O.a("Unexpected header list type " + i18, null);
                    case 3:
                        if (this.f12655k != -1) {
                            long o11 = rVar.o();
                            long j11 = this.f12655k;
                            if (o11 != j11) {
                                this.f12652h = j11;
                                return 0;
                            }
                        }
                        rVar.n(uVar.f45193a, 0, 12);
                        rVar.k();
                        uVar.F(0);
                        gVar.getClass();
                        gVar.f8749a = uVar.i();
                        gVar.f8750b = uVar.i();
                        gVar.f8751c = 0;
                        int i23 = uVar.i();
                        int i24 = gVar.f8749a;
                        if (i24 == 1179011410) {
                            rVar.l(12);
                            return 0;
                        } else if (i24 == 1414744396 && i23 == 1769369453) {
                            long o12 = rVar.o();
                            this.f12655k = o12;
                            this.f12656l = o12 + gVar.f8750b + 8;
                            if (!this.f12658n) {
                                c cVar2 = this.f12649e;
                                cVar2.getClass();
                                if ((cVar2.f12660b & 16) == 16) {
                                    this.f12647c = 4;
                                    this.f12652h = this.f12656l;
                                    return 0;
                                }
                                this.f12648d.b(new L2.u(this.f12650f));
                                this.f12658n = true;
                            }
                            this.f12652h = rVar.o() + 12;
                            this.f12647c = 6;
                            return 0;
                        } else {
                            this.f12652h = rVar.o() + gVar.f8750b + 8;
                            return 0;
                        }
                    case 4:
                        rVar.readFully(uVar.f45193a, 0, 8);
                        uVar.F(0);
                        int i25 = uVar.i();
                        int i26 = uVar.i();
                        if (i25 == 829973609) {
                            this.f12647c = 5;
                            this.f12657m = i26;
                            return 0;
                        }
                        this.f12652h = rVar.o() + i26;
                        return 0;
                    case 5:
                        u uVar3 = new u(this.f12657m);
                        rVar.readFully(uVar3.f45193a, 0, this.f12657m);
                        if (uVar3.a() < 16) {
                            j6 = 0;
                        } else {
                            int i27 = uVar3.f45194b;
                            uVar3.G(8);
                            long j12 = this.f12655k;
                            if (uVar3.i() > j12) {
                                j6 = 0;
                            } else {
                                j6 = j12 + 8;
                            }
                            uVar3.F(i27);
                        }
                        while (uVar3.a() >= 16) {
                            int i28 = uVar3.i();
                            int i29 = uVar3.i();
                            long i30 = uVar3.i() + j6;
                            uVar3.i();
                            e[] eVarArr3 = this.f12651g;
                            int length = eVarArr3.length;
                            int i31 = i12;
                            while (true) {
                                if (i31 < length) {
                                    eVar2 = eVarArr3[i31];
                                    if (eVar2.f12668b != i28 && eVar2.f12669c != i28) {
                                        i31++;
                                    }
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                if ((i29 & 16) == 16) {
                                    if (eVar2.f12676j == eVar2.f12678l.length) {
                                        long[] jArr = eVar2.f12677k;
                                        eVar2.f12677k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.f12678l;
                                        eVar2.f12678l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.f12677k;
                                    int i32 = eVar2.f12676j;
                                    jArr2[i32] = i30;
                                    eVar2.f12678l[i32] = eVar2.f12675i;
                                    i10 = 1;
                                    eVar2.f12676j = i32 + 1;
                                } else {
                                    i10 = 1;
                                }
                                eVar2.f12675i += i10;
                            }
                            i12 = 0;
                        }
                        for (e eVar4 : this.f12651g) {
                            eVar4.f12677k = Arrays.copyOf(eVar4.f12677k, eVar4.f12676j);
                            eVar4.f12678l = Arrays.copyOf(eVar4.f12678l, eVar4.f12676j);
                        }
                        this.f12658n = true;
                        this.f12648d.b(new L2.u(this, this.f12650f, 2));
                        this.f12647c = 6;
                        this.f12652h = this.f12655k;
                        return 0;
                    case 6:
                        if (rVar.o() >= this.f12656l) {
                            return -1;
                        }
                        e eVar5 = this.f12653i;
                        if (eVar5 != null) {
                            int i33 = eVar5.f12673g;
                            int c10 = i33 - eVar5.f12667a.c(rVar, i33, false);
                            eVar5.f12673g = c10;
                            if (c10 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (eVar5.f12672f > 0) {
                                    int i34 = eVar5.f12674h;
                                    long j13 = (eVar5.f12670d * i34) / eVar5.f12671e;
                                    if (Arrays.binarySearch(eVar5.f12678l, i34) >= 0) {
                                        i11 = 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    eVar5.f12667a.e(j13, i11, eVar5.f12672f, 0, null);
                                }
                                eVar5.f12674h++;
                            }
                            if (!z11) {
                                return 0;
                            }
                            this.f12653i = null;
                            return 0;
                        }
                        if ((rVar.o() & 1) == 1) {
                            rVar.l(1);
                        }
                        rVar.n(uVar.f45193a, 0, 12);
                        uVar.F(0);
                        int i35 = uVar.i();
                        if (i35 == 1414744396) {
                            uVar.F(8);
                            if (uVar.i() == 1769369453) {
                                i15 = 12;
                            }
                            rVar.l(i15);
                            rVar.k();
                            return 0;
                        }
                        int i36 = uVar.i();
                        if (i35 == 1263424842) {
                            this.f12652h = rVar.o() + i36 + 8;
                            return 0;
                        }
                        rVar.l(8);
                        rVar.k();
                        for (e eVar6 : this.f12651g) {
                            if (eVar6.f12668b == i35 || eVar6.f12669c == i35) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.f12652h = rVar.o() + i36;
                                    return 0;
                                }
                                eVar3.f12672f = i36;
                                eVar3.f12673g = i36;
                                this.f12653i = eVar3;
                                return 0;
                            }
                        }
                        if (eVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        z10 = false;
        this.f12652h = -1L;
        if (!z10) {
        }
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f12647c = 0;
        this.f12648d = sVar;
        this.f12652h = -1L;
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        u uVar = this.f12645a;
        rVar.n(uVar.f45193a, 0, 12);
        uVar.F(0);
        if (uVar.i() != 1179011410) {
            return false;
        }
        uVar.G(4);
        if (uVar.i() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        e[] eVarArr;
        this.f12652h = -1L;
        this.f12653i = null;
        for (e eVar : this.f12651g) {
            if (eVar.f12676j == 0) {
                eVar.f12674h = 0;
            } else {
                eVar.f12674h = eVar.f12678l[AbstractC5530A.e(eVar.f12677k, j6, true)];
            }
        }
        if (j6 == 0) {
            if (this.f12651g.length == 0) {
                this.f12647c = 0;
                return;
            } else {
                this.f12647c = 3;
                return;
            }
        }
        this.f12647c = 6;
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
