package j$.util.stream;

import java.util.HashSet;

/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3810p extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    HashSet f35709b;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (!this.f35709b.contains(obj)) {
            this.f35709b.add(obj);
            this.f35690a.accept((AbstractC3818q2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void k() {
        this.f35709b = null;
        this.f35690a.k();
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35709b = new HashSet();
        this.f35690a.l(-1L);
    }
}
