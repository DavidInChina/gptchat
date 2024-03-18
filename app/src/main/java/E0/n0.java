package E0;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f4083a;

    /* renamed from: b  reason: collision with root package name */
    public J f4084b;

    /* renamed from: c  reason: collision with root package name */
    public final m0 f4085c = new m0(this, 2);

    /* renamed from: d  reason: collision with root package name */
    public final m0 f4086d = new m0(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final m0 f4087e = new m0(this, 1);

    public n0(q0 q0Var) {
        this.f4083a = q0Var;
    }

    public final J a() {
        J j6 = this.f4084b;
        if (j6 != null) {
            return j6;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}
