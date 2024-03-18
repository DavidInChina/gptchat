package L2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final int f10529a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10530b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10531c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10532d;

    public F(int i10, int i11, int i12, byte[] bArr) {
        this.f10529a = i10;
        this.f10530b = bArr;
        this.f10531c = i11;
        this.f10532d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f6 = (F) obj;
        if (this.f10529a == f6.f10529a && this.f10531c == f6.f10531c && this.f10532d == f6.f10532d && Arrays.equals(this.f10530b, f6.f10530b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10530b) + (this.f10529a * 31)) * 31) + this.f10531c) * 31) + this.f10532d;
    }
}
