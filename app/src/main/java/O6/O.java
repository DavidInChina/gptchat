package o6;

import G0.C0571a;
import id.AbstractC3557B;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import jf.C3959i;
import kf.AbstractC4268D;
import m6.C4562a;
import m6.C4564c;
import r5.AbstractC5368c;
import t5.AbstractC5675a;

/* loaded from: classes2.dex */
public final class O implements M {

    /* renamed from: q  reason: collision with root package name */
    public static final long f40688q = TimeUnit.MINUTES.toNanos(15);

    /* renamed from: r  reason: collision with root package name */
    public static final long f40689r = TimeUnit.HOURS.toNanos(4);

    /* renamed from: a  reason: collision with root package name */
    public final M f40690a;

    /* renamed from: b  reason: collision with root package name */
    public final u5.g f40691b;

    /* renamed from: c  reason: collision with root package name */
    public final float f40692c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40693d;

    /* renamed from: e  reason: collision with root package name */
    public final i6.h f40694e;

    /* renamed from: f  reason: collision with root package name */
    public final long f40695f = f40688q;

    /* renamed from: g  reason: collision with root package name */
    public final long f40696g = f40689r;

    /* renamed from: h  reason: collision with root package name */
    public String f40697h = C4562a.f38944m;

    /* renamed from: i  reason: collision with root package name */
    public int f40698i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f40699j = 1;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f40700k = true;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicLong f40701l = new AtomicLong(System.nanoTime());

    /* renamed from: m  reason: collision with root package name */
    public final AtomicLong f40702m = new AtomicLong(0);

    /* renamed from: n  reason: collision with root package name */
    public final SecureRandom f40703n = new SecureRandom();

    /* renamed from: o  reason: collision with root package name */
    public final Ii.q f40704o = new Ii.q(1);

    /* renamed from: p  reason: collision with root package name */
    public M f40705p;

    public O(M m10, u5.g gVar, float f6, boolean z10, boolean z11, P p10, D5.a aVar, w6.m mVar, w6.m mVar2, w6.m mVar3, i6.h hVar, boolean z12) {
        AbstractC3557B.c0("parentScope", m10);
        AbstractC3557B.c0("sdkCore", gVar);
        AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar);
        AbstractC3557B.c0("cpuVitalMonitor", mVar);
        AbstractC3557B.c0("memoryVitalMonitor", mVar2);
        AbstractC3557B.c0("frameRateVitalMonitor", mVar3);
        this.f40690a = m10;
        this.f40691b = gVar;
        this.f40692c = f6;
        this.f40693d = z10;
        this.f40694e = hVar;
        this.f40705p = new S(this, gVar, z10, z11, p10, aVar, mVar, mVar2, mVar3, z12, f6);
        gVar.j("rum", new C0571a(25, this));
    }

    @Override // o6.M
    public final boolean a() {
        return this.f40700k;
    }

    @Override // o6.M
    public final M b(L4.a aVar, AbstractC5675a abstractC5675a) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC5675a abstractC5675a2;
        M m10;
        C4935n c4935n;
        int i10;
        C4935n c4935n2 = aVar;
        AbstractC3557B.c0("writer", abstractC5675a);
        long nanoTime = System.nanoTime();
        boolean K10 = AbstractC3557B.K(this.f40697h, C4562a.f38944m);
        AtomicLong atomicLong = this.f40702m;
        if (nanoTime - atomicLong.get() >= this.f40695f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nanoTime - this.f40701l.get() >= this.f40696g) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(c4935n2 instanceof C) && !(c4935n2 instanceof C4920A)) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean S22 = kf.q.S2(aVar.getClass(), S.f40709n);
        boolean z16 = c4935n2 instanceof C4943w;
        if (z16 && ((C4943w) c4935n2).f40906j) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z16 && !((C4943w) c4935n2).f40906j) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z12 && !z13) {
            if (z10) {
                if (this.f40693d && (S22 || z14)) {
                    d(nanoTime, 2);
                    atomicLong.set(nanoTime);
                } else {
                    this.f40698i = 3;
                }
            } else if (z11) {
                d(nanoTime, 3);
            }
        } else {
            if (K10 || z10 || z11) {
                if (K10) {
                    i10 = 1;
                } else if (z10) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                d(nanoTime, i10);
            }
            atomicLong.set(nanoTime);
        }
        int i11 = this.f40698i;
        String str = this.f40697h;
        if (i11 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        AbstractC5368c h10 = this.f40691b.h("session-replay");
        if (h10 != null) {
            ((y5.h) h10).a(AbstractC4268D.a1(new C3959i("type", "rum_session_renewed"), new C3959i("keepSession", Boolean.valueOf(z15)), new C3959i("sessionId", str)));
        }
        if (this.f40698i == 2) {
            abstractC5675a2 = abstractC5675a;
        } else {
            abstractC5675a2 = this.f40704o;
        }
        if (z16) {
            C4943w c4943w = (C4943w) c4935n2;
            if (c4943w.f40906j) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C4564c c4564c = c4943w.f40908l;
                long nanos = timeUnit.toNanos(c4564c.f38961a);
                long j6 = c4564c.f38962b;
                long j10 = c4943w.f40907k;
                c4935n = new C4935n(new C4564c(TimeUnit.NANOSECONDS.toMillis((nanos - j6) + j10), j10), j6 - j10);
            } else {
                c4935n = null;
            }
            c4935n2 = c4935n;
        }
        if (c4935n2 != null) {
            M m11 = this.f40705p;
            if (m11 != null) {
                m10 = m11.b(c4935n2, abstractC5675a2);
            } else {
                m10 = null;
            }
            this.f40705p = m10;
        }
        if (!this.f40700k && this.f40705p == null) {
            return null;
        }
        return this;
    }

    @Override // o6.M
    public final C4562a c() {
        return C4562a.a(this.f40690a.c(), this.f40697h, this.f40700k, null, null, null, null, this.f40698i, this.f40699j, 0, null, null, 3705);
    }

    public final void d(long j6, int i10) {
        boolean z10;
        int i11;
        if (this.f40703n.nextFloat() < this.f40692c / 100.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40699j = i10;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        this.f40698i = i11;
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        this.f40697h = uuid;
        this.f40701l.set(j6);
        i6.h hVar = this.f40694e;
        if (hVar != null) {
            hVar.a(this.f40697h, !z10);
        }
    }
}
