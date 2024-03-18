package Xe;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21908a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21909b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC1680b f21910c;

    /* renamed from: d  reason: collision with root package name */
    public final C f21911d;

    public m(boolean z10, int i10) {
        this((i10 & 1) != 0 ? false : z10, null, EnumC1680b.f21884Y, G.H540.f21867Y);
    }

    public static m a(m mVar, String str, EnumC1680b enumC1680b, int i10) {
        boolean z10 = mVar.f21908a;
        if ((i10 & 2) != 0) {
            str = mVar.f21909b;
        }
        if ((i10 & 4) != 0) {
            enumC1680b = mVar.f21910c;
        }
        C c10 = mVar.f21911d;
        mVar.getClass();
        AbstractC3557B.c0("captureParams", c10);
        return new m(z10, str, enumC1680b, c10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f21908a == mVar.f21908a && AbstractC3557B.K(this.f21909b, mVar.f21909b) && this.f21910c == mVar.f21910c && AbstractC3557B.K(this.f21911d, mVar.f21911d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        boolean z10 = this.f21908a;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = i11 * 31;
        int i14 = 0;
        String str = this.f21909b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (i13 + i10) * 31;
        EnumC1680b enumC1680b = this.f21910c;
        if (enumC1680b != null) {
            i14 = enumC1680b.hashCode();
        }
        return this.f21911d.hashCode() + ((i15 + i14) * 31);
    }

    public final String toString() {
        return "LocalVideoTrackOptions(isScreencast=" + this.f21908a + ", deviceId=" + this.f21909b + ", position=" + this.f21910c + ", captureParams=" + this.f21911d + ')';
    }

    public m(boolean z10, String str, EnumC1680b enumC1680b, C c10) {
        AbstractC3557B.c0("captureParams", c10);
        this.f21908a = z10;
        this.f21909b = str;
        this.f21910c = enumC1680b;
        this.f21911d = c10;
    }
}
