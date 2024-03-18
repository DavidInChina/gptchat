package E2;

import N.C1025i;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import p2.C5065s;
import s2.AbstractC5530A;
import v2.AbstractC5968g;
import v2.AbstractC5969h;
import y2.C6513P;
import y2.l0;

/* loaded from: classes2.dex */
public final class e0 implements AbstractC0490w, I2.h {

    /* renamed from: Y  reason: collision with root package name */
    public final v2.l f4312Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5968g f4313Z;

    /* renamed from: h0  reason: collision with root package name */
    public final v2.F f4314h0;

    /* renamed from: i0  reason: collision with root package name */
    public final R4.a f4315i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1025i f4316j0;

    /* renamed from: k0  reason: collision with root package name */
    public final i0 f4317k0;

    /* renamed from: m0  reason: collision with root package name */
    public final long f4319m0;

    /* renamed from: o0  reason: collision with root package name */
    public final C5065s f4321o0;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f4322p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f4323q0;

    /* renamed from: r0  reason: collision with root package name */
    public byte[] f4324r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f4325s0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f4318l0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public final I2.n f4320n0 = new I2.n("SingleSampleMediaPeriod");

    public e0(v2.l lVar, AbstractC5968g abstractC5968g, v2.F f6, C5065s c5065s, long j6, R4.a aVar, C1025i c1025i, boolean z10) {
        this.f4312Y = lVar;
        this.f4313Z = abstractC5968g;
        this.f4314h0 = f6;
        this.f4321o0 = c5065s;
        this.f4319m0 = j6;
        this.f4315i0 = aVar;
        this.f4316j0 = c1025i;
        this.f4322p0 = z10;
        this.f4317k0 = new i0(new p2.h0("", c5065s));
    }

    @Override // I2.h
    public final void a(I2.k kVar, long j6, long j10, boolean z10) {
        v2.D d10 = ((d0) kVar).f4310c;
        Uri uri = d10.f47043c;
        C0484p c0484p = new C0484p(d10.f47044d);
        this.f4315i0.getClass();
        C1025i c1025i = this.f4316j0;
        c1025i.getClass();
        c1025i.j(c0484p, new C0488u(1, -1, null, 0, null, AbstractC5530A.L(0L), AbstractC5530A.L(this.f4319m0)));
    }

    @Override // E2.Z
    public final long c() {
        if (!this.f4323q0 && !this.f4320n0.a()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // I2.h
    public final void g(I2.k kVar, long j6, long j10) {
        d0 d0Var = (d0) kVar;
        this.f4325s0 = (int) d0Var.f4310c.f47042b;
        byte[] bArr = d0Var.f4311d;
        bArr.getClass();
        this.f4324r0 = bArr;
        this.f4323q0 = true;
        v2.D d10 = d0Var.f4310c;
        Uri uri = d10.f47043c;
        C0484p c0484p = new C0484p(d10.f47044d);
        this.f4315i0.getClass();
        C1025i c1025i = this.f4316j0;
        c1025i.getClass();
        c1025i.k(c0484p, new C0488u(1, -1, this.f4321o0, 0, null, AbstractC5530A.L(0L), AbstractC5530A.L(this.f4319m0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Override // I2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I2.i h(I2.k kVar, long j6, long j10, IOException iOException, int i10) {
        long j11;
        int i11;
        boolean z10;
        I2.i iVar;
        int i12;
        v2.D d10 = ((d0) kVar).f4310c;
        Uri uri = d10.f47043c;
        C0484p c0484p = new C0484p(d10.f47044d);
        int i13 = AbstractC5530A.f45131a;
        R4.a aVar = this.f4315i0;
        aVar.getClass();
        if (!(iOException instanceof p2.O) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof v2.v) && !(iOException instanceof I2.m)) {
            int i14 = v2.i.f47077Z;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof v2.i) || ((v2.i) th2).f47078Y != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * 1000, 5000);
            i11 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
            boolean z11 = false;
            if (i11 == 0 && i10 < aVar.a0(1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!this.f4322p0 && z10) {
                s2.p.h("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
                this.f4323q0 = true;
                iVar = I2.n.f8006d;
            } else if (i11 == 0) {
                iVar = new I2.i(0, j11);
            } else {
                iVar = I2.n.f8007e;
            }
            i12 = iVar.f7994a;
            if (i12 != 0 || i12 == 1) {
                z11 = true;
            }
            C1025i c1025i = this.f4316j0;
            c1025i.getClass();
            c1025i.l(c0484p, new C0488u(1, -1, this.f4321o0, 0, null, AbstractC5530A.L(0L), AbstractC5530A.L(this.f4319m0)), iOException, !z11);
            return iVar;
        }
        j11 = -9223372036854775807L;
        i11 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
        boolean z112 = false;
        if (i11 == 0) {
        }
        z10 = true;
        if (!this.f4322p0) {
        }
        if (i11 == 0) {
        }
        i12 = iVar.f7994a;
        if (i12 != 0) {
        }
        z112 = true;
        C1025i c1025i2 = this.f4316j0;
        c1025i2.getClass();
        c1025i2.l(c0484p, new C0488u(1, -1, this.f4321o0, 0, null, AbstractC5530A.L(0L), AbstractC5530A.L(this.f4319m0)), iOException, !z112);
        return iVar;
    }

    @Override // E2.AbstractC0490w
    public final long j(long j6) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4318l0;
            if (i10 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i10);
                if (c0Var.f4301Y == 2) {
                    c0Var.f4301Y = 1;
                }
                i10++;
            } else {
                return j6;
            }
        }
    }

    @Override // E2.Z
    public final boolean l() {
        return this.f4320n0.a();
    }

    @Override // E2.Z
    public final boolean m(C6513P c6513p) {
        boolean z10 = false;
        if (!this.f4323q0) {
            I2.n nVar = this.f4320n0;
            if (!nVar.a() && nVar.f8010c == null) {
                AbstractC5969h a5 = this.f4313Z.a();
                v2.F f6 = this.f4314h0;
                if (f6 != null) {
                    a5.g(f6);
                }
                d0 d0Var = new d0(a5, this.f4312Y);
                int a02 = this.f4315i0.a0(1);
                Looper myLooper = Looper.myLooper();
                Gi.e.o(myLooper);
                nVar.f8010c = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                I2.j jVar = new I2.j(nVar, myLooper, d0Var, this, a02, elapsedRealtime);
                if (nVar.f8009b == null) {
                    z10 = true;
                }
                Gi.e.n(z10);
                nVar.f8009b = jVar;
                jVar.f8000j0 = null;
                nVar.f8008a.execute(jVar);
                C0484p c0484p = new C0484p(d0Var.f4308a, this.f4312Y, elapsedRealtime);
                C1025i c1025i = this.f4316j0;
                c1025i.getClass();
                c1025i.m(c0484p, new C0488u(1, -1, this.f4321o0, 0, null, AbstractC5530A.L(0L), AbstractC5530A.L(this.f4319m0)));
                return true;
            }
        }
        return false;
    }

    @Override // E2.AbstractC0490w
    public final void q(AbstractC0489v abstractC0489v, long j6) {
        abstractC0489v.a(this);
    }

    @Override // E2.AbstractC0490w
    public final long r() {
        return -9223372036854775807L;
    }

    @Override // E2.AbstractC0490w
    public final i0 u() {
        return this.f4317k0;
    }

    @Override // E2.AbstractC0490w
    public final long v(H2.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j6) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            Y y10 = yArr[i10];
            ArrayList arrayList = this.f4318l0;
            if (y10 != null && (sVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(y10);
                yArr[i10] = null;
            }
            if (yArr[i10] == null && sVarArr[i10] != null) {
                c0 c0Var = new c0(this);
                arrayList.add(c0Var);
                yArr[i10] = c0Var;
                zArr2[i10] = true;
            }
        }
        return j6;
    }

    @Override // E2.Z
    public final long x() {
        if (this.f4323q0) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // E2.AbstractC0490w
    public final void e() {
    }

    @Override // E2.Z
    public final void C(long j6) {
    }

    @Override // E2.AbstractC0490w
    public final void k(long j6) {
    }

    @Override // E2.AbstractC0490w
    public final long p(long j6, l0 l0Var) {
        return j6;
    }
}
