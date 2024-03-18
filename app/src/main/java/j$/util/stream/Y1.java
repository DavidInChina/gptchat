package j$.util.stream;

/* loaded from: classes3.dex */
final class Y1 extends Z1 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35574b++;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        this.f35574b += ((Z1) t12).f35574b;
    }

    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f35574b);
    }
}
