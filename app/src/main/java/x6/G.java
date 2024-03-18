package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final long f48960a;

    /* renamed from: b  reason: collision with root package name */
    public final C6293f f48961b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48962c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48963d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48964e;

    /* renamed from: f  reason: collision with root package name */
    public final C6284c f48965f;

    /* renamed from: g  reason: collision with root package name */
    public final int f48966g;

    /* renamed from: h  reason: collision with root package name */
    public final C6290e f48967h;

    /* renamed from: i  reason: collision with root package name */
    public final E f48968i;

    /* renamed from: j  reason: collision with root package name */
    public final C6305j f48969j;

    /* renamed from: k  reason: collision with root package name */
    public final C6334t f48970k;

    /* renamed from: l  reason: collision with root package name */
    public final C f48971l;

    /* renamed from: m  reason: collision with root package name */
    public final C6299h f48972m;

    /* renamed from: n  reason: collision with root package name */
    public final C6349y f48973n;

    /* renamed from: o  reason: collision with root package name */
    public final C6331s f48974o;

    /* renamed from: p  reason: collision with root package name */
    public final C6320o f48975p;

    /* renamed from: q  reason: collision with root package name */
    public final C6314m f48976q;

    /* renamed from: r  reason: collision with root package name */
    public final C6308k f48977r;

    /* renamed from: s  reason: collision with root package name */
    public final C6278a f48978s;

    public G(long j6, C6293f c6293f, String str, String str2, String str3, C6284c c6284c, int i10, C6290e c6290e, E e10, C6305j c6305j, C6334t c6334t, C c10, C6299h c6299h, C6349y c6349y, C6331s c6331s, C6320o c6320o, C6314m c6314m, C6308k c6308k, C6278a c6278a) {
        this.f48960a = j6;
        this.f48961b = c6293f;
        this.f48962c = str;
        this.f48963d = str2;
        this.f48964e = str3;
        this.f48965f = c6284c;
        this.f48966g = i10;
        this.f48967h = c6290e;
        this.f48968i = e10;
        this.f48969j = c6305j;
        this.f48970k = c6334t;
        this.f48971l = c10;
        this.f48972m = c6299h;
        this.f48973n = c6349y;
        this.f48974o = c6331s;
        this.f48975p = c6320o;
        this.f48976q = c6314m;
        this.f48977r = c6308k;
        this.f48978s = c6278a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (this.f48960a == g10.f48960a && AbstractC3557B.K(this.f48961b, g10.f48961b) && AbstractC3557B.K(this.f48962c, g10.f48962c) && AbstractC3557B.K(this.f48963d, g10.f48963d) && AbstractC3557B.K(this.f48964e, g10.f48964e) && AbstractC3557B.K(this.f48965f, g10.f48965f) && this.f48966g == g10.f48966g && AbstractC3557B.K(this.f48967h, g10.f48967h) && AbstractC3557B.K(this.f48968i, g10.f48968i) && AbstractC3557B.K(this.f48969j, g10.f48969j) && AbstractC3557B.K(this.f48970k, g10.f48970k) && AbstractC3557B.K(this.f48971l, g10.f48971l) && AbstractC3557B.K(this.f48972m, g10.f48972m) && AbstractC3557B.K(this.f48973n, g10.f48973n) && AbstractC3557B.K(this.f48974o, g10.f48974o) && AbstractC3557B.K(this.f48975p, g10.f48975p) && AbstractC3557B.K(this.f48976q, g10.f48976q) && AbstractC3557B.K(this.f48977r, g10.f48977r) && AbstractC3557B.K(this.f48978s, g10.f48978s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
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
        int i20;
        int i21;
        long j6 = this.f48960a;
        int v10 = E9.f.v(this.f48961b.f49292a, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
        int i22 = 0;
        String str = this.f48962c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i23 = (v10 + i10) * 31;
        String str2 = this.f48963d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i24 = (i23 + i11) * 31;
        String str3 = this.f48964e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int hashCode = (this.f48965f.hashCode() + ((i24 + i12) * 31)) * 31;
        int i25 = this.f48966g;
        if (i25 == 0) {
            i13 = 0;
        } else {
            i13 = AbstractC6708l.f(i25);
        }
        int hashCode2 = (this.f48967h.hashCode() + ((hashCode + i13) * 31)) * 31;
        E e10 = this.f48968i;
        if (e10 == null) {
            i14 = 0;
        } else {
            i14 = e10.hashCode();
        }
        int i26 = (hashCode2 + i14) * 31;
        C6305j c6305j = this.f48969j;
        if (c6305j == null) {
            i15 = 0;
        } else {
            i15 = c6305j.hashCode();
        }
        int i27 = (i26 + i15) * 31;
        C6334t c6334t = this.f48970k;
        if (c6334t == null) {
            i16 = 0;
        } else {
            i16 = c6334t.hashCode();
        }
        int i28 = (i27 + i16) * 31;
        C c10 = this.f48971l;
        if (c10 == null) {
            i17 = 0;
        } else {
            i17 = c10.hashCode();
        }
        int i29 = (i28 + i17) * 31;
        C6299h c6299h = this.f48972m;
        if (c6299h == null) {
            i18 = 0;
        } else {
            i18 = c6299h.f49320a.hashCode();
        }
        int i30 = (i29 + i18) * 31;
        C6349y c6349y = this.f48973n;
        if (c6349y == null) {
            i19 = 0;
        } else {
            i19 = c6349y.hashCode();
        }
        int i31 = (i30 + i19) * 31;
        C6331s c6331s = this.f48974o;
        if (c6331s == null) {
            i20 = 0;
        } else {
            i20 = c6331s.hashCode();
        }
        int hashCode3 = (this.f48975p.hashCode() + ((i31 + i20) * 31)) * 31;
        C6314m c6314m = this.f48976q;
        if (c6314m == null) {
            i21 = 0;
        } else {
            i21 = c6314m.f49377a.hashCode();
        }
        int i32 = (hashCode3 + i21) * 31;
        C6308k c6308k = this.f48977r;
        if (c6308k != null) {
            i22 = c6308k.hashCode();
        }
        return this.f48978s.hashCode() + ((i32 + i22) * 31);
    }

    public final String toString() {
        return "ActionEvent(date=" + this.f48960a + ", application=" + this.f48961b + ", service=" + this.f48962c + ", version=" + this.f48963d + ", buildVersion=" + this.f48964e + ", session=" + this.f48965f + ", source=" + AbstractC6287d.E(this.f48966g) + ", view=" + this.f48967h + ", usr=" + this.f48968i + ", connectivity=" + this.f48969j + ", display=" + this.f48970k + ", synthetics=" + this.f48971l + ", ciTest=" + this.f48972m + ", os=" + this.f48973n + ", device=" + this.f48974o + ", dd=" + this.f48975p + ", context=" + this.f48976q + ", container=" + this.f48977r + ", action=" + this.f48978s + Separators.RPAREN;
    }

    public /* synthetic */ G(long j6, C6293f c6293f, String str, String str2, C6284c c6284c, int i10, C6290e c6290e, E e10, C6305j c6305j, C c10, C6349y c6349y, C6331s c6331s, C6320o c6320o, C6314m c6314m, C6278a c6278a) {
        this(j6, c6293f, str, str2, null, c6284c, i10, c6290e, e10, c6305j, null, c10, null, c6349y, c6331s, c6320o, c6314m, null, c6278a);
    }
}
