package th;

/* renamed from: th.V  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5789V extends Z {

    /* renamed from: a  reason: collision with root package name */
    public final Class f46197a;

    public C5789V(Class cls) {
        this.f46197a = cls;
    }

    @Override // th.a0
    public final Object c() {
        throw new IncompatibleClassChangeError(this.f46197a.toString());
    }

    public final String toString() {
        return "/* Warning type incompatibility! \"" + this.f46197a.getName() + "\" */";
    }
}
