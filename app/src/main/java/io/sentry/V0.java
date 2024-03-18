package io.sentry;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33876a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3636c1 f33877b;

    public /* synthetic */ V0(C3636c1 c3636c1, int i10) {
        this.f33876a = i10;
        this.f33877b = c3636c1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f33876a;
        C3636c1 c3636c1 = this.f33877b;
        switch (i10) {
            case 0:
                return Integer.valueOf(c3636c1.k().length);
            case 1:
                return c3636c1.k();
            case 2:
                return Integer.valueOf(c3636c1.k().length);
            case 3:
                return c3636c1.k();
            case 4:
                return Integer.valueOf(c3636c1.k().length);
            case 5:
                return c3636c1.k();
            case 6:
                return Integer.valueOf(c3636c1.k().length);
            case 7:
                return c3636c1.k();
            case 8:
                return Integer.valueOf(c3636c1.k().length);
            case 9:
                return c3636c1.k();
            case 10:
                return Integer.valueOf(c3636c1.k().length);
            default:
                return c3636c1.k();
        }
    }
}
