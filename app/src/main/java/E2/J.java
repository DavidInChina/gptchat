package E2;

import Z.C1745x0;
import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v2.AbstractC5969h;

/* loaded from: classes.dex */
public final class J implements I2.k {

    /* renamed from: b  reason: collision with root package name */
    public final Uri f4151b;

    /* renamed from: c  reason: collision with root package name */
    public final v2.D f4152c;

    /* renamed from: d  reason: collision with root package name */
    public final U3.u f4153d;

    /* renamed from: e  reason: collision with root package name */
    public final L2.s f4154e;

    /* renamed from: f  reason: collision with root package name */
    public final C1745x0 f4155f;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f4157h;

    /* renamed from: j  reason: collision with root package name */
    public long f4159j;

    /* renamed from: l  reason: collision with root package name */
    public X f4161l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4162m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ N f4163n;

    /* renamed from: g  reason: collision with root package name */
    public final I2.i f4156g = new I2.i(1);

    /* renamed from: i  reason: collision with root package name */
    public boolean f4158i = true;

    /* renamed from: a  reason: collision with root package name */
    public final long f4150a = C0484p.f4392b.getAndIncrement();

    /* renamed from: k  reason: collision with root package name */
    public v2.l f4160k = c(0);

    public J(N n10, Uri uri, AbstractC5969h abstractC5969h, U3.u uVar, L2.s sVar, C1745x0 c1745x0) {
        this.f4163n = n10;
        this.f4151b = uri;
        this.f4152c = new v2.D(abstractC5969h);
        this.f4153d = uVar;
        this.f4154e = sVar;
        this.f4155f = c1745x0;
    }

    @Override // I2.k
    public final void a() {
        AbstractC5969h abstractC5969h;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.f4157h) {
            try {
                long j6 = this.f4156g.f7995b;
                v2.l c10 = c(j6);
                this.f4160k = c10;
                long a5 = this.f4152c.a(c10);
                if (this.f4157h) {
                    if (i11 != 1 && this.f4153d.q() != -1) {
                        this.f4156g.f7995b = this.f4153d.q();
                    }
                    v2.D d10 = this.f4152c;
                    if (d10 != null) {
                        try {
                            d10.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (a5 != -1) {
                    a5 += j6;
                    N n10 = this.f4163n;
                    n10.f4207u0.post(new H(n10, 0));
                }
                long j10 = a5;
                this.f4163n.f4210x0 = X2.b.a(this.f4152c.f47041a.j());
                v2.D d11 = this.f4152c;
                X2.b bVar = this.f4163n.f4210x0;
                if (bVar != null && (i10 = bVar.f21773k0) != -1) {
                    abstractC5969h = new C0483o(d11, i10, this);
                    N n11 = this.f4163n;
                    n11.getClass();
                    X z10 = n11.z(new L(0, true));
                    this.f4161l = z10;
                    z10.b(N.f4173T0);
                } else {
                    abstractC5969h = d11;
                }
                long j11 = j6;
                this.f4153d.F(abstractC5969h, this.f4151b, this.f4152c.f47041a.j(), j6, j10, this.f4154e);
                if (this.f4163n.f4210x0 != null) {
                    Object obj = this.f4153d.f17493h0;
                    if (((L2.q) obj) != null) {
                        L2.q b10 = ((L2.q) obj).b();
                        if (b10 instanceof d3.d) {
                            ((d3.d) b10).f27976q = true;
                        }
                    }
                }
                if (this.f4158i) {
                    U3.u uVar = this.f4153d;
                    long j12 = this.f4159j;
                    L2.q qVar = (L2.q) uVar.f17493h0;
                    qVar.getClass();
                    qVar.h(j11, j12);
                    this.f4158i = false;
                }
                while (true) {
                    long j13 = j11;
                    while (i11 == 0 && !this.f4157h) {
                        try {
                            C1745x0 c1745x0 = this.f4155f;
                            synchronized (c1745x0) {
                                while (!c1745x0.f22767a) {
                                    c1745x0.wait();
                                }
                            }
                            U3.u uVar2 = this.f4153d;
                            I2.i iVar = this.f4156g;
                            L2.q qVar2 = (L2.q) uVar2.f17493h0;
                            qVar2.getClass();
                            L2.r rVar = (L2.r) uVar2.f17494i0;
                            rVar.getClass();
                            i11 = qVar2.a(rVar, iVar);
                            j11 = this.f4153d.q();
                            if (j11 > this.f4163n.f4201o0 + j13) {
                                break;
                            }
                        } catch (InterruptedException unused2) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f4155f.c();
                    N n12 = this.f4163n;
                    n12.f4207u0.post(n12.f4206t0);
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f4153d.q() != -1) {
                    this.f4156g.f7995b = this.f4153d.q();
                }
                v2.D d12 = this.f4152c;
                if (d12 != null) {
                    try {
                        d12.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th2) {
                if (i11 != 1 && this.f4153d.q() != -1) {
                    this.f4156g.f7995b = this.f4153d.q();
                }
                v2.D d13 = this.f4152c;
                if (d13 != null) {
                    try {
                        d13.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
        }
    }

    @Override // I2.k
    public final void b() {
        this.f4157h = true;
    }

    public final v2.l c(long j6) {
        Collections.emptyMap();
        String str = this.f4163n.f4200n0;
        Map map = N.f4172S0;
        Uri uri = this.f4151b;
        Gi.e.p(uri, "The uri must be set.");
        return new v2.l(uri, 0L, 1, null, map, j6, -1L, str, 6, null);
    }
}
