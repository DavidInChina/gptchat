package B2;

import java.util.UUID;
import s2.AbstractC5530A;
import x2.AbstractC6267b;

/* loaded from: classes2.dex */
public final class z implements AbstractC6267b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f1825d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f1826a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f1827b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1828c;

    static {
        boolean z10;
        if ("Amazon".equals(AbstractC5530A.f45133c)) {
            String str = AbstractC5530A.f45134d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f1825d = z10;
            }
        }
        z10 = false;
        f1825d = z10;
    }

    public z(UUID uuid, byte[] bArr, boolean z10) {
        this.f1826a = uuid;
        this.f1827b = bArr;
        this.f1828c = z10;
    }
}
