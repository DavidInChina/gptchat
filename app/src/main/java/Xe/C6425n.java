package xe;

import id.AbstractC3557B;
import java.util.List;
import java.util.Set;

/* renamed from: xe.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6425n implements AbstractC6432u {

    /* renamed from: c  reason: collision with root package name */
    public static final C6425n f49943c = new Object();

    @Override // Fe.v
    public final Set a() {
        return kf.x.f37485Y;
    }

    @Override // Fe.v
    public final boolean b() {
        return true;
    }

    @Override // Fe.v
    public final List c(String str) {
        AbstractC3557B.c0("name", str);
        return null;
    }

    @Override // Fe.v
    public final void d(wf.n nVar) {
        Df.H.M(this, (Jb.c) nVar);
    }

    @Override // Fe.v
    public final String e(String str) {
        c(str);
        return null;
    }

    @Override // Fe.v
    public final Set names() {
        return kf.x.f37485Y;
    }

    public final String toString() {
        return "Headers " + kf.x.f37485Y;
    }
}
