package z2;

import E2.C0492y;
import p2.f0;
import p2.g0;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final String f51545a;

    /* renamed from: b  reason: collision with root package name */
    public int f51546b;

    /* renamed from: c  reason: collision with root package name */
    public long f51547c;

    /* renamed from: d  reason: collision with root package name */
    public final C0492y f51548d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f51549e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f51550f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f51551g;

    public x(y yVar, String str, int i10, C0492y c0492y) {
        long j6;
        this.f51551g = yVar;
        this.f51545a = str;
        this.f51546b = i10;
        if (c0492y == null) {
            j6 = -1;
        } else {
            j6 = c0492y.f4423d;
        }
        this.f51547c = j6;
        if (c0492y != null && c0492y.b()) {
            this.f51548d = c0492y;
        }
    }

    public final boolean a(C6757b c6757b) {
        C0492y c0492y = c6757b.f51494d;
        if (c0492y == null) {
            if (this.f51546b != c6757b.f51493c) {
                return true;
            }
            return false;
        }
        long j6 = this.f51547c;
        if (j6 == -1) {
            return false;
        }
        if (c0492y.f4423d > j6) {
            return true;
        }
        C0492y c0492y2 = this.f51548d;
        if (c0492y2 == null) {
            return false;
        }
        g0 g0Var = c6757b.f51492b;
        int c10 = g0Var.c(c0492y.f4420a);
        int c11 = g0Var.c(c0492y2.f4420a);
        if (c0492y.f4423d < c0492y2.f4423d || c10 < c11) {
            return false;
        }
        if (c10 > c11) {
            return true;
        }
        boolean b10 = c0492y.b();
        int i10 = c0492y2.f4421b;
        if (b10) {
            int i11 = c0492y.f4421b;
            if (i11 > i10) {
                return true;
            }
            if (i11 == i10) {
                if (c0492y.f4422c > c0492y2.f4422c) {
                    return true;
                }
            }
            return false;
        }
        int i12 = c0492y.f4424e;
        if (i12 == -1 || i12 > i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.q()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(g0 g0Var, g0 g0Var2) {
        int i10 = this.f51546b;
        if (i10 < g0Var.q()) {
            y yVar = this.f51551g;
            g0Var.p(i10, yVar.f51554a);
            f0 f0Var = yVar.f51554a;
            for (int i11 = f0Var.f42059t0; i11 <= f0Var.f42060u0; i11++) {
                int c10 = g0Var2.c(g0Var.n(i11));
                if (c10 != -1) {
                    i10 = g0Var2.h(c10, yVar.f51555b, false).f42024h0;
                    break;
                }
            }
            i10 = -1;
        }
        this.f51546b = i10;
        if (i10 == -1) {
            return false;
        }
        C0492y c0492y = this.f51548d;
        if (c0492y != null && g0Var2.c(c0492y.f4420a) == -1) {
            return false;
        }
        return true;
    }
}
