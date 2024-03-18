package e7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final b7.b f29015a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f29016b;

    public l(b7.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f29015a = bVar;
                this.f29016b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f29015a.equals(lVar.f29015a)) {
            return false;
        }
        return Arrays.equals(this.f29016b, lVar.f29016b);
    }

    public final int hashCode() {
        return ((this.f29015a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29016b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f29015a + ", bytes=[...]}";
    }
}
