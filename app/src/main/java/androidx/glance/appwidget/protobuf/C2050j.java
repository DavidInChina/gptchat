package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2050j extends AbstractC2049i {

    /* renamed from: i0  reason: collision with root package name */
    public final byte[] f25226i0;

    public C2050j(byte[] bArr) {
        this.f25225Y = 0;
        bArr.getClass();
        this.f25226i0 = bArr;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2049i
    public byte I(int i10) {
        return this.f25226i0[i10];
    }

    public int T() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2049i) || size() != ((AbstractC2049i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C2050j) {
            C2050j c2050j = (C2050j) obj;
            int i10 = this.f25225Y;
            int i11 = c2050j.f25225Y;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size <= c2050j.size()) {
                if (size <= c2050j.size()) {
                    int T = T() + size;
                    int T10 = T();
                    int T11 = c2050j.T();
                    while (T10 < T) {
                        if (this.f25226i0[T10] != c2050j.f25226i0[T11]) {
                            return false;
                        }
                        T10++;
                        T11++;
                    }
                    return true;
                }
                StringBuilder q10 = android.gov.nist.core.a.q("Ran off end of other: 0, ", size, ", ");
                q10.append(c2050j.size());
                throw new IllegalArgumentException(q10.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2049i
    public byte f(int i10) {
        return this.f25226i0[i10];
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2049i
    public int size() {
        return this.f25226i0.length;
    }
}
