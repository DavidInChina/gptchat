package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2026k extends AbstractC2025j {

    /* renamed from: i0  reason: collision with root package name */
    public final byte[] f25069i0;

    public C2026k(byte[] bArr) {
        this.f25068Y = 0;
        bArr.getClass();
        this.f25069i0 = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2025j
    public byte I(int i10) {
        return this.f25069i0[i10];
    }

    public int T() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2025j) || size() != ((AbstractC2025j) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C2026k) {
            C2026k c2026k = (C2026k) obj;
            int i10 = this.f25068Y;
            int i11 = c2026k.f25068Y;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size <= c2026k.size()) {
                if (size <= c2026k.size()) {
                    int T = T() + size;
                    int T10 = T();
                    int T11 = c2026k.T();
                    while (T10 < T) {
                        if (this.f25069i0[T10] != c2026k.f25069i0[T11]) {
                            return false;
                        }
                        T10++;
                        T11++;
                    }
                    return true;
                }
                StringBuilder q10 = android.gov.nist.core.a.q("Ran off end of other: 0, ", size, ", ");
                q10.append(c2026k.size());
                throw new IllegalArgumentException(q10.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2025j
    public byte f(int i10) {
        return this.f25069i0[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2025j
    public int size() {
        return this.f25069i0.length;
    }
}
