package C2;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final String f2632a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2633b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2634c;

    public u(String str, boolean z10, boolean z11) {
        this.f2632a = str;
        this.f2633b = z10;
        this.f2634c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != u.class) {
            return false;
        }
        u uVar = (u) obj;
        if (TextUtils.equals(this.f2632a, uVar.f2632a) && this.f2633b == uVar.f2633b && this.f2634c == uVar.f2634c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f2632a, 31, 31);
        int i11 = 1237;
        if (this.f2633b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (v10 + i10) * 31;
        if (this.f2634c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
