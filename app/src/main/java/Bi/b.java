package Bi;

import Ji.d;
import Ji.g;
import Ji.s;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2418Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f2419Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f2420h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f2421i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ g f2422j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ g f2423k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f2424l0;

    public /* synthetic */ b(long j6, long j10, long j11, d dVar, d dVar2, long j12, int i10) {
        this.f2418Y = i10;
        this.f2419Z = j6;
        this.f2420h0 = j10;
        this.f2421i0 = j11;
        this.f2422j0 = dVar;
        this.f2423k0 = dVar2;
        this.f2424l0 = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2418Y;
        long j6 = this.f2424l0;
        g gVar = this.f2423k0;
        long j10 = this.f2421i0;
        g gVar2 = this.f2422j0;
        long j11 = this.f2420h0;
        long j12 = this.f2419Z;
        switch (i10) {
            case 0:
                long j13 = j12 + j11;
                while (j10 > 512) {
                    long j14 = j10 >> 2;
                    long j15 = j6 - (j10 >> 3);
                    c.p0(j14, j13 - j14, j15, (d) gVar2, (d) gVar);
                    j10 = j14;
                }
                d dVar = (d) gVar2;
                d dVar2 = (d) gVar;
                c.n0(j10, 1L, j13 - j10, this.f2424l0, dVar, dVar2);
                long j16 = j12 - j10;
                long j17 = j11 - j10;
                long j18 = 0;
                for (long j19 = 0; j17 > j19; j19 = 0) {
                    j18++;
                    long j20 = j16;
                    long j21 = j10;
                    long j22 = j17;
                    c.n0(j21, c.x0(j21, j22, j18, this.f2419Z, this.f2424l0, dVar, dVar2), j20 + j17, this.f2424l0, dVar, dVar2);
                    j17 -= j10;
                    j16 = j20;
                }
                return;
            case 1:
                long j23 = j12 + j11;
                long j24 = 1;
                for (long j25 = 512; j10 > j25; j25 = 512) {
                    j10 >>= 2;
                    j24 <<= 2;
                    c.r0(j10, j23 - j10, j6 - j10, (d) gVar2, (d) gVar);
                }
                d dVar3 = (d) gVar2;
                d dVar4 = (d) gVar;
                c.n0(j10, 0L, j23 - j10, this.f2424l0, dVar3, dVar4);
                long j26 = j24 >> 1;
                long j27 = j12 - j10;
                long j28 = j11 - j10;
                while (j28 > 0) {
                    j26++;
                    long j29 = j27;
                    long j30 = j10;
                    long j31 = j28;
                    c.n0(j30, c.x0(j30, j31, j26, this.f2419Z, this.f2424l0, dVar3, dVar4), j29 + j28, this.f2424l0, dVar3, dVar4);
                    j28 -= j10;
                    j27 = j29;
                }
                return;
            case 2:
                while (j12 < j11) {
                    ((d) gVar2).c(((d) gVar).b(j6 + j12), j10 + j12);
                    j12++;
                }
                return;
        }
        while (j12 < j11) {
            ((s) gVar2).c(j10 + j12, ((s) gVar).b(j6 + j12));
            j12++;
            gVar = gVar;
            j10 = j10;
        }
    }

    public /* synthetic */ b(long j6, long j10, g gVar, long j11, g gVar2, long j12, int i10) {
        this.f2418Y = i10;
        this.f2419Z = j6;
        this.f2420h0 = j10;
        this.f2422j0 = gVar;
        this.f2421i0 = j11;
        this.f2423k0 = gVar2;
        this.f2424l0 = j12;
    }
}
