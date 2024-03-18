package Lf;

import id.AbstractC3557B;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11108Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4294f f11109Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(C4294f c4294f, int i10) {
        super(1);
        this.f11108Y = i10;
        this.f11109Z = c4294f;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C4294f c4294f = this.f11109Z;
        int i10 = this.f11108Y;
        switch (i10) {
            case 0:
                ug.n nVar = (ug.n) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", nVar);
                        return nVar.a(c4294f, Tf.d.f17211Y);
                    default:
                        AbstractC3557B.c0("it", nVar);
                        return nVar.f(c4294f, Tf.d.f17215j0);
                }
            default:
                ug.n nVar2 = (ug.n) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", nVar2);
                        return nVar2.a(c4294f, Tf.d.f17211Y);
                    default:
                        AbstractC3557B.c0("it", nVar2);
                        return nVar2.f(c4294f, Tf.d.f17215j0);
                }
        }
    }
}
