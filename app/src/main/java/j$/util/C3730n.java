package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3730n {

    /* renamed from: c  reason: collision with root package name */
    private static final C3730n f35373c = new C3730n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35374a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35375b;

    private C3730n() {
        this.f35374a = false;
        this.f35375b = 0L;
    }

    private C3730n(long j6) {
        this.f35374a = true;
        this.f35375b = j6;
    }

    public static C3730n a() {
        return f35373c;
    }

    public static C3730n d(long j6) {
        return new C3730n(j6);
    }

    public final long b() {
        if (this.f35374a) {
            return this.f35375b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f35374a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3730n)) {
            return false;
        }
        C3730n c3730n = (C3730n) obj;
        boolean z10 = this.f35374a;
        if (!z10 || !c3730n.f35374a) {
            if (z10 == c3730n.f35374a) {
                return true;
            }
        } else if (this.f35375b == c3730n.f35375b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f35374a) {
            long j6 = this.f35375b;
            return (int) (j6 ^ (j6 >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.f35374a) {
            return "OptionalLong[" + this.f35375b + "]";
        }
        return "OptionalLong.empty";
    }
}
