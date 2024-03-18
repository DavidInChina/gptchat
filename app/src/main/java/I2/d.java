package I2;

import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public int f7964c;

    /* renamed from: d  reason: collision with root package name */
    public int f7965d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7962a = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f7963b = 65536;

    /* renamed from: e  reason: collision with root package name */
    public int f7966e = 0;

    /* renamed from: f  reason: collision with root package name */
    public a[] f7967f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f7964c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7964c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, AbstractC5530A.f(this.f7964c, this.f7963b) - this.f7965d);
        int i10 = this.f7966e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f7967f, max, i10, (Object) null);
        this.f7966e = max;
    }
}
