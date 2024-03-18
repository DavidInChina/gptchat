package e0;

/* renamed from: e0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2759v extends AbstractC2756s {

    /* renamed from: i0  reason: collision with root package name */
    public final C2746i f28718i0;

    public C2759v(C2746i c2746i) {
        this.f28718i0 = c2746i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f28717h0;
        this.f28717h0 = i10 + 2;
        Object[] objArr = this.f28715Y;
        return new C2740c(this.f28718i0, objArr[i10], objArr[i10 + 1]);
    }
}
