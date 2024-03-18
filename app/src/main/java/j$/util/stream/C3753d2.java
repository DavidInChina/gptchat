package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.d2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3753d2 extends AbstractC3773h2 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f35610s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Function f35611t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3753d2(AbstractC3745c abstractC3745c, int i10, Function function, int i11) {
        super(abstractC3745c, i10);
        this.f35610s = i11;
        this.f35611t = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        switch (this.f35610s) {
            case 0:
                return new C3743b2(this, abstractC3818q2, 2);
            default:
                return new C3758e2(this, abstractC3818q2);
        }
    }
}
