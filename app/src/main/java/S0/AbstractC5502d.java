package s0;

import id.AbstractC3557B;

/* renamed from: s0.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5502d {

    /* renamed from: a  reason: collision with root package name */
    public final String f45023a;

    /* renamed from: b  reason: collision with root package name */
    public final long f45024b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45025c;

    public AbstractC5502d(String str, long j6, int i10) {
        this.f45023a = str;
        this.f45024b = j6;
        this.f45025c = i10;
        if (str.length() != 0) {
            if (i10 >= -1 && i10 <= 63) {
                return;
            }
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
        throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f6, float f10, float f11);

    public abstract float e(float f6, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5502d abstractC5502d = (AbstractC5502d) obj;
        if (this.f45025c != abstractC5502d.f45025c || !AbstractC3557B.K(this.f45023a, abstractC5502d.f45023a)) {
            return false;
        }
        return AbstractC5501c.a(this.f45024b, abstractC5502d.f45024b);
    }

    public abstract long f(float f6, float f10, float f11, float f12, AbstractC5502d abstractC5502d);

    public int hashCode() {
        int i10 = AbstractC5501c.f45022e;
        long j6 = this.f45024b;
        return (((this.f45023a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f45025c;
    }

    public final String toString() {
        return this.f45023a + " (id=" + this.f45025c + ", model=" + ((Object) AbstractC5501c.b(this.f45024b)) + ')';
    }
}
