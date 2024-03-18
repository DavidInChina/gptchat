package A2;

import L2.AbstractC0881b;
import Q1.ThreadFactoryC1173a;
import Z.C1745x0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import c1.AbstractC2279d;
import com.revenuecat.purchases.common.UtilsKt;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import livekit.org.webrtc.MediaStreamTrack;
import m.C4507D;
import p2.C5052e;
import p2.C5053f;
import p2.C5065s;
import q2.AbstractC5264d;
import q2.C5261a;
import q2.C5262b;
import q2.C5263c;
import s2.AbstractC5530A;
import x8.k0;
import y2.C6503F;
import y2.C6505H;
import y2.SurfaceHolder$CallbackC6500C;
import y8.AbstractC6548c;
import z2.C6755D;

/* loaded from: classes.dex */
public final class S implements AbstractC0075t {

    /* renamed from: i0  reason: collision with root package name */
    public static final Object f431i0 = new Object();

    /* renamed from: j0  reason: collision with root package name */
    public static ExecutorService f432j0;

    /* renamed from: k0  reason: collision with root package name */
    public static int f433k0;

    /* renamed from: A  reason: collision with root package name */
    public C5052e f434A;

    /* renamed from: B  reason: collision with root package name */
    public L f435B;

    /* renamed from: C  reason: collision with root package name */
    public L f436C;

    /* renamed from: D  reason: collision with root package name */
    public p2.S f437D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f438E;

    /* renamed from: F  reason: collision with root package name */
    public ByteBuffer f439F;

    /* renamed from: G  reason: collision with root package name */
    public int f440G;

    /* renamed from: H  reason: collision with root package name */
    public long f441H;

    /* renamed from: I  reason: collision with root package name */
    public long f442I;

    /* renamed from: J  reason: collision with root package name */
    public long f443J;

    /* renamed from: K  reason: collision with root package name */
    public long f444K;

    /* renamed from: L  reason: collision with root package name */
    public int f445L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f446M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f447N;

    /* renamed from: O  reason: collision with root package name */
    public long f448O;
    public float P;
    public ByteBuffer Q;

    /* renamed from: R  reason: collision with root package name */
    public int f449R;
    public ByteBuffer S;
    public byte[] T;

    /* renamed from: U  reason: collision with root package name */
    public int f450U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f451V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f452W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f453X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f454Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f455Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f456a;

    /* renamed from: a0  reason: collision with root package name */
    public C5053f f457a0;

    /* renamed from: b  reason: collision with root package name */
    public final q2.e f458b;

    /* renamed from: b0  reason: collision with root package name */
    public G f459b0;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f460c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f461c0;

    /* renamed from: d  reason: collision with root package name */
    public final C0079x f462d;

    /* renamed from: d0  reason: collision with root package name */
    public long f463d0;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f464e;

    /* renamed from: e0  reason: collision with root package name */
    public long f465e0;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f466f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f467f0;

    /* renamed from: g  reason: collision with root package name */
    public final k0 f468g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f469g0;

    /* renamed from: h  reason: collision with root package name */
    public final C1745x0 f470h;

    /* renamed from: h0  reason: collision with root package name */
    public Looper f471h0;

    /* renamed from: i  reason: collision with root package name */
    public final C0078w f472i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque f473j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f474k;

    /* renamed from: l  reason: collision with root package name */
    public int f475l;

    /* renamed from: m  reason: collision with root package name */
    public Q f476m;

    /* renamed from: n  reason: collision with root package name */
    public final M f477n;

    /* renamed from: o  reason: collision with root package name */
    public final M f478o;

    /* renamed from: p  reason: collision with root package name */
    public final H f479p;

    /* renamed from: q  reason: collision with root package name */
    public final A f480q;

    /* renamed from: r  reason: collision with root package name */
    public final SurfaceHolder$CallbackC6500C f481r;

    /* renamed from: s  reason: collision with root package name */
    public C6755D f482s;

    /* renamed from: t  reason: collision with root package name */
    public F4.a f483t;

    /* renamed from: u  reason: collision with root package name */
    public J f484u;

    /* renamed from: v  reason: collision with root package name */
    public J f485v;

    /* renamed from: w  reason: collision with root package name */
    public C5261a f486w;

    /* renamed from: x  reason: collision with root package name */
    public AudioTrack f487x;

    /* renamed from: y  reason: collision with root package name */
    public C0059c f488y;

    /* renamed from: z  reason: collision with root package name */
    public C0062f f489z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, A2.M] */
    /* JADX WARN: Type inference failed for: r0v6, types: [p2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, A2.M] */
    /* JADX WARN: Type inference failed for: r3v13, types: [A2.x, q2.f] */
    /* JADX WARN: Type inference failed for: r4v4, types: [A2.b0, q2.f] */
    public S(I i10) {
        C0059c c0059c;
        boolean z10;
        boolean z11;
        Context context = (Context) i10.f398d;
        this.f456a = context;
        if (context != null) {
            c0059c = C0059c.b(context);
        } else {
            c0059c = (C0059c) i10.f399e;
        }
        this.f488y = c0059c;
        this.f458b = (q2.e) i10.f400f;
        int i11 = AbstractC5530A.f45131a;
        if (i11 >= 21 && i10.f395a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f460c = z10;
        if (i11 >= 23 && i10.f396b) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f474k = z11;
        this.f475l = 0;
        this.f479p = (H) i10.f401g;
        A a5 = (A) i10.f402h;
        a5.getClass();
        this.f480q = a5;
        C1745x0 c1745x0 = new C1745x0();
        this.f470h = c1745x0;
        c1745x0.d();
        this.f472i = new C0078w(new N(this));
        ?? fVar = new q2.f();
        this.f462d = fVar;
        ?? fVar2 = new q2.f();
        fVar2.f532m = AbstractC5530A.f45136f;
        this.f464e = fVar2;
        q2.f fVar3 = new q2.f();
        x8.L l10 = x8.N.f49523Z;
        Object[] objArr = {fVar3, fVar, fVar2};
        P4.a.s(3, objArr);
        this.f466f = x8.N.T(3, objArr);
        this.f468g = x8.N.u0(new q2.f());
        this.P = 1.0f;
        this.f434A = C5052e.f42005l0;
        this.f455Z = 0;
        this.f457a0 = new Object();
        p2.S s10 = p2.S.f41931i0;
        this.f436C = new L(s10, 0L, 0L);
        this.f437D = s10;
        this.f438E = false;
        this.f473j = new ArrayDeque();
        this.f477n = new Object();
        this.f478o = new Object();
        this.f481r = (SurfaceHolder$CallbackC6500C) i10.f403i;
    }

    public static boolean o(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (AbstractC5530A.f45131a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 != 4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        if (r1 != 4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j6) {
        p2.S s10;
        boolean z10;
        boolean z11;
        F4.a aVar;
        boolean u10 = u();
        boolean z12 = this.f460c;
        q2.e eVar = this.f458b;
        if (!u10) {
            if (!this.f461c0) {
                J j10 = this.f485v;
                if (j10.f406c == 0) {
                    int i10 = j10.f404a.f42299F0;
                    if (z12) {
                        int i11 = AbstractC5530A.f45131a;
                        if (i10 != 536870912) {
                            if (i10 != 1342177280) {
                                if (i10 != 805306368) {
                                    if (i10 != 1610612736) {
                                    }
                                }
                            }
                        }
                    }
                    s10 = eVar.b(this.f437D);
                    this.f437D = s10;
                }
            }
            s10 = p2.S.f41931i0;
            this.f437D = s10;
        } else {
            s10 = p2.S.f41931i0;
        }
        p2.S s11 = s10;
        if (!this.f461c0) {
            J j11 = this.f485v;
            if (j11.f406c == 0) {
                int i12 = j11.f404a.f42299F0;
                if (z12) {
                    int i13 = AbstractC5530A.f45131a;
                    if (i12 != 536870912) {
                        if (i12 != 1342177280) {
                            if (i12 != 805306368) {
                                if (i12 != 1610612736) {
                                }
                            }
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                    z11 = eVar.e(this.f438E);
                } else {
                    z11 = false;
                }
                this.f438E = z11;
                this.f473j.add(new L(s11, Math.max(0L, j6), AbstractC5530A.G(this.f485v.f408e, j())));
                C5261a c5261a = this.f485v.f412i;
                this.f486w = c5261a;
                c5261a.b();
                aVar = this.f483t;
                if (aVar == null) {
                    boolean z13 = this.f438E;
                    U3.l lVar = ((V) aVar.f5033Z).f498M1;
                    Handler handler = (Handler) lVar.f17423Z;
                    if (handler != null) {
                        handler.post(new RunnableC0070n(lVar, z13, 0));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
        this.f438E = z11;
        this.f473j.add(new L(s11, Math.max(0L, j6), AbstractC5530A.G(this.f485v.f408e, j())));
        C5261a c5261a2 = this.f485v.f412i;
        this.f486w = c5261a2;
        c5261a2.b();
        aVar = this.f483t;
        if (aVar == null) {
        }
    }

    public final AudioTrack b(J j6) {
        try {
            AudioTrack a5 = j6.a(this.f434A, this.f455Z);
            if (this.f481r != null) {
                o(a5);
            }
            return a5;
        } catch (C0073q e10) {
            F4.a aVar = this.f483t;
            if (aVar != null) {
                aVar.j(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
        if ((r3 & r6) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
        if (r23 > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
        if (r5 > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
        if (r5 < 0) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
    /* JADX WARN: Type inference failed for: r12v6, types: [x8.K, x8.H] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C5065s c5065s, int[] iArr) {
        boolean z10;
        boolean z11;
        C5261a c5261a;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        double d10;
        boolean z13;
        int i17;
        C5261a c5261a2;
        int i18;
        boolean z14;
        int i19;
        int i20;
        int i21;
        int a5;
        boolean z15;
        boolean z16;
        int i22;
        C0064h c0064h;
        int[] iArr2;
        boolean equals = "audio/raw".equals(c5065s.f42319q0);
        boolean z17 = this.f474k;
        int i23 = c5065s.f42298E0;
        int i24 = c5065s.f42297D0;
        if (equals) {
            int i25 = c5065s.f42299F0;
            Gi.e.l(AbstractC5530A.z(i25));
            int u10 = AbstractC5530A.u(i25, i24);
            ?? h10 = new x8.H();
            if (this.f460c && (i25 == 536870912 || i25 == 1342177280 || i25 == 805306368 || i25 == 1610612736 || i25 == 4)) {
                h10.f0(this.f468g);
            } else {
                h10.f0(this.f466f);
                AbstractC5264d[] f6 = this.f458b.f();
                int length = f6.length;
                P4.a.s(length, f6);
                h10.h0(h10.f49514g + length);
                System.arraycopy(f6, 0, h10.f49513f, h10.f49514g, length);
                h10.f49514g += length;
            }
            C5261a c5261a3 = new C5261a(h10.i0());
            if (c5261a3.equals(this.f486w)) {
                c5261a3 = this.f486w;
            }
            int i26 = c5065s.f42300G0;
            b0 b0Var = this.f464e;
            b0Var.f528i = i26;
            b0Var.f529j = c5065s.f42301H0;
            if (AbstractC5530A.f45131a < 21 && i24 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i27 = 0; i27 < 6; i27++) {
                    iArr2[i27] = i27;
                }
            } else {
                iArr2 = iArr;
            }
            this.f462d.f635i = iArr2;
            try {
                C5262b a10 = c5261a3.a(new C5262b(i23, i24, i25));
                int i28 = a10.f43663b;
                int p10 = AbstractC5530A.p(i28);
                i10 = a10.f43664c;
                i13 = AbstractC5530A.u(i10, i28);
                c5261a = c5261a3;
                z11 = z17;
                z10 = false;
                i14 = u10;
                i11 = p10;
                i12 = a10.f43662a;
                i15 = 0;
            } catch (C5263c e10) {
                throw new C0072p(e10, c5065s);
            }
        } else {
            x8.L l10 = x8.N.f49523Z;
            C5261a c5261a4 = new C5261a(k0.f49573j0);
            if (this.f475l != 0) {
                c0064h = g(c5065s);
            } else {
                c0064h = C0064h.f554d;
            }
            if (this.f475l != 0 && c0064h.f555a) {
                String str = c5065s.f42319q0;
                str.getClass();
                int b10 = p2.N.b(str, c5065s.f42316n0);
                int p11 = AbstractC5530A.p(i24);
                c5261a = c5261a4;
                z10 = c0064h.f556b;
                i10 = b10;
                i14 = -1;
                i15 = 1;
                z11 = true;
                i11 = p11;
            } else {
                Pair d11 = f().d(c5065s);
                if (d11 != null) {
                    int intValue = ((Integer) d11.first).intValue();
                    c5261a = c5261a4;
                    i11 = ((Integer) d11.second).intValue();
                    z11 = z17;
                    i14 = -1;
                    z10 = false;
                    i10 = intValue;
                    i15 = 2;
                } else {
                    throw new C0072p("Unable to configure passthrough for: " + c5065s, c5065s);
                }
            }
            i12 = i23;
            i13 = i14;
        }
        if (i10 != 0) {
            if (i11 != 0) {
                int minBufferSize = AudioTrack.getMinBufferSize(i12, i11, i10);
                if (minBufferSize != -2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Gi.e.n(z12);
                if (i13 != -1) {
                    i16 = i13;
                } else {
                    i16 = 1;
                }
                if (z11) {
                    d10 = 8.0d;
                } else {
                    d10 = 1.0d;
                }
                T t10 = (T) this.f479p;
                t10.getClass();
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            int i29 = t10.f493e;
                            if (i10 == 5) {
                                i22 = t10.f495g;
                            } else {
                                if (i10 == 8) {
                                    i22 = t10.f496h;
                                }
                                i21 = c5065s.f42315m0;
                                if (i21 == -1) {
                                    RoundingMode roundingMode = RoundingMode.CEILING;
                                    roundingMode.getClass();
                                    a5 = i21 / 8;
                                    int i30 = i21 - (8 * a5);
                                    if (i30 != 0) {
                                        int i31 = ((i21 ^ 8) >> 31) | 1;
                                        switch (AbstractC6548c.f50836a[roundingMode.ordinal()]) {
                                            case 1:
                                                if (i30 != 0) {
                                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                                }
                                                break;
                                            case 2:
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                a5 += i31;
                                                break;
                                            case 5:
                                                break;
                                            case 6:
                                            case 7:
                                            case 8:
                                                int abs = Math.abs(i30);
                                                int abs2 = abs - (Math.abs(8) - abs);
                                                if (abs2 == 0) {
                                                    if (roundingMode != RoundingMode.HALF_UP) {
                                                        if (roundingMode == RoundingMode.HALF_EVEN) {
                                                            z15 = true;
                                                        } else {
                                                            z15 = false;
                                                        }
                                                        if ((a5 & 1) != 0) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        break;
                                                    }
                                                    a5 += i31;
                                                    break;
                                                }
                                                break;
                                            default:
                                                throw new AssertionError();
                                        }
                                    }
                                } else {
                                    a5 = T.a(i10);
                                }
                                z13 = z11;
                                z14 = z10;
                                i20 = M3.H.E((i29 * a5) / 1000000);
                            }
                            i29 *= i22;
                            i21 = c5065s.f42315m0;
                            if (i21 == -1) {
                            }
                            z13 = z11;
                            z14 = z10;
                            i20 = M3.H.E((i29 * a5) / 1000000);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        z13 = z11;
                        z14 = z10;
                        i20 = M3.H.E((t10.f494f * T.a(i10)) / 1000000);
                    }
                    i19 = i12;
                    i17 = i11;
                    i18 = i10;
                    c5261a2 = c5261a;
                } else {
                    z13 = z11;
                    z14 = z10;
                    i18 = i10;
                    c5261a2 = c5261a;
                    long j6 = i12;
                    i19 = i12;
                    i17 = i11;
                    long j10 = i16;
                    i20 = AbstractC5530A.i(t10.f492d * minBufferSize, M3.H.E(((t10.f490b * j6) * j10) / 1000000), M3.H.E(((t10.f491c * j6) * j10) / 1000000));
                }
                this.f467f0 = false;
                J j11 = new J(c5065s, i14, i15, i13, i19, i17, i18, (((Math.max(minBufferSize, (int) (i20 * d10)) + i16) - 1) / i16) * i16, c5261a2, z13, z14, this.f461c0);
                if (n()) {
                    this.f484u = j11;
                    return;
                } else {
                    this.f485v = j11;
                    return;
                }
            }
            throw new C0072p("Invalid output channel config (mode=" + i15 + ") for: " + c5065s, c5065s);
        }
        throw new C0072p("Invalid output encoding (mode=" + i15 + ") for: " + c5065s, c5065s);
    }

    public final boolean d() {
        if (!this.f486w.e()) {
            ByteBuffer byteBuffer = this.S;
            if (byteBuffer == null) {
                return true;
            }
            v(byteBuffer, Long.MIN_VALUE);
            if (this.S != null) {
                return false;
            }
            return true;
        }
        C5261a c5261a = this.f486w;
        if (c5261a.e() && !c5261a.f43660d) {
            c5261a.f43660d = true;
            ((AbstractC5264d) c5261a.f43658b.get(0)).f();
        }
        r(Long.MIN_VALUE);
        if (!this.f486w.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final void e() {
        if (n()) {
            this.f441H = 0L;
            this.f442I = 0L;
            this.f443J = 0L;
            this.f444K = 0L;
            this.f469g0 = false;
            this.f445L = 0;
            this.f436C = new L(this.f437D, 0L, 0L);
            this.f448O = 0L;
            this.f435B = null;
            this.f473j.clear();
            this.Q = null;
            this.f449R = 0;
            this.S = null;
            this.f452W = false;
            this.f451V = false;
            this.f439F = null;
            this.f440G = 0;
            this.f464e.f534o = 0L;
            C5261a c5261a = this.f485v.f412i;
            this.f486w = c5261a;
            c5261a.b();
            AudioTrack audioTrack = this.f472i.f611c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f487x.pause();
            }
            if (o(this.f487x)) {
                Q q10 = this.f476m;
                q10.getClass();
                this.f487x.unregisterStreamEventCallback(q10.f429b);
                q10.f428a.removeCallbacksAndMessages(null);
            }
            if (AbstractC5530A.f45131a < 21 && !this.f454Y) {
                this.f455Z = 0;
            }
            this.f485v.getClass();
            Object obj = new Object();
            J j6 = this.f484u;
            if (j6 != null) {
                this.f485v = j6;
                this.f484u = null;
            }
            C0078w c0078w = this.f472i;
            c0078w.d();
            c0078w.f611c = null;
            c0078w.f614f = null;
            AudioTrack audioTrack2 = this.f487x;
            C1745x0 c1745x0 = this.f470h;
            F4.a aVar = this.f483t;
            c1745x0.c();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f431i0) {
                try {
                    if (f432j0 == null) {
                        f432j0 = Executors.newSingleThreadExecutor(new ThreadFactoryC1173a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f433k0++;
                    f432j0.execute(new B(audioTrack2, aVar, handler, obj, c1745x0, 0));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f487x = null;
        }
        this.f478o.f422a = null;
        this.f477n.f422a = null;
    }

    public final C0059c f() {
        Context context;
        C0059c c0059c;
        C6503F c6503f;
        if (this.f489z == null && (context = this.f456a) != null) {
            this.f471h0 = Looper.myLooper();
            C0062f c0062f = new C0062f(context, new C(this));
            this.f489z = c0062f;
            if (c0062f.f550h) {
                c0059c = c0062f.f549g;
                c0059c.getClass();
            } else {
                c0062f.f550h = true;
                C0061e c0061e = c0062f.f548f;
                if (c0061e != null) {
                    c0061e.f540a.registerContentObserver(c0061e.f541b, false, c0061e);
                }
                int i10 = AbstractC5530A.f45131a;
                Handler handler = c0062f.f545c;
                Context context2 = c0062f.f543a;
                if (i10 >= 23 && (c6503f = c0062f.f546d) != null) {
                    AbstractC0060d.a(context2, c6503f, handler);
                }
                C4507D c4507d = c0062f.f547e;
                Intent intent = null;
                if (c4507d != null) {
                    intent = context2.registerReceiver(c4507d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                c0059c = C0059c.c(context2, intent);
                c0062f.f549g = c0059c;
            }
            this.f488y = c0059c;
        }
        return this.f488y;
    }

    public final C0064h g(C5065s c5065s) {
        int i10;
        boolean z10;
        boolean z11;
        if (this.f467f0) {
            return C0064h.f554d;
        }
        C5052e c5052e = this.f434A;
        A a5 = this.f480q;
        a5.getClass();
        c5065s.getClass();
        c5052e.getClass();
        int i11 = AbstractC5530A.f45131a;
        if (i11 >= 29 && (i10 = c5065s.f42298E0) != -1) {
            Boolean bool = a5.f382b;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                Context context = a5.f381a;
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a5.f382b = Boolean.valueOf(z11);
                    } else {
                        a5.f382b = Boolean.FALSE;
                    }
                } else {
                    a5.f382b = Boolean.FALSE;
                }
                z10 = a5.f382b.booleanValue();
            }
            String str = c5065s.f42319q0;
            str.getClass();
            int b10 = p2.N.b(str, c5065s.f42316n0);
            if (b10 != 0 && i11 >= AbstractC5530A.n(b10)) {
                int p10 = AbstractC5530A.p(c5065s.f42297D0);
                if (p10 == 0) {
                    return C0064h.f554d;
                }
                try {
                    AudioFormat o10 = AbstractC5530A.o(i10, p10, b10);
                    if (i11 >= 31) {
                        return AbstractC0081z.a(o10, (AudioAttributes) c5052e.b().f8729Y, z10);
                    }
                    return AbstractC0080y.a(o10, (AudioAttributes) c5052e.b().f8729Y, z10);
                } catch (IllegalArgumentException unused) {
                    return C0064h.f554d;
                }
            }
            return C0064h.f554d;
        }
        return C0064h.f554d;
    }

    public final int h(C5065s c5065s) {
        if ("audio/raw".equals(c5065s.f42319q0)) {
            int i10 = c5065s.f42299F0;
            if (!AbstractC5530A.z(i10)) {
                s2.p.g("DefaultAudioSink", "Invalid PCM encoding: " + i10);
                return 0;
            } else if (i10 == 2 || (this.f460c && i10 == 4)) {
                return 2;
            } else {
                return 1;
            }
        } else if (f().d(c5065s) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    public final long i() {
        J j6 = this.f485v;
        if (j6.f406c == 0) {
            return this.f441H / j6.f405b;
        }
        return this.f442I;
    }

    public final long j() {
        J j6 = this.f485v;
        if (j6.f406c == 0) {
            long j10 = this.f443J;
            long j11 = j6.f407d;
            int i10 = AbstractC5530A.f45131a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f444K;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
        if (r9.b() == 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(ByteBuffer byteBuffer, long j6, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        byte b10;
        int i14;
        byte b11;
        int i15;
        int i16;
        int i17;
        boolean z12;
        int i18;
        int i19;
        byte b12;
        ByteBuffer byteBuffer2 = this.Q;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.l(z10);
        J j10 = this.f484u;
        int i20 = 3;
        C0078w c0078w = this.f472i;
        if (j10 != null) {
            if (!d()) {
                return false;
            }
            J j11 = this.f484u;
            J j12 = this.f485v;
            j11.getClass();
            if (j12.f406c == j11.f406c && j12.f410g == j11.f410g && j12.f408e == j11.f408e && j12.f409f == j11.f409f && j12.f407d == j11.f407d && j12.f413j == j11.f413j && j12.f414k == j11.f414k) {
                this.f485v = this.f484u;
                this.f484u = null;
                AudioTrack audioTrack = this.f487x;
                if (audioTrack != null && o(audioTrack) && this.f485v.f414k) {
                    if (this.f487x.getPlayState() == 3) {
                        this.f487x.setOffloadEndOfStream();
                        c0078w.f606H = true;
                    }
                    AudioTrack audioTrack2 = this.f487x;
                    C5065s c5065s = this.f485v.f404a;
                    audioTrack2.setOffloadDelayPadding(c5065s.f42300G0, c5065s.f42301H0);
                    this.f469g0 = true;
                }
            } else {
                q();
                if (l()) {
                    return false;
                }
                e();
            }
            a(j6);
        }
        boolean n10 = n();
        M m10 = this.f477n;
        if (!n10) {
            try {
                if (!m()) {
                    return false;
                }
            } catch (C0073q e10) {
                if (!e10.f584Z) {
                    m10.a(e10);
                    return false;
                }
                throw e10;
            }
        }
        m10.f422a = null;
        if (this.f447N) {
            this.f448O = Math.max(0L, j6);
            this.f446M = false;
            this.f447N = false;
            if (u()) {
                t();
            }
            a(j6);
            if (this.f453X) {
                p();
            }
        }
        long j13 = j();
        AudioTrack audioTrack3 = c0078w.f611c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (c0078w.f616h) {
            if (playState == 2) {
                c0078w.f624p = false;
            } else if (playState == 1) {
            }
            return false;
        }
        boolean z13 = c0078w.f624p;
        boolean c10 = c0078w.c(j13);
        c0078w.f624p = c10;
        if (z13 && !c10 && playState != 1) {
            int i21 = c0078w.f613e;
            long L10 = AbstractC5530A.L(c0078w.f617i);
            S s10 = c0078w.f609a.f424a;
            if (s10.f483t != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - s10.f465e0;
                U3.l lVar = ((V) s10.f483t.f5033Z).f498M1;
                Handler handler = (Handler) lVar.f17423Z;
                if (handler != null) {
                    handler.post(new RunnableC0069m(lVar, i21, L10, elapsedRealtime, 0));
                }
            }
        }
        if (this.Q == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z11 = true;
            } else {
                z11 = false;
            }
            Gi.e.l(z11);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            J j14 = this.f485v;
            if (j14.f406c != 0 && this.f445L == 0) {
                int i22 = j14.f410g;
                switch (i22) {
                    case 5:
                    case 6:
                    case 18:
                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                                i20 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
                            }
                            i12 = AbstractC0881b.f10552c[i20] * 256;
                        } else {
                            i12 = 1536;
                        }
                        i11 = i12;
                        break;
                    case 7:
                    case 8:
                        if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                i11 = 4096;
                                break;
                            } else {
                                int position = byteBuffer.position();
                                byte b13 = byteBuffer.get(position);
                                if (b13 != -2) {
                                    if (b13 != -1) {
                                        if (b13 != 31) {
                                            i13 = (byteBuffer.get(position + 4) & 1) << 6;
                                            b10 = byteBuffer.get(position + 5);
                                        } else {
                                            i13 = (byteBuffer.get(position + 5) & 7) << 4;
                                            b11 = byteBuffer.get(position + 6);
                                        }
                                    } else {
                                        i13 = (byteBuffer.get(position + 4) & 7) << 4;
                                        b11 = byteBuffer.get(position + 7);
                                    }
                                    i14 = b11 & 60;
                                    i11 = (((i14 >> 2) | i13) + 1) * 32;
                                    break;
                                } else {
                                    i13 = (byteBuffer.get(position + 5) & 1) << 6;
                                    b10 = byteBuffer.get(position + 4);
                                }
                                i14 = b10 & 252;
                                i11 = (((i14 >> 2) | i13) + 1) * 32;
                            }
                        }
                        i11 = 1024;
                        break;
                    case 9:
                        int i23 = byteBuffer.getInt(byteBuffer.position());
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            i23 = Integer.reverseBytes(i23);
                        }
                        if ((i23 & (-2097152)) == -2097152 && (i15 = (i23 >>> 19) & 3) != 1 && (i16 = (i23 >>> 17) & 3) != 0) {
                            int i24 = (i23 >>> 12) & 15;
                            int i25 = (i23 >>> 10) & 3;
                            if (i24 != 0 && i24 != 15 && i25 != 3) {
                                i12 = 1152;
                                if (i16 != 1) {
                                    if (i16 != 2) {
                                        if (i16 == 3) {
                                            i12 = 384;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                } else if (i15 != 3) {
                                    i12 = 576;
                                }
                                if (i12 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                i11 = i12;
                                break;
                            }
                        }
                        i12 = -1;
                        if (i12 == -1) {
                        }
                        i11 = i12;
                        break;
                    case 10:
                    case 16:
                        i11 = 1024;
                        break;
                    case 11:
                    case 12:
                        i11 = 2048;
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected audio encoding: ", i22));
                    case 14:
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i26 = position2;
                        while (true) {
                            if (i26 <= limit) {
                                int i27 = byteBuffer.getInt(i26 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    i27 = Integer.reverseBytes(i27);
                                }
                                if ((i27 & (-2)) == -126718022) {
                                    i17 = i26 - position2;
                                } else {
                                    i26++;
                                }
                            } else {
                                i17 = -1;
                            }
                        }
                        if (i17 == -1) {
                            i11 = 0;
                            break;
                        } else {
                            if ((byteBuffer.get(byteBuffer.position() + i17 + 7) & 255) == 187) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int position3 = byteBuffer.position() + i17;
                            if (z12) {
                                i18 = 9;
                            } else {
                                i18 = 8;
                            }
                            i12 = (40 << ((byteBuffer.get(position3 + i18) >> 4) & 7)) * 16;
                            i11 = i12;
                            break;
                        }
                    case 15:
                        i11 = 512;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int position4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position4);
                        i11 = AbstractC0881b.e(new s2.t(bArr, 0)).f36965e;
                        break;
                    case 20:
                        if ((byteBuffer.get(5) & 2) == 0) {
                            i19 = 0;
                        } else {
                            byte b14 = byteBuffer.get(26);
                            int i28 = 28;
                            int i29 = 28;
                            for (int i30 = 0; i30 < b14; i30++) {
                                i29 += byteBuffer.get(i30 + 27);
                            }
                            byte b15 = byteBuffer.get(i29 + 26);
                            for (int i31 = 0; i31 < b15; i31++) {
                                i28 += byteBuffer.get(i29 + 27 + i31);
                            }
                            i19 = i29 + i28;
                        }
                        int i32 = byteBuffer.get(i19 + 26) + 27 + i19;
                        byte b16 = byteBuffer.get(i32);
                        if (byteBuffer.limit() - i32 > 1) {
                            b12 = byteBuffer.get(i32 + 1);
                        } else {
                            b12 = 0;
                        }
                        i11 = (int) ((AbstractC2279d.o(b16, b12) * 48000) / 1000000);
                        break;
                }
                this.f445L = i11;
                if (i11 == 0) {
                    return true;
                }
            }
            if (this.f435B != null) {
                if (!d()) {
                    return false;
                }
                a(j6);
                this.f435B = null;
            }
            long G10 = AbstractC5530A.G(this.f485v.f404a.f42298E0, i() - this.f464e.f534o) + this.f448O;
            if (!this.f446M && Math.abs(G10 - j6) > 200000) {
                F4.a aVar = this.f483t;
                if (aVar != null) {
                    aVar.j(new Exception("Unexpected audio track timestamp discontinuity: expected " + G10 + ", got " + j6));
                }
                this.f446M = true;
            }
            if (this.f446M) {
                if (!d()) {
                    return false;
                }
                long j15 = j6 - G10;
                this.f448O += j15;
                this.f446M = false;
                a(j6);
                F4.a aVar2 = this.f483t;
                if (aVar2 != null && j15 != 0) {
                    ((V) aVar2.f5033Z).f505V1 = true;
                }
            }
            if (this.f485v.f406c == 0) {
                this.f441H += byteBuffer.remaining();
            } else {
                this.f442I = (this.f445L * i10) + this.f442I;
            }
            this.Q = byteBuffer;
            this.f449R = i10;
        }
        r(j6);
        if (!this.Q.hasRemaining()) {
            this.Q = null;
            this.f449R = 0;
            return true;
        }
        long j16 = j();
        if (c0078w.f634z != -9223372036854775807L && j16 > 0) {
            ((s2.w) c0078w.f608J).getClass();
            if (SystemClock.elapsedRealtime() - c0078w.f634z >= 200) {
                s2.p.g("DefaultAudioSink", "Resetting stalled audio track");
                e();
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        if (n() && this.f472i.c(j())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Type inference failed for: r4v7, types: [R4.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean z10;
        AudioTrack audioTrack;
        boolean z11;
        boolean z12;
        long j6;
        C6755D c6755d;
        C1745x0 c1745x0 = this.f470h;
        synchronized (c1745x0) {
            z10 = c1745x0.f22767a;
        }
        if (!z10) {
            return false;
        }
        try {
            J j10 = this.f485v;
            j10.getClass();
            audioTrack = b(j10);
        } catch (C0073q e10) {
            J j11 = this.f485v;
            if (j11.f411h > 1000000) {
                J j12 = new J(j11.f404a, j11.f405b, j11.f406c, j11.f407d, j11.f408e, j11.f409f, j11.f410g, UtilsKt.MICROS_MULTIPLIER, j11.f412i, j11.f413j, j11.f414k, j11.f415l);
                try {
                    audioTrack = b(j12);
                    this.f485v = j12;
                } catch (C0073q e11) {
                    e10.addSuppressed(e11);
                    if (this.f485v.f406c == 1) {
                        this.f467f0 = true;
                    }
                    throw e10;
                }
            }
            if (this.f485v.f406c == 1) {
            }
            throw e10;
        }
        this.f487x = audioTrack;
        if (o(audioTrack)) {
            AudioTrack audioTrack2 = this.f487x;
            if (this.f476m == null) {
                this.f476m = new Q(this);
            }
            Q q10 = this.f476m;
            Handler handler = q10.f428a;
            Objects.requireNonNull(handler);
            audioTrack2.registerStreamEventCallback(new O(0, handler), q10.f429b);
            J j13 = this.f485v;
            if (j13.f414k) {
                AudioTrack audioTrack3 = this.f487x;
                C5065s c5065s = j13.f404a;
                audioTrack3.setOffloadDelayPadding(c5065s.f42300G0, c5065s.f42301H0);
            }
        }
        int i10 = AbstractC5530A.f45131a;
        if (i10 >= 31 && (c6755d = this.f482s) != null) {
            F.a(this.f487x, c6755d);
        }
        this.f455Z = this.f487x.getAudioSessionId();
        AudioTrack audioTrack4 = this.f487x;
        J j14 = this.f485v;
        if (j14.f406c == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = j14.f410g;
        int i12 = j14.f407d;
        int i13 = j14.f411h;
        C0078w c0078w = this.f472i;
        c0078w.f611c = audioTrack4;
        c0078w.f612d = i12;
        c0078w.f613e = i13;
        c0078w.f614f = new C0077v(audioTrack4);
        c0078w.f615g = audioTrack4.getSampleRate();
        if (z11 && i10 < 23 && (i11 == 5 || i11 == 6)) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0078w.f616h = z12;
        boolean z13 = AbstractC5530A.z(i11);
        c0078w.f625q = z13;
        if (z13) {
            j6 = AbstractC5530A.G(c0078w.f615g, i13 / i12);
        } else {
            j6 = -9223372036854775807L;
        }
        c0078w.f617i = j6;
        c0078w.f628t = 0L;
        c0078w.f629u = 0L;
        c0078w.f606H = false;
        c0078w.f607I = 0L;
        c0078w.f630v = 0L;
        c0078w.f624p = false;
        c0078w.f633y = -9223372036854775807L;
        c0078w.f634z = -9223372036854775807L;
        c0078w.f626r = 0L;
        c0078w.f623o = 0L;
        c0078w.f618j = 1.0f;
        if (n()) {
            if (i10 >= 21) {
                this.f487x.setVolume(this.P);
            } else {
                AudioTrack audioTrack5 = this.f487x;
                float f6 = this.P;
                audioTrack5.setStereoVolume(f6, f6);
            }
        }
        this.f457a0.getClass();
        G g10 = this.f459b0;
        if (g10 != null && i10 >= 23) {
            E.a(this.f487x, g10);
        }
        this.f447N = true;
        F4.a aVar = this.f483t;
        if (aVar != null) {
            this.f485v.getClass();
            ?? obj = new Object();
            U3.l lVar = ((V) aVar.f5033Z).f498M1;
            Handler handler2 = (Handler) lVar.f17423Z;
            if (handler2 != null) {
                handler2.post(new RunnableC0071o(lVar, obj, 0));
            }
        }
        return true;
    }

    public final boolean n() {
        if (this.f487x != null) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.f453X = true;
        if (n()) {
            C0078w c0078w = this.f472i;
            if (c0078w.f633y != -9223372036854775807L) {
                ((s2.w) c0078w.f608J).getClass();
                c0078w.f633y = AbstractC5530A.C(SystemClock.elapsedRealtime());
            }
            C0077v c0077v = c0078w.f614f;
            c0077v.getClass();
            c0077v.a();
            this.f487x.play();
        }
    }

    public final void q() {
        if (!this.f452W) {
            this.f452W = true;
            long j6 = j();
            C0078w c0078w = this.f472i;
            c0078w.f599A = c0078w.b();
            ((s2.w) c0078w.f608J).getClass();
            c0078w.f633y = AbstractC5530A.C(SystemClock.elapsedRealtime());
            c0078w.f600B = j6;
            this.f487x.stop();
            this.f440G = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r0 = r3.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r0.hasRemaining() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        r0 = r3.f486w;
        r1 = r3.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r0.e() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r0.f43660d == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
        r0.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(long j6) {
        ByteBuffer byteBuffer;
        if (!this.f486w.e()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = AbstractC5264d.f43666a;
            }
            v(byteBuffer2, j6);
            return;
        }
        while (!this.f486w.d()) {
            while (true) {
                C5261a c5261a = this.f486w;
                if (!c5261a.e()) {
                    byteBuffer = AbstractC5264d.f43666a;
                } else {
                    ByteBuffer byteBuffer3 = c5261a.f43659c[c5261a.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c5261a.f(AbstractC5264d.f43666a);
                        byteBuffer = c5261a.f43659c[c5261a.c()];
                    }
                }
                if (!byteBuffer.hasRemaining()) {
                    break;
                }
                v(byteBuffer, j6);
                if (byteBuffer.hasRemaining()) {
                    return;
                }
            }
        }
    }

    public final void s() {
        e();
        x8.L listIterator = this.f466f.listIterator(0);
        while (listIterator.hasNext()) {
            ((AbstractC5264d) listIterator.next()).b();
        }
        x8.L listIterator2 = this.f468g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((AbstractC5264d) listIterator2.next()).b();
        }
        C5261a c5261a = this.f486w;
        if (c5261a != null) {
            c5261a.g();
        }
        this.f453X = false;
        this.f467f0 = false;
    }

    public final void t() {
        if (n()) {
            try {
                this.f487x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f437D.f41934Y).setPitch(this.f437D.f41935Z).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                s2.p.h("DefaultAudioSink", "Failed to set playback params", e10);
            }
            p2.S s10 = new p2.S(this.f487x.getPlaybackParams().getSpeed(), this.f487x.getPlaybackParams().getPitch());
            this.f437D = s10;
            C0078w c0078w = this.f472i;
            c0078w.f618j = s10.f41934Y;
            C0077v c0077v = c0078w.f614f;
            if (c0077v != null) {
                c0077v.a();
            }
            c0078w.d();
        }
    }

    public final boolean u() {
        J j6 = this.f485v;
        if (j6 != null && j6.f413j && AbstractC5530A.f45131a >= 23) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ee, code lost:
        if (r15 < r14) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(ByteBuffer byteBuffer, long j6) {
        int i10;
        F4.a aVar;
        C6505H c6505h;
        C0074s c0074s;
        F4.a aVar2;
        boolean z10;
        boolean z11;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.S;
        boolean z12 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z11 = true;
            } else {
                z11 = false;
            }
            Gi.e.l(z11);
        } else {
            this.S = byteBuffer;
            if (AbstractC5530A.f45131a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.T;
                if (bArr == null || bArr.length < remaining) {
                    this.T = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.T, 0, remaining);
                byteBuffer.position(position);
                this.f450U = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i11 = AbstractC5530A.f45131a;
        if (i11 < 21) {
            long j10 = this.f443J;
            C0078w c0078w = this.f472i;
            int b10 = c0078w.f613e - ((int) (j10 - (c0078w.b() * c0078w.f612d)));
            if (b10 > 0) {
                i10 = this.f487x.write(this.T, this.f450U, Math.min(remaining2, b10));
                if (i10 > 0) {
                    this.f450U += i10;
                    byteBuffer.position(byteBuffer.position() + i10);
                }
                this.f465e0 = SystemClock.elapsedRealtime();
                M m10 = this.f478o;
                if (i10 < 0) {
                    if ((i11 >= 24 && i10 == -6) || i10 == -32) {
                        if (j() <= 0) {
                            if (o(this.f487x)) {
                                if (this.f485v.f406c == 1) {
                                    this.f467f0 = true;
                                }
                            }
                        }
                        c0074s = new C0074s(i10, this.f485v.f404a, z12);
                        aVar2 = this.f483t;
                        if (aVar2 != null) {
                            aVar2.j(c0074s);
                        }
                        if (c0074s.f586Z) {
                            m10.a(c0074s);
                            return;
                        } else {
                            this.f488y = C0059c.f535c;
                            throw c0074s;
                        }
                    }
                    z12 = false;
                    c0074s = new C0074s(i10, this.f485v.f404a, z12);
                    aVar2 = this.f483t;
                    if (aVar2 != null) {
                    }
                    if (c0074s.f586Z) {
                    }
                } else {
                    m10.f422a = null;
                    if (o(this.f487x)) {
                        if (this.f444K > 0) {
                            this.f469g0 = false;
                        }
                        if (this.f453X && (aVar = this.f483t) != null && i10 < remaining2 && !this.f469g0 && (c6505h = ((V) aVar.f5033Z).f507X1) != null) {
                            c6505h.f50388a.f50421M0 = true;
                        }
                    }
                    int i12 = this.f485v.f406c;
                    if (i12 == 0) {
                        this.f443J += i10;
                    }
                    if (i10 == remaining2) {
                        if (i12 != 0) {
                            if (byteBuffer != this.Q) {
                                z12 = false;
                            }
                            Gi.e.n(z12);
                            this.f444K = (this.f445L * this.f449R) + this.f444K;
                        }
                        this.S = null;
                        return;
                    }
                    return;
                }
            }
            i10 = 0;
            this.f465e0 = SystemClock.elapsedRealtime();
            M m102 = this.f478o;
            if (i10 < 0) {
            }
        } else {
            if (this.f461c0) {
                if (j6 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Gi.e.n(z10);
                if (j6 == Long.MIN_VALUE) {
                    j6 = this.f463d0;
                } else {
                    this.f463d0 = j6;
                }
                AudioTrack audioTrack = this.f487x;
                if (i11 >= 26) {
                    i10 = audioTrack.write(byteBuffer, remaining2, 1, j6 * 1000);
                } else {
                    if (this.f439F == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f439F = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f439F.putInt(1431633921);
                    }
                    if (this.f440G == 0) {
                        this.f439F.putInt(4, remaining2);
                        this.f439F.putLong(8, j6 * 1000);
                        this.f439F.position(0);
                        this.f440G = remaining2;
                    }
                    int remaining3 = this.f439F.remaining();
                    if (remaining3 > 0) {
                        int write = audioTrack.write(this.f439F, remaining3, 1);
                        if (write < 0) {
                            this.f440G = 0;
                            i10 = write;
                        }
                    }
                    i10 = audioTrack.write(byteBuffer, remaining2, 1);
                    if (i10 < 0) {
                        this.f440G = 0;
                    } else {
                        this.f440G -= i10;
                    }
                }
            } else {
                i10 = this.f487x.write(byteBuffer, remaining2, 1);
            }
            this.f465e0 = SystemClock.elapsedRealtime();
            M m1022 = this.f478o;
            if (i10 < 0) {
            }
        }
    }
}
