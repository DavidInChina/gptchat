package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3729m {

    /* renamed from: c  reason: collision with root package name */
    private static final C3729m f35370c = new C3729m();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35371a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35372b;

    private C3729m() {
        this.f35371a = false;
        this.f35372b = 0;
    }

    private C3729m(int i10) {
        this.f35371a = true;
        this.f35372b = i10;
    }

    public static C3729m a() {
        return f35370c;
    }

    public static C3729m d(int i10) {
        return new C3729m(i10);
    }

    public final int b() {
        if (this.f35371a) {
            return this.f35372b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f35371a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3729m)) {
            return false;
        }
        C3729m c3729m = (C3729m) obj;
        boolean z10 = this.f35371a;
        if (!z10 || !c3729m.f35371a) {
            if (z10 == c3729m.f35371a) {
                return true;
            }
        } else if (this.f35372b == c3729m.f35372b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f35371a) {
            return this.f35372b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f35371a) {
            return "OptionalInt[" + this.f35372b + "]";
        }
        return "OptionalInt.empty";
    }
}
