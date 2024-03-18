package yh;

/* loaded from: classes2.dex */
public final class D1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f50928Z;

    public D1(Class cls) {
        super(0);
        this.f50928Z = cls;
    }

    @Override // yh.r1, yh.G1
    public final H1 Q() {
        return new q1(this.f50928Z.getInterfaces());
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Class cls = this.f50928Z;
        return new C1(cls, i10, cls.getInterfaces());
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50928Z.getInterfaces().length;
    }
}
