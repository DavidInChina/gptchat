package z2;

import E2.C0492y;
import android.media.metrics.PlaybackMetrics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p2.e0;
import p2.f0;
import p2.g0;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: h  reason: collision with root package name */
    public static final y2.r f51552h = new y2.r(1);

    /* renamed from: i  reason: collision with root package name */
    public static final Random f51553i = new Random();

    /* renamed from: d  reason: collision with root package name */
    public AbstractC6753B f51557d;

    /* renamed from: f  reason: collision with root package name */
    public String f51559f;

    /* renamed from: a  reason: collision with root package name */
    public final f0 f51554a = new f0();

    /* renamed from: b  reason: collision with root package name */
    public final e0 f51555b = new e0();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f51556c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public g0 f51558e = g0.f42063Y;

    /* renamed from: g  reason: collision with root package name */
    public long f51560g = -1;

    public final void a(x xVar) {
        long j6 = xVar.f51547c;
        if (j6 != -1) {
            this.f51560g = j6;
        }
        this.f51559f = null;
    }

    public final synchronized void b(C6757b c6757b) {
        AbstractC6753B abstractC6753B;
        try {
            String str = this.f51559f;
            if (str != null) {
                x xVar = (x) this.f51556c.get(str);
                xVar.getClass();
                a(xVar);
            }
            Iterator it = this.f51556c.values().iterator();
            while (it.hasNext()) {
                x xVar2 = (x) it.next();
                it.remove();
                if (xVar2.f51549e && (abstractC6753B = this.f51557d) != null) {
                    ((C6752A) abstractC6753B).e(c6757b, xVar2.f51545a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r13 != (-1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x c(int i10, C0492y c0492y) {
        long j6;
        int i11;
        long j10;
        HashMap hashMap = this.f51556c;
        x xVar = null;
        long j11 = Long.MAX_VALUE;
        for (x xVar2 : hashMap.values()) {
            if (xVar2.f51547c == -1 && i10 == xVar2.f51546b && c0492y != null) {
                y yVar = xVar2.f51551g;
                x xVar3 = (x) yVar.f51556c.get(yVar.f51559f);
                if (xVar3 != null) {
                    j10 = xVar3.f51547c;
                }
                j10 = 1 + yVar.f51560g;
                long j12 = c0492y.f4423d;
                if (j12 >= j10) {
                    xVar2.f51547c = j12;
                }
            }
            C0492y c0492y2 = xVar2.f51548d;
            if (c0492y == null) {
                if (i10 == xVar2.f51546b) {
                    j6 = xVar2.f51547c;
                    if (j6 != -1 && j6 >= j11) {
                        if (i11 == 0) {
                            int i12 = AbstractC5530A.f45131a;
                            if (xVar.f51548d != null && c0492y2 != null) {
                                xVar = xVar2;
                            }
                        }
                    } else {
                        xVar = xVar2;
                        j11 = j6;
                    }
                }
            } else {
                long j13 = c0492y.f4423d;
                if (c0492y2 == null) {
                    if (!c0492y.b() && j13 == xVar2.f51547c) {
                        j6 = xVar2.f51547c;
                        if (j6 != -1) {
                        }
                        xVar = xVar2;
                        j11 = j6;
                    }
                } else if (j13 == c0492y2.f4423d && c0492y.f4421b == c0492y2.f4421b && c0492y.f4422c == c0492y2.f4422c) {
                    j6 = xVar2.f51547c;
                    if (j6 != -1) {
                    }
                    xVar = xVar2;
                    j11 = j6;
                }
            }
        }
        if (xVar == null) {
            String str = (String) f51552h.get();
            x xVar4 = new x(this, str, i10, c0492y);
            hashMap.put(str, xVar4);
            return xVar4;
        }
        return xVar;
    }

    public final synchronized String d(g0 g0Var, C0492y c0492y) {
        return c(g0Var.i(c0492y.f4420a, this.f51555b).f42024h0, c0492y).f51545a;
    }

    public final void e(C6757b c6757b) {
        C0492y c0492y;
        boolean r10 = c6757b.f51492b.r();
        HashMap hashMap = this.f51556c;
        if (r10) {
            String str = this.f51559f;
            if (str != null) {
                x xVar = (x) hashMap.get(str);
                xVar.getClass();
                a(xVar);
                return;
            }
            return;
        }
        x xVar2 = (x) hashMap.get(this.f51559f);
        int i10 = c6757b.f51493c;
        C0492y c0492y2 = c6757b.f51494d;
        this.f51559f = c(i10, c0492y2).f51545a;
        f(c6757b);
        if (c0492y2 != null && c0492y2.b()) {
            long j6 = c0492y2.f4423d;
            if (xVar2 == null || xVar2.f51547c != j6 || (c0492y = xVar2.f51548d) == null || c0492y.f4421b != c0492y2.f4421b || c0492y.f4422c != c0492y2.f4422c) {
                c(i10, new C0492y(j6, c0492y2.f4420a));
                this.f51557d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:14:0x002b, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b3, B:41:0x00b7, B:42:0x00be, B:44:0x00c8, B:46:0x00cc, B:48:0x00db, B:51:0x00e2), top: B:55:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(C6757b c6757b) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j6;
        this.f51557d.getClass();
        if (c6757b.f51492b.r()) {
            return;
        }
        C0492y c0492y = c6757b.f51494d;
        if (c0492y != null) {
            long j10 = c0492y.f4423d;
            x xVar = (x) this.f51556c.get(this.f51559f);
            if (xVar != null) {
                j6 = xVar.f51547c;
                if (j6 != -1) {
                    if (j10 >= j6) {
                        return;
                    }
                    x xVar2 = (x) this.f51556c.get(this.f51559f);
                    if (xVar2 != null && xVar2.f51547c == -1 && xVar2.f51546b != c6757b.f51493c) {
                        return;
                    }
                }
            }
            j6 = this.f51560g + 1;
            if (j10 >= j6) {
            }
        }
        x c10 = c(c6757b.f51493c, c6757b.f51494d);
        if (this.f51559f == null) {
            this.f51559f = c10.f51545a;
        }
        C0492y c0492y2 = c6757b.f51494d;
        if (c0492y2 != null && c0492y2.b()) {
            C0492y c0492y3 = c6757b.f51494d;
            x c11 = c(c6757b.f51493c, new C0492y(c0492y3.f4420a, c0492y3.f4423d, c0492y3.f4421b));
            if (!c11.f51549e) {
                c11.f51549e = true;
                c6757b.f51492b.i(c6757b.f51494d.f4420a, this.f51555b);
                Math.max(0L, AbstractC5530A.L(this.f51555b.e(c6757b.f51494d.f4421b)) + AbstractC5530A.L(this.f51555b.f42026j0));
                this.f51557d.getClass();
            }
        }
        if (!c10.f51549e) {
            c10.f51549e = true;
            this.f51557d.getClass();
        }
        if (c10.f51545a.equals(this.f51559f) && !c10.f51550f) {
            c10.f51550f = true;
            AbstractC6753B abstractC6753B = this.f51557d;
            String str = c10.f51545a;
            C6752A c6752a = (C6752A) abstractC6753B;
            c6752a.getClass();
            C0492y c0492y4 = c6757b.f51494d;
            if (c0492y4 == null || !c0492y4.b()) {
                c6752a.b();
                c6752a.f51470i = str;
                playerName = z.b().setPlayerName("AndroidXMedia3");
                playerVersion = playerName.setPlayerVersion("1.2.1");
                c6752a.f51471j = playerVersion;
                c6752a.c(c6757b.f51492b, c6757b.f51494d);
            }
        }
    }

    public final synchronized void g(C6757b c6757b, int i10) {
        boolean z10;
        try {
            this.f51557d.getClass();
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f51556c.values().iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (xVar.a(c6757b)) {
                    it.remove();
                    if (xVar.f51549e) {
                        boolean equals = xVar.f51545a.equals(this.f51559f);
                        if (z10 && equals) {
                            boolean z11 = xVar.f51550f;
                        }
                        if (equals) {
                            a(xVar);
                        }
                        ((C6752A) this.f51557d).e(c6757b, xVar.f51545a);
                    }
                }
            }
            e(c6757b);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
