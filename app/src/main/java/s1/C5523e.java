package s1;

import android.graphics.Insets;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: s1.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5523e {

    /* renamed from: e  reason: collision with root package name */
    public static final C5523e f45105e = new C5523e(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f45106a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45107b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45108c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45109d;

    public C5523e(int i10, int i11, int i12, int i13) {
        this.f45106a = i10;
        this.f45107b = i11;
        this.f45108c = i12;
        this.f45109d = i13;
    }

    public static C5523e a(C5523e c5523e, C5523e c5523e2) {
        return b(Math.max(c5523e.f45106a, c5523e2.f45106a), Math.max(c5523e.f45107b, c5523e2.f45107b), Math.max(c5523e.f45108c, c5523e2.f45108c), Math.max(c5523e.f45109d, c5523e2.f45109d));
    }

    public static C5523e b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f45105e;
        }
        return new C5523e(i10, i11, i12, i13);
    }

    public static C5523e c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return AbstractC5522d.a(this.f45106a, this.f45107b, this.f45108c, this.f45109d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5523e.class != obj.getClass()) {
            return false;
        }
        C5523e c5523e = (C5523e) obj;
        if (this.f45109d == c5523e.f45109d && this.f45106a == c5523e.f45106a && this.f45108c == c5523e.f45108c && this.f45107b == c5523e.f45107b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f45106a * 31) + this.f45107b) * 31) + this.f45108c) * 31) + this.f45109d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f45106a);
        sb2.append(", top=");
        sb2.append(this.f45107b);
        sb2.append(", right=");
        sb2.append(this.f45108c);
        sb2.append(", bottom=");
        return AbstractC2469q0.j(sb2, this.f45109d, '}');
    }
}
