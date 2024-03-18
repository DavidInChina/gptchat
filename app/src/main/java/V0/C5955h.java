package v0;

import android.graphics.Path;
import id.AbstractC3557B;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import r0.AbstractC5350n;
import r0.C5344h;
import r0.C5345i;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5654m;

/* renamed from: v0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5955h extends AbstractC5939C {

    /* renamed from: b  reason: collision with root package name */
    public AbstractC5350n f46953b;

    /* renamed from: f  reason: collision with root package name */
    public float f46957f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC5350n f46958g;

    /* renamed from: k  reason: collision with root package name */
    public float f46962k;

    /* renamed from: m  reason: collision with root package name */
    public float f46964m;

    /* renamed from: p  reason: collision with root package name */
    public boolean f46967p;

    /* renamed from: q  reason: collision with root package name */
    public C5654m f46968q;

    /* renamed from: r  reason: collision with root package name */
    public final C5344h f46969r;

    /* renamed from: s  reason: collision with root package name */
    public C5344h f46970s;

    /* renamed from: c  reason: collision with root package name */
    public float f46954c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public List f46955d = kf.v.f37483Y;

    /* renamed from: e  reason: collision with root package name */
    public float f46956e = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public int f46959h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f46960i = 0;

    /* renamed from: j  reason: collision with root package name */
    public float f46961j = 4.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f46963l = 1.0f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f46965n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f46966o = true;

    /* renamed from: t  reason: collision with root package name */
    public final AbstractC3957g f46971t = R4.b.C1(EnumC3958h.f36153Z, C5954g.f46950Z);

    public C5955h() {
        int i10 = AbstractC5944H.f46870a;
        C5344h g10 = androidx.compose.ui.graphics.a.g();
        this.f46969r = g10;
        this.f46970s = g10;
    }

    @Override // v0.AbstractC5939C
    public final void a(AbstractC5650i abstractC5650i) {
        if (this.f46965n) {
            AbstractC5949b.b(this.f46955d, this.f46969r);
            e();
        } else if (this.f46967p) {
            e();
        }
        this.f46965n = false;
        this.f46967p = false;
        AbstractC5350n abstractC5350n = this.f46953b;
        if (abstractC5350n != null) {
            AbstractC5648g.h(abstractC5650i, this.f46970s, abstractC5350n, this.f46954c, null, 56);
        }
        AbstractC5350n abstractC5350n2 = this.f46958g;
        if (abstractC5350n2 != null) {
            C5654m c5654m = this.f46968q;
            if (this.f46966o || c5654m == null) {
                c5654m = new C5654m(this.f46957f, this.f46961j, this.f46959h, this.f46960i, 16);
                this.f46968q = c5654m;
                this.f46966o = false;
            }
            AbstractC5648g.h(abstractC5650i, this.f46970s, abstractC5350n2, this.f46956e, c5654m, 48);
        }
    }

    public final void e() {
        Path path;
        int i10;
        int i11 = (this.f46962k > 0.0f ? 1 : (this.f46962k == 0.0f ? 0 : -1));
        C5344h c5344h = this.f46969r;
        if (i11 == 0 && this.f46963l == 1.0f) {
            this.f46970s = c5344h;
            return;
        }
        if (AbstractC3557B.K(this.f46970s, c5344h)) {
            this.f46970s = androidx.compose.ui.graphics.a.g();
        } else {
            if (this.f46970s.f44241a.getFillType() == Path.FillType.EVEN_ODD) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f46970s.f44241a.rewind();
            this.f46970s.e(i10);
        }
        AbstractC3957g abstractC3957g = this.f46971t;
        C5345i c5345i = (C5345i) abstractC3957g.getValue();
        if (c5344h != null) {
            c5345i.getClass();
            path = c5344h.f44241a;
        } else {
            path = null;
        }
        c5345i.f44245a.setPath(path, false);
        float length = ((C5345i) abstractC3957g.getValue()).f44245a.getLength();
        float f6 = this.f46962k;
        float f10 = this.f46964m;
        float f11 = ((f6 + f10) % 1.0f) * length;
        float f12 = ((this.f46963l + f10) % 1.0f) * length;
        if (f11 > f12) {
            ((C5345i) abstractC3957g.getValue()).a(f11, length, this.f46970s);
            ((C5345i) abstractC3957g.getValue()).a(0.0f, f12, this.f46970s);
            return;
        }
        ((C5345i) abstractC3957g.getValue()).a(f11, f12, this.f46970s);
    }

    public final String toString() {
        return this.f46969r.toString();
    }
}
