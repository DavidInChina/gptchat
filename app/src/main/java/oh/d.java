package Oh;

import I5.h;
import androidx.lifecycle.D;

/* loaded from: classes.dex */
public final class d extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final D f13765d;

    public d(int i10, io.sentry.vendor.b bVar, D d10) {
        super(i10, bVar, (io.sentry.vendor.a) null);
        this.f13765d = d10;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        D d10 = this.f13765d;
        io.sentry.vendor.b d11 = super.d(d10.d(str), z10);
        if (d11 == null) {
            return null;
        }
        return new a(this.f34787b, str, d11, d10).B(new a(this.f34787b, null, d11, d10));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, h hVar, String str, boolean z10) {
        D d10 = this.f13765d;
        io.sentry.vendor.b y10 = super.y(i10, hVar, d10.d(str), z10);
        if (y10 == null) {
            return null;
        }
        return new a(this.f34787b, str, y10, d10).B(new a(this.f34787b, null, y10, d10));
    }
}
