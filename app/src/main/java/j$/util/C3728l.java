package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3728l {

    /* renamed from: c  reason: collision with root package name */
    private static final C3728l f35367c = new C3728l();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35368a;

    /* renamed from: b  reason: collision with root package name */
    private final double f35369b;

    private C3728l() {
        this.f35368a = false;
        this.f35369b = Double.NaN;
    }

    private C3728l(double d10) {
        this.f35368a = true;
        this.f35369b = d10;
    }

    public static C3728l a() {
        return f35367c;
    }

    public static C3728l d(double d10) {
        return new C3728l(d10);
    }

    public final double b() {
        if (this.f35368a) {
            return this.f35369b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f35368a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3728l)) {
            return false;
        }
        C3728l c3728l = (C3728l) obj;
        boolean z10 = this.f35368a;
        if (!z10 || !c3728l.f35368a) {
            if (z10 == c3728l.f35368a) {
                return true;
            }
        } else if (Double.compare(this.f35369b, c3728l.f35369b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f35368a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f35369b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.f35368a) {
            return "OptionalDouble[" + this.f35369b + "]";
        }
        return "OptionalDouble.empty";
    }
}
