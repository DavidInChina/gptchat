package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3743b2 extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35593b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC3745c f35594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3743b2(AbstractC3745c abstractC3745c, AbstractC3818q2 abstractC3818q2, int i10) {
        super(abstractC3818q2);
        this.f35593b = i10;
        this.f35594c = abstractC3745c;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35593b;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        AbstractC3745c abstractC3745c = this.f35594c;
        switch (i10) {
            case 0:
                ((Consumer) ((C3834u) abstractC3745c).f35734t).accept(obj);
                abstractC3818q2.accept((AbstractC3818q2) obj);
                return;
            case 1:
                if (!((Predicate) ((C3834u) abstractC3745c).f35734t).test(obj)) {
                    return;
                }
                abstractC3818q2.accept((AbstractC3818q2) obj);
                return;
            case 2:
                abstractC3818q2.accept((AbstractC3818q2) ((C3753d2) abstractC3745c).f35611t.apply(obj));
                return;
            case 3:
                abstractC3818q2.accept(((ToIntFunction) ((C3844w) abstractC3745c).f35756t).applyAsInt(obj));
                return;
            case 4:
                abstractC3818q2.accept(((ToLongFunction) ((C3849x) abstractC3745c).f35763t).applyAsLong(obj));
                return;
            default:
                abstractC3818q2.accept(((ToDoubleFunction) ((C3839v) abstractC3745c).f35748t).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        switch (this.f35593b) {
            case 1:
                this.f35690a.l(-1L);
                return;
            default:
                super.l(j6);
                return;
        }
    }
}
