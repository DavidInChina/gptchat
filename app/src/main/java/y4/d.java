package y4;

import java.util.List;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public float f50718a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    public final Object f50719b;

    public d(List list) {
        this.f50719b = (J4.a) list.get(0);
    }

    @Override // y4.b
    public final boolean b(float f6) {
        if (this.f50718a == f6) {
            return true;
        }
        this.f50718a = f6;
        return false;
    }

    @Override // y4.b
    public final J4.a c() {
        return (J4.a) this.f50719b;
    }

    @Override // y4.b
    public final boolean d(float f6) {
        return !((J4.a) this.f50719b).c();
    }

    @Override // y4.b
    public final float e() {
        return ((J4.a) this.f50719b).a();
    }

    @Override // y4.b
    public final float f() {
        return ((J4.a) this.f50719b).b();
    }

    @Override // y4.b
    public final boolean isEmpty() {
        return false;
    }
}
