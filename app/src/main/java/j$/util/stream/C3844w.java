package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3844w extends AbstractC3756e0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f35755s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f35756t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3844w(AbstractC3745c abstractC3745c, int i10, Object obj, int i11) {
        super(abstractC3745c, i10);
        this.f35755s = i11;
        this.f35756t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        switch (this.f35755s) {
            case 0:
                return new C3829t(this, abstractC3818q2, 2);
            case 1:
                return new Y(this, abstractC3818q2, 1);
            case 2:
                return new Y(this, abstractC3818q2, 4);
            case 3:
                return new C3736a0(this, abstractC3818q2);
            case 4:
                return new Y(this, abstractC3818q2, 7);
            case 5:
                return new C3771h0(this, abstractC3818q2, 3);
            case 6:
                return new C3743b2(this, abstractC3818q2, 3);
            default:
                return new C3805o(this, abstractC3818q2);
        }
    }
}
