package f3;

import L2.B;
import L2.G;
import L2.q;
import L2.r;
import L2.s;
import java.util.Arrays;
import p2.C5065s;
import p2.O;
import r9.y;
import s2.AbstractC5530A;
import s2.u;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: a  reason: collision with root package name */
    public s f29545a;

    /* renamed from: b  reason: collision with root package name */
    public j f29546b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f29547c;

    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [f3.h, java.lang.Object] */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, I2.i iVar) {
        int i10;
        byte[] bArr;
        boolean z10;
        Gi.e.o(this.f29545a);
        if (this.f29546b == null) {
            if (c(rVar)) {
                rVar.k();
            } else {
                throw O.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f29547c) {
            G f6 = this.f29545a.f(0, 1);
            this.f29545a.d();
            j jVar = this.f29546b;
            jVar.f29565c = this.f29545a;
            jVar.f29564b = f6;
            jVar.d(true);
            this.f29547c = true;
        }
        j jVar2 = this.f29546b;
        Gi.e.o(jVar2.f29564b);
        int i11 = AbstractC5530A.f45131a;
        int i12 = jVar2.f29570h;
        f fVar = jVar2.f29563a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                } else {
                    long n10 = jVar2.f29566d.n(rVar);
                    if (n10 >= 0) {
                        iVar.f7995b = n10;
                        return 1;
                    }
                    if (n10 < -1) {
                        jVar2.a(-(n10 + 2));
                    }
                    if (!jVar2.f29574l) {
                        B m10 = jVar2.f29566d.m();
                        Gi.e.o(m10);
                        jVar2.f29565c.b(m10);
                        jVar2.f29574l = true;
                    }
                    if (jVar2.f29573k <= 0 && !fVar.c(rVar)) {
                        jVar2.f29570h = 3;
                    } else {
                        jVar2.f29573k = 0L;
                        u uVar = (u) fVar.f29552e;
                        long b10 = jVar2.b(uVar);
                        if (b10 >= 0) {
                            long j6 = jVar2.f29569g;
                            if (j6 + b10 >= jVar2.f29567e) {
                                jVar2.f29564b.a(uVar.f45195c, uVar);
                                jVar2.f29564b.e((j6 * 1000000) / jVar2.f29571i, 1, uVar.f45195c, 0, null);
                                jVar2.f29567e = -1L;
                            }
                        }
                        jVar2.f29569g += b10;
                        return 0;
                    }
                }
            } else {
                rVar.l((int) jVar2.f29568f);
                jVar2.f29570h = 2;
                return 0;
            }
        } else {
            while (fVar.c(rVar)) {
                long o10 = rVar.o();
                long j10 = jVar2.f29568f;
                jVar2.f29573k = o10 - j10;
                if (jVar2.c((u) fVar.f29552e, j10, jVar2.f29572j)) {
                    jVar2.f29568f = rVar.o();
                } else {
                    C5065s c5065s = (C5065s) jVar2.f29572j.f17423Z;
                    jVar2.f29571i = c5065s.f42298E0;
                    if (!jVar2.f29575m) {
                        jVar2.f29564b.b(c5065s);
                        jVar2.f29575m = true;
                    }
                    h hVar = (h) jVar2.f29572j.f17424h0;
                    if (hVar != null) {
                        jVar2.f29566d = hVar;
                    } else if (rVar.h() == -1) {
                        jVar2.f29566d = new Object();
                    } else {
                        g gVar = (g) fVar.f29551d;
                        if ((gVar.f29553a & 4) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i10 = 2;
                        jVar2.f29566d = new b(jVar2, jVar2.f29568f, rVar.h(), gVar.f29556d + gVar.f29557e, gVar.f29554b, z10);
                        jVar2.f29570h = i10;
                        u uVar2 = (u) fVar.f29552e;
                        bArr = uVar2.f45193a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        uVar2.D(((u) fVar.f29552e).f45195c, Arrays.copyOf(bArr, Math.max(65025, uVar2.f45195c)));
                        return 0;
                    }
                    i10 = 2;
                    jVar2.f29570h = i10;
                    u uVar22 = (u) fVar.f29552e;
                    bArr = uVar22.f45193a;
                    if (bArr.length != 65025) {
                    }
                }
            }
            jVar2.f29570h = 3;
        }
        return -1;
    }

    public final boolean c(r rVar) {
        g gVar = new g();
        if (gVar.a(rVar, true) && (gVar.f29553a & 2) == 2) {
            int min = Math.min(gVar.f29557e, 8);
            u uVar = new u(min);
            rVar.n(uVar.f45193a, 0, min);
            uVar.F(0);
            if (uVar.a() >= 5 && uVar.u() == 127 && uVar.v() == 1179402563) {
                this.f29546b = new j();
            } else {
                uVar.F(0);
                try {
                    if (y.h1(1, uVar, true)) {
                        this.f29546b = new j();
                    }
                } catch (O unused) {
                }
                uVar.F(0);
                if (i.e(uVar, i.f29560o)) {
                    this.f29546b = new j();
                }
            }
            return true;
        }
        return false;
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f29545a = sVar;
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        try {
            return c(rVar);
        } catch (O unused) {
            return false;
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        j jVar = this.f29546b;
        if (jVar != null) {
            f fVar = jVar.f29563a;
            g gVar = (g) fVar.f29551d;
            gVar.f29553a = 0;
            gVar.f29554b = 0L;
            gVar.f29555c = 0;
            gVar.f29556d = 0;
            gVar.f29557e = 0;
            ((u) fVar.f29552e).C(0);
            fVar.f29549b = -1;
            fVar.f29548a = false;
            if (j6 == 0) {
                jVar.d(!jVar.f29574l);
            } else if (jVar.f29570h != 0) {
                long j11 = (jVar.f29571i * j10) / 1000000;
                jVar.f29567e = j11;
                h hVar = jVar.f29566d;
                int i10 = AbstractC5530A.f45131a;
                hVar.q(j11);
                jVar.f29570h = 2;
            }
        }
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
