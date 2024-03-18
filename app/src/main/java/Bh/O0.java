package Bh;

/* loaded from: classes.dex */
public final class O0 extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2236d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2237e;

    public O0(int i10, io.sentry.vendor.b bVar, androidx.lifecycle.D d10) {
        super(i10, bVar, (Object) null);
        this.f2237e = d10;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        int i10 = this.f2236d;
        Object obj = this.f2237e;
        switch (i10) {
            case 0:
                ((Q0) obj).f2246d.i();
                return super.d(str, z10);
            default:
                io.sentry.vendor.b d10 = super.d(((androidx.lifecycle.D) obj).d(str), z10);
                if (d10 == null) {
                    return null;
                }
                androidx.lifecycle.D d11 = (androidx.lifecycle.D) obj;
                return new Oh.a(this.f34787b, str, d10, d11).B(new Oh.a(this.f34787b, null, d10, d11));
        }
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        switch (this.f2236d) {
            case 1:
                Object obj = this.f2237e;
                io.sentry.vendor.b y10 = super.y(i10, hVar, ((androidx.lifecycle.D) obj).d(str), z10);
                if (y10 == null) {
                    return null;
                }
                androidx.lifecycle.D d10 = (androidx.lifecycle.D) obj;
                return new Oh.a(this.f34787b, str, y10, d10).B(new Oh.a(this.f34787b, null, y10, d10));
            default:
                return super.y(i10, hVar, str, z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(Q0 q02, io.sentry.vendor.b bVar) {
        super(Sh.I.f16703b, bVar, (Object) null);
        this.f2237e = q02;
    }
}
