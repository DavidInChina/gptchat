package K8;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class h extends Number {

    /* renamed from: Y  reason: collision with root package name */
    public final String f9551Y;

    public h(String str) {
        this.f9551Y = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f9551Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        String str = ((h) obj).f9551Y;
        String str2 = this.f9551Y;
        if (str2 == str || str2.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f9551Y);
    }

    public final int hashCode() {
        return this.f9551Y.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f9551Y;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f9551Y;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f9551Y;
    }
}
