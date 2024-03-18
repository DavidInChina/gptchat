package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3834u extends AbstractC3773h2 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f35733s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f35734t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3834u(AbstractC3745c abstractC3745c, int i10, Object obj, int i11) {
        super(abstractC3745c, i10);
        this.f35733s = i11;
        this.f35734t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        switch (this.f35733s) {
            case 0:
                return new C3829t(this, abstractC3818q2, 0);
            case 1:
                return new Y(this, abstractC3818q2, 0);
            case 2:
                return new C3771h0(this, abstractC3818q2, 0);
            case 3:
                return new C3743b2(this, abstractC3818q2, 0);
            default:
                return new C3743b2(this, abstractC3818q2, 1);
        }
    }
}
