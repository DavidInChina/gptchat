package y2;

import java.util.Arrays;

/* renamed from: y2.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6513P {

    /* renamed from: a  reason: collision with root package name */
    public final long f50454a;

    /* renamed from: b  reason: collision with root package name */
    public final float f50455b;

    /* renamed from: c  reason: collision with root package name */
    public final long f50456c;

    public C6513P(C6512O c6512o) {
        this.f50454a = c6512o.f50451a;
        this.f50455b = c6512o.f50452b;
        this.f50456c = c6512o.f50453c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6513P)) {
            return false;
        }
        C6513P c6513p = (C6513P) obj;
        if (this.f50454a == c6513p.f50454a && this.f50455b == c6513p.f50455b && this.f50456c == c6513p.f50456c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f50454a), Float.valueOf(this.f50455b), Long.valueOf(this.f50456c)});
    }
}
