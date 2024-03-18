package z2;

import E2.C0492y;
import M3.H;
import java.util.Arrays;
import p2.g0;

/* renamed from: z2.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6757b {

    /* renamed from: a  reason: collision with root package name */
    public final long f51491a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f51492b;

    /* renamed from: c  reason: collision with root package name */
    public final int f51493c;

    /* renamed from: d  reason: collision with root package name */
    public final C0492y f51494d;

    /* renamed from: e  reason: collision with root package name */
    public final long f51495e;

    /* renamed from: f  reason: collision with root package name */
    public final g0 f51496f;

    /* renamed from: g  reason: collision with root package name */
    public final int f51497g;

    /* renamed from: h  reason: collision with root package name */
    public final C0492y f51498h;

    /* renamed from: i  reason: collision with root package name */
    public final long f51499i;

    /* renamed from: j  reason: collision with root package name */
    public final long f51500j;

    public C6757b(long j6, g0 g0Var, int i10, C0492y c0492y, long j10, g0 g0Var2, int i11, C0492y c0492y2, long j11, long j12) {
        this.f51491a = j6;
        this.f51492b = g0Var;
        this.f51493c = i10;
        this.f51494d = c0492y;
        this.f51495e = j10;
        this.f51496f = g0Var2;
        this.f51497g = i11;
        this.f51498h = c0492y2;
        this.f51499i = j11;
        this.f51500j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6757b.class != obj.getClass()) {
            return false;
        }
        C6757b c6757b = (C6757b) obj;
        if (this.f51491a == c6757b.f51491a && this.f51493c == c6757b.f51493c && this.f51495e == c6757b.f51495e && this.f51497g == c6757b.f51497g && this.f51499i == c6757b.f51499i && this.f51500j == c6757b.f51500j && H.O(this.f51492b, c6757b.f51492b) && H.O(this.f51494d, c6757b.f51494d) && H.O(this.f51496f, c6757b.f51496f) && H.O(this.f51498h, c6757b.f51498h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f51491a), this.f51492b, Integer.valueOf(this.f51493c), this.f51494d, Long.valueOf(this.f51495e), this.f51496f, Integer.valueOf(this.f51497g), this.f51498h, Long.valueOf(this.f51499i), Long.valueOf(this.f51500j)});
    }
}
