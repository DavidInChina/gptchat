package v0;

import Z.C1724m0;
import Z.o1;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import id.AbstractC3557B;
import n0.C4707f;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import r0.C5339c;
import r0.C5341e;
import r0.C5347k;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5642a;
import t0.C5644c;
import wf.AbstractC6216a;

/* renamed from: v0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5941E extends AbstractC5939C {

    /* renamed from: b  reason: collision with root package name */
    public final C5950c f46846b;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f46851g;

    /* renamed from: h  reason: collision with root package name */
    public C5347k f46852h;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f46853i;

    /* renamed from: c  reason: collision with root package name */
    public String f46847c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f46848d = true;

    /* renamed from: e  reason: collision with root package name */
    public final C5948a f46849e = new C5948a();

    /* renamed from: f  reason: collision with root package name */
    public AbstractC6216a f46850f = C5954g.f46951h0;

    /* renamed from: j  reason: collision with root package name */
    public long f46854j = C5254f.f43638c;

    /* renamed from: k  reason: collision with root package name */
    public float f46855k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f46856l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public final C5940D f46857m = new C5940D(this, 1);

    public C5941E(C5950c c5950c) {
        this.f46846b = c5950c;
        c5950c.f46906i = new C5940D(this, 0);
        o1 o1Var = o1.f22665a;
        this.f46851g = AbstractC4828h.Z(null, o1Var);
        this.f46853i = AbstractC4828h.Z(new C5254f(C5254f.f43637b), o1Var);
    }

    @Override // v0.AbstractC5939C
    public final void a(AbstractC5650i abstractC5650i) {
        e(abstractC5650i, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(AbstractC5650i abstractC5650i, float f6, C5347k c5347k) {
        int i10;
        C5347k c5347k2;
        C5341e c5341e;
        C5347k c5347k3;
        C5347k c5347k4;
        C5341e c5341e2;
        int i11;
        Bitmap.Config config;
        Bitmap.Config config2;
        C5950c c5950c = this.f46846b;
        boolean z10 = c5950c.f46901d;
        C1724m0 c1724m0 = this.f46851g;
        if (z10 && c5950c.f46902e != r0.r.f44263k && AbstractC5944H.b((C5347k) c1724m0.getValue()) && AbstractC5944H.b(c5347k)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        boolean z11 = this.f46848d;
        C5948a c5948a = this.f46849e;
        if (!z11 && C5254f.a(this.f46854j, abstractC5650i.g())) {
            C5341e c5341e3 = c5948a.f46892a;
            if (c5341e3 != null) {
                Bitmap.Config config3 = c5341e3.f44234a.getConfig();
                if (config3 == Bitmap.Config.ALPHA_8) {
                    i11 = 1;
                } else if (config3 == Bitmap.Config.RGB_565) {
                    i11 = 2;
                } else if (config3 != Bitmap.Config.ARGB_4444) {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 26) {
                        config2 = Bitmap.Config.RGBA_F16;
                        if (config3 == config2) {
                            i11 = 3;
                        }
                    }
                    if (i12 >= 26) {
                        config = Bitmap.Config.HARDWARE;
                        if (config3 == config) {
                            i11 = 4;
                        }
                    }
                }
                if (r0.G.e(i10, i11)) {
                    if (c5347k != null) {
                        c5347k2 = c5347k;
                    } else {
                        if (((C5347k) c1724m0.getValue()) != null) {
                            c5347k3 = (C5347k) c1724m0.getValue();
                        } else {
                            c5347k3 = this.f46852h;
                        }
                        c5347k2 = c5347k3;
                    }
                    c5341e = c5948a.f46892a;
                    if (c5341e != null) {
                        AbstractC5648g.d(abstractC5650i, c5341e, 0L, c5948a.f46894c, 0L, f6, c5347k2, 0, 858);
                        return;
                    }
                    throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
                }
            }
            i11 = 0;
            if (r0.G.e(i10, i11)) {
            }
        }
        if (r0.G.e(i10, 1)) {
            int i13 = C5347k.f44246d;
            c5347k4 = C4707f.a(5, c5950c.f46902e);
        } else {
            c5347k4 = null;
        }
        this.f46852h = c5347k4;
        float d10 = C5254f.d(abstractC5650i.g());
        C1724m0 c1724m02 = this.f46853i;
        this.f46855k = d10 / C5254f.d(((C5254f) c1724m02.getValue()).f43640a);
        this.f46856l = C5254f.b(abstractC5650i.g()) / C5254f.b(((C5254f) c1724m02.getValue()).f43640a);
        long c10 = Ng.H.c((int) Math.ceil(C5254f.d(abstractC5650i.g())), (int) Math.ceil(C5254f.b(abstractC5650i.g())));
        Z0.l layoutDirection = abstractC5650i.getLayoutDirection();
        C5341e c5341e4 = c5948a.f46892a;
        C5339c c5339c = c5948a.f46893b;
        if (c5341e4 != null && c5339c != null) {
            int i14 = (int) (c10 >> 32);
            Bitmap bitmap = c5341e4.f44234a;
            if (i14 <= bitmap.getWidth() && ((int) (c10 & 4294967295L)) <= bitmap.getHeight() && r0.G.e(c5948a.f46895d, i10)) {
                c5341e2 = c5341e4;
                c5948a.f46894c = c10;
                long z12 = Ng.H.z(c10);
                C5644c c5644c = c5948a.f46896e;
                C5642a c5642a = c5644c.f45611Y;
                Z0.b bVar = c5642a.f45605a;
                Z0.l lVar = c5642a.f45606b;
                AbstractC5352p abstractC5352p = c5642a.f45607c;
                long j6 = c5642a.f45608d;
                c5642a.f45605a = abstractC5650i;
                c5642a.f45606b = layoutDirection;
                c5642a.f45607c = c5339c;
                c5642a.f45608d = z12;
                c5339c.h();
                AbstractC5648g.k(c5644c, r0.r.f44254b, 0L, 0L, 0.0f, 62);
                this.f46857m.invoke(c5644c);
                c5339c.q();
                C5642a c5642a2 = c5644c.f45611Y;
                c5642a2.f45605a = bVar;
                c5642a2.f45606b = lVar;
                c5642a2.f45607c = abstractC5352p;
                c5642a2.f45608d = j6;
                c5341e2.f44234a.prepareToDraw();
                this.f46848d = false;
                this.f46854j = abstractC5650i.g();
                if (c5347k != null) {
                }
                c5341e = c5948a.f46892a;
                if (c5341e != null) {
                }
            }
        }
        c5341e2 = androidx.compose.ui.graphics.a.e((int) (c10 >> 32), (int) (4294967295L & c10), i10);
        Canvas canvas = AbstractC5340d.f44233a;
        c5339c = new C5339c();
        c5339c.f44230a = new Canvas(androidx.compose.ui.graphics.a.j(c5341e2));
        c5948a.f46892a = c5341e2;
        c5948a.f46893b = c5339c;
        c5948a.f46895d = i10;
        c5948a.f46894c = c10;
        long z122 = Ng.H.z(c10);
        C5644c c5644c2 = c5948a.f46896e;
        C5642a c5642a3 = c5644c2.f45611Y;
        Z0.b bVar2 = c5642a3.f45605a;
        Z0.l lVar2 = c5642a3.f45606b;
        AbstractC5352p abstractC5352p2 = c5642a3.f45607c;
        long j62 = c5642a3.f45608d;
        c5642a3.f45605a = abstractC5650i;
        c5642a3.f45606b = layoutDirection;
        c5642a3.f45607c = c5339c;
        c5642a3.f45608d = z122;
        c5339c.h();
        AbstractC5648g.k(c5644c2, r0.r.f44254b, 0L, 0L, 0.0f, 62);
        this.f46857m.invoke(c5644c2);
        c5339c.q();
        C5642a c5642a22 = c5644c2.f45611Y;
        c5642a22.f45605a = bVar2;
        c5642a22.f45606b = lVar2;
        c5642a22.f45607c = abstractC5352p2;
        c5642a22.f45608d = j62;
        c5341e2.f44234a.prepareToDraw();
        this.f46848d = false;
        this.f46854j = abstractC5650i.g();
        if (c5347k != null) {
        }
        c5341e = c5948a.f46892a;
        if (c5341e != null) {
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f46847c);
        sb2.append("\n\tviewportWidth: ");
        C1724m0 c1724m0 = this.f46853i;
        sb2.append(C5254f.d(((C5254f) c1724m0.getValue()).f43640a));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(C5254f.b(((C5254f) c1724m0.getValue()).f43640a));
        sb2.append(Separators.RETURN);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
