package p7;

import M3.H;
import U3.e;
import java.util.Arrays;
import u7.AbstractC5846b;

/* renamed from: p7.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5097b implements AbstractC5846b {

    /* renamed from: h0  reason: collision with root package name */
    public static final C5097b f42752h0 = new C5097b(new e(12));

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f42753Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f42754Z;

    public C5097b(e eVar) {
        this.f42753Y = ((Boolean) eVar.f17400Y).booleanValue();
        this.f42754Z = (String) eVar.f17401Z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5097b)) {
            return false;
        }
        C5097b c5097b = (C5097b) obj;
        c5097b.getClass();
        if (H.P(null, null) && this.f42753Y == c5097b.f42753Y && H.P(this.f42754Z, c5097b.f42754Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f42753Y), this.f42754Z});
    }
}
