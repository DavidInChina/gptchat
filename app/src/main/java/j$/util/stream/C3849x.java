package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3849x extends AbstractC3791l0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f35762s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f35763t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3849x(AbstractC3745c abstractC3745c, int i10, Object obj, int i11) {
        super(abstractC3745c, i10);
        this.f35762s = i11;
        this.f35763t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        switch (this.f35762s) {
            case 0:
                return new C3829t(this, abstractC3818q2, 3);
            case 1:
                return new Y(this, abstractC3818q2, 5);
            case 2:
                return new C3771h0(this, abstractC3818q2, 2);
            case 3:
                return new C3776i0(this, abstractC3818q2);
            case 4:
                return new C3771h0(this, abstractC3818q2, 5);
            case 5:
                return new C3771h0(this, abstractC3818q2, 6);
            case 6:
                return new C3805o(this, abstractC3818q2);
            default:
                return new C3743b2(this, abstractC3818q2, 4);
        }
    }
}
