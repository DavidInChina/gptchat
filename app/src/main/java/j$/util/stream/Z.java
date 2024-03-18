package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z extends AbstractC3791l0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f35573s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC3745c abstractC3745c, int i10, int i11) {
        super(abstractC3745c, i10);
        this.f35573s = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        switch (this.f35573s) {
            case 0:
                return new Y(this, abstractC3818q2, 2);
            default:
                return abstractC3818q2;
        }
    }
}
