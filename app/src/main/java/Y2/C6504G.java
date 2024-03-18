package y2;

import E2.AbstractC0491x;
import E2.C0492y;
import Z.C1745x0;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.n0;
import g.RunnableC3111d;
import h.C3276b;
import i8.C3493k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import livekit.org.webrtc.MediaStreamTrack;
import n2.C4711b;
import p2.AbstractC5054g;
import p2.C5052e;
import p2.C5061n;
import p2.C5064q;
import p2.o0;
import p2.r0;
import q.r1;
import s2.AbstractC5530A;
import z2.AbstractC6756a;
import z2.C6755D;

/* renamed from: y2.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6504G extends AbstractC5054g {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f50341Z = 0;

    /* renamed from: A  reason: collision with root package name */
    public final r1 f50342A;

    /* renamed from: B  reason: collision with root package name */
    public final long f50343B;

    /* renamed from: C  reason: collision with root package name */
    public int f50344C;

    /* renamed from: D  reason: collision with root package name */
    public int f50345D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f50346E;

    /* renamed from: F  reason: collision with root package name */
    public int f50347F;

    /* renamed from: G  reason: collision with root package name */
    public final l0 f50348G;

    /* renamed from: H  reason: collision with root package name */
    public E2.a0 f50349H;

    /* renamed from: I  reason: collision with root package name */
    public p2.U f50350I;

    /* renamed from: J  reason: collision with root package name */
    public p2.K f50351J;

    /* renamed from: K  reason: collision with root package name */
    public AudioTrack f50352K;

    /* renamed from: L  reason: collision with root package name */
    public Object f50353L;

    /* renamed from: M  reason: collision with root package name */
    public Surface f50354M;

    /* renamed from: N  reason: collision with root package name */
    public final int f50355N;

    /* renamed from: O  reason: collision with root package name */
    public s2.v f50356O;
    public final int P;
    public final C5052e Q;

    /* renamed from: R  reason: collision with root package name */
    public float f50357R;
    public boolean S;
    public final boolean T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f50358U;

    /* renamed from: V  reason: collision with root package name */
    public p2.K f50359V;

    /* renamed from: W  reason: collision with root package name */
    public d0 f50360W;

    /* renamed from: X  reason: collision with root package name */
    public int f50361X;

    /* renamed from: Y  reason: collision with root package name */
    public long f50362Y;

    /* renamed from: b  reason: collision with root package name */
    public final H2.w f50363b;

    /* renamed from: c  reason: collision with root package name */
    public final p2.U f50364c;

    /* renamed from: d  reason: collision with root package name */
    public final C1745x0 f50365d = new C1745x0(2);

    /* renamed from: e  reason: collision with root package name */
    public final Context f50366e;

    /* renamed from: f  reason: collision with root package name */
    public final p2.X f50367f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC6519f[] f50368g;

    /* renamed from: h  reason: collision with root package name */
    public final H2.v f50369h;

    /* renamed from: i  reason: collision with root package name */
    public final s2.y f50370i;

    /* renamed from: j  reason: collision with root package name */
    public final C6533u f50371j;

    /* renamed from: k  reason: collision with root package name */
    public final C6510M f50372k;

    /* renamed from: l  reason: collision with root package name */
    public final j1.e f50373l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArraySet f50374m;

    /* renamed from: n  reason: collision with root package name */
    public final p2.e0 f50375n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f50376o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f50377p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0491x f50378q;

    /* renamed from: r  reason: collision with root package name */
    public final AbstractC6756a f50379r;

    /* renamed from: s  reason: collision with root package name */
    public final Looper f50380s;

    /* renamed from: t  reason: collision with root package name */
    public final I2.c f50381t;

    /* renamed from: u  reason: collision with root package name */
    public final s2.w f50382u;

    /* renamed from: v  reason: collision with root package name */
    public final SurfaceHolder$CallbackC6500C f50383v;

    /* renamed from: w  reason: collision with root package name */
    public final C6501D f50384w;

    /* renamed from: x  reason: collision with root package name */
    public final C4711b f50385x;

    /* renamed from: y  reason: collision with root package name */
    public final C6518e f50386y;

    /* renamed from: z  reason: collision with root package name */
    public final r1 f50387z;

    static {
        p2.I.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [y2.D, java.lang.Object] */
    public C6504G(C6531s c6531s) {
        boolean z10;
        C6755D a5;
        C5052e c5052e;
        C5052e c5052e2;
        boolean z11;
        try {
            s2.p.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + AbstractC5530A.f45135e + "]");
            this.f50366e = c6531s.f50680a.getApplicationContext();
            this.f50379r = (AbstractC6756a) c6531s.f50687h.apply(c6531s.f50681b);
            this.Q = c6531s.f50689j;
            this.f50355N = c6531s.f50691l;
            this.S = false;
            this.f50343B = c6531s.f50696q;
            SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C = new SurfaceHolder$CallbackC6500C(this);
            this.f50383v = surfaceHolder$CallbackC6500C;
            this.f50384w = new Object();
            Handler handler = new Handler(c6531s.f50688i);
            AbstractC6519f[] c10 = ((k0) c6531s.f50682c.get()).c(handler, surfaceHolder$CallbackC6500C, surfaceHolder$CallbackC6500C, surfaceHolder$CallbackC6500C, surfaceHolder$CallbackC6500C);
            this.f50368g = c10;
            if (c10.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.n(z10);
            this.f50369h = (H2.v) c6531s.f50684e.get();
            this.f50378q = (AbstractC0491x) c6531s.f50683d.get();
            this.f50381t = (I2.c) c6531s.f50686g.get();
            this.f50377p = c6531s.f50692m;
            this.f50348G = c6531s.f50693n;
            Looper looper = c6531s.f50688i;
            this.f50380s = looper;
            s2.w wVar = c6531s.f50681b;
            this.f50382u = wVar;
            this.f50367f = this;
            this.f50373l = new j1.e(looper, wVar, new C6533u(this));
            this.f50374m = new CopyOnWriteArraySet();
            this.f50376o = new ArrayList();
            this.f50349H = new E2.a0();
            this.f50363b = new H2.w(new j0[c10.length], new H2.s[c10.length], o0.f42211Z, null);
            this.f50375n = new p2.e0();
            C1745x0 c1745x0 = new C1745x0(1);
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 20; i10++) {
                c1745x0.a(iArr[i10]);
            }
            this.f50369h.getClass();
            c1745x0.a(29);
            C5064q b10 = c1745x0.b();
            this.f50364c = new p2.U(b10);
            C1745x0 c1745x02 = new C1745x0(1);
            for (int i11 = 0; i11 < b10.f42219a.size(); i11++) {
                c1745x02.a(b10.a(i11));
            }
            c1745x02.a(4);
            c1745x02.a(10);
            this.f50350I = new p2.U(c1745x02.b());
            this.f50370i = this.f50382u.a(this.f50380s, null);
            C6533u c6533u = new C6533u(this);
            this.f50371j = c6533u;
            this.f50360W = d0.h(this.f50363b);
            ((z2.w) this.f50379r).O(this.f50367f, this.f50380s);
            int i12 = AbstractC5530A.f45131a;
            if (i12 < 31) {
                a5 = new C6755D();
            } else {
                a5 = AbstractC6498A.a(this.f50366e, this, c6531s.f50697r);
            }
            this.f50372k = new C6510M(this.f50368g, this.f50369h, this.f50363b, (AbstractC6511N) c6531s.f50685f.get(), this.f50381t, 0, this.f50379r, this.f50348G, c6531s.f50694o, c6531s.f50695p, false, this.f50380s, this.f50382u, c6533u, a5);
            this.f50357R = 1.0f;
            p2.K k10 = p2.K.f41848N0;
            this.f50351J = k10;
            this.f50359V = k10;
            int i13 = -1;
            this.f50361X = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.f50352K;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f50352K.release();
                    c5052e = null;
                    this.f50352K = null;
                } else {
                    c5052e = null;
                }
                if (this.f50352K == null) {
                    this.f50352K = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.P = this.f50352K.getAudioSessionId();
            } else {
                c5052e = null;
                AudioManager audioManager = (AudioManager) this.f50366e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    i13 = audioManager.generateAudioSessionId();
                }
                this.P = i13;
            }
            String str = r2.c.f44372h0;
            this.T = true;
            AbstractC6756a abstractC6756a = this.f50379r;
            abstractC6756a.getClass();
            this.f50373l.a(abstractC6756a);
            I2.c cVar = this.f50381t;
            Handler handler2 = new Handler(this.f50380s);
            AbstractC6756a abstractC6756a2 = this.f50379r;
            I2.g gVar = (I2.g) cVar;
            gVar.getClass();
            abstractC6756a2.getClass();
            F4.a aVar = gVar.f7982b;
            aVar.getClass();
            aVar.n(abstractC6756a2);
            ((CopyOnWriteArrayList) aVar.f5033Z).add(new I2.b(handler2, abstractC6756a2));
            this.f50374m.add(this.f50383v);
            C4711b c4711b = new C4711b(c6531s.f50680a, handler, this.f50383v);
            this.f50385x = c4711b;
            c4711b.h(false);
            C6518e c6518e = new C6518e(c6531s.f50680a, handler, this.f50383v);
            this.f50386y = c6518e;
            if (c6531s.f50690k) {
                c5052e2 = this.Q;
            } else {
                c5052e2 = c5052e;
            }
            c6518e.c(c5052e2);
            r1 r1Var = new r1(c6531s.f50680a, 1);
            this.f50387z = r1Var;
            r1Var.e();
            r1 r1Var2 = new r1(c6531s.f50680a, 2);
            this.f50342A = r1Var2;
            r1Var2.e();
            e();
            r0 r0Var = r0.f42253j0;
            this.f50356O = s2.v.f45196c;
            H2.v vVar = this.f50369h;
            C5052e c5052e3 = this.Q;
            H2.p pVar = (H2.p) vVar;
            synchronized (pVar.f7320c) {
                z11 = !pVar.f7325h.equals(c5052e3);
                pVar.f7325h = c5052e3;
            }
            if (z11) {
                pVar.g();
            }
            w(1, Integer.valueOf(this.P), 10);
            w(2, Integer.valueOf(this.P), 10);
            w(1, this.Q, 3);
            w(2, Integer.valueOf(this.f50355N), 4);
            w(2, 0, 5);
            w(1, Boolean.valueOf(this.S), 9);
            w(2, this.f50384w, 7);
            w(6, this.f50384w, 8);
            this.f50365d.d();
        } catch (Throwable th2) {
            this.f50365d.d();
            throw th2;
        }
    }

    public static void c(C6504G c6504g, final int i10, final int i11) {
        s2.v vVar = c6504g.f50356O;
        if (i10 != vVar.f45197a || i11 != vVar.f45198b) {
            c6504g.f50356O = new s2.v(i10, i11);
            c6504g.f50373l.l(24, new s2.m() { // from class: y2.y
                @Override // s2.m
                public final void invoke(Object obj) {
                    ((p2.V) obj).C(i10, i11);
                }
            });
            c6504g.w(2, new s2.v(i10, i11), 14);
        }
    }

    public static C5061n e() {
        T0.m mVar = new T0.m(0);
        mVar.f16798c = 0;
        mVar.f16799d = 0;
        return new C5061n(mVar);
    }

    public static long p(d0 d0Var) {
        p2.f0 f0Var = new p2.f0();
        p2.e0 e0Var = new p2.e0();
        d0Var.f50536a.i(d0Var.f50537b.f4420a, e0Var);
        long j6 = d0Var.f50538c;
        if (j6 == -9223372036854775807L) {
            return d0Var.f50536a.o(e0Var.f42024h0, f0Var, 0L).f42057r0;
        }
        return e0Var.f42026j0 + j6;
    }

    public final void A(int i10, int i11, boolean z10) {
        boolean z11;
        int i12 = 0;
        if (z10 && i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        d0 d0Var = this.f50360W;
        if (d0Var.f50547l == z11 && d0Var.f50548m == i12) {
            return;
        }
        C(i11, i12, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x043a A[LOOP:2: B:162:0x0432->B:164:0x043a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x044b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0463 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04f7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(final d0 d0Var, final int i10, final int i11, boolean z10, int i12, long j6, int i13) {
        Pair pair;
        p2.H h10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        p2.g0 m10;
        boolean z19;
        p2.g0 m11;
        d0 d0Var2;
        boolean z20;
        p2.g0 m12;
        p2.U u10;
        boolean z21;
        boolean r10;
        C5064q c5064q;
        int i14;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        int i15;
        boolean z28;
        p2.U u11;
        boolean z29;
        int i16;
        Object obj;
        p2.H h11;
        int i17;
        Object obj2;
        long j10;
        long j11;
        int i18;
        Object obj3;
        p2.H h12;
        Object obj4;
        long j12;
        long j13;
        long j14;
        int i19;
        d0 d0Var3 = this.f50360W;
        this.f50360W = d0Var;
        boolean z30 = !d0Var3.f50536a.equals(d0Var.f50536a);
        p2.g0 g0Var = d0Var3.f50536a;
        p2.g0 g0Var2 = d0Var.f50536a;
        if (g0Var2.r() && g0Var.r()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (g0Var2.r() != g0Var.r()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C0492y c0492y = d0Var3.f50537b;
            Object obj5 = c0492y.f4420a;
            p2.e0 e0Var = this.f50375n;
            int i20 = g0Var.i(obj5, e0Var).f42024h0;
            p2.f0 f0Var = this.f42062a;
            Object obj6 = g0Var.o(i20, f0Var, 0L).f42045Y;
            C0492y c0492y2 = d0Var.f50537b;
            if (!obj6.equals(g0Var2.o(g0Var2.i(c0492y2.f4420a, e0Var).f42024h0, f0Var, 0L).f42045Y)) {
                if (z10 && i12 == 0) {
                    i19 = 1;
                } else if (z10 && i12 == 1) {
                    i19 = 2;
                } else if (z30) {
                    i19 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i19));
            } else if (z10 && i12 == 0 && c0492y.f4423d < c0492y2.f4423d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!d0Var.f50536a.r()) {
                h10 = d0Var.f50536a.o(d0Var.f50536a.i(d0Var.f50537b.f4420a, this.f50375n).f42024h0, this.f42062a, 0L).f42047h0;
            } else {
                h10 = null;
            }
            this.f50359V = p2.K.f41848N0;
        } else {
            h10 = null;
        }
        if (!d0Var3.f50545j.equals(d0Var.f50545j)) {
            p2.J b10 = this.f50359V.b();
            List list = d0Var.f50545j;
            for (int i21 = 0; i21 < list.size(); i21++) {
                p2.M m13 = (p2.M) list.get(i21);
                int i22 = 0;
                while (true) {
                    p2.L[] lArr = m13.f41915Y;
                    if (i22 < lArr.length) {
                        lArr[i22].d(b10);
                        i22++;
                    }
                }
            }
            this.f50359V = new p2.K(b10);
        }
        p2.K d10 = d();
        boolean z31 = !d10.equals(this.f50351J);
        this.f50351J = d10;
        if (d0Var3.f50547l != d0Var.f50547l) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d0Var3.f50540e != d0Var.f50540e) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 || z11) {
            D();
        }
        if (d0Var3.f50542g != d0Var.f50542g) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z30) {
            this.f50373l.j(0, new s2.m() { // from class: y2.v
                @Override // s2.m
                public final void invoke(Object obj7) {
                    int i23 = r2;
                    int i24 = i10;
                    d0 d0Var4 = d0Var;
                    p2.V v10 = (p2.V) obj7;
                    switch (i23) {
                        case 0:
                            p2.g0 g0Var3 = d0Var4.f50536a;
                            v10.v(i24);
                            return;
                        default:
                            v10.j(i24, d0Var4.f50547l);
                            return;
                    }
                }
            });
        }
        if (z10) {
            p2.e0 e0Var2 = new p2.e0();
            if (!d0Var3.f50536a.r()) {
                Object obj7 = d0Var3.f50537b.f4420a;
                d0Var3.f50536a.i(obj7, e0Var2);
                int i23 = e0Var2.f42024h0;
                z15 = z12;
                z14 = z13;
                i16 = d0Var3.f50536a.c(obj7);
                obj2 = d0Var3.f50536a.o(i23, this.f42062a, 0L).f42045Y;
                h11 = this.f42062a.f42047h0;
                obj = obj7;
                i17 = i23;
            } else {
                z15 = z12;
                z14 = z13;
                i17 = i13;
                obj2 = null;
                h11 = null;
                obj = null;
                i16 = -1;
            }
            if (i12 == 0) {
                if (d0Var3.f50537b.b()) {
                    C0492y c0492y3 = d0Var3.f50537b;
                    j11 = e0Var2.b(c0492y3.f4421b, c0492y3.f4422c);
                    j10 = p(d0Var3);
                } else if (d0Var3.f50537b.f4424e != -1) {
                    j11 = p(this.f50360W);
                    j10 = j11;
                } else {
                    j13 = e0Var2.f42026j0;
                    j14 = e0Var2.f42025i0;
                    j11 = j13 + j14;
                    j10 = j11;
                }
            } else if (d0Var3.f50537b.b()) {
                j11 = d0Var3.f50553r;
                j10 = p(d0Var3);
            } else {
                j13 = e0Var2.f42026j0;
                j14 = d0Var3.f50553r;
                j11 = j13 + j14;
                j10 = j11;
            }
            long L10 = AbstractC5530A.L(j11);
            long L11 = AbstractC5530A.L(j10);
            C0492y c0492y4 = d0Var3.f50537b;
            p2.W w10 = new p2.W(obj2, i17, h11, obj, i16, L10, L11, c0492y4.f4421b, c0492y4.f4422c);
            int i24 = i();
            if (!this.f50360W.f50536a.r()) {
                d0 d0Var4 = this.f50360W;
                Object obj8 = d0Var4.f50537b.f4420a;
                d0Var4.f50536a.i(obj8, this.f50375n);
                int c10 = this.f50360W.f50536a.c(obj8);
                p2.g0 g0Var3 = this.f50360W.f50536a;
                p2.f0 f0Var2 = this.f42062a;
                z16 = z31;
                i18 = c10;
                obj4 = g0Var3.o(i24, f0Var2, 0L).f42045Y;
                h12 = f0Var2.f42047h0;
                obj3 = obj8;
            } else {
                z16 = z31;
                obj4 = null;
                h12 = null;
                obj3 = null;
                i18 = -1;
            }
            long L12 = AbstractC5530A.L(j6);
            if (this.f50360W.f50537b.b()) {
                j12 = AbstractC5530A.L(p(this.f50360W));
            } else {
                j12 = L12;
            }
            C0492y c0492y5 = this.f50360W.f50537b;
            this.f50373l.j(11, new C6536x(i12, w10, new p2.W(obj4, i24, h12, obj3, i18, L12, j12, c0492y5.f4421b, c0492y5.f4422c)));
        } else {
            z16 = z31;
            z15 = z12;
            z14 = z13;
        }
        if (booleanValue) {
            this.f50373l.j(1, new C3493k(intValue, h10));
        }
        if (d0Var3.f50541f != d0Var.f50541f) {
            this.f50373l.j(10, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj9) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj9;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
            if (d0Var.f50541f != null) {
                this.f50373l.j(10, new s2.m() { // from class: y2.w
                    @Override // s2.m
                    public final void invoke(Object obj9) {
                        int i25 = r2;
                        d0 d0Var5 = d0Var;
                        p2.V v10 = (p2.V) obj9;
                        switch (i25) {
                            case 0:
                                v10.a(d0Var5.f50548m);
                                return;
                            case 1:
                                v10.H(d0Var5.j());
                                return;
                            case 2:
                                v10.b(d0Var5.f50549n);
                                return;
                            case 3:
                                v10.h(d0Var5.f50541f);
                                return;
                            case 4:
                                v10.B(d0Var5.f50541f);
                                return;
                            case 5:
                                v10.i(d0Var5.f50544i.f7340d);
                                return;
                            case 6:
                                boolean z32 = d0Var5.f50542g;
                                v10.getClass();
                                v10.c(d0Var5.f50542g);
                                return;
                            case 7:
                                v10.A(d0Var5.f50540e, d0Var5.f50547l);
                                return;
                            default:
                                v10.n(d0Var5.f50540e);
                                return;
                        }
                    }
                });
            }
        }
        H2.w wVar = d0Var3.f50544i;
        H2.w wVar2 = d0Var.f50544i;
        if (wVar != wVar2) {
            H2.v vVar = this.f50369h;
            Object obj9 = wVar2.f7341e;
            vVar.getClass();
            H2.u uVar = (H2.u) obj9;
            this.f50373l.j(2, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        if (z16) {
            this.f50373l.j(14, new C3276b(4, this.f50351J));
        }
        if (z14) {
            this.f50373l.j(3, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        if (z15 || z11) {
            this.f50373l.j(-1, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        if (z15) {
            this.f50373l.j(4, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        if (z11) {
            this.f50373l.j(5, new s2.m() { // from class: y2.v
                @Override // s2.m
                public final void invoke(Object obj72) {
                    int i232 = r2;
                    int i242 = i11;
                    d0 d0Var42 = d0Var;
                    p2.V v10 = (p2.V) obj72;
                    switch (i232) {
                        case 0:
                            p2.g0 g0Var32 = d0Var42.f50536a;
                            v10.v(i242);
                            return;
                        default:
                            v10.j(i242, d0Var42.f50547l);
                            return;
                    }
                }
            });
        }
        if (d0Var3.f50548m != d0Var.f50548m) {
            this.f50373l.j(6, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        if (d0Var3.j() != d0Var.j()) {
            this.f50373l.j(7, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        if (!d0Var3.f50549n.equals(d0Var.f50549n)) {
            this.f50373l.j(12, new s2.m() { // from class: y2.w
                @Override // s2.m
                public final void invoke(Object obj92) {
                    int i25 = r2;
                    d0 d0Var5 = d0Var;
                    p2.V v10 = (p2.V) obj92;
                    switch (i25) {
                        case 0:
                            v10.a(d0Var5.f50548m);
                            return;
                        case 1:
                            v10.H(d0Var5.j());
                            return;
                        case 2:
                            v10.b(d0Var5.f50549n);
                            return;
                        case 3:
                            v10.h(d0Var5.f50541f);
                            return;
                        case 4:
                            v10.B(d0Var5.f50541f);
                            return;
                        case 5:
                            v10.i(d0Var5.f50544i.f7340d);
                            return;
                        case 6:
                            boolean z32 = d0Var5.f50542g;
                            v10.getClass();
                            v10.c(d0Var5.f50542g);
                            return;
                        case 7:
                            v10.A(d0Var5.f50540e, d0Var5.f50547l);
                            return;
                        default:
                            v10.n(d0Var5.f50540e);
                            return;
                    }
                }
            });
        }
        p2.U u12 = this.f50350I;
        int i25 = AbstractC5530A.f45131a;
        C6504G c6504g = (C6504G) this.f50367f;
        boolean r11 = c6504g.r();
        p2.g0 m14 = c6504g.m();
        boolean r12 = m14.r();
        p2.f0 f0Var3 = c6504g.f42062a;
        if (!r12 && m14.o(c6504g.i(), f0Var3, 0L).f42052m0) {
            z17 = true;
        } else {
            z17 = false;
        }
        p2.g0 m15 = c6504g.m();
        if (!m15.r()) {
            int i26 = c6504g.i();
            c6504g.E();
            c6504g.E();
            if (m15.m(i26, 0, false) != -1) {
                z18 = true;
                m10 = c6504g.m();
                if (!m10.r()) {
                    z29 = false;
                } else {
                    int i27 = c6504g.i();
                    c6504g.E();
                    c6504g.E();
                    z29 = false;
                    if (m10.f(i27, 0, false) != -1) {
                        z19 = true;
                        m11 = c6504g.m();
                        if (!m11.r()) {
                            d0Var2 = d0Var3;
                            if (m11.o(c6504g.i(), f0Var3, 0L).b()) {
                                z20 = true;
                                m12 = c6504g.m();
                                if (m12.r()) {
                                    u10 = u12;
                                    if (m12.o(c6504g.i(), f0Var3, 0L).f42053n0) {
                                        z21 = true;
                                        r10 = c6504g.m().r();
                                        p2.T t10 = new p2.T();
                                        c5064q = this.f50364c.f41939Y;
                                        C1745x0 c1745x0 = t10.f41937a;
                                        c1745x0.getClass();
                                        for (i14 = 0; i14 < c5064q.f42219a.size(); i14++) {
                                            c1745x0.a(c5064q.a(i14));
                                        }
                                        boolean z32 = !r11;
                                        t10.a(4, z32);
                                        if (!z17 && !r11) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        t10.a(5, z22);
                                        if (!z18 && !r11) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        t10.a(6, z23);
                                        if (r10 && ((z18 || !z20 || z17) && !r11)) {
                                            z24 = true;
                                        } else {
                                            z24 = false;
                                        }
                                        t10.a(7, z24);
                                        if (!z19 && !r11) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        t10.a(8, z25);
                                        if (r10 && ((z19 || (z20 && z21)) && !r11)) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        t10.a(9, z26);
                                        t10.a(10, z32);
                                        if (!z17 && !r11) {
                                            i15 = 11;
                                            z27 = true;
                                        } else {
                                            i15 = 11;
                                            z27 = false;
                                        }
                                        t10.a(i15, z27);
                                        if (!z17 && !r11) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        t10.a(12, z28);
                                        u11 = new p2.U(t10.f41937a.b());
                                        this.f50350I = u11;
                                        if (!u11.equals(u10)) {
                                            this.f50373l.j(13, new C6533u(this));
                                        }
                                        this.f50373l.g();
                                        if (d0Var2.f50550o != d0Var.f50550o) {
                                            Iterator it = this.f50374m.iterator();
                                            while (it.hasNext()) {
                                                ((SurfaceHolder$CallbackC6500C) it.next()).f50334Y.D();
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    u10 = u12;
                                }
                                z21 = false;
                                r10 = c6504g.m().r();
                                p2.T t102 = new p2.T();
                                c5064q = this.f50364c.f41939Y;
                                C1745x0 c1745x02 = t102.f41937a;
                                c1745x02.getClass();
                                while (i14 < c5064q.f42219a.size()) {
                                }
                                boolean z322 = !r11;
                                t102.a(4, z322);
                                if (!z17) {
                                }
                                z22 = false;
                                t102.a(5, z22);
                                if (!z18) {
                                }
                                z23 = false;
                                t102.a(6, z23);
                                if (r10) {
                                }
                                z24 = false;
                                t102.a(7, z24);
                                if (!z19) {
                                }
                                z25 = false;
                                t102.a(8, z25);
                                if (r10) {
                                }
                                z26 = false;
                                t102.a(9, z26);
                                t102.a(10, z322);
                                if (!z17) {
                                }
                                i15 = 11;
                                z27 = false;
                                t102.a(i15, z27);
                                if (!z17) {
                                }
                                z28 = false;
                                t102.a(12, z28);
                                u11 = new p2.U(t102.f41937a.b());
                                this.f50350I = u11;
                                if (!u11.equals(u10)) {
                                }
                                this.f50373l.g();
                                if (d0Var2.f50550o != d0Var.f50550o) {
                                }
                            }
                        } else {
                            d0Var2 = d0Var3;
                        }
                        z20 = false;
                        m12 = c6504g.m();
                        if (m12.r()) {
                        }
                        z21 = false;
                        r10 = c6504g.m().r();
                        p2.T t1022 = new p2.T();
                        c5064q = this.f50364c.f41939Y;
                        C1745x0 c1745x022 = t1022.f41937a;
                        c1745x022.getClass();
                        while (i14 < c5064q.f42219a.size()) {
                        }
                        boolean z3222 = !r11;
                        t1022.a(4, z3222);
                        if (!z17) {
                        }
                        z22 = false;
                        t1022.a(5, z22);
                        if (!z18) {
                        }
                        z23 = false;
                        t1022.a(6, z23);
                        if (r10) {
                        }
                        z24 = false;
                        t1022.a(7, z24);
                        if (!z19) {
                        }
                        z25 = false;
                        t1022.a(8, z25);
                        if (r10) {
                        }
                        z26 = false;
                        t1022.a(9, z26);
                        t1022.a(10, z3222);
                        if (!z17) {
                        }
                        i15 = 11;
                        z27 = false;
                        t1022.a(i15, z27);
                        if (!z17) {
                        }
                        z28 = false;
                        t1022.a(12, z28);
                        u11 = new p2.U(t1022.f41937a.b());
                        this.f50350I = u11;
                        if (!u11.equals(u10)) {
                        }
                        this.f50373l.g();
                        if (d0Var2.f50550o != d0Var.f50550o) {
                        }
                    }
                }
                z19 = z29;
                m11 = c6504g.m();
                if (!m11.r()) {
                }
                z20 = false;
                m12 = c6504g.m();
                if (m12.r()) {
                }
                z21 = false;
                r10 = c6504g.m().r();
                p2.T t10222 = new p2.T();
                c5064q = this.f50364c.f41939Y;
                C1745x0 c1745x0222 = t10222.f41937a;
                c1745x0222.getClass();
                while (i14 < c5064q.f42219a.size()) {
                }
                boolean z32222 = !r11;
                t10222.a(4, z32222);
                if (!z17) {
                }
                z22 = false;
                t10222.a(5, z22);
                if (!z18) {
                }
                z23 = false;
                t10222.a(6, z23);
                if (r10) {
                }
                z24 = false;
                t10222.a(7, z24);
                if (!z19) {
                }
                z25 = false;
                t10222.a(8, z25);
                if (r10) {
                }
                z26 = false;
                t10222.a(9, z26);
                t10222.a(10, z32222);
                if (!z17) {
                }
                i15 = 11;
                z27 = false;
                t10222.a(i15, z27);
                if (!z17) {
                }
                z28 = false;
                t10222.a(12, z28);
                u11 = new p2.U(t10222.f41937a.b());
                this.f50350I = u11;
                if (!u11.equals(u10)) {
                }
                this.f50373l.g();
                if (d0Var2.f50550o != d0Var.f50550o) {
                }
            }
        }
        z18 = false;
        m10 = c6504g.m();
        if (!m10.r()) {
        }
        z19 = z29;
        m11 = c6504g.m();
        if (!m11.r()) {
        }
        z20 = false;
        m12 = c6504g.m();
        if (m12.r()) {
        }
        z21 = false;
        r10 = c6504g.m().r();
        p2.T t102222 = new p2.T();
        c5064q = this.f50364c.f41939Y;
        C1745x0 c1745x02222 = t102222.f41937a;
        c1745x02222.getClass();
        while (i14 < c5064q.f42219a.size()) {
        }
        boolean z322222 = !r11;
        t102222.a(4, z322222);
        if (!z17) {
        }
        z22 = false;
        t102222.a(5, z22);
        if (!z18) {
        }
        z23 = false;
        t102222.a(6, z23);
        if (r10) {
        }
        z24 = false;
        t102222.a(7, z24);
        if (!z19) {
        }
        z25 = false;
        t102222.a(8, z25);
        if (r10) {
        }
        z26 = false;
        t102222.a(9, z26);
        t102222.a(10, z322222);
        if (!z17) {
        }
        i15 = 11;
        z27 = false;
        t102222.a(i15, z27);
        if (!z17) {
        }
        z28 = false;
        t102222.a(12, z28);
        u11 = new p2.U(t102222.f41937a.b());
        this.f50350I = u11;
        if (!u11.equals(u10)) {
        }
        this.f50373l.g();
        if (d0Var2.f50550o != d0Var.f50550o) {
        }
    }

    public final void C(int i10, int i11, boolean z10) {
        this.f50344C++;
        d0 d0Var = this.f50360W;
        if (d0Var.f50550o) {
            d0Var = d0Var.a();
        }
        d0 d10 = d0Var.d(i11, z10);
        s2.y yVar = this.f50372k.f50437m0;
        yVar.getClass();
        s2.x b10 = s2.y.b();
        b10.f45199a = yVar.f45201a.obtainMessage(1, z10 ? 1 : 0, i11);
        b10.b();
        B(d10, 0, i10, false, 5, -9223372036854775807L, -1);
    }

    public final void D() {
        E();
        int i10 = this.f50360W.f50540e;
        r1 r1Var = this.f50342A;
        r1 r1Var2 = this.f50387z;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                E();
                boolean z11 = this.f50360W.f50550o;
                if (!o() || z11) {
                    z10 = false;
                }
                r1Var2.f(z10);
                r1Var.f(o());
                return;
            }
        }
        r1Var2.f(false);
        r1Var.f(false);
    }

    public final void E() {
        IllegalStateException illegalStateException;
        C1745x0 c1745x0 = this.f50365d;
        synchronized (c1745x0) {
            boolean z10 = false;
            while (!c1745x0.f22767a) {
                try {
                    c1745x0.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f50380s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f50380s.getThread().getName();
            int i10 = AbstractC5530A.f45131a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (!this.T) {
                if (this.f50358U) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                s2.p.h("ExoPlayerImpl", str, illegalStateException);
                this.f50358U = true;
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    public final p2.K d() {
        p2.g0 m10 = m();
        if (m10.r()) {
            return this.f50359V;
        }
        p2.H h10 = m10.o(i(), this.f42062a, 0L).f42047h0;
        p2.J b10 = this.f50359V.b();
        p2.K k10 = h10.f41810i0;
        if (k10 != null) {
            CharSequence charSequence = k10.f41894Y;
            if (charSequence != null) {
                b10.f41822a = charSequence;
            }
            CharSequence charSequence2 = k10.f41895Z;
            if (charSequence2 != null) {
                b10.f41823b = charSequence2;
            }
            CharSequence charSequence3 = k10.f41896h0;
            if (charSequence3 != null) {
                b10.f41824c = charSequence3;
            }
            CharSequence charSequence4 = k10.f41897i0;
            if (charSequence4 != null) {
                b10.f41825d = charSequence4;
            }
            CharSequence charSequence5 = k10.f41898j0;
            if (charSequence5 != null) {
                b10.f41826e = charSequence5;
            }
            CharSequence charSequence6 = k10.f41899k0;
            if (charSequence6 != null) {
                b10.f41827f = charSequence6;
            }
            CharSequence charSequence7 = k10.f41900l0;
            if (charSequence7 != null) {
                b10.f41828g = charSequence7;
            }
            p2.Z z10 = k10.f41901m0;
            if (z10 != null) {
                b10.f41829h = z10;
            }
            p2.Z z11 = k10.f41902n0;
            if (z11 != null) {
                b10.f41830i = z11;
            }
            byte[] bArr = k10.f41903o0;
            if (bArr != null) {
                b10.f41831j = (byte[]) bArr.clone();
                b10.f41832k = k10.f41904p0;
            }
            Uri uri = k10.f41905q0;
            if (uri != null) {
                b10.f41833l = uri;
            }
            Integer num = k10.f41906r0;
            if (num != null) {
                b10.f41834m = num;
            }
            Integer num2 = k10.f41907s0;
            if (num2 != null) {
                b10.f41835n = num2;
            }
            Integer num3 = k10.f41908t0;
            if (num3 != null) {
                b10.f41836o = num3;
            }
            Boolean bool = k10.f41909u0;
            if (bool != null) {
                b10.f41837p = bool;
            }
            Boolean bool2 = k10.f41910v0;
            if (bool2 != null) {
                b10.f41838q = bool2;
            }
            Integer num4 = k10.f41911w0;
            if (num4 != null) {
                b10.f41839r = num4;
            }
            Integer num5 = k10.f41912x0;
            if (num5 != null) {
                b10.f41839r = num5;
            }
            Integer num6 = k10.f41913y0;
            if (num6 != null) {
                b10.f41840s = num6;
            }
            Integer num7 = k10.f41914z0;
            if (num7 != null) {
                b10.f41841t = num7;
            }
            Integer num8 = k10.f41881A0;
            if (num8 != null) {
                b10.f41842u = num8;
            }
            Integer num9 = k10.f41882B0;
            if (num9 != null) {
                b10.f41843v = num9;
            }
            Integer num10 = k10.f41883C0;
            if (num10 != null) {
                b10.f41844w = num10;
            }
            CharSequence charSequence8 = k10.f41884D0;
            if (charSequence8 != null) {
                b10.f41845x = charSequence8;
            }
            CharSequence charSequence9 = k10.f41885E0;
            if (charSequence9 != null) {
                b10.f41846y = charSequence9;
            }
            CharSequence charSequence10 = k10.f41886F0;
            if (charSequence10 != null) {
                b10.f41847z = charSequence10;
            }
            Integer num11 = k10.f41887G0;
            if (num11 != null) {
                b10.f41815A = num11;
            }
            Integer num12 = k10.f41888H0;
            if (num12 != null) {
                b10.f41816B = num12;
            }
            CharSequence charSequence11 = k10.f41889I0;
            if (charSequence11 != null) {
                b10.f41817C = charSequence11;
            }
            CharSequence charSequence12 = k10.f41890J0;
            if (charSequence12 != null) {
                b10.f41818D = charSequence12;
            }
            CharSequence charSequence13 = k10.f41891K0;
            if (charSequence13 != null) {
                b10.f41819E = charSequence13;
            }
            Integer num13 = k10.f41892L0;
            if (num13 != null) {
                b10.f41820F = num13;
            }
            Bundle bundle = k10.f41893M0;
            if (bundle != null) {
                b10.f41821G = bundle;
            }
        }
        return new p2.K(b10);
    }

    public final long f(d0 d0Var) {
        if (d0Var.f50537b.b()) {
            Object obj = d0Var.f50537b.f4420a;
            p2.g0 g0Var = d0Var.f50536a;
            p2.e0 e0Var = this.f50375n;
            g0Var.i(obj, e0Var);
            long j6 = d0Var.f50538c;
            if (j6 == -9223372036854775807L) {
                return AbstractC5530A.L(g0Var.o(n(d0Var), this.f42062a, 0L).f42057r0);
            }
            return AbstractC5530A.L(e0Var.f42026j0) + AbstractC5530A.L(j6);
        }
        return AbstractC5530A.L(l(d0Var));
    }

    public final int g() {
        E();
        if (r()) {
            return this.f50360W.f50537b.f4421b;
        }
        return -1;
    }

    public final int h() {
        E();
        if (r()) {
            return this.f50360W.f50537b.f4422c;
        }
        return -1;
    }

    public final int i() {
        E();
        int n10 = n(this.f50360W);
        if (n10 == -1) {
            return 0;
        }
        return n10;
    }

    public final int j() {
        E();
        if (this.f50360W.f50536a.r()) {
            return 0;
        }
        d0 d0Var = this.f50360W;
        return d0Var.f50536a.c(d0Var.f50537b.f4420a);
    }

    public final long k() {
        E();
        return AbstractC5530A.L(l(this.f50360W));
    }

    public final long l(d0 d0Var) {
        long j6;
        if (d0Var.f50536a.r()) {
            return AbstractC5530A.C(this.f50362Y);
        }
        if (d0Var.f50550o) {
            j6 = d0Var.i();
        } else {
            j6 = d0Var.f50553r;
        }
        if (d0Var.f50537b.b()) {
            return j6;
        }
        p2.g0 g0Var = d0Var.f50536a;
        Object obj = d0Var.f50537b.f4420a;
        p2.e0 e0Var = this.f50375n;
        g0Var.i(obj, e0Var);
        return j6 + e0Var.f42026j0;
    }

    public final p2.g0 m() {
        E();
        return this.f50360W.f50536a;
    }

    public final int n(d0 d0Var) {
        if (d0Var.f50536a.r()) {
            return this.f50361X;
        }
        return d0Var.f50536a.i(d0Var.f50537b.f4420a, this.f50375n).f42024h0;
    }

    public final boolean o() {
        E();
        return this.f50360W.f50547l;
    }

    public final boolean q() {
        return true;
    }

    public final boolean r() {
        E();
        return this.f50360W.f50537b.b();
    }

    public final d0 s(d0 d0Var, p2.g0 g0Var, Pair pair) {
        boolean z10;
        C0492y c0492y;
        E2.i0 i0Var;
        H2.w wVar;
        List list;
        int i10;
        long j6;
        if (!g0Var.r() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.l(z10);
        p2.g0 g0Var2 = d0Var.f50536a;
        long f6 = f(d0Var);
        d0 g10 = d0Var.g(g0Var);
        if (g0Var.r()) {
            C0492y c0492y2 = d0.f50535t;
            long C10 = AbstractC5530A.C(this.f50362Y);
            d0 b10 = g10.c(c0492y2, C10, C10, C10, 0L, E2.i0.f4359i0, this.f50363b, x8.k0.f49573j0).b(c0492y2);
            b10.f50551p = b10.f50553r;
            return b10;
        }
        Object obj = g10.f50537b.f4420a;
        int i11 = AbstractC5530A.f45131a;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            c0492y = new C0492y(pair.first);
        } else {
            c0492y = g10.f50537b;
        }
        C0492y c0492y3 = c0492y;
        long longValue = ((Long) pair.second).longValue();
        long C11 = AbstractC5530A.C(f6);
        if (!g0Var2.r()) {
            C11 -= g0Var2.i(obj, this.f50375n).f42026j0;
        }
        if (!z11 && longValue >= C11) {
            if (i10 == 0) {
                int c10 = g0Var.c(g10.f50546k.f4420a);
                if (c10 == -1 || g0Var.h(c10, this.f50375n, false).f42024h0 != g0Var.i(c0492y3.f4420a, this.f50375n).f42024h0) {
                    g0Var.i(c0492y3.f4420a, this.f50375n);
                    if (c0492y3.b()) {
                        j6 = this.f50375n.b(c0492y3.f4421b, c0492y3.f4422c);
                    } else {
                        j6 = this.f50375n.f42025i0;
                    }
                    d0 b11 = g10.c(c0492y3, g10.f50553r, g10.f50553r, g10.f50539d, j6 - g10.f50553r, g10.f50543h, g10.f50544i, g10.f50545j).b(c0492y3);
                    b11.f50551p = j6;
                    return b11;
                }
                return g10;
            }
            Gi.e.n(!c0492y3.b());
            long max = Math.max(0L, g10.f50552q - (longValue - C11));
            long j10 = g10.f50551p;
            if (g10.f50546k.equals(g10.f50537b)) {
                j10 = longValue + max;
            }
            d0 c11 = g10.c(c0492y3, longValue, longValue, longValue, max, g10.f50543h, g10.f50544i, g10.f50545j);
            c11.f50551p = j10;
            return c11;
        }
        Gi.e.n(!c0492y3.b());
        if (z11) {
            i0Var = E2.i0.f4359i0;
        } else {
            i0Var = g10.f50543h;
        }
        E2.i0 i0Var2 = i0Var;
        if (z11) {
            wVar = this.f50363b;
        } else {
            wVar = g10.f50544i;
        }
        H2.w wVar2 = wVar;
        if (z11) {
            x8.L l10 = x8.N.f49523Z;
            list = x8.k0.f49573j0;
        } else {
            list = g10.f50545j;
        }
        d0 b12 = g10.c(c0492y3, longValue, longValue, longValue, 0L, i0Var2, wVar2, list).b(c0492y3);
        b12.f50551p = longValue;
        return b12;
    }

    public final Pair t(p2.g0 g0Var, int i10, long j6) {
        if (g0Var.r()) {
            this.f50361X = i10;
            if (j6 == -9223372036854775807L) {
                j6 = 0;
            }
            this.f50362Y = j6;
            return null;
        }
        if (i10 == -1 || i10 >= g0Var.q()) {
            i10 = g0Var.b(false);
            j6 = AbstractC5530A.L(g0Var.o(i10, this.f42062a, 0L).f42057r0);
        }
        return g0Var.k(this.f42062a, this.f50375n, i10, AbstractC5530A.C(j6));
    }

    public final void u() {
        int i10;
        E();
        boolean o10 = o();
        int i11 = 2;
        int e10 = this.f50386y.e(2, o10);
        if (o10 && e10 != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        A(e10, i10, o10);
        d0 d0Var = this.f50360W;
        if (d0Var.f50540e != 1) {
            return;
        }
        d0 e11 = d0Var.e(null);
        if (e11.f50536a.r()) {
            i11 = 4;
        }
        d0 f6 = e11.f(i11);
        this.f50344C++;
        s2.y yVar = this.f50372k.f50437m0;
        yVar.getClass();
        s2.x b10 = s2.y.b();
        b10.f45199a = yVar.f45201a.obtainMessage(0);
        b10.b();
        B(f6, 1, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void v() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.2.1] [");
        sb2.append(AbstractC5530A.f45135e);
        sb2.append("] [");
        HashSet hashSet = p2.I.f41813a;
        synchronized (p2.I.class) {
            str = p2.I.f41814b;
        }
        sb2.append(str);
        sb2.append("]");
        s2.p.f("ExoPlayerImpl", sb2.toString());
        E();
        if (AbstractC5530A.f45131a < 21 && (audioTrack = this.f50352K) != null) {
            audioTrack.release();
            this.f50352K = null;
        }
        this.f50385x.h(false);
        this.f50387z.f(false);
        this.f50342A.f(false);
        C6518e c6518e = this.f50386y;
        c6518e.f50557c = null;
        c6518e.a();
        if (!this.f50372k.y()) {
            this.f50373l.l(10, new p2.Y(16));
        }
        this.f50373l.k();
        this.f50370i.f45201a.removeCallbacksAndMessages(null);
        ((I2.g) this.f50381t).f7982b.n(this.f50379r);
        d0 d0Var = this.f50360W;
        if (d0Var.f50550o) {
            this.f50360W = d0Var.a();
        }
        d0 f6 = this.f50360W.f(1);
        this.f50360W = f6;
        d0 b10 = f6.b(f6.f50537b);
        this.f50360W = b10;
        b10.f50551p = b10.f50553r;
        this.f50360W.f50552q = 0L;
        z2.w wVar = (z2.w) this.f50379r;
        s2.y yVar = wVar.f51543m0;
        Gi.e.o(yVar);
        yVar.c(new RunnableC3111d(14, wVar));
        this.f50369h.a();
        Surface surface = this.f50354M;
        if (surface != null) {
            surface.release();
            this.f50354M = null;
        }
        String str2 = r2.c.f44372h0;
    }

    public final void w(int i10, Object obj, int i11) {
        AbstractC6519f[] abstractC6519fArr;
        int i12;
        for (AbstractC6519f abstractC6519f : this.f50368g) {
            if (abstractC6519f.f50564Z == i10) {
                int n10 = n(this.f50360W);
                p2.g0 g0Var = this.f50360W.f50536a;
                if (n10 == -1) {
                    i12 = 0;
                } else {
                    i12 = n10;
                }
                C6510M c6510m = this.f50372k;
                f0 f0Var = new f0(c6510m, abstractC6519f, g0Var, i12, this.f50382u, c6510m.f50439o0);
                Gi.e.n(!f0Var.f50586g);
                f0Var.f50583d = i11;
                Gi.e.n(!f0Var.f50586g);
                f0Var.f50584e = obj;
                f0Var.c();
            }
        }
    }

    public final void x(boolean z10) {
        E();
        E();
        int e10 = this.f50386y.e(this.f50360W.f50540e, z10);
        int i10 = 1;
        if (z10 && e10 != 1) {
            i10 = 2;
        }
        A(e10, i10, z10);
    }

    public final void y(Surface surface) {
        AbstractC6519f[] abstractC6519fArr;
        boolean z10;
        int i10;
        ArrayList arrayList = new ArrayList();
        for (AbstractC6519f abstractC6519f : this.f50368g) {
            if (abstractC6519f.f50564Z == 2) {
                int n10 = n(this.f50360W);
                p2.g0 g0Var = this.f50360W.f50536a;
                if (n10 == -1) {
                    i10 = 0;
                } else {
                    i10 = n10;
                }
                C6510M c6510m = this.f50372k;
                f0 f0Var = new f0(c6510m, abstractC6519f, g0Var, i10, this.f50382u, c6510m.f50439o0);
                Gi.e.n(!f0Var.f50586g);
                f0Var.f50583d = 1;
                Gi.e.n(!f0Var.f50586g);
                f0Var.f50584e = surface;
                f0Var.c();
                arrayList.add(f0Var);
            }
        }
        Object obj = this.f50353L;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((f0) it.next()).a(this.f50343B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            z10 = false;
            Object obj2 = this.f50353L;
            Surface surface2 = this.f50354M;
            if (obj2 == surface2) {
                surface2.release();
                this.f50354M = null;
            }
        } else {
            z10 = false;
        }
        this.f50353L = surface;
        if (z10) {
            z(new C6527n(2, new n0(3), 1003));
        }
    }

    public final void z(C6527n c6527n) {
        d0 d0Var = this.f50360W;
        d0 b10 = d0Var.b(d0Var.f50537b);
        b10.f50551p = b10.f50553r;
        b10.f50552q = 0L;
        d0 f6 = b10.f(1);
        if (c6527n != null) {
            f6 = f6.e(c6527n);
        }
        d0 d0Var2 = f6;
        this.f50344C++;
        s2.y yVar = this.f50372k.f50437m0;
        yVar.getClass();
        s2.x b11 = s2.y.b();
        b11.f45199a = yVar.f45201a.obtainMessage(6);
        b11.b();
        B(d0Var2, 0, 1, false, 5, -9223372036854775807L, -1);
    }
}
