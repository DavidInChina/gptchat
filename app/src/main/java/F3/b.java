package f3;

import L2.B;
import L2.r;
import java.io.EOFException;
import java.io.IOException;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: Y  reason: collision with root package name */
    public final g f29527Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f29528Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f29529h0;

    /* renamed from: i0  reason: collision with root package name */
    public final j f29530i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f29531j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f29532k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f29533l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f29534m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f29535n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f29536o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f29537p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f29538q0;

    public b(j jVar, long j6, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j6 >= 0 && j10 > j6) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.l(z11);
        this.f29530i0 = jVar;
        this.f29528Z = j6;
        this.f29529h0 = j10;
        if (j11 != j10 - j6 && !z10) {
            this.f29531j0 = 0;
        } else {
            this.f29532k0 = j12;
            this.f29531j0 = 4;
        }
        this.f29527Y = new g();
    }

    @Override // f3.h
    public final B m() {
        if (this.f29532k0 != 0) {
            return new C2935a(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // f3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(r rVar) {
        g gVar;
        ?? r22;
        g gVar2;
        long j6;
        long j10;
        long j11;
        int i10 = this.f29531j0;
        long j12 = this.f29529h0;
        g gVar3 = this.f29527Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                    j6 = -1;
                    gVar2 = gVar3;
                } else {
                    if (this.f29535n0 != this.f29536o0) {
                        long o10 = rVar.o();
                        if (!gVar3.b(rVar, this.f29536o0)) {
                            long j13 = this.f29535n0;
                            if (j13 != o10) {
                                j10 = j13;
                            } else {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            gVar3.a(rVar, false);
                            rVar.k();
                            long j14 = this.f29534m0;
                            long j15 = gVar3.f29554b;
                            long j16 = j14 - j15;
                            int i11 = gVar3.f29556d + gVar3.f29557e;
                            if (0 > j16 || j16 >= 72000) {
                                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                                if (i12 < 0) {
                                    this.f29536o0 = o10;
                                    this.f29538q0 = j15;
                                } else {
                                    this.f29535n0 = rVar.o() + i11;
                                    this.f29537p0 = gVar3.f29554b;
                                }
                                long j17 = this.f29536o0;
                                long j18 = this.f29535n0;
                                if (j17 - j18 < 100000) {
                                    this.f29536o0 = j18;
                                    j10 = j18;
                                } else {
                                    long j19 = i11;
                                    if (i12 <= 0) {
                                        j11 = 2;
                                    } else {
                                        j11 = 1;
                                    }
                                    long j20 = this.f29536o0;
                                    gVar2 = gVar3;
                                    long j21 = this.f29535n0;
                                    j10 = AbstractC5530A.j((((j20 - j21) * j16) / (this.f29538q0 - this.f29537p0)) + (rVar.o() - (j19 * j11)), j21, j20 - 1);
                                    j6 = -1;
                                    if (j10 != j6) {
                                        return j10;
                                    }
                                    this.f29531j0 = 3;
                                }
                            }
                        }
                        gVar2 = gVar3;
                        j6 = -1;
                        if (j10 != j6) {
                        }
                    }
                    gVar2 = gVar3;
                    j6 = -1;
                    j10 = -1;
                    if (j10 != j6) {
                    }
                }
                g gVar4 = gVar2;
                while (true) {
                    gVar4.b(rVar, j6);
                    gVar4.a(rVar, false);
                    if (gVar4.f29554b > this.f29534m0) {
                        rVar.k();
                        this.f29531j0 = 4;
                        return -(this.f29537p0 + 2);
                    }
                    rVar.l(gVar4.f29556d + gVar4.f29557e);
                    this.f29535n0 = rVar.o();
                    this.f29537p0 = gVar4.f29554b;
                    j6 = -1;
                }
            } else {
                gVar = gVar3;
                r22 = 0;
            }
        } else {
            gVar = gVar3;
            long o11 = rVar.o();
            this.f29533l0 = o11;
            this.f29531j0 = 1;
            long j22 = j12 - 65307;
            if (j22 > o11) {
                return j22;
            }
            r22 = 0;
        }
        int i13 = r22 == true ? 1 : 0;
        int i14 = r22 == true ? 1 : 0;
        gVar.f29553a = i13;
        gVar.f29554b = 0L;
        gVar.f29555c = r22;
        gVar.f29556d = r22;
        gVar.f29557e = r22;
        if (gVar.b(rVar, -1L)) {
            gVar.a(rVar, r22);
            rVar.l(gVar.f29556d + gVar.f29557e);
            long j23 = gVar.f29554b;
            while ((gVar.f29553a & 4) != 4 && gVar.b(rVar, -1L) && rVar.o() < j12 && gVar.a(rVar, true)) {
                try {
                    rVar.l(gVar.f29556d + gVar.f29557e);
                    j23 = gVar.f29554b;
                } catch (EOFException unused) {
                }
            }
            this.f29532k0 = j23;
            this.f29531j0 = 4;
            return this.f29533l0;
        }
        throw new EOFException();
    }

    @Override // f3.h
    public final void q(long j6) {
        this.f29534m0 = AbstractC5530A.j(j6, 0L, this.f29532k0 - 1);
        this.f29531j0 = 2;
        this.f29535n0 = this.f29528Z;
        this.f29536o0 = this.f29529h0;
        this.f29537p0 = 0L;
        this.f29538q0 = this.f29532k0;
    }
}
