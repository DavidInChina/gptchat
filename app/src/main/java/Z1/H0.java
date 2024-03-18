package Z1;

import android.content.ComponentName;
import android.content.Context;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class H0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22835a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22836b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22837c;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f22838d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22839e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22840f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicInteger f22841g;

    /* renamed from: h  reason: collision with root package name */
    public final C1763g0 f22842h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f22843i;

    /* renamed from: j  reason: collision with root package name */
    public final long f22844j;

    /* renamed from: k  reason: collision with root package name */
    public final int f22845k;

    /* renamed from: l  reason: collision with root package name */
    public final int f22846l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f22847m;

    /* renamed from: n  reason: collision with root package name */
    public final Integer f22848n;

    /* renamed from: o  reason: collision with root package name */
    public final ComponentName f22849o;

    public H0(Context context, int i10, boolean z10, j0 j0Var, int i11, boolean z11, AtomicInteger atomicInteger, C1763g0 c1763g0, AtomicBoolean atomicBoolean, long j6, int i12, int i13, boolean z12, Integer num, ComponentName componentName) {
        this.f22835a = context;
        this.f22836b = i10;
        this.f22837c = z10;
        this.f22838d = j0Var;
        this.f22839e = i11;
        this.f22840f = z11;
        this.f22841g = atomicInteger;
        this.f22842h = c1763g0;
        this.f22843i = atomicBoolean;
        this.f22844j = j6;
        this.f22845k = i12;
        this.f22846l = i13;
        this.f22847m = z12;
        this.f22848n = num;
        this.f22849o = componentName;
    }

    public static H0 a(H0 h02, int i10, boolean z10, AtomicInteger atomicInteger, C1763g0 c1763g0, AtomicBoolean atomicBoolean, long j6, boolean z11, Integer num, int i11) {
        int i12;
        boolean z12;
        AtomicInteger atomicInteger2;
        C1763g0 c1763g02;
        AtomicBoolean atomicBoolean2;
        long j10;
        int i13;
        boolean z13;
        Integer num2;
        Context context = h02.f22835a;
        int i14 = h02.f22836b;
        boolean z14 = h02.f22837c;
        j0 j0Var = h02.f22838d;
        if ((i11 & 16) != 0) {
            i12 = h02.f22839e;
        } else {
            i12 = i10;
        }
        if ((i11 & 32) != 0) {
            z12 = h02.f22840f;
        } else {
            z12 = z10;
        }
        if ((i11 & 64) != 0) {
            atomicInteger2 = h02.f22841g;
        } else {
            atomicInteger2 = atomicInteger;
        }
        if ((i11 & 128) != 0) {
            c1763g02 = h02.f22842h;
        } else {
            c1763g02 = c1763g0;
        }
        if ((i11 & 256) != 0) {
            atomicBoolean2 = h02.f22843i;
        } else {
            atomicBoolean2 = atomicBoolean;
        }
        if ((i11 & 512) != 0) {
            j10 = h02.f22844j;
        } else {
            j10 = j6;
        }
        if ((i11 & 1024) != 0) {
            i13 = h02.f22845k;
        } else {
            i13 = 0;
        }
        int i15 = h02.f22846l;
        if ((i11 & 4096) != 0) {
            z13 = h02.f22847m;
        } else {
            z13 = z11;
        }
        if ((i11 & 8192) != 0) {
            num2 = h02.f22848n;
        } else {
            num2 = num;
        }
        ComponentName componentName = h02.f22849o;
        h02.getClass();
        return new H0(context, i14, z14, j0Var, i12, z12, atomicInteger2, c1763g02, atomicBoolean2, j10, i13, i15, z13, num2, componentName);
    }

    public final H0 b(C1763g0 c1763g0, int i10) {
        return a(this, i10, false, null, c1763g0, null, 0L, false, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (!AbstractC3557B.K(this.f22835a, h02.f22835a) || this.f22836b != h02.f22836b || this.f22837c != h02.f22837c || !AbstractC3557B.K(this.f22838d, h02.f22838d) || this.f22839e != h02.f22839e || this.f22840f != h02.f22840f || !AbstractC3557B.K(this.f22841g, h02.f22841g) || !AbstractC3557B.K(this.f22842h, h02.f22842h) || !AbstractC3557B.K(this.f22843i, h02.f22843i)) {
            return false;
        }
        int i10 = Z0.g.f22794d;
        if (this.f22844j == h02.f22844j && this.f22845k == h02.f22845k && this.f22846l == h02.f22846l && this.f22847m == h02.f22847m && AbstractC3557B.K(this.f22848n, h02.f22848n) && AbstractC3557B.K(this.f22849o, h02.f22849o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = ((this.f22835a.hashCode() * 31) + this.f22836b) * 31;
        int i12 = 1;
        boolean z10 = this.f22837c;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (hashCode + i13) * 31;
        int i16 = 0;
        j0 j0Var = this.f22838d;
        if (j0Var == null) {
            i10 = 0;
        } else {
            i10 = j0Var.hashCode();
        }
        int i17 = (((i15 + i10) * 31) + this.f22839e) * 31;
        boolean z11 = this.f22840f;
        if (z11) {
            z11 = true;
        }
        int i18 = z11 ? 1 : 0;
        int i19 = z11 ? 1 : 0;
        int hashCode2 = this.f22841g.hashCode();
        int hashCode3 = this.f22842h.hashCode();
        int hashCode4 = this.f22843i.hashCode();
        int i20 = Z0.g.f22794d;
        long j6 = this.f22844j;
        int i21 = (((((((int) (j6 ^ (j6 >>> 32))) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((i17 + i18) * 31)) * 31)) * 31)) * 31)) * 31) + this.f22845k) * 31) + this.f22846l) * 31;
        boolean z12 = this.f22847m;
        if (!z12) {
            i12 = z12 ? 1 : 0;
        }
        int i22 = (i21 + i12) * 31;
        Integer num = this.f22848n;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i23 = (i22 + i11) * 31;
        ComponentName componentName = this.f22849o;
        if (componentName != null) {
            i16 = componentName.hashCode();
        }
        return i23 + i16;
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f22835a + ", appWidgetId=" + this.f22836b + ", isRtl=" + this.f22837c + ", layoutConfiguration=" + this.f22838d + ", itemPosition=" + this.f22839e + ", isLazyCollectionDescendant=" + this.f22840f + ", lastViewId=" + this.f22841g + ", parentContext=" + this.f22842h + ", isBackgroundSpecified=" + this.f22843i + ", layoutSize=" + ((Object) Z0.g.c(this.f22844j)) + ", layoutCollectionViewId=" + this.f22845k + ", layoutCollectionItemId=" + this.f22846l + ", canUseSelectableGroup=" + this.f22847m + ", actionTargetId=" + this.f22848n + ", actionBroadcastReceiver=" + this.f22849o + ')';
    }
}
