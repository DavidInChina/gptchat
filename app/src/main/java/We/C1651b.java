package We;

import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: We.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1651b extends L4.a implements D {

    /* renamed from: k  reason: collision with root package name */
    public final Integer f20982k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f20983l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f20984m;

    /* renamed from: j  reason: collision with root package name */
    public final String f20981j = null;

    /* renamed from: n  reason: collision with root package name */
    public final int f20985n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final String f20986o = null;

    public C1651b(C1650a c1650a) {
        AbstractC3557B.c0("base", c1650a);
        this.f20982k = c1650a.f20978j;
        this.f20983l = c1650a.f20979k;
        this.f20984m = c1650a.f20980l;
    }

    @Override // We.D
    public final String a() {
        return this.f20986o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1651b)) {
            return false;
        }
        C1651b c1651b = (C1651b) obj;
        if (AbstractC3557B.K(this.f20981j, c1651b.f20981j) && AbstractC3557B.K(this.f20982k, c1651b.f20982k) && this.f20983l == c1651b.f20983l && this.f20984m == c1651b.f20984m && this.f20985n == c1651b.f20985n && AbstractC3557B.K(this.f20986o, c1651b.f20986o)) {
            return true;
        }
        return false;
    }

    @Override // We.D
    public final String getName() {
        return this.f20981j;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f20981j;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        Integer num = this.f20982k;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        int i16 = 1;
        boolean z10 = this.f20983l;
        if (z10) {
            z10 = true;
        }
        int i17 = z10 ? 1 : 0;
        int i18 = z10 ? 1 : 0;
        int i19 = (i15 + i17) * 31;
        boolean z11 = this.f20984m;
        if (!z11) {
            i16 = z11 ? 1 : 0;
        }
        int i20 = (i19 + i16) * 31;
        int i21 = this.f20985n;
        if (i21 == 0) {
            i12 = 0;
        } else {
            i12 = AbstractC6708l.f(i21);
        }
        int i22 = (i20 + i12) * 31;
        String str2 = this.f20986o;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        return i22 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioTrackPublishOptions(name=");
        sb2.append(this.f20981j);
        sb2.append(", audioBitrate=");
        sb2.append(this.f20982k);
        sb2.append(", dtx=");
        sb2.append(this.f20983l);
        sb2.append(", red=");
        sb2.append(this.f20984m);
        sb2.append(", source=");
        sb2.append(Xe.v.d(this.f20985n));
        sb2.append(", stream=");
        return android.gov.nist.core.a.n(sb2, this.f20986o, ')');
    }
}
