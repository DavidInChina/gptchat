package io.sentry;

/* loaded from: classes2.dex */
public final class N0 implements S0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33829Y;

    /* renamed from: Z  reason: collision with root package name */
    public final jh.H1 f33830Z;

    public N0(int i10) {
        this.f33829Y = i10;
        if (i10 != 1) {
            if ((!io.sentry.util.d.f34775a) && io.sentry.util.d.f34776b) {
                this.f33830Z = new jh.H1(0);
                return;
            } else {
                this.f33830Z = new jh.H1(1);
                return;
            }
        }
        this.f33830Z = new jh.H1(1);
    }

    @Override // io.sentry.S0
    public final R0 e() {
        switch (this.f33829Y) {
            case 0:
                return this.f33830Z.e();
            default:
                return this.f33830Z.e();
        }
    }
}
