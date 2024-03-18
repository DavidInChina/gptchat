package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes3.dex */
abstract class E2 extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    protected final Comparator f35411b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f35412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(AbstractC3818q2 abstractC3818q2, Comparator comparator) {
        super(abstractC3818q2);
        this.f35411b = comparator;
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        this.f35412c = true;
        return false;
    }
}
