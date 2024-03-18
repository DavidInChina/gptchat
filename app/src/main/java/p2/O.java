package p2;

import java.io.IOException;

/* loaded from: classes.dex */
public class O extends IOException {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f41919Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f41920Z;

    public O(String str, RuntimeException runtimeException, boolean z10, int i10) {
        super(str, runtimeException);
        this.f41919Y = z10;
        this.f41920Z = i10;
    }

    public static O a(String str, RuntimeException runtimeException) {
        return new O(str, runtimeException, true, 1);
    }

    public static O b(String str) {
        return new O(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f41919Y);
        sb2.append(", dataType=");
        return android.gov.nist.core.a.l(sb2, this.f41920Z, "}");
    }
}
