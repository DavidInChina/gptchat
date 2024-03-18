package h1;

import U3.n;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import livekit.org.webrtc.WebrtcBuildVersion;

/* renamed from: h1.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3296c {

    /* renamed from: d  reason: collision with root package name */
    public AbstractC3295b f31702d;

    /* renamed from: a  reason: collision with root package name */
    public C3302i f31699a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f31700b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f31701c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f31703e = false;

    public C3296c(n nVar) {
        this.f31702d = new C3294a(this, nVar);
    }

    public final void a(C3298e c3298e, int i10) {
        this.f31702d.a(c3298e.i(i10), 1.0f);
        this.f31702d.a(c3298e.i(i10), -1.0f);
    }

    public final void b(C3302i c3302i, C3302i c3302i2, C3302i c3302i3, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31700b = i10;
            if (z10) {
                this.f31702d.a(c3302i, 1.0f);
                this.f31702d.a(c3302i2, -1.0f);
                this.f31702d.a(c3302i3, -1.0f);
                return;
            }
        }
        this.f31702d.a(c3302i, -1.0f);
        this.f31702d.a(c3302i2, 1.0f);
        this.f31702d.a(c3302i3, 1.0f);
    }

    public final void c(C3302i c3302i, C3302i c3302i2, C3302i c3302i3, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31700b = i10;
            if (z10) {
                this.f31702d.a(c3302i, 1.0f);
                this.f31702d.a(c3302i2, -1.0f);
                this.f31702d.a(c3302i3, 1.0f);
                return;
            }
        }
        this.f31702d.a(c3302i, -1.0f);
        this.f31702d.a(c3302i2, 1.0f);
        this.f31702d.a(c3302i3, -1.0f);
    }

    public C3302i d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final C3302i e(boolean[] zArr, C3302i c3302i) {
        int i10;
        int b10 = this.f31702d.b();
        C3302i c3302i2 = null;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < b10; i11++) {
            float g10 = this.f31702d.g(i11);
            if (g10 < 0.0f) {
                C3302i e10 = this.f31702d.e(i11);
                if ((zArr == null || !zArr[e10.f31730b]) && e10 != c3302i && (((i10 = e10.f31740l) == 3 || i10 == 4) && g10 < f6)) {
                    f6 = g10;
                    c3302i2 = e10;
                }
            }
        }
        return c3302i2;
    }

    public final void f(C3302i c3302i) {
        C3302i c3302i2 = this.f31699a;
        if (c3302i2 != null) {
            this.f31702d.a(c3302i2, -1.0f);
            this.f31699a = null;
        }
        float i10 = this.f31702d.i(c3302i, true) * (-1.0f);
        this.f31699a = c3302i;
        if (i10 == 1.0f) {
            return;
        }
        this.f31700b /= i10;
        this.f31702d.j(i10);
    }

    public final void g(C3302i c3302i, boolean z10) {
        if (!c3302i.f31734f) {
            return;
        }
        float c10 = this.f31702d.c(c3302i);
        this.f31700b = (c3302i.f31733e * c10) + this.f31700b;
        this.f31702d.i(c3302i, z10);
        if (z10) {
            c3302i.b(this);
        }
    }

    public void h(C3296c c3296c, boolean z10) {
        float h10 = this.f31702d.h(c3296c, z10);
        this.f31700b = (c3296c.f31700b * h10) + this.f31700b;
        if (z10) {
            c3296c.f31699a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z10;
        float g10;
        int i10;
        if (this.f31699a == null) {
            str = WebrtcBuildVersion.maint_version;
        } else {
            str = "" + this.f31699a;
        }
        String g11 = android.gov.nist.core.a.g(str, " = ");
        if (this.f31700b != 0.0f) {
            StringBuilder p10 = android.gov.nist.core.a.p(g11);
            p10.append(this.f31700b);
            g11 = p10.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int b10 = this.f31702d.b();
        for (int i11 = 0; i11 < b10; i11++) {
            C3302i e10 = this.f31702d.e(i11);
            if (e10 != null && (this.f31702d.g(i11)) != 0.0f) {
                String c3302i = e10.toString();
                if (!z10) {
                    if (g10 < 0.0f) {
                        g11 = android.gov.nist.core.a.g(g11, "- ");
                        g10 *= -1.0f;
                    }
                    if (g10 == 1.0f) {
                        g11 = android.gov.nist.core.a.g(g11, c3302i);
                    } else {
                        g11 = g11 + g10 + Separators.SP + c3302i;
                    }
                    z10 = true;
                } else if (i10 > 0) {
                    g11 = android.gov.nist.core.a.g(g11, " + ");
                    if (g10 == 1.0f) {
                    }
                    z10 = true;
                } else {
                    g11 = android.gov.nist.core.a.g(g11, " - ");
                    g10 *= -1.0f;
                    if (g10 == 1.0f) {
                    }
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return android.gov.nist.core.a.g(g11, "0.0");
        }
        return g11;
    }
}
