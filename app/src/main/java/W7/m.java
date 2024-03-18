package w7;

import java.util.Arrays;
import u7.AbstractC5846b;

/* loaded from: classes2.dex */
public final class m implements AbstractC5846b {

    /* renamed from: Z  reason: collision with root package name */
    public static final m f48183Z = new m(null);

    /* renamed from: Y  reason: collision with root package name */
    public final String f48184Y;

    public /* synthetic */ m(String str) {
        this.f48184Y = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return M3.H.P(this.f48184Y, ((m) obj).f48184Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48184Y});
    }
}
