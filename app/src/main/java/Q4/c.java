package q4;

import Ng.B;
import Ng.Q;
import Sg.u;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final B f43753a;

    /* renamed from: b  reason: collision with root package name */
    public final B f43754b;

    /* renamed from: c  reason: collision with root package name */
    public final B f43755c;

    /* renamed from: d  reason: collision with root package name */
    public final B f43756d;

    /* renamed from: e  reason: collision with root package name */
    public final t4.e f43757e;

    /* renamed from: f  reason: collision with root package name */
    public final r4.d f43758f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f43759g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f43760h = true;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f43761i = false;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f43762j = null;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f43763k = null;

    /* renamed from: l  reason: collision with root package name */
    public final Drawable f43764l = null;

    /* renamed from: m  reason: collision with root package name */
    public final b f43765m;

    /* renamed from: n  reason: collision with root package name */
    public final b f43766n;

    /* renamed from: o  reason: collision with root package name */
    public final b f43767o;

    public c() {
        Tg.e eVar = Q.f12904a;
        Og.d dVar = ((Og.d) u.f16684a).f13759j0;
        Tg.d dVar2 = Q.f12906c;
        t4.c cVar = t4.e.f45748a;
        r4.d dVar3 = r4.d.f44434h0;
        Bitmap.Config config = u4.e.f46389b;
        b bVar = b.f43747h0;
        this.f43753a = dVar;
        this.f43754b = dVar2;
        this.f43755c = dVar2;
        this.f43756d = dVar2;
        this.f43757e = cVar;
        this.f43758f = dVar3;
        this.f43759g = config;
        this.f43765m = bVar;
        this.f43766n = bVar;
        this.f43767o = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (AbstractC3557B.K(this.f43753a, cVar.f43753a) && AbstractC3557B.K(this.f43754b, cVar.f43754b) && AbstractC3557B.K(this.f43755c, cVar.f43755c) && AbstractC3557B.K(this.f43756d, cVar.f43756d) && AbstractC3557B.K(this.f43757e, cVar.f43757e) && this.f43758f == cVar.f43758f && this.f43759g == cVar.f43759g && this.f43760h == cVar.f43760h && this.f43761i == cVar.f43761i && AbstractC3557B.K(this.f43762j, cVar.f43762j) && AbstractC3557B.K(this.f43763k, cVar.f43763k) && AbstractC3557B.K(this.f43764l, cVar.f43764l) && this.f43765m == cVar.f43765m && this.f43766n == cVar.f43766n && this.f43767o == cVar.f43767o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = this.f43754b.hashCode();
        int hashCode2 = this.f43755c.hashCode();
        int hashCode3 = this.f43756d.hashCode();
        int hashCode4 = this.f43757e.hashCode();
        int hashCode5 = (this.f43759g.hashCode() + ((this.f43758f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f43753a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i13 = 1237;
        if (this.f43760h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (hashCode5 + i10) * 31;
        if (this.f43761i) {
            i13 = 1231;
        }
        int i15 = (i14 + i13) * 31;
        int i16 = 0;
        Drawable drawable = this.f43762j;
        if (drawable != null) {
            i11 = drawable.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i15 + i11) * 31;
        Drawable drawable2 = this.f43763k;
        if (drawable2 != null) {
            i12 = drawable2.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        Drawable drawable3 = this.f43764l;
        if (drawable3 != null) {
            i16 = drawable3.hashCode();
        }
        int hashCode6 = this.f43765m.hashCode();
        return this.f43767o.hashCode() + ((this.f43766n.hashCode() + ((hashCode6 + ((i18 + i16) * 31)) * 31)) * 31);
    }
}
