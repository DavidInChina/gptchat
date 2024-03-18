package E2;

import N.C1025i;
import Z.C1745x0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import livekit.org.webrtc.MediaStreamTrack;
import m.RunnableC4517N;
import p2.C5065s;
import s2.AbstractC5530A;
import v2.AbstractC5969h;
import y2.C6513P;
import y2.l0;

/* loaded from: classes.dex */
public final class N implements AbstractC0490w, L2.s, I2.h, I2.l, W {

    /* renamed from: S0  reason: collision with root package name */
    public static final Map f4172S0;

    /* renamed from: T0  reason: collision with root package name */
    public static final C5065s f4173T0;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f4174A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f4175B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f4176C0;

    /* renamed from: D0  reason: collision with root package name */
    public M f4177D0;

    /* renamed from: E0  reason: collision with root package name */
    public L2.B f4178E0;

    /* renamed from: F0  reason: collision with root package name */
    public long f4179F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f4180G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f4181H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f4182I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f4183J0;

    /* renamed from: K0  reason: collision with root package name */
    public int f4184K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f4185L0;

    /* renamed from: M0  reason: collision with root package name */
    public long f4186M0;

    /* renamed from: N0  reason: collision with root package name */
    public long f4187N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f4188O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f4189P0;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f4190Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f4191R0;

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f4192Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5969h f4193Z;

    /* renamed from: h0  reason: collision with root package name */
    public final B2.q f4194h0;

    /* renamed from: i0  reason: collision with root package name */
    public final R4.a f4195i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1025i f4196j0;

    /* renamed from: k0  reason: collision with root package name */
    public final B2.n f4197k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Q f4198l0;

    /* renamed from: m0  reason: collision with root package name */
    public final I2.d f4199m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f4200n0;

    /* renamed from: o0  reason: collision with root package name */
    public final long f4201o0;

    /* renamed from: p0  reason: collision with root package name */
    public final I2.n f4202p0 = new I2.n("ProgressiveMediaPeriod");

    /* renamed from: q0  reason: collision with root package name */
    public final U3.u f4203q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C1745x0 f4204r0;

    /* renamed from: s0  reason: collision with root package name */
    public final H f4205s0;

    /* renamed from: t0  reason: collision with root package name */
    public final H f4206t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Handler f4207u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f4208v0;

    /* renamed from: w0  reason: collision with root package name */
    public AbstractC0489v f4209w0;

    /* renamed from: x0  reason: collision with root package name */
    public X2.b f4210x0;

    /* renamed from: y0  reason: collision with root package name */
    public X[] f4211y0;

    /* renamed from: z0  reason: collision with root package name */
    public L[] f4212z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f4172S0 = Collections.unmodifiableMap(hashMap);
        p2.r rVar = new p2.r();
        rVar.f42227a = "icy";
        rVar.f42237k = "application/x-icy";
        f4173T0 = rVar.a();
    }

    public N(Uri uri, AbstractC5969h abstractC5969h, U3.u uVar, B2.q qVar, B2.n nVar, R4.a aVar, C1025i c1025i, Q q10, I2.d dVar, String str, int i10, long j6) {
        boolean z10;
        this.f4192Y = uri;
        this.f4193Z = abstractC5969h;
        this.f4194h0 = qVar;
        this.f4197k0 = nVar;
        this.f4195i0 = aVar;
        this.f4196j0 = c1025i;
        this.f4198l0 = q10;
        this.f4199m0 = dVar;
        this.f4200n0 = str;
        this.f4201o0 = i10;
        this.f4203q0 = uVar;
        this.f4179F0 = j6;
        if (j6 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4208v0 = z10;
        this.f4204r0 = new C1745x0(2);
        this.f4205s0 = new H(this, 1);
        this.f4206t0 = new H(this, 2);
        this.f4207u0 = AbstractC5530A.l(null);
        this.f4212z0 = new L[0];
        this.f4211y0 = new X[0];
        this.f4187N0 = -9223372036854775807L;
        this.f4181H0 = 1;
    }

    public final void A() {
        J j6 = new J(this, this.f4192Y, this.f4193Z, this.f4203q0, this, this.f4204r0);
        boolean z10 = false;
        if (this.f4175B0) {
            Gi.e.n(s());
            long j10 = this.f4179F0;
            if (j10 != -9223372036854775807L && this.f4187N0 > j10) {
                this.f4190Q0 = true;
                this.f4187N0 = -9223372036854775807L;
                return;
            }
            L2.B b10 = this.f4178E0;
            b10.getClass();
            long j11 = b10.i(this.f4187N0).f10517a.f10521b;
            long j12 = this.f4187N0;
            j6.f4156g.f7995b = j11;
            j6.f4159j = j12;
            j6.f4158i = true;
            j6.f4162m = false;
            for (X x10 : this.f4211y0) {
                x10.f4268t = this.f4187N0;
            }
            this.f4187N0 = -9223372036854775807L;
        }
        this.f4189P0 = n();
        int a02 = this.f4195i0.a0(this.f4181H0);
        I2.n nVar = this.f4202p0;
        nVar.getClass();
        Looper myLooper = Looper.myLooper();
        Gi.e.o(myLooper);
        nVar.f8010c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        I2.j jVar = new I2.j(nVar, myLooper, j6, this, a02, elapsedRealtime);
        if (nVar.f8009b == null) {
            z10 = true;
        }
        Gi.e.n(z10);
        nVar.f8009b = jVar;
        jVar.f8000j0 = null;
        nVar.f8008a.execute(jVar);
        C0484p c0484p = new C0484p(j6.f4150a, j6.f4160k, elapsedRealtime);
        long j13 = j6.f4159j;
        long j14 = this.f4179F0;
        C1025i c1025i = this.f4196j0;
        c1025i.getClass();
        c1025i.m(c0484p, new C0488u(1, -1, null, 0, null, AbstractC5530A.L(j13), AbstractC5530A.L(j14)));
    }

    public final boolean B() {
        if (!this.f4183J0 && !s()) {
            return false;
        }
        return true;
    }

    @Override // I2.h
    public final void a(I2.k kVar, long j6, long j10, boolean z10) {
        J j11 = (J) kVar;
        v2.D d10 = j11.f4152c;
        Uri uri = d10.f47043c;
        C0484p c0484p = new C0484p(d10.f47044d);
        this.f4195i0.getClass();
        long j12 = j11.f4159j;
        long j13 = this.f4179F0;
        C1025i c1025i = this.f4196j0;
        c1025i.getClass();
        c1025i.j(c0484p, new C0488u(1, -1, null, 0, null, AbstractC5530A.L(j12), AbstractC5530A.L(j13)));
        if (!z10) {
            for (X x10 : this.f4211y0) {
                x10.q(false);
            }
            if (this.f4184K0 > 0) {
                AbstractC0489v abstractC0489v = this.f4209w0;
                abstractC0489v.getClass();
                abstractC0489v.b(this);
            }
        }
    }

    @Override // L2.s
    public final void b(L2.B b10) {
        this.f4207u0.post(new RunnableC4517N(this, 11, b10));
    }

    @Override // E2.Z
    public final long c() {
        return x();
    }

    @Override // L2.s
    public final void d() {
        this.f4174A0 = true;
        this.f4207u0.post(this.f4205s0);
    }

    @Override // E2.AbstractC0490w
    public final void e() {
        int a02 = this.f4195i0.a0(this.f4181H0);
        I2.n nVar = this.f4202p0;
        IOException iOException = nVar.f8010c;
        if (iOException == null) {
            I2.j jVar = nVar.f8009b;
            if (jVar != null) {
                if (a02 == Integer.MIN_VALUE) {
                    a02 = jVar.f7996Y;
                }
                IOException iOException2 = jVar.f8000j0;
                if (iOException2 != null && jVar.f8001k0 > a02) {
                    throw iOException2;
                }
            }
            if (this.f4190Q0 && !this.f4175B0) {
                throw p2.O.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // L2.s
    public final L2.G f(int i10, int i11) {
        return z(new L(i10, false));
    }

    @Override // I2.h
    public final void g(I2.k kVar, long j6, long j10) {
        L2.B b10;
        long j11;
        J j12 = (J) kVar;
        if (this.f4179F0 == -9223372036854775807L && (b10 = this.f4178E0) != null) {
            boolean e10 = b10.e();
            long o10 = o(true);
            if (o10 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = o10 + 10000;
            }
            this.f4179F0 = j11;
            this.f4198l0.t(j11, e10, this.f4180G0);
        }
        v2.D d10 = j12.f4152c;
        Uri uri = d10.f47043c;
        C0484p c0484p = new C0484p(d10.f47044d);
        this.f4195i0.getClass();
        long j13 = j12.f4159j;
        long j14 = this.f4179F0;
        C1025i c1025i = this.f4196j0;
        c1025i.getClass();
        c1025i.k(c0484p, new C0488u(1, -1, null, 0, null, AbstractC5530A.L(j13), AbstractC5530A.L(j14)));
        this.f4190Q0 = true;
        AbstractC0489v abstractC0489v = this.f4209w0;
        abstractC0489v.getClass();
        abstractC0489v.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @Override // I2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I2.i h(I2.k kVar, long j6, long j10, IOException iOException, int i10) {
        long j11;
        I2.i iVar;
        int i11;
        int i12;
        L2.B b10;
        J j12 = (J) kVar;
        v2.D d10 = j12.f4152c;
        Uri uri = d10.f47043c;
        C0484p c0484p = new C0484p(d10.f47044d);
        int i13 = AbstractC5530A.f45131a;
        this.f4195i0.getClass();
        if (!(iOException instanceof p2.O) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof v2.v) && !(iOException instanceof I2.m)) {
            int i14 = v2.i.f47077Z;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof v2.i) || ((v2.i) th2).f47078Y != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * 1000, 5000);
            boolean z10 = false;
            if (j11 != -9223372036854775807L) {
                iVar = I2.n.f8007e;
            } else {
                int n10 = n();
                if (n10 > this.f4189P0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (!this.f4185L0 && ((b10 = this.f4178E0) == null || b10.j() == -9223372036854775807L)) {
                    if (this.f4175B0 && !B()) {
                        this.f4188O0 = true;
                        iVar = I2.n.f8006d;
                    } else {
                        this.f4183J0 = this.f4175B0;
                        this.f4186M0 = 0L;
                        this.f4189P0 = 0;
                        for (X x10 : this.f4211y0) {
                            x10.q(false);
                        }
                        j12.f4156g.f7995b = 0L;
                        j12.f4159j = 0L;
                        j12.f4158i = true;
                        j12.f4162m = false;
                    }
                } else {
                    this.f4189P0 = n10;
                }
                iVar = new I2.i(i12, j11);
            }
            i11 = iVar.f7994a;
            if (i11 != 0 || i11 == 1) {
                z10 = true;
            }
            long j13 = j12.f4159j;
            long j14 = this.f4179F0;
            C1025i c1025i = this.f4196j0;
            c1025i.getClass();
            c1025i.l(c0484p, new C0488u(1, -1, null, 0, null, AbstractC5530A.L(j13), AbstractC5530A.L(j14)), iOException, true ^ z10);
            return iVar;
        }
        j11 = -9223372036854775807L;
        boolean z102 = false;
        if (j11 != -9223372036854775807L) {
        }
        i11 = iVar.f7994a;
        if (i11 != 0) {
        }
        z102 = true;
        long j132 = j12.f4159j;
        long j142 = this.f4179F0;
        C1025i c1025i2 = this.f4196j0;
        c1025i2.getClass();
        c1025i2.l(c0484p, new C0488u(1, -1, null, 0, null, AbstractC5530A.L(j132), AbstractC5530A.L(j142)), iOException, true ^ z102);
        return iVar;
    }

    public final void i() {
        Gi.e.n(this.f4175B0);
        this.f4177D0.getClass();
        this.f4178E0.getClass();
    }

    @Override // E2.AbstractC0490w
    public final long j(long j6) {
        i();
        boolean[] zArr = this.f4177D0.f4169b;
        if (!this.f4178E0.e()) {
            j6 = 0;
        }
        this.f4183J0 = false;
        this.f4186M0 = j6;
        if (s()) {
            this.f4187N0 = j6;
            return j6;
        }
        if (this.f4181H0 != 7) {
            int length = this.f4211y0.length;
            for (int i10 = 0; i10 < length; i10++) {
                X x10 = this.f4211y0[i10];
                if (this.f4208v0) {
                    int i11 = x10.f4265q;
                    synchronized (x10) {
                        x10.r();
                        int i12 = x10.f4265q;
                        if (i11 >= i12 && i11 <= x10.f4264p + i12) {
                            x10.f4268t = Long.MIN_VALUE;
                            x10.f4267s = i11 - i12;
                        }
                        if (!zArr[i10] && this.f4176C0) {
                        }
                    }
                } else {
                    if (x10.t(j6, false)) {
                        continue;
                    }
                    if (!zArr[i10]) {
                    }
                }
            }
            return j6;
        }
        this.f4188O0 = false;
        this.f4187N0 = j6;
        this.f4190Q0 = false;
        if (this.f4202p0.a()) {
            for (X x11 : this.f4211y0) {
                x11.h();
            }
            I2.j jVar = this.f4202p0.f8009b;
            Gi.e.o(jVar);
            jVar.a(false);
        } else {
            this.f4202p0.f8010c = null;
            for (X x12 : this.f4211y0) {
                x12.q(false);
            }
        }
        return j6;
    }

    @Override // E2.AbstractC0490w
    public final void k(long j6) {
        long j10;
        int i10;
        int i11;
        if (this.f4208v0) {
            return;
        }
        i();
        if (s()) {
            return;
        }
        boolean[] zArr = this.f4177D0.f4170c;
        int length = this.f4211y0.length;
        for (int i12 = 0; i12 < length; i12++) {
            X x10 = this.f4211y0[i12];
            boolean z10 = zArr[i12];
            T t10 = x10.f4249a;
            synchronized (x10) {
                try {
                    int i13 = x10.f4264p;
                    j10 = -1;
                    if (i13 != 0) {
                        long[] jArr = x10.f4262n;
                        int i14 = x10.f4266r;
                        if (j6 >= jArr[i14]) {
                            if (z10 && (i11 = x10.f4267s) != i13) {
                                i10 = i11 + 1;
                            } else {
                                i10 = i13;
                            }
                            int i15 = x10.i(i14, i10, j6, false);
                            if (i15 != -1) {
                                j10 = x10.g(i15);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            t10.a(j10);
        }
    }

    @Override // E2.Z
    public final boolean l() {
        boolean z10;
        if (this.f4202p0.a()) {
            C1745x0 c1745x0 = this.f4204r0;
            synchronized (c1745x0) {
                z10 = c1745x0.f22767a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // E2.Z
    public final boolean m(C6513P c6513p) {
        if (!this.f4190Q0) {
            I2.n nVar = this.f4202p0;
            if (nVar.f8010c == null && !this.f4188O0) {
                if (!this.f4175B0 || this.f4184K0 != 0) {
                    boolean d10 = this.f4204r0.d();
                    if (!nVar.a()) {
                        A();
                        return true;
                    }
                    return d10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int n() {
        X[] xArr;
        int i10 = 0;
        for (X x10 : this.f4211y0) {
            i10 += x10.f4265q + x10.f4264p;
        }
        return i10;
    }

    public final long o(boolean z10) {
        long j6 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f4211y0.length; i10++) {
            if (!z10) {
                M m10 = this.f4177D0;
                m10.getClass();
                if (!m10.f4170c[i10]) {
                }
            }
            j6 = Math.max(j6, this.f4211y0[i10].j());
        }
        return j6;
    }

    @Override // E2.AbstractC0490w
    public final long p(long j6, l0 l0Var) {
        boolean z10;
        i();
        if (!this.f4178E0.e()) {
            return 0L;
        }
        L2.A i10 = this.f4178E0.i(j6);
        long j10 = i10.f10517a.f10520a;
        long j11 = i10.f10518b.f10520a;
        long j12 = l0Var.f50652a;
        int i11 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        long j13 = l0Var.f50653b;
        if (i11 == 0 && j13 == 0) {
            return j6;
        }
        int i12 = AbstractC5530A.f45131a;
        long j14 = j6 - j12;
        if (((j12 ^ j6) & (j6 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = j6 + j13;
        if (((j13 ^ j15) & (j6 ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z11 = false;
        if (j14 <= j10 && j10 <= j15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j14 <= j11 && j11 <= j15) {
            z11 = true;
        }
        if (z10 && z11) {
            if (Math.abs(j10 - j6) <= Math.abs(j11 - j6)) {
                return j10;
            }
        } else if (!z10) {
            if (!z11) {
                return j14;
            }
        } else {
            return j10;
        }
        return j11;
    }

    @Override // E2.AbstractC0490w
    public final void q(AbstractC0489v abstractC0489v, long j6) {
        this.f4209w0 = abstractC0489v;
        this.f4204r0.d();
        A();
    }

    @Override // E2.AbstractC0490w
    public final long r() {
        if (this.f4183J0) {
            if (this.f4190Q0 || n() > this.f4189P0) {
                this.f4183J0 = false;
                return this.f4186M0;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final boolean s() {
        if (this.f4187N0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void t() {
        X[] xArr;
        boolean z10;
        int i10;
        p2.M m10;
        C5065s c5065s;
        if (!this.f4191R0 && !this.f4175B0 && this.f4174A0 && this.f4178E0 != null) {
            for (X x10 : this.f4211y0) {
                synchronized (x10) {
                    if (x10.f4273y) {
                        c5065s = null;
                    } else {
                        c5065s = x10.f4274z;
                    }
                }
                if (c5065s == null) {
                    return;
                }
            }
            this.f4204r0.c();
            int length = this.f4211y0.length;
            p2.h0[] h0VarArr = new p2.h0[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                C5065s m11 = this.f4211y0[i11].m();
                m11.getClass();
                String str = m11.f42319q0;
                boolean equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(p2.N.e(str));
                if (!equals && !MediaStreamTrack.VIDEO_TRACK_KIND.equals(p2.N.e(str))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i11] = z10;
                this.f4176C0 = z10 | this.f4176C0;
                X2.b bVar = this.f4210x0;
                if (bVar != null) {
                    if (equals || this.f4212z0[i11].f4167b) {
                        p2.M m12 = m11.f42317o0;
                        if (m12 == null) {
                            m10 = new p2.M(bVar);
                        } else {
                            m10 = m12.a(bVar);
                        }
                        p2.r b10 = m11.b();
                        b10.f42235i = m10;
                        m11 = new C5065s(b10);
                    }
                    if (equals && m11.f42313k0 == -1 && m11.f42314l0 == -1 && (i10 = bVar.f21768Y) != -1) {
                        p2.r b11 = m11.b();
                        b11.f42232f = i10;
                        m11 = new C5065s(b11);
                    }
                }
                int M10 = this.f4194h0.M(m11);
                p2.r b12 = m11.b();
                b12.f42226G = M10;
                h0VarArr[i11] = new p2.h0(Integer.toString(i11), b12.a());
            }
            this.f4177D0 = new M(new i0(h0VarArr), zArr);
            this.f4175B0 = true;
            AbstractC0489v abstractC0489v = this.f4209w0;
            abstractC0489v.getClass();
            abstractC0489v.a(this);
        }
    }

    @Override // E2.AbstractC0490w
    public final i0 u() {
        i();
        return this.f4177D0.f4168a;
    }

    @Override // E2.AbstractC0490w
    public final long v(H2.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j6) {
        boolean[] zArr3;
        boolean z10;
        H2.s sVar;
        boolean z11;
        boolean z12;
        i();
        M m10 = this.f4177D0;
        i0 i0Var = m10.f4168a;
        int i10 = this.f4184K0;
        int i11 = 0;
        while (true) {
            int length = sVarArr.length;
            zArr3 = m10.f4170c;
            if (i11 >= length) {
                break;
            }
            Y y10 = yArr[i11];
            if (y10 != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((K) y10).f4164Y;
                Gi.e.n(zArr3[i12]);
                this.f4184K0--;
                zArr3[i12] = false;
                yArr[i11] = null;
            }
            i11++;
        }
        if (!this.f4208v0 && (!this.f4182I0 ? j6 != 0 : i10 == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (yArr[i13] == null && (sVar = sVarArr[i13]) != null) {
                if (sVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Gi.e.n(z11);
                if (sVar.e(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Gi.e.n(z12);
                int indexOf = i0Var.f4362Z.indexOf(sVar.a());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                Gi.e.n(!zArr3[indexOf]);
                this.f4184K0++;
                zArr3[indexOf] = true;
                yArr[i13] = new K(this, indexOf);
                zArr2[i13] = true;
                if (!z10) {
                    X x10 = this.f4211y0[indexOf];
                    if (x10.f4265q + x10.f4267s != 0 && !x10.t(j6, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f4184K0 == 0) {
            this.f4188O0 = false;
            this.f4183J0 = false;
            I2.n nVar = this.f4202p0;
            if (nVar.a()) {
                for (X x11 : this.f4211y0) {
                    x11.h();
                }
                I2.j jVar = nVar.f8009b;
                Gi.e.o(jVar);
                jVar.a(false);
            } else {
                for (X x12 : this.f4211y0) {
                    x12.q(false);
                }
            }
        } else if (z10) {
            j6 = j(j6);
            for (int i14 = 0; i14 < yArr.length; i14++) {
                if (yArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.f4182I0 = true;
        return j6;
    }

    public final void w(int i10) {
        i();
        M m10 = this.f4177D0;
        boolean[] zArr = m10.f4171d;
        if (!zArr[i10]) {
            C5065s c5065s = m10.f4168a.b(i10).f42075i0[0];
            int f6 = p2.N.f(c5065s.f42319q0);
            long j6 = this.f4186M0;
            C1025i c1025i = this.f4196j0;
            c1025i.getClass();
            c1025i.d(new C0488u(1, f6, c5065s, 0, null, AbstractC5530A.L(j6), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    @Override // E2.Z
    public final long x() {
        long j6;
        boolean z10;
        i();
        if (this.f4190Q0 || this.f4184K0 == 0) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.f4187N0;
        }
        if (this.f4176C0) {
            int length = this.f4211y0.length;
            j6 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                M m10 = this.f4177D0;
                if (m10.f4169b[i10] && m10.f4170c[i10]) {
                    X x10 = this.f4211y0[i10];
                    synchronized (x10) {
                        z10 = x10.f4271w;
                    }
                    if (!z10) {
                        j6 = Math.min(j6, this.f4211y0[i10].j());
                    }
                }
            }
        } else {
            j6 = Long.MAX_VALUE;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = o(false);
        }
        if (j6 == Long.MIN_VALUE) {
            return this.f4186M0;
        }
        return j6;
    }

    public final void y(int i10) {
        i();
        boolean[] zArr = this.f4177D0.f4169b;
        if (this.f4188O0 && zArr[i10] && !this.f4211y0[i10].n(false)) {
            this.f4187N0 = 0L;
            this.f4188O0 = false;
            this.f4183J0 = true;
            this.f4186M0 = 0L;
            this.f4189P0 = 0;
            for (X x10 : this.f4211y0) {
                x10.q(false);
            }
            AbstractC0489v abstractC0489v = this.f4209w0;
            abstractC0489v.getClass();
            abstractC0489v.b(this);
        }
    }

    public final X z(L l10) {
        int length = this.f4211y0.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (l10.equals(this.f4212z0[i10])) {
                return this.f4211y0[i10];
            }
        }
        B2.q qVar = this.f4194h0;
        qVar.getClass();
        B2.n nVar = this.f4197k0;
        nVar.getClass();
        X x10 = new X(this.f4199m0, qVar, nVar);
        x10.f4254f = this;
        int i11 = length + 1;
        L[] lArr = (L[]) Arrays.copyOf(this.f4212z0, i11);
        lArr[length] = l10;
        this.f4212z0 = lArr;
        X[] xArr = (X[]) Arrays.copyOf(this.f4211y0, i11);
        xArr[length] = x10;
        this.f4211y0 = xArr;
        return x10;
    }

    @Override // E2.Z
    public final void C(long j6) {
    }
}
