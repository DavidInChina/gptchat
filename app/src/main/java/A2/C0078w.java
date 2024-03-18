package A2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import s2.AbstractC5530A;
import s2.AbstractC5532b;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* renamed from: A2.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0078w {

    /* renamed from: A  reason: collision with root package name */
    public long f599A;

    /* renamed from: B  reason: collision with root package name */
    public long f600B;

    /* renamed from: C  reason: collision with root package name */
    public long f601C;

    /* renamed from: D  reason: collision with root package name */
    public long f602D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f603E;

    /* renamed from: F  reason: collision with root package name */
    public long f604F;

    /* renamed from: G  reason: collision with root package name */
    public long f605G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f606H;

    /* renamed from: I  reason: collision with root package name */
    public long f607I;

    /* renamed from: J  reason: collision with root package name */
    public AbstractC5532b f608J;

    /* renamed from: a  reason: collision with root package name */
    public final N f609a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f610b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f611c;

    /* renamed from: d  reason: collision with root package name */
    public int f612d;

    /* renamed from: e  reason: collision with root package name */
    public int f613e;

    /* renamed from: f  reason: collision with root package name */
    public C0077v f614f;

    /* renamed from: g  reason: collision with root package name */
    public int f615g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f616h;

    /* renamed from: i  reason: collision with root package name */
    public long f617i;

    /* renamed from: j  reason: collision with root package name */
    public float f618j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f619k;

    /* renamed from: l  reason: collision with root package name */
    public long f620l;

    /* renamed from: m  reason: collision with root package name */
    public long f621m;

    /* renamed from: n  reason: collision with root package name */
    public Method f622n;

    /* renamed from: o  reason: collision with root package name */
    public long f623o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f624p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f625q;

    /* renamed from: r  reason: collision with root package name */
    public long f626r;

    /* renamed from: s  reason: collision with root package name */
    public long f627s;

    /* renamed from: t  reason: collision with root package name */
    public long f628t;

    /* renamed from: u  reason: collision with root package name */
    public long f629u;

    /* renamed from: v  reason: collision with root package name */
    public long f630v;

    /* renamed from: w  reason: collision with root package name */
    public int f631w;

    /* renamed from: x  reason: collision with root package name */
    public int f632x;

    /* renamed from: y  reason: collision with root package name */
    public long f633y;

    /* renamed from: z  reason: collision with root package name */
    public long f634z;

    public C0078w(N n10) {
        this.f609a = n10;
        if (AbstractC5530A.f45131a >= 18) {
            try {
                this.f622n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f610b = new long[10];
        this.f608J = AbstractC5532b.f45146a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z10) {
        boolean z11;
        N n10;
        C0077v c0077v;
        boolean z12;
        long j6;
        long j10;
        long s10;
        long j11;
        long j12;
        Method method;
        AudioTrack audioTrack;
        N n11;
        long j13;
        long j14;
        AudioTrack audioTrack2 = this.f611c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        N n12 = this.f609a;
        if (playState == 3) {
            ((s2.w) this.f608J).getClass();
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f621m >= 30000) {
                long G10 = AbstractC5530A.G(this.f615g, b());
                if (G10 != 0) {
                    int i10 = this.f631w;
                    float f6 = this.f618j;
                    if (f6 != 1.0f) {
                        G10 = Math.round(G10 / f6);
                    }
                    long[] jArr = this.f610b;
                    jArr[i10] = G10 - nanoTime;
                    this.f631w = (this.f631w + 1) % 10;
                    int i11 = this.f632x;
                    if (i11 < 10) {
                        this.f632x = i11 + 1;
                    }
                    this.f621m = nanoTime;
                    this.f620l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f632x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f620l = (jArr[i12] / i13) + this.f620l;
                        i12++;
                    }
                }
            }
            if (!this.f616h) {
                C0077v c0077v2 = this.f614f;
                c0077v2.getClass();
                C0076u c0076u = c0077v2.f593a;
                if (c0076u == null || nanoTime - c0077v2.f597e < c0077v2.f596d) {
                    n10 = n12;
                } else {
                    c0077v2.f597e = nanoTime;
                    AudioTrack audioTrack3 = c0076u.f588a;
                    AudioTimestamp audioTimestamp = c0076u.f589b;
                    boolean timestamp = audioTrack3.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        long j15 = audioTimestamp.framePosition;
                        n11 = n12;
                        if (c0076u.f591d > j15) {
                            c0076u.f590c++;
                        }
                        c0076u.f591d = j15;
                        c0076u.f592e = j15 + (c0076u.f590c << 32);
                    } else {
                        n11 = n12;
                    }
                    int i14 = c0077v2.f594b;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        throw new IllegalStateException();
                                    }
                                } else if (timestamp) {
                                    c0077v2.a();
                                }
                            } else if (!timestamp) {
                                c0077v2.a();
                            }
                        } else if (timestamp) {
                            if (c0076u.f592e > c0077v2.f598f) {
                                c0077v2.b(2);
                            }
                        } else {
                            c0077v2.a();
                        }
                    } else if (timestamp) {
                        if (audioTimestamp.nanoTime / 1000 >= c0077v2.f595c) {
                            c0077v2.f598f = c0076u.f592e;
                            c0077v2.b(1);
                        }
                        n10 = n11;
                    } else if (nanoTime - c0077v2.f595c > 500000) {
                        c0077v2.b(3);
                    }
                    if (timestamp) {
                        if (c0076u != null) {
                            j13 = c0076u.f589b.nanoTime / 1000;
                        } else {
                            j13 = -9223372036854775807L;
                        }
                        if (c0076u != null) {
                            j14 = c0076u.f592e;
                        } else {
                            j14 = -1;
                        }
                        long G11 = AbstractC5530A.G(this.f615g, b());
                        if (Math.abs(j13 - nanoTime) > 5000000) {
                            n11.getClass();
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(j14);
                            sb2.append(", ");
                            sb2.append(j13);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(G11);
                            sb2.append(", ");
                            n10 = n11;
                            S s11 = n10.f424a;
                            sb2.append(s11.i());
                            sb2.append(", ");
                            sb2.append(s11.j());
                            String sb3 = sb2.toString();
                            Object obj = S.f431i0;
                            s2.p.g("DefaultAudioSink", sb3);
                            c0077v2.b(4);
                        } else {
                            n10 = n11;
                            if (Math.abs(AbstractC5530A.G(this.f615g, j14) - G11) > 5000000) {
                                n10.getClass();
                                StringBuilder sb4 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb4.append(j14);
                                sb4.append(", ");
                                sb4.append(j13);
                                sb4.append(", ");
                                sb4.append(nanoTime);
                                sb4.append(", ");
                                sb4.append(G11);
                                sb4.append(", ");
                                S s12 = n10.f424a;
                                sb4.append(s12.i());
                                sb4.append(", ");
                                sb4.append(s12.j());
                                String sb5 = sb4.toString();
                                Object obj2 = S.f431i0;
                                s2.p.g("DefaultAudioSink", sb5);
                                c0077v2.b(4);
                            } else if (c0077v2.f594b == 4) {
                                c0077v2.a();
                            }
                        }
                    }
                    n10 = n11;
                }
                if (this.f625q && (method = this.f622n) != null && nanoTime - this.f626r >= 500000) {
                    try {
                        this.f611c.getClass();
                        z11 = false;
                        try {
                            int i15 = AbstractC5530A.f45131a;
                            long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - this.f617i;
                            this.f623o = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f623o = max;
                            if (max > 5000000) {
                                n10.getClass();
                                s2.p.g("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                this.f623o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f622n = null;
                            this.f626r = nanoTime;
                            ((s2.w) this.f608J).getClass();
                            long nanoTime2 = System.nanoTime() / 1000;
                            c0077v = this.f614f;
                            c0077v.getClass();
                            if (c0077v.f594b != 2) {
                            }
                            if (!z12) {
                            }
                            if (this.f603E != z12) {
                            }
                            j10 = nanoTime2 - this.f605G;
                            if (j10 < 1000000) {
                            }
                            if (!this.f619k) {
                            }
                            this.f602D = nanoTime2;
                            this.f601C = j6;
                            this.f603E = z12;
                            return j6;
                        }
                    } catch (Exception unused2) {
                        z11 = false;
                    }
                    this.f626r = nanoTime;
                    ((s2.w) this.f608J).getClass();
                    long nanoTime22 = System.nanoTime() / 1000;
                    c0077v = this.f614f;
                    c0077v.getClass();
                    if (c0077v.f594b != 2) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (!z12) {
                        C0076u c0076u2 = c0077v.f593a;
                        if (c0076u2 != null) {
                            j11 = c0076u2.f592e;
                        } else {
                            j11 = -1;
                        }
                        long G12 = AbstractC5530A.G(this.f615g, j11);
                        if (c0076u2 != null) {
                            j12 = c0076u2.f589b.nanoTime / 1000;
                        } else {
                            j12 = -9223372036854775807L;
                        }
                        j6 = AbstractC5530A.s(this.f618j, nanoTime22 - j12) + G12;
                    } else {
                        if (this.f632x == 0) {
                            s10 = AbstractC5530A.G(this.f615g, b());
                        } else {
                            s10 = AbstractC5530A.s(this.f618j, this.f620l + nanoTime22);
                        }
                        j6 = s10;
                        if (!z10) {
                            j6 = Math.max(0L, j6 - this.f623o);
                        }
                    }
                    if (this.f603E != z12) {
                        this.f605G = this.f602D;
                        this.f604F = this.f601C;
                    }
                    j10 = nanoTime22 - this.f605G;
                    if (j10 < 1000000) {
                        long j16 = (j10 * 1000) / 1000000;
                        j6 = (((1000 - j16) * (AbstractC5530A.s(this.f618j, j10) + this.f604F)) + (j6 * j16)) / 1000;
                    }
                    if (!this.f619k) {
                        long j17 = this.f601C;
                        if (j6 > j17) {
                            this.f619k = true;
                            long L10 = AbstractC5530A.L(j6 - j17);
                            float f10 = this.f618j;
                            if (f10 != 1.0f) {
                                L10 = Math.round(L10 / f10);
                            }
                            ((s2.w) this.f608J).getClass();
                            final long currentTimeMillis = System.currentTimeMillis() - AbstractC5530A.L(L10);
                            F4.a aVar = n10.f424a.f483t;
                            if (aVar != null) {
                                final U3.l lVar = ((V) aVar.f5033Z).f498M1;
                                Handler handler = (Handler) lVar.f17423Z;
                                if (handler != null) {
                                    handler.post(new Runnable() { // from class: A2.l
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i16 = AbstractC5530A.f45131a;
                                            z2.w wVar = (z2.w) ((SurfaceHolder$CallbackC6500C) U3.l.this.f17424h0).f50334Y.f50379r;
                                            C6757b M10 = wVar.M();
                                            wVar.N(M10, 1010, new z2.g(M10, currentTimeMillis, 0));
                                        }
                                    });
                                }
                            }
                        }
                    }
                    this.f602D = nanoTime22;
                    this.f601C = j6;
                    this.f603E = z12;
                    return j6;
                }
                z11 = false;
                ((s2.w) this.f608J).getClass();
                long nanoTime222 = System.nanoTime() / 1000;
                c0077v = this.f614f;
                c0077v.getClass();
                if (c0077v.f594b != 2) {
                }
                if (!z12) {
                }
                if (this.f603E != z12) {
                }
                j10 = nanoTime222 - this.f605G;
                if (j10 < 1000000) {
                }
                if (!this.f619k) {
                }
                this.f602D = nanoTime222;
                this.f601C = j6;
                this.f603E = z12;
                return j6;
            }
        }
        n10 = n12;
        z11 = false;
        ((s2.w) this.f608J).getClass();
        long nanoTime2222 = System.nanoTime() / 1000;
        c0077v = this.f614f;
        c0077v.getClass();
        if (c0077v.f594b != 2) {
        }
        if (!z12) {
        }
        if (this.f603E != z12) {
        }
        j10 = nanoTime2222 - this.f605G;
        if (j10 < 1000000) {
        }
        if (!this.f619k) {
        }
        this.f602D = nanoTime2222;
        this.f601C = j6;
        this.f603E = z12;
        return j6;
    }

    public final long b() {
        ((s2.w) this.f608J).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f633y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f611c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f599A;
            }
            return Math.min(this.f600B, this.f599A + AbstractC5530A.I(AbstractC5530A.s(this.f618j, AbstractC5530A.C(elapsedRealtime) - this.f633y), this.f615g, 1000000L, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.f627s >= 5) {
            AudioTrack audioTrack2 = this.f611c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (this.f616h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f630v = this.f628t;
                    }
                    playbackHeadPosition += this.f630v;
                }
                if (AbstractC5530A.f45131a <= 29) {
                    if (playbackHeadPosition == 0 && this.f628t > 0 && playState == 3) {
                        if (this.f634z == -9223372036854775807L) {
                            this.f634z = elapsedRealtime;
                        }
                    } else {
                        this.f634z = -9223372036854775807L;
                    }
                }
                long j6 = this.f628t;
                if (j6 > playbackHeadPosition) {
                    if (this.f606H) {
                        this.f607I += j6;
                        this.f606H = false;
                    } else {
                        this.f629u++;
                    }
                }
                this.f628t = playbackHeadPosition;
            }
            this.f627s = elapsedRealtime;
        }
        return this.f628t + this.f607I + (this.f629u << 32);
    }

    public final boolean c(long j6) {
        long a5 = a(false);
        int i10 = this.f615g;
        int i11 = AbstractC5530A.f45131a;
        if (j6 <= AbstractC5530A.I(a5, i10, 1000000L, RoundingMode.CEILING)) {
            if (!this.f616h) {
                return false;
            }
            AudioTrack audioTrack = this.f611c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f620l = 0L;
        this.f632x = 0;
        this.f631w = 0;
        this.f621m = 0L;
        this.f602D = 0L;
        this.f605G = 0L;
        this.f619k = false;
    }
}
