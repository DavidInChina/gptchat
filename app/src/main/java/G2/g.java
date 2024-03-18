package G2;

import B2.u;
import a1.C1915c;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import c1.AbstractC2279d;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g3.AbstractC3163f;
import g3.AbstractC3168k;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3164g;
import g3.C3167j;
import h.C3276b;
import h3.C3314c;
import h3.C3317f;
import io.sentry.C3636c1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p2.C5065s;
import s2.AbstractC5530A;
import s2.p;
import x2.h;
import x8.N;
import x8.k0;
import y.AbstractC6463a;
import y2.AbstractC6519f;
import y2.C6504G;
import y2.SurfaceHolder$CallbackC6500C;

/* loaded from: classes2.dex */
public final class g extends AbstractC6519f implements Handler.Callback {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f5859A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f5860B0;

    /* renamed from: C0  reason: collision with root package name */
    public AbstractC3163f f5861C0;

    /* renamed from: D0  reason: collision with root package name */
    public C3167j f5862D0;

    /* renamed from: E0  reason: collision with root package name */
    public AbstractC3168k f5863E0;

    /* renamed from: F0  reason: collision with root package name */
    public AbstractC3168k f5864F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f5865G0;

    /* renamed from: H0  reason: collision with root package name */
    public final Handler f5866H0;

    /* renamed from: I0  reason: collision with root package name */
    public final f f5867I0;

    /* renamed from: J0  reason: collision with root package name */
    public final C3636c1 f5868J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f5869K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f5870L0;

    /* renamed from: M0  reason: collision with root package name */
    public C5065s f5871M0;

    /* renamed from: N0  reason: collision with root package name */
    public long f5872N0;

    /* renamed from: O0  reason: collision with root package name */
    public long f5873O0;

    /* renamed from: P0  reason: collision with root package name */
    public long f5874P0;

    /* renamed from: w0  reason: collision with root package name */
    public final C1915c f5875w0;

    /* renamed from: x0  reason: collision with root package name */
    public final h f5876x0;

    /* renamed from: y0  reason: collision with root package name */
    public a f5877y0;

    /* renamed from: z0  reason: collision with root package name */
    public final e f5878z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C, Looper looper) {
        super(3);
        Handler handler;
        J0.a aVar = e.f5858j;
        this.f5867I0 = surfaceHolder$CallbackC6500C;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = AbstractC5530A.f45131a;
            handler = new Handler(looper, this);
        }
        this.f5866H0 = handler;
        this.f5878z0 = aVar;
        this.f5875w0 = new C1915c(29);
        this.f5876x0 = new h(1);
        this.f5868J0 = new C3636c1(5, (AbstractC2469q0) null);
        this.f5874P0 = -9223372036854775807L;
        this.f5872N0 = -9223372036854775807L;
        this.f5873O0 = -9223372036854775807L;
    }

    public final long B() {
        if (this.f5865G0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f5863E0.getClass();
        if (this.f5865G0 >= this.f5863E0.d()) {
            return Long.MAX_VALUE;
        }
        return this.f5863E0.b(this.f5865G0);
    }

    public final long C(long j6) {
        boolean z10;
        boolean z11 = false;
        if (j6 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        if (this.f5872N0 != -9223372036854775807L) {
            z11 = true;
        }
        Gi.e.n(z11);
        return j6 - this.f5872N0;
    }

    public final void D() {
        AbstractC3163f abstractC3163f;
        this.f5859A0 = true;
        C5065s c5065s = this.f5871M0;
        c5065s.getClass();
        J0.a aVar = (J0.a) this.f5878z0;
        if (((u) aVar.f8729Y).A(c5065s)) {
            ((u) aVar.f8729Y).getClass();
            AbstractC3170m t10 = u.t(c5065s);
            t10.getClass().getSimpleName().concat("Decoder");
            abstractC3163f = new b(t10);
        } else {
            String str = c5065s.f42319q0;
            if (str != null) {
                int hashCode = str.hashCode();
                char c10 = '\uffff';
                if (hashCode != 930165504) {
                    if (hashCode != 1566015601) {
                        if (hashCode == 1566016562 && str.equals("application/cea-708")) {
                            c10 = 2;
                        }
                    } else if (str.equals("application/cea-608")) {
                        c10 = 1;
                    }
                } else if (str.equals("application/x-mp4-cea-608")) {
                    c10 = 0;
                }
                int i10 = c5065s.f42302I0;
                if (c10 != 0 && c10 != 1) {
                    if (c10 == 2) {
                        abstractC3163f = new C3317f(i10, c5065s.f42321s0);
                    }
                } else {
                    abstractC3163f = new C3314c(str, i10);
                }
            }
            throw new IllegalArgumentException(R.a.r("Attempted to create decoder for unsupported MIME type: ", str));
        }
        this.f5861C0 = abstractC3163f;
    }

    public final void E(r2.c cVar) {
        N n10 = cVar.f44374Y;
        f fVar = this.f5867I0;
        ((SurfaceHolder$CallbackC6500C) fVar).f50334Y.f50373l.l(27, new C3276b(8, n10));
        C6504G c6504g = ((SurfaceHolder$CallbackC6500C) fVar).f50334Y;
        c6504g.getClass();
        c6504g.f50373l.l(27, new C3276b(5, cVar));
    }

    public final void F() {
        this.f5862D0 = null;
        this.f5865G0 = -1;
        AbstractC3168k abstractC3168k = this.f5863E0;
        if (abstractC3168k != null) {
            abstractC3168k.i();
            this.f5863E0 = null;
        }
        AbstractC3168k abstractC3168k2 = this.f5864F0;
        if (abstractC3168k2 != null) {
            abstractC3168k2.i();
            this.f5864F0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            E((r2.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // y2.AbstractC6519f
    public final String i() {
        return "TextRenderer";
    }

    @Override // y2.AbstractC6519f
    public final boolean k() {
        return this.f5870L0;
    }

    @Override // y2.AbstractC6519f
    public final boolean l() {
        return true;
    }

    @Override // y2.AbstractC6519f
    public final void m() {
        this.f5871M0 = null;
        this.f5874P0 = -9223372036854775807L;
        r2.c cVar = new r2.c(C(this.f5873O0), k0.f49573j0);
        Handler handler = this.f5866H0;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            E(cVar);
        }
        this.f5872N0 = -9223372036854775807L;
        this.f5873O0 = -9223372036854775807L;
        if (this.f5861C0 != null) {
            F();
            AbstractC3163f abstractC3163f = this.f5861C0;
            abstractC3163f.getClass();
            abstractC3163f.release();
            this.f5861C0 = null;
            this.f5860B0 = 0;
        }
    }

    @Override // y2.AbstractC6519f
    public final void o(long j6, boolean z10) {
        this.f5873O0 = j6;
        a aVar = this.f5877y0;
        if (aVar != null) {
            aVar.clear();
        }
        r2.c cVar = new r2.c(C(this.f5873O0), k0.f49573j0);
        Handler handler = this.f5866H0;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            E(cVar);
        }
        this.f5869K0 = false;
        this.f5870L0 = false;
        this.f5874P0 = -9223372036854775807L;
        C5065s c5065s = this.f5871M0;
        if (c5065s != null && !Objects.equals(c5065s.f42319q0, "application/x-media3-cues")) {
            if (this.f5860B0 != 0) {
                F();
                AbstractC3163f abstractC3163f = this.f5861C0;
                abstractC3163f.getClass();
                abstractC3163f.release();
                this.f5861C0 = null;
                this.f5860B0 = 0;
                D();
                return;
            }
            F();
            AbstractC3163f abstractC3163f2 = this.f5861C0;
            abstractC3163f2.getClass();
            abstractC3163f2.flush();
        }
    }

    @Override // y2.AbstractC6519f
    public final void t(C5065s[] c5065sArr, long j6, long j10) {
        a aVar;
        this.f5872N0 = j10;
        C5065s c5065s = c5065sArr[0];
        this.f5871M0 = c5065s;
        if (!Objects.equals(c5065s.f42319q0, "application/x-media3-cues")) {
            if (this.f5861C0 != null) {
                this.f5860B0 = 1;
                return;
            } else {
                D();
                return;
            }
        }
        if (this.f5871M0.f42303J0 == 1) {
            aVar = new c();
        } else {
            aVar = new d();
        }
        this.f5877y0 = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c6, code lost:
        if (r0 == false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    @Override // y2.AbstractC6519f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j6, long j10) {
        boolean z10;
        C3636c1 c3636c1;
        long j11;
        boolean z11;
        int i10;
        if (this.f50576s0) {
            long j12 = this.f5874P0;
            if (j12 != -9223372036854775807L && j6 >= j12) {
                F();
                this.f5870L0 = true;
            }
        }
        if (this.f5870L0) {
            return;
        }
        C5065s c5065s = this.f5871M0;
        c5065s.getClass();
        boolean equals = Objects.equals(c5065s.f42319q0, "application/x-media3-cues");
        Handler handler = this.f5866H0;
        int i11 = 4;
        C3636c1 c3636c12 = this.f5868J0;
        if (equals) {
            this.f5877y0.getClass();
            if (!this.f5869K0) {
                h hVar = this.f5876x0;
                if (u(c3636c12, hVar, 0) == -4) {
                    if (hVar.g(4)) {
                        this.f5869K0 = true;
                    } else {
                        hVar.l();
                        ByteBuffer byteBuffer = hVar.f48641j0;
                        byteBuffer.getClass();
                        C1915c c1915c = this.f5875w0;
                        long j13 = hVar.f48643l0;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        c1915c.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C3158a c3158a = new C3158a(j13, readBundle.getLong("d"), AbstractC2279d.m(r2.b.f44350N0, parcelableArrayList));
                        hVar.i();
                        z11 = this.f5877y0.b(c3158a, j6);
                        long a5 = this.f5877y0.a(this.f5873O0);
                        i10 = (a5 > Long.MIN_VALUE ? 1 : (a5 == Long.MIN_VALUE ? 0 : -1));
                        if (i10 == 0 && this.f5869K0 && !z11) {
                            this.f5870L0 = true;
                        }
                        if ((i10 != 0 && a5 <= j6) || z11) {
                            N c10 = this.f5877y0.c(j6);
                            long d10 = this.f5877y0.d(j6);
                            r2.c cVar = new r2.c(C(d10), c10);
                            if (handler != null) {
                                handler.obtainMessage(0, cVar).sendToTarget();
                            } else {
                                E(cVar);
                            }
                            this.f5877y0.e(d10);
                        }
                        this.f5873O0 = j6;
                        return;
                    }
                }
            }
            z11 = false;
            long a52 = this.f5877y0.a(this.f5873O0);
            i10 = (a52 > Long.MIN_VALUE ? 1 : (a52 == Long.MIN_VALUE ? 0 : -1));
            if (i10 == 0) {
                this.f5870L0 = true;
            }
            if (i10 != 0) {
                N c102 = this.f5877y0.c(j6);
                long d102 = this.f5877y0.d(j6);
                r2.c cVar2 = new r2.c(C(d102), c102);
                if (handler != null) {
                }
                this.f5877y0.e(d102);
                this.f5873O0 = j6;
                return;
            }
            N c1022 = this.f5877y0.c(j6);
            long d1022 = this.f5877y0.d(j6);
            r2.c cVar22 = new r2.c(C(d1022), c1022);
            if (handler != null) {
            }
            this.f5877y0.e(d1022);
            this.f5873O0 = j6;
            return;
        }
        this.f5873O0 = j6;
        if (this.f5864F0 == null) {
            AbstractC3163f abstractC3163f = this.f5861C0;
            abstractC3163f.getClass();
            abstractC3163f.a(j6);
            try {
                AbstractC3163f abstractC3163f2 = this.f5861C0;
                abstractC3163f2.getClass();
                this.f5864F0 = (AbstractC3168k) abstractC3163f2.b();
            } catch (C3164g e10) {
                p.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f5871M0, e10);
                r2.c cVar3 = new r2.c(C(this.f5873O0), k0.f49573j0);
                if (handler != null) {
                    handler.obtainMessage(0, cVar3).sendToTarget();
                } else {
                    E(cVar3);
                }
                F();
                AbstractC3163f abstractC3163f3 = this.f5861C0;
                abstractC3163f3.getClass();
                abstractC3163f3.release();
                this.f5861C0 = null;
                this.f5860B0 = 0;
                D();
                return;
            }
        }
        if (this.f50570m0 == 2) {
            if (this.f5863E0 != null) {
                long B10 = B();
                z10 = false;
                while (B10 <= j6) {
                    this.f5865G0++;
                    B10 = B();
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            AbstractC3168k abstractC3168k = this.f5864F0;
            if (abstractC3168k != null) {
                if (abstractC3168k.g(4)) {
                    if (!z10 && B() == Long.MAX_VALUE) {
                        if (this.f5860B0 == 2) {
                            F();
                            AbstractC3163f abstractC3163f4 = this.f5861C0;
                            abstractC3163f4.getClass();
                            abstractC3163f4.release();
                            this.f5861C0 = null;
                            this.f5860B0 = 0;
                            D();
                        } else {
                            F();
                            this.f5870L0 = true;
                        }
                    }
                } else {
                    c3636c1 = c3636c12;
                    if (abstractC3168k.f48647h0 <= j6) {
                        AbstractC3168k abstractC3168k2 = this.f5863E0;
                        if (abstractC3168k2 != null) {
                            abstractC3168k2.i();
                        }
                        this.f5865G0 = abstractC3168k.a(j6);
                        this.f5863E0 = abstractC3168k;
                        this.f5864F0 = null;
                        this.f5863E0.getClass();
                        int a10 = this.f5863E0.a(j6);
                        if (a10 != 0 && this.f5863E0.d() != 0) {
                            if (a10 == -1) {
                                AbstractC3168k abstractC3168k3 = this.f5863E0;
                                j11 = abstractC3168k3.b(abstractC3168k3.d() - 1);
                            } else {
                                j11 = this.f5863E0.b(a10 - 1);
                            }
                        } else {
                            j11 = this.f5863E0.f48647h0;
                        }
                        r2.c cVar4 = new r2.c(C(j11), this.f5863E0.c(j6));
                        if (handler != null) {
                            handler.obtainMessage(0, cVar4).sendToTarget();
                        } else {
                            E(cVar4);
                        }
                        if (this.f5860B0 != 2) {
                            while (!this.f5869K0) {
                                try {
                                    C3167j c3167j = this.f5862D0;
                                    if (c3167j == null) {
                                        AbstractC3163f abstractC3163f5 = this.f5861C0;
                                        abstractC3163f5.getClass();
                                        c3167j = (C3167j) abstractC3163f5.c();
                                        if (c3167j != null) {
                                            this.f5862D0 = c3167j;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (this.f5860B0 == 1) {
                                        c3167j.f48626Z = i11;
                                        AbstractC3163f abstractC3163f6 = this.f5861C0;
                                        abstractC3163f6.getClass();
                                        abstractC3163f6.d(c3167j);
                                        this.f5862D0 = null;
                                        this.f5860B0 = 2;
                                        return;
                                    }
                                    C3636c1 c3636c13 = c3636c1;
                                    int u10 = u(c3636c13, c3167j, 0);
                                    if (u10 == -4) {
                                        if (c3167j.g(i11)) {
                                            this.f5869K0 = true;
                                            this.f5859A0 = false;
                                        } else {
                                            C5065s c5065s2 = (C5065s) c3636c13.f34286h0;
                                            if (c5065s2 != null) {
                                                c3167j.f31184p0 = c5065s2.f42323u0;
                                                c3167j.l();
                                                this.f5859A0 &= !c3167j.g(1);
                                            } else {
                                                return;
                                            }
                                        }
                                        if (!this.f5859A0) {
                                            if (c3167j.f48643l0 < this.f50574q0) {
                                                c3167j.e(Integer.MIN_VALUE);
                                            }
                                            AbstractC3163f abstractC3163f7 = this.f5861C0;
                                            abstractC3163f7.getClass();
                                            abstractC3163f7.d(c3167j);
                                            this.f5862D0 = null;
                                        }
                                    } else if (u10 == -3) {
                                        return;
                                    }
                                    c3636c1 = c3636c13;
                                    i11 = 4;
                                } catch (C3164g e11) {
                                    p.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f5871M0, e11);
                                    r2.c cVar5 = new r2.c(C(this.f5873O0), k0.f49573j0);
                                    if (handler != null) {
                                        handler.obtainMessage(0, cVar5).sendToTarget();
                                    } else {
                                        E(cVar5);
                                    }
                                    F();
                                    AbstractC3163f abstractC3163f8 = this.f5861C0;
                                    abstractC3163f8.getClass();
                                    abstractC3163f8.release();
                                    this.f5861C0 = null;
                                    this.f5860B0 = 0;
                                    D();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            c3636c1 = c3636c12;
        }
    }

    @Override // y2.AbstractC6519f
    public final int z(C5065s c5065s) {
        int i10;
        if (!Objects.equals(c5065s.f42319q0, "application/x-media3-cues")) {
            J0.a aVar = (J0.a) this.f5878z0;
            aVar.getClass();
            if (!((u) aVar.f8729Y).A(c5065s)) {
                String str = c5065s.f42319q0;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    if (p2.N.g(str)) {
                        return AbstractC6463a.a(1, 0, 0, 0);
                    }
                    return AbstractC6463a.a(0, 0, 0, 0);
                }
            }
        }
        if (c5065s.f42306M0 == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return AbstractC6463a.a(i10, 0, 0, 0);
    }
}
