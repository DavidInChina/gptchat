package Bh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2202a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2203b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ R0 f2204c;

    public F0(R0 r02, byte[] bArr, ArrayList arrayList) {
        this.f2204c = r02;
        this.f2202a = bArr;
        this.f2203b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F0.class != obj.getClass()) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (Arrays.equals(this.f2202a, f02.f2202a) && this.f2203b.equals(f02.f2203b) && this.f2204c.equals(f02.f2204c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f2202a);
        return this.f2204c.hashCode() + AbstractC4194d.s(this.f2203b, (hashCode + (F0.class.hashCode() * 31)) * 31, 31);
    }
}
