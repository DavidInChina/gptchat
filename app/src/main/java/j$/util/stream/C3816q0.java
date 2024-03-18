package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3816q0 extends AbstractC3835u0 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC3840v0 f35710c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f35711d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3816q0(EnumC3840v0 enumC3840v0, Predicate predicate) {
        super(enumC3840v0);
        this.f35710c = enumC3840v0;
        this.f35711d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        if (!this.f35735a) {
            boolean test = this.f35711d.test(obj);
            EnumC3840v0 enumC3840v0 = this.f35710c;
            z10 = enumC3840v0.f35750a;
            if (test != z10) {
                return;
            }
            this.f35735a = true;
            z11 = enumC3840v0.f35751b;
            this.f35736b = z11;
        }
    }
}
