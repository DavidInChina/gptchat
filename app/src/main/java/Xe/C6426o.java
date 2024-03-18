package xe;

import id.AbstractC3557B;
import java.util.List;
import java.util.Set;

/* renamed from: xe.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6426o implements AbstractC6401F {

    /* renamed from: c  reason: collision with root package name */
    public static final C6426o f49944c = new Object();

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

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC6401F) && ((AbstractC6401F) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // Fe.v
    public final boolean isEmpty() {
        return true;
    }

    @Override // Fe.v
    public final Set names() {
        return kf.x.f37485Y;
    }

    public final String toString() {
        return "Parameters " + kf.x.f37485Y;
    }
}
