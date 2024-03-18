package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3859z extends C {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f35785s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3859z(AbstractC3745c abstractC3745c, int i10, int i11) {
        super(abstractC3745c, i10);
        this.f35785s = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        switch (this.f35785s) {
            case 0:
                return abstractC3818q2;
            case 1:
                return new Y(this, abstractC3818q2, 3);
            default:
                return new C3771h0(this, abstractC3818q2, 1);
        }
    }
}
