package a1;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: a1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1916d implements AbstractC1913a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f23848c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f23849a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f23850b;

    public C1916d(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.f23849a = fArr;
            this.f23850b = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
    }

    @Override // a1.AbstractC1913a
    public final float a(float f6) {
        return C1915c.b(f6, this.f23850b, this.f23849a);
    }

    @Override // a1.AbstractC1913a
    public final float b(float f6) {
        return C1915c.b(f6, this.f23849a, this.f23850b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1916d)) {
            return false;
        }
        C1916d c1916d = (C1916d) obj;
        if (Arrays.equals(this.f23849a, c1916d.f23849a) && Arrays.equals(this.f23850b, c1916d.f23850b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23850b) + (Arrays.hashCode(this.f23849a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f23849a);
        AbstractC3557B.b0("toString(this)", arrays);
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f23850b);
        AbstractC3557B.b0("toString(this)", arrays2);
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
