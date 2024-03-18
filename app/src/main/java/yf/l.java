package Yf;

import id.AbstractC3557B;
import kg.C4294f;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22360Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f22361Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, int i10) {
        super(1);
        this.f22360Y = i10;
        this.f22361Z = oVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        o oVar = this.f22361Z;
        int i10 = this.f22360Y;
        switch (i10) {
            case 0:
                C4294f c4294f = (C4294f) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", c4294f);
                        return o.v(oVar, c4294f);
                    default:
                        AbstractC3557B.c0("it", c4294f);
                        return o.w(oVar, c4294f);
                }
            default:
                C4294f c4294f2 = (C4294f) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", c4294f2);
                        return o.v(oVar, c4294f2);
                    default:
                        AbstractC3557B.c0("it", c4294f2);
                        return o.w(oVar, c4294f2);
                }
        }
    }
}
