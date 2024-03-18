package x8;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 extends W {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f49556a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ W f49557b;

    public f0(W w10) {
        this.f49557b = w10;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [x8.t, x8.c, x8.g0] */
    public final g0 X() {
        Map E10 = this.f49557b.E();
        e0 e0Var = new e0(this.f49556a);
        ?? abstractC6375t = new AbstractC6375t();
        if (E10.isEmpty()) {
            abstractC6375t.f49545i0 = E10;
            abstractC6375t.f49562k0 = e0Var;
            return abstractC6375t;
        }
        throw new IllegalArgumentException();
    }
}
