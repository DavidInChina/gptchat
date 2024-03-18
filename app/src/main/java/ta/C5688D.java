package ta;

import id.AbstractC3557B;
import na.E0;
import za.AbstractC6782A;
import za.AbstractC6806w;

/* renamed from: ta.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5688D extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45815Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5688D(int i10, Ad.g gVar) {
        super(1, gVar, E0.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        this.f45815Y = i10;
        if (i10 != 1) {
        } else {
            super(1, gVar, AbstractC6782A.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45815Y) {
            case 0:
                na.Z z10 = (na.Z) obj;
                AbstractC3557B.c0("p0", z10);
                ((E0) this.receiver).j(z10);
                return yVar;
            default:
                AbstractC6806w abstractC6806w = (AbstractC6806w) obj;
                AbstractC3557B.c0("p0", abstractC6806w);
                ((AbstractC6782A) this.receiver).j(abstractC6806w);
                return yVar;
        }
    }
}
