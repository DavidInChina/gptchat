package We;

import id.AbstractC3557B;
import y.AbstractC6463a;

/* renamed from: We.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1652c {

    /* renamed from: a  reason: collision with root package name */
    public final String f20987a = "vp8";

    /* renamed from: b  reason: collision with root package name */
    public final Xe.F f20988b = null;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20989c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1652c)) {
            return false;
        }
        C1652c c1652c = (C1652c) obj;
        if (AbstractC3557B.K(this.f20987a, c1652c.f20987a) && AbstractC3557B.K(this.f20988b, c1652c.f20988b) && this.f20989c == c1652c.f20989c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f20987a.hashCode() * 31;
        Xe.F f6 = this.f20988b;
        if (f6 == null) {
            i10 = 0;
        } else {
            i10 = f6.hashCode();
        }
        int i11 = (hashCode + i10) * 31;
        boolean z10 = this.f20989c;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        return i11 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackupVideoCodec(codec=");
        sb2.append(this.f20987a);
        sb2.append(", encoding=");
        sb2.append(this.f20988b);
        sb2.append(", simulcast=");
        return AbstractC6463a.l(sb2, this.f20989c, ')');
    }
}
