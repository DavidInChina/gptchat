package e0;

import f0.C2930a;
import kf.AbstractC4281f;

/* renamed from: e0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2741d extends AbstractC4281f implements c0.f {

    /* renamed from: h0  reason: collision with root package name */
    public static final C2741d f28685h0 = new C2741d(C2755r.f28710e, 0);

    /* renamed from: Y  reason: collision with root package name */
    public final C2755r f28686Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f28687Z;

    public C2741d(C2755r c2755r, int i10) {
        this.f28686Y = c2755r;
        this.f28687Z = i10;
    }

    /* renamed from: a */
    public C2743f builder() {
        return new C2743f(this);
    }

    public final C2741d b(Object obj, C2930a c2930a) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        C2754q u10 = this.f28686Y.u(i10, obj, c2930a, 0);
        if (u10 == null) {
            return this;
        }
        return new C2741d(u10.f28708a, this.f28687Z + u10.f28709b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return this.f28686Y.d(i10, obj, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return this.f28686Y.g(i10, obj, 0);
    }
}
