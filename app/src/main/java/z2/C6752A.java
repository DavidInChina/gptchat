package z2;

import A2.C0073q;
import A2.C0074s;
import B2.C0205f;
import B2.H;
import D1.C0373t;
import E2.C0492y;
import N.C1025i;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import p2.AbstractC5058k;
import p2.C5063p;
import p2.C5064q;
import p2.C5065s;
import p2.O;
import p2.Q;
import p2.X;
import p2.e0;
import p2.f0;
import p2.g0;
import p2.n0;
import p2.o0;
import s2.AbstractC5530A;
import v2.G;
import x8.L;
import y2.C6504G;
import y2.C6527n;

/* renamed from: z2.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6752A implements AbstractC6758c, AbstractC6753B {

    /* renamed from: A  reason: collision with root package name */
    public boolean f51461A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f51462a;

    /* renamed from: b  reason: collision with root package name */
    public final y f51463b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaybackSession f51464c;

    /* renamed from: i  reason: collision with root package name */
    public String f51470i;

    /* renamed from: j  reason: collision with root package name */
    public PlaybackMetrics.Builder f51471j;

    /* renamed from: k  reason: collision with root package name */
    public int f51472k;

    /* renamed from: n  reason: collision with root package name */
    public Q f51475n;

    /* renamed from: o  reason: collision with root package name */
    public C1025i f51476o;

    /* renamed from: p  reason: collision with root package name */
    public C1025i f51477p;

    /* renamed from: q  reason: collision with root package name */
    public C1025i f51478q;

    /* renamed from: r  reason: collision with root package name */
    public C5065s f51479r;

    /* renamed from: s  reason: collision with root package name */
    public C5065s f51480s;

    /* renamed from: t  reason: collision with root package name */
    public C5065s f51481t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f51482u;

    /* renamed from: v  reason: collision with root package name */
    public int f51483v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f51484w;

    /* renamed from: x  reason: collision with root package name */
    public int f51485x;

    /* renamed from: y  reason: collision with root package name */
    public int f51486y;

    /* renamed from: z  reason: collision with root package name */
    public int f51487z;

    /* renamed from: e  reason: collision with root package name */
    public final f0 f51466e = new f0();

    /* renamed from: f  reason: collision with root package name */
    public final e0 f51467f = new e0();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f51469h = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f51468g = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final long f51465d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    public int f51473l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f51474m = 0;

    public C6752A(Context context, PlaybackSession playbackSession) {
        this.f51462a = context.getApplicationContext();
        this.f51464c = playbackSession;
        y yVar = new y();
        this.f51463b = yVar;
        yVar.f51557d = this;
    }

    public final boolean a(C1025i c1025i) {
        String str;
        if (c1025i != null) {
            String str2 = (String) c1025i.f12352i0;
            y yVar = this.f51463b;
            synchronized (yVar) {
                str = yVar.f51559f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long j6;
        long j10;
        int i10;
        PlaybackMetrics.Builder builder = this.f51471j;
        if (builder != null && this.f51461A) {
            z.i(builder, this.f51487z);
            z.q(this.f51471j, this.f51485x);
            z.u(this.f51471j, this.f51486y);
            Long l10 = (Long) this.f51468g.get(this.f51470i);
            PlaybackMetrics.Builder builder2 = this.f51471j;
            if (l10 == null) {
                j6 = 0;
            } else {
                j6 = l10.longValue();
            }
            z.j(builder2, j6);
            Long l11 = (Long) this.f51469h.get(this.f51470i);
            PlaybackMetrics.Builder builder3 = this.f51471j;
            if (l11 == null) {
                j10 = 0;
            } else {
                j10 = l11.longValue();
            }
            z.r(builder3, j10);
            PlaybackMetrics.Builder builder4 = this.f51471j;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            z.x(builder4, i10);
            z.k(this.f51464c, z.d(this.f51471j));
        }
        this.f51471j = null;
        this.f51470i = null;
        this.f51487z = 0;
        this.f51485x = 0;
        this.f51486y = 0;
        this.f51479r = null;
        this.f51480s = null;
        this.f51481t = null;
        this.f51461A = false;
    }

    public final void c(g0 g0Var, C0492y c0492y) {
        int c10;
        PlaybackMetrics.Builder builder = this.f51471j;
        if (c0492y == null || (c10 = g0Var.c(c0492y.f4420a)) == -1) {
            return;
        }
        e0 e0Var = this.f51467f;
        int i10 = 0;
        g0Var.h(c10, e0Var, false);
        int i11 = e0Var.f42024h0;
        f0 f0Var = this.f51466e;
        g0Var.p(i11, f0Var);
        p2.C c11 = f0Var.f42047h0.f41808Z;
        int i12 = 2;
        if (c11 != null) {
            int y10 = AbstractC5530A.y(c11.f41760Y, c11.f41761Z);
            if (y10 != 0) {
                if (y10 != 1) {
                    if (y10 != 2) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 3;
            }
        }
        z.z(builder, i10);
        if (f0Var.f42058s0 != -9223372036854775807L && !f0Var.f42056q0 && !f0Var.f42053n0 && !f0Var.b()) {
            z.v(builder, AbstractC5530A.L(f0Var.f42058s0));
        }
        if (!f0Var.b()) {
            i12 = 1;
        }
        z.A(builder, i12);
        this.f51461A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:386:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(X x10, U3.e eVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C6504G c6504g;
        int i20;
        int i21;
        int i22;
        int i23;
        C5065s c5065s;
        int i24;
        int i25;
        int i26;
        boolean z10;
        C0373t c0373t;
        boolean z11;
        int i27;
        int i28;
        int i29;
        char c10;
        C5063p c5063p;
        int i30;
        if (((C5064q) eVar.f17400Y).f42219a.size() == 0) {
            return;
        }
        for (int i31 = 0; i31 < ((C5064q) eVar.f17400Y).f42219a.size(); i31++) {
            int a5 = ((C5064q) eVar.f17400Y).a(i31);
            C6757b c6757b = (C6757b) ((SparseArray) eVar.f17401Z).get(a5);
            c6757b.getClass();
            if (a5 == 0) {
                y yVar = this.f51463b;
                synchronized (yVar) {
                    try {
                        yVar.f51557d.getClass();
                        g0 g0Var = yVar.f51558e;
                        yVar.f51558e = c6757b.f51492b;
                        Iterator it = yVar.f51556c.values().iterator();
                        while (it.hasNext()) {
                            x xVar = (x) it.next();
                            if (xVar.b(g0Var, yVar.f51558e) && !xVar.a(c6757b)) {
                            }
                            it.remove();
                            if (xVar.f51549e) {
                                if (xVar.f51545a.equals(yVar.f51559f)) {
                                    yVar.a(xVar);
                                }
                                ((C6752A) yVar.f51557d).e(c6757b, xVar.f51545a);
                            }
                        }
                        yVar.e(c6757b);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (a5 == 11) {
                this.f51463b.g(c6757b, this.f51472k);
            } else {
                this.f51463b.f(c6757b);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (eVar.c(0)) {
            C6757b c6757b2 = (C6757b) ((SparseArray) eVar.f17401Z).get(0);
            c6757b2.getClass();
            if (this.f51471j != null) {
                c(c6757b2.f51492b, c6757b2.f51494d);
            }
        }
        if (eVar.c(2) && this.f51471j != null) {
            C6504G c6504g2 = (C6504G) x10;
            c6504g2.E();
            L listIterator = c6504g2.f50360W.f50544i.f7340d.f42213Y.listIterator(0);
            loop2: while (true) {
                if (listIterator.hasNext()) {
                    n0 n0Var = (n0) listIterator.next();
                    for (int i32 = 0; i32 < n0Var.f42201Y; i32++) {
                        if (n0Var.f42205j0[i32] && (c5063p = n0Var.f42202Z.f42075i0[i32].f42322t0) != null) {
                            break loop2;
                        }
                    }
                } else {
                    c5063p = null;
                    break;
                }
            }
            if (c5063p != null) {
                PlaybackMetrics.Builder builder = this.f51471j;
                int i33 = AbstractC5530A.f45131a;
                int i34 = 0;
                while (true) {
                    if (i34 < c5063p.f42217i0) {
                        UUID uuid = c5063p.f42214Y[i34].f42207Z;
                        if (uuid.equals(AbstractC5058k.f42087d)) {
                            i30 = 3;
                            break;
                        } else if (uuid.equals(AbstractC5058k.f42088e)) {
                            i30 = 2;
                            break;
                        } else if (uuid.equals(AbstractC5058k.f42086c)) {
                            i30 = 6;
                            break;
                        } else {
                            i34++;
                        }
                    } else {
                        i30 = 1;
                        break;
                    }
                }
                builder.setDrmType(i30);
            }
        }
        if (eVar.c(1011)) {
            this.f51487z++;
        }
        Q q10 = this.f51475n;
        if (q10 == null) {
            i14 = 2;
            i13 = 13;
            i12 = 6;
            i11 = 7;
            i10 = 9;
        } else {
            if (this.f51483v == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i35 = q10.f41929Y;
            if (i35 == 1001) {
                c0373t = new C0373t(20, 0);
                i13 = 13;
                i12 = 6;
                i11 = 7;
                i10 = 9;
            } else {
                if (q10 instanceof C6527n) {
                    C6527n c6527n = (C6527n) q10;
                    if (c6527n.f50667m0 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i27 = c6527n.f50671q0;
                } else {
                    i27 = 0;
                    z11 = false;
                }
                Throwable cause = q10.getCause();
                cause.getClass();
                int i36 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof v2.y) {
                        c0373t = new C0373t(5, ((v2.y) cause).f47143i0);
                    } else {
                        if (!(cause instanceof v2.x) && !(cause instanceof O)) {
                            boolean z12 = cause instanceof v2.w;
                            if (z12 || (cause instanceof G)) {
                                i29 = 9;
                                if (s2.s.c(this.f51462a).d() == 1) {
                                    c0373t = new C0373t(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        c0373t = new C0373t(6, 0);
                                        i10 = 9;
                                        i12 = 6;
                                        i13 = 13;
                                        i11 = 7;
                                    } else if (cause2 instanceof SocketTimeoutException) {
                                        c0373t = new C0373t(7, 0);
                                        i10 = 9;
                                        i11 = 7;
                                        i12 = 6;
                                        i13 = 13;
                                    } else {
                                        if (z12 && ((v2.w) cause).f47142h0 == 1) {
                                            c10 = 4;
                                            c0373t = new C0373t(4, 0);
                                        } else {
                                            c10 = 4;
                                            c0373t = new C0373t(8, 0);
                                        }
                                        i10 = 9;
                                        i11 = 7;
                                        i12 = 6;
                                    }
                                }
                            } else if (i35 == 1002) {
                                c0373t = new C0373t(21, 0);
                            } else if (cause instanceof B2.j) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                int i37 = AbstractC5530A.f45131a;
                                if (i37 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                    int r10 = AbstractC5530A.r(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (AbstractC5530A.q(r10)) {
                                        case 6002:
                                            i36 = 24;
                                            break;
                                        case 6003:
                                            i36 = 28;
                                            break;
                                        case 6004:
                                            i36 = 25;
                                            break;
                                        case 6005:
                                            i36 = 26;
                                            break;
                                    }
                                    c0373t = new C0373t(i36, r10);
                                } else if (i37 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                    c0373t = new C0373t(27, 0);
                                } else if (i37 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                    c0373t = new C0373t(24, 0);
                                } else if (i37 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                    c0373t = new C0373t(29, 0);
                                } else if (cause3 instanceof H) {
                                    c0373t = new C0373t(23, 0);
                                } else if (cause3 instanceof C0205f) {
                                    c0373t = new C0373t(28, 0);
                                } else {
                                    c0373t = new C0373t(30, 0);
                                }
                            } else if ((cause instanceof v2.t) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                if (AbstractC5530A.f45131a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                    c0373t = new C0373t(32, 0);
                                } else {
                                    c0373t = new C0373t(31, 0);
                                }
                            } else {
                                i29 = 9;
                                c0373t = new C0373t(9, 0);
                            }
                            i10 = i29;
                            i13 = 13;
                            i12 = 6;
                            i11 = 7;
                        } else {
                            if (z10) {
                                i28 = 10;
                            } else {
                                i28 = 11;
                            }
                            i10 = 9;
                            i11 = 7;
                            i12 = 6;
                            c0373t = new C0373t(i28, 0);
                        }
                        i13 = 13;
                    }
                    i13 = 13;
                    i12 = 6;
                    i11 = 7;
                    i10 = 9;
                } else {
                    int i38 = 28;
                    i12 = 6;
                    i11 = 7;
                    i10 = 9;
                    if (z11 && (i27 == 0 || i27 == 1)) {
                        c0373t = new C0373t(35, 0);
                    } else if (z11 && i27 == 3) {
                        c0373t = new C0373t(15, 0);
                    } else if (z11 && i27 == 2) {
                        c0373t = new C0373t(23, 0);
                    } else if (cause instanceof C2.o) {
                        i13 = 13;
                        c0373t = new C0373t(13, AbstractC5530A.r(((C2.o) cause).f2558i0));
                    } else {
                        i13 = 13;
                        if (cause instanceof C2.k) {
                            c0373t = new C0373t(14, AbstractC5530A.r(((C2.k) cause).f2546Y));
                        } else if (cause instanceof OutOfMemoryError) {
                            c0373t = new C0373t(14, 0);
                        } else if (cause instanceof C0073q) {
                            c0373t = new C0373t(17, ((C0073q) cause).f583Y);
                        } else if (cause instanceof C0074s) {
                            c0373t = new C0373t(18, ((C0074s) cause).f585Y);
                        } else if (AbstractC5530A.f45131a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (AbstractC5530A.q(errorCode)) {
                                case 6002:
                                    i38 = 24;
                                    break;
                                case 6003:
                                    break;
                                case 6004:
                                    i38 = 25;
                                    break;
                                case 6005:
                                    i38 = 26;
                                    break;
                                default:
                                    i38 = 27;
                                    break;
                            }
                            c0373t = new C0373t(i38, errorCode);
                        } else {
                            c0373t = new C0373t(22, 0);
                        }
                    }
                    i13 = 13;
                }
            }
            this.f51464c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.f51465d).setErrorCode(c0373t.f3302a).setSubErrorCode(c0373t.f3303b).setException(q10).build());
            this.f51461A = true;
            this.f51475n = null;
            i14 = 2;
        }
        if (eVar.c(i14)) {
            C6504G c6504g3 = (C6504G) x10;
            c6504g3.E();
            o0 o0Var = c6504g3.f50360W.f50544i.f7340d;
            boolean b10 = o0Var.b(i14);
            boolean b11 = o0Var.b(1);
            boolean b12 = o0Var.b(3);
            if (b10 || b11 || b12) {
                if (!b10) {
                    c5065s = null;
                    if (AbstractC5530A.a(this.f51479r, null)) {
                        i15 = i13;
                        i17 = i11;
                    } else {
                        if (this.f51479r == null) {
                            i26 = 1;
                        } else {
                            i26 = 0;
                        }
                        this.f51479r = null;
                        i17 = i11;
                        i18 = 10;
                        i16 = 8;
                        i15 = i13;
                        f(1, elapsedRealtime, null, i26);
                        if (!b11 && !AbstractC5530A.a(this.f51480s, c5065s)) {
                            if (this.f51480s != null) {
                                i25 = 1;
                            } else {
                                i25 = 0;
                            }
                            this.f51480s = c5065s;
                            f(0, elapsedRealtime, c5065s, i25);
                        }
                        if (!b12 && !AbstractC5530A.a(this.f51481t, c5065s)) {
                            if (this.f51481t != null) {
                                i24 = 1;
                            } else {
                                i24 = 0;
                            }
                            this.f51481t = c5065s;
                            f(2, elapsedRealtime, c5065s, i24);
                        }
                        if (a(this.f51476o)) {
                            C1025i c1025i = this.f51476o;
                            C5065s c5065s2 = (C5065s) c1025i.f12351h0;
                            if (c5065s2.f42325w0 != -1) {
                                int i39 = c1025i.f12350Z;
                                if (!AbstractC5530A.a(this.f51479r, c5065s2)) {
                                    if (this.f51479r == null && i39 == 0) {
                                        i23 = 1;
                                    } else {
                                        i23 = i39;
                                    }
                                    this.f51479r = c5065s2;
                                    f(1, elapsedRealtime, c5065s2, i23);
                                }
                                this.f51476o = null;
                            }
                        }
                        if (a(this.f51477p)) {
                            C1025i c1025i2 = this.f51477p;
                            C5065s c5065s3 = (C5065s) c1025i2.f12351h0;
                            int i40 = c1025i2.f12350Z;
                            if (!AbstractC5530A.a(this.f51480s, c5065s3)) {
                                if (this.f51480s == null && i40 == 0) {
                                    i22 = 1;
                                } else {
                                    i22 = i40;
                                }
                                this.f51480s = c5065s3;
                                f(0, elapsedRealtime, c5065s3, i22);
                            }
                            this.f51477p = null;
                        }
                        if (a(this.f51478q)) {
                            C1025i c1025i3 = this.f51478q;
                            C5065s c5065s4 = (C5065s) c1025i3.f12351h0;
                            int i41 = c1025i3.f12350Z;
                            if (!AbstractC5530A.a(this.f51481t, c5065s4)) {
                                if (this.f51481t == null && i41 == 0) {
                                    i21 = 1;
                                } else {
                                    i21 = i41;
                                }
                                this.f51481t = c5065s4;
                                f(2, elapsedRealtime, c5065s4, i21);
                            }
                            this.f51478q = null;
                        }
                        switch (s2.s.c(this.f51462a).d()) {
                            case 0:
                                i19 = 0;
                                break;
                            case 1:
                                i19 = i10;
                                break;
                            case 2:
                                i19 = 2;
                                break;
                            case 3:
                                i19 = 4;
                                break;
                            case 4:
                                i19 = 5;
                                break;
                            case 5:
                                i19 = i12;
                                break;
                            case 6:
                            case 8:
                            default:
                                i19 = 1;
                                break;
                            case 7:
                                i19 = 3;
                                break;
                            case 9:
                                i19 = i16;
                                break;
                            case 10:
                                i19 = i17;
                                break;
                        }
                        if (i19 != this.f51474m) {
                            this.f51474m = i19;
                            this.f51464c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i19).setTimeSinceCreatedMillis(elapsedRealtime - this.f51465d).build());
                        }
                        c6504g = (C6504G) x10;
                        c6504g.E();
                        if (c6504g.f50360W.f50540e != 2) {
                            this.f51482u = false;
                        }
                        c6504g.E();
                        if (c6504g.f50360W.f50541f == null) {
                            this.f51484w = false;
                        } else if (eVar.c(i18)) {
                            this.f51484w = true;
                        }
                        c6504g.E();
                        int i42 = c6504g.f50360W.f50540e;
                        if (this.f51482u) {
                            i20 = 5;
                        } else if (this.f51484w) {
                            i20 = i15;
                        } else if (i42 == 4) {
                            i20 = 11;
                        } else {
                            int i43 = 2;
                            if (i42 == 2) {
                                int i44 = this.f51473l;
                                if (i44 != 0 && i44 != 2) {
                                    if (!c6504g.o()) {
                                        i20 = i17;
                                    } else {
                                        c6504g.E();
                                        if (c6504g.f50360W.f50548m != 0) {
                                            i20 = i18;
                                        } else {
                                            i20 = i12;
                                        }
                                    }
                                }
                                i20 = i43;
                            } else {
                                i43 = 3;
                                if (i42 == 3) {
                                    if (!c6504g.o()) {
                                        i20 = 4;
                                    } else {
                                        c6504g.E();
                                        if (c6504g.f50360W.f50548m != 0) {
                                            i20 = i10;
                                        }
                                        i20 = i43;
                                    }
                                } else if (i42 == 1 && this.f51473l != 0) {
                                    i20 = 12;
                                } else {
                                    i20 = this.f51473l;
                                }
                            }
                        }
                        if (this.f51473l != i20) {
                            this.f51473l = i20;
                            this.f51461A = true;
                            this.f51464c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f51473l).setTimeSinceCreatedMillis(elapsedRealtime - this.f51465d).build());
                        }
                        if (eVar.c(1028)) {
                            y yVar2 = this.f51463b;
                            C6757b c6757b3 = (C6757b) ((SparseArray) eVar.f17401Z).get(1028);
                            c6757b3.getClass();
                            yVar2.b(c6757b3);
                            return;
                        }
                        return;
                    }
                } else {
                    i15 = i13;
                    i17 = i11;
                    c5065s = null;
                }
                i18 = 10;
                i16 = 8;
                if (!b11) {
                    if (this.f51480s != null) {
                    }
                    this.f51480s = c5065s;
                    f(0, elapsedRealtime, c5065s, i25);
                }
                if (!b12) {
                    if (this.f51481t != null) {
                    }
                    this.f51481t = c5065s;
                    f(2, elapsedRealtime, c5065s, i24);
                }
                if (a(this.f51476o)) {
                }
                if (a(this.f51477p)) {
                }
                if (a(this.f51478q)) {
                }
                switch (s2.s.c(this.f51462a).d()) {
                }
                if (i19 != this.f51474m) {
                }
                c6504g = (C6504G) x10;
                c6504g.E();
                if (c6504g.f50360W.f50540e != 2) {
                }
                c6504g.E();
                if (c6504g.f50360W.f50541f == null) {
                }
                c6504g.E();
                int i422 = c6504g.f50360W.f50540e;
                if (this.f51482u) {
                }
                if (this.f51473l != i20) {
                }
                if (eVar.c(1028)) {
                }
            }
        }
        i15 = i13;
        i17 = i11;
        i18 = 10;
        i16 = 8;
        if (a(this.f51476o)) {
        }
        if (a(this.f51477p)) {
        }
        if (a(this.f51478q)) {
        }
        switch (s2.s.c(this.f51462a).d()) {
        }
        if (i19 != this.f51474m) {
        }
        c6504g = (C6504G) x10;
        c6504g.E();
        if (c6504g.f50360W.f50540e != 2) {
        }
        c6504g.E();
        if (c6504g.f50360W.f50541f == null) {
        }
        c6504g.E();
        int i4222 = c6504g.f50360W.f50540e;
        if (this.f51482u) {
        }
        if (this.f51473l != i20) {
        }
        if (eVar.c(1028)) {
        }
    }

    public final void e(C6757b c6757b, String str) {
        C0492y c0492y = c6757b.f51494d;
        if ((c0492y == null || !c0492y.b()) && str.equals(this.f51470i)) {
            b();
        }
        this.f51468g.remove(str);
        this.f51469h.remove(str);
    }

    public final void f(int i10, long j6, C5065s c5065s, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder g10 = z.g(z.f(i10), j6 - this.f51465d);
        if (c5065s != null) {
            g10.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    if (i11 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                }
            } else {
                i12 = 2;
            }
            g10.setTrackChangeReason(i12);
            String str2 = c5065s.f42318p0;
            if (str2 != null) {
                g10.setContainerMimeType(str2);
            }
            String str3 = c5065s.f42319q0;
            if (str3 != null) {
                g10.setSampleMimeType(str3);
            }
            String str4 = c5065s.f42316n0;
            if (str4 != null) {
                g10.setCodecName(str4);
            }
            int i13 = c5065s.f42315m0;
            if (i13 != -1) {
                g10.setBitrate(i13);
            }
            int i14 = c5065s.f42324v0;
            if (i14 != -1) {
                z.n(g10, i14);
            }
            int i15 = c5065s.f42325w0;
            if (i15 != -1) {
                z.s(g10, i15);
            }
            int i16 = c5065s.f42297D0;
            if (i16 != -1) {
                z.w(g10, i16);
            }
            int i17 = c5065s.f42298E0;
            if (i17 != -1) {
                z.y(g10, i17);
            }
            String str5 = c5065s.f42310h0;
            if (str5 != null) {
                int i18 = AbstractC5530A.f45131a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                z.o(g10, (String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    z.t(g10, (String) obj);
                }
            }
            float f6 = c5065s.f42326x0;
            if (f6 != -1.0f) {
                z.m(g10, f6);
            }
        } else {
            z.l(g10);
        }
        this.f51461A = true;
        this.f51464c.reportTrackChangeEvent(z.h(g10));
    }
}
