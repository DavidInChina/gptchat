package y2;

import android.text.TextUtils;
import p2.C5065s;

/* renamed from: y2.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6521h {

    /* renamed from: a  reason: collision with root package name */
    public final String f50603a;

    /* renamed from: b  reason: collision with root package name */
    public final C5065s f50604b;

    /* renamed from: c  reason: collision with root package name */
    public final C5065s f50605c;

    /* renamed from: d  reason: collision with root package name */
    public final int f50606d;

    /* renamed from: e  reason: collision with root package name */
    public final int f50607e;

    public C6521h(String str, C5065s c5065s, C5065s c5065s2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.l(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f50603a = str;
            this.f50604b = c5065s;
            c5065s2.getClass();
            this.f50605c = c5065s2;
            this.f50606d = i10;
            this.f50607e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6521h.class != obj.getClass()) {
            return false;
        }
        C6521h c6521h = (C6521h) obj;
        if (this.f50606d == c6521h.f50606d && this.f50607e == c6521h.f50607e && this.f50603a.equals(c6521h.f50603a) && this.f50604b.equals(c6521h.f50604b) && this.f50605c.equals(c6521h.f50605c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f50603a, (((527 + this.f50606d) * 31) + this.f50607e) * 31, 31);
        return this.f50605c.hashCode() + ((this.f50604b.hashCode() + v10) * 31);
    }
}
