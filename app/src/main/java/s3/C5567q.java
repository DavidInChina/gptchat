package s3;

import id.AbstractC3557B;
import z.C6678S;

/* renamed from: s3.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5567q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45331Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC5568s f45332Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5567q(AbstractC5568s abstractC5568s, int i10) {
        super(1);
        this.f45331Y = i10;
        this.f45332Z = abstractC5568s;
    }

    public final Boolean a(AbstractC5540C abstractC5540C) {
        int i10 = this.f45331Y;
        AbstractC5568s abstractC5568s = this.f45332Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("destination", abstractC5540C);
                return Boolean.valueOf(!abstractC5568s.f45352m.containsKey(Integer.valueOf(abstractC5540C.f45221l0)));
            default:
                AbstractC3557B.c0("destination", abstractC5540C);
                return Boolean.valueOf(!abstractC5568s.f45352m.containsKey(Integer.valueOf(abstractC5540C.f45221l0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [s3.p, java.lang.Object] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f45331Y) {
            case 0:
                return a((AbstractC5540C) obj);
            case 1:
                return a((AbstractC5540C) obj);
            default:
                AbstractC3557B.c0("$this$DisposableEffect", (Z.N) obj);
                ?? obj2 = new Object();
                AbstractC5568s abstractC5568s = this.f45332Z;
                abstractC5568s.b(obj2);
                return new C6678S(abstractC5568s, 10, obj2);
        }
    }
}
