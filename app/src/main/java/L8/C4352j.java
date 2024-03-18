package l8;

/* renamed from: l8.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4352j {

    /* renamed from: a  reason: collision with root package name */
    public final int f37884a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37885b;

    public C4352j(int i10, boolean z10) {
        this.f37884a = i10;
        this.f37885b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4352j) {
            C4352j c4352j = (C4352j) obj;
            if (this.f37884a == c4352j.f37884a && this.f37885b == c4352j.f37885b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f37884a ^ 1000003;
        if (true != this.f37885b) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return (i11 * 1000003) ^ i10;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f37884a + ", allowAssetPackDeletion=" + this.f37885b + "}";
    }
}
