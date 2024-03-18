package D2;

import Gi.e;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h.C3276b;
import io.sentry.C3636c1;
import java.util.ArrayList;
import p2.C5065s;
import p2.J;
import p2.K;
import p2.L;
import p2.M;
import r.f;
import s2.AbstractC5530A;
import x2.h;
import y.AbstractC6463a;
import y2.AbstractC6519f;
import y2.C6504G;
import y2.SurfaceHolder$CallbackC6500C;

/* loaded from: classes.dex */
public final class b extends AbstractC6519f implements Handler.Callback {

    /* renamed from: A0  reason: collision with root package name */
    public f f3326A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f3327B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f3328C0;

    /* renamed from: D0  reason: collision with root package name */
    public long f3329D0;

    /* renamed from: E0  reason: collision with root package name */
    public M f3330E0;

    /* renamed from: F0  reason: collision with root package name */
    public long f3331F0;

    /* renamed from: w0  reason: collision with root package name */
    public final a f3332w0;

    /* renamed from: x0  reason: collision with root package name */
    public final SurfaceHolder$CallbackC6500C f3333x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Handler f3334y0;

    /* renamed from: z0  reason: collision with root package name */
    public final T2.a f3335z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [x2.h, T2.a] */
    public b(SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C, Looper looper) {
        super(5);
        Handler handler;
        R4.a aVar = a.f3325h;
        this.f3333x0 = surfaceHolder$CallbackC6500C;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = AbstractC5530A.f45131a;
            handler = new Handler(looper, this);
        }
        this.f3334y0 = handler;
        this.f3332w0 = aVar;
        this.f3335z0 = new h(1);
        this.f3331F0 = -9223372036854775807L;
    }

    public final void B(M m10, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            L[] lArr = m10.f41915Y;
            if (i10 < lArr.length) {
                C5065s b10 = lArr[i10].b();
                if (b10 != null) {
                    R4.a aVar = (R4.a) this.f3332w0;
                    if (aVar.b0(b10)) {
                        f X10 = aVar.X(b10);
                        byte[] e10 = lArr[i10].e();
                        e10.getClass();
                        T2.a aVar2 = this.f3335z0;
                        aVar2.i();
                        aVar2.k(e10.length);
                        aVar2.f48641j0.put(e10);
                        aVar2.l();
                        M t10 = X10.t(aVar2);
                        if (t10 != null) {
                            B(t10, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(lArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long C(long j6) {
        boolean z10;
        boolean z11 = false;
        if (j6 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.n(z10);
        if (this.f3331F0 != -9223372036854775807L) {
            z11 = true;
        }
        e.n(z11);
        return j6 - this.f3331F0;
    }

    public final void D(M m10) {
        SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C = this.f3333x0;
        C6504G c6504g = surfaceHolder$CallbackC6500C.f50334Y;
        J b10 = c6504g.f50359V.b();
        int i10 = 0;
        while (true) {
            L[] lArr = m10.f41915Y;
            if (i10 >= lArr.length) {
                break;
            }
            lArr[i10].d(b10);
            i10++;
        }
        c6504g.f50359V = new K(b10);
        K d10 = c6504g.d();
        boolean equals = d10.equals(c6504g.f50351J);
        j1.e eVar = c6504g.f50373l;
        if (!equals) {
            c6504g.f50351J = d10;
            eVar.j(14, new C3276b(6, surfaceHolder$CallbackC6500C));
        }
        eVar.j(28, new C3276b(7, m10));
        eVar.g();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            D((M) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // y2.AbstractC6519f
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // y2.AbstractC6519f
    public final boolean k() {
        return this.f3328C0;
    }

    @Override // y2.AbstractC6519f
    public final boolean l() {
        return true;
    }

    @Override // y2.AbstractC6519f
    public final void m() {
        this.f3330E0 = null;
        this.f3326A0 = null;
        this.f3331F0 = -9223372036854775807L;
    }

    @Override // y2.AbstractC6519f
    public final void o(long j6, boolean z10) {
        this.f3330E0 = null;
        this.f3327B0 = false;
        this.f3328C0 = false;
    }

    @Override // y2.AbstractC6519f
    public final void t(C5065s[] c5065sArr, long j6, long j10) {
        this.f3326A0 = ((R4.a) this.f3332w0).X(c5065sArr[0]);
        M m10 = this.f3330E0;
        if (m10 != null) {
            long j11 = this.f3331F0;
            long j12 = m10.f41916Z;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                m10 = new M(j13, m10.f41915Y);
            }
            this.f3330E0 = m10;
        }
        this.f3331F0 = j10;
    }

    @Override // y2.AbstractC6519f
    public final void v(long j6, long j10) {
        boolean z10;
        do {
            z10 = false;
            if (!this.f3327B0 && this.f3330E0 == null) {
                T2.a aVar = this.f3335z0;
                aVar.i();
                C3636c1 c3636c1 = this.f50565h0;
                c3636c1.g();
                int u10 = u(c3636c1, aVar, 0);
                if (u10 == -4) {
                    if (aVar.g(4)) {
                        this.f3327B0 = true;
                    } else if (aVar.f48643l0 >= this.f50574q0) {
                        aVar.f16890p0 = this.f3329D0;
                        aVar.l();
                        f fVar = this.f3326A0;
                        int i10 = AbstractC5530A.f45131a;
                        M t10 = fVar.t(aVar);
                        if (t10 != null) {
                            ArrayList arrayList = new ArrayList(t10.f41915Y.length);
                            B(t10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f3330E0 = new M(C(aVar.f48643l0), (L[]) arrayList.toArray(new L[0]));
                            }
                        }
                    }
                } else if (u10 == -5) {
                    C5065s c5065s = (C5065s) c3636c1.f34286h0;
                    c5065s.getClass();
                    this.f3329D0 = c5065s.f42323u0;
                }
            }
            M m10 = this.f3330E0;
            if (m10 != null && m10.f41916Z <= C(j6)) {
                M m11 = this.f3330E0;
                Handler handler = this.f3334y0;
                if (handler != null) {
                    handler.obtainMessage(0, m11).sendToTarget();
                } else {
                    D(m11);
                }
                this.f3330E0 = null;
                z10 = true;
            }
            if (this.f3327B0 && this.f3330E0 == null) {
                this.f3328C0 = true;
                continue;
            }
        } while (z10);
    }

    @Override // y2.AbstractC6519f
    public final int z(C5065s c5065s) {
        int i10;
        if (((R4.a) this.f3332w0).b0(c5065s)) {
            if (c5065s.f42306M0 == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return AbstractC6463a.a(i10, 0, 0, 0);
        }
        return AbstractC6463a.a(0, 0, 0, 0);
    }
}
