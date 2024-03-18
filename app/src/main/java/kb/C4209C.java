package kb;

import android.gov.nist.core.Separators;
import android.net.Uri;
import gb.C3234k;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: kb.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4209C implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f37223a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f37224b;

    /* renamed from: c  reason: collision with root package name */
    public final List f37225c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f37226d;

    /* renamed from: e  reason: collision with root package name */
    public final int f37227e;

    /* renamed from: f  reason: collision with root package name */
    public final int f37228f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f37229g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f37230h;

    /* renamed from: i  reason: collision with root package name */
    public final String f37231i;

    /* renamed from: j  reason: collision with root package name */
    public final String f37232j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f37233k;

    public C4209C(Uri uri, Uri uri2, List list, boolean z10, int i10, int i11, boolean z11, boolean z12) {
        String str;
        boolean z13;
        C3234k c3234k;
        C3234k c3234k2;
        AbstractC3557B.c0("originalUri", uri);
        AbstractC3557B.c0("inPaintedUri", uri2);
        this.f37223a = uri;
        this.f37224b = uri2;
        this.f37225c = list;
        this.f37226d = z10;
        this.f37227e = i10;
        this.f37228f = i11;
        this.f37229g = z11;
        this.f37230h = z12;
        String str2 = null;
        if (list != null && (c3234k2 = (C3234k) kf.t.i2(i11, list)) != null) {
            str = c3234k2.f31471b;
        } else {
            str = null;
        }
        this.f37231i = str;
        if (list != null && (c3234k = (C3234k) kf.t.i2(i11, list)) != null) {
            str2 = c3234k.f31470a;
        }
        this.f37232j = str2 == null ? "" : str2;
        if (str != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f37233k = z13;
    }

    public static C4209C e(C4209C c4209c, List list, int i10, int i11, boolean z10, boolean z11, int i12) {
        Uri uri = c4209c.f37223a;
        Uri uri2 = c4209c.f37224b;
        if ((i12 & 4) != 0) {
            list = c4209c.f37225c;
        }
        List list2 = list;
        boolean z12 = c4209c.f37226d;
        if ((i12 & 16) != 0) {
            i10 = c4209c.f37227e;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = c4209c.f37228f;
        }
        int i14 = i11;
        if ((i12 & 64) != 0) {
            z10 = c4209c.f37229g;
        }
        boolean z13 = z10;
        if ((i12 & 128) != 0) {
            z11 = c4209c.f37230h;
        }
        c4209c.getClass();
        AbstractC3557B.c0("originalUri", uri);
        AbstractC3557B.c0("inPaintedUri", uri2);
        return new C4209C(uri, uri2, list2, z12, i13, i14, z13, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4209C)) {
            return false;
        }
        C4209C c4209c = (C4209C) obj;
        if (AbstractC3557B.K(this.f37223a, c4209c.f37223a) && AbstractC3557B.K(this.f37224b, c4209c.f37224b) && AbstractC3557B.K(this.f37225c, c4209c.f37225c) && this.f37226d == c4209c.f37226d && this.f37227e == c4209c.f37227e && this.f37228f == c4209c.f37228f && this.f37229g == c4209c.f37229g && this.f37230h == c4209c.f37230h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f37224b.hashCode() + (this.f37223a.hashCode() * 31)) * 31;
        List list = this.f37225c;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        int i14 = 1237;
        if (this.f37226d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (((((i13 + i11) * 31) + this.f37227e) * 31) + this.f37228f) * 31;
        if (this.f37229g) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (this.f37230h) {
            i14 = 1231;
        }
        return i16 + i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageDetailState(originalUri=");
        sb2.append(this.f37223a);
        sb2.append(", inPaintedUri=");
        sb2.append(this.f37224b);
        sb2.append(", imageSelections=");
        sb2.append(this.f37225c);
        sb2.append(", editImageEnabled=");
        sb2.append(this.f37226d);
        sb2.append(", firstImageIndex=");
        sb2.append(this.f37227e);
        sb2.append(", currentIndex=");
        sb2.append(this.f37228f);
        sb2.append(", isUploadedImage=");
        sb2.append(this.f37229g);
        sb2.append(", isInPaintMode=");
        return AbstractC4194d.w(sb2, this.f37230h, Separators.RPAREN);
    }
}
