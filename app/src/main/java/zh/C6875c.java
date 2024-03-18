package zh;

import java.util.Arrays;

/* renamed from: zh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6875c implements AbstractC6877e {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f52122a;

    public C6875c(byte[] bArr) {
        this.f52122a = bArr;
    }

    @Override // zh.AbstractC6877e
    public final byte[] a() {
        return this.f52122a;
    }

    @Override // zh.AbstractC6877e
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6875c.class != obj.getClass()) {
            return false;
        }
        if (Arrays.equals(this.f52122a, ((C6875c) obj).f52122a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f52122a) + (C6875c.class.hashCode() * 31);
    }
}
