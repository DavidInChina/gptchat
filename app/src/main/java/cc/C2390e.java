package cc;

import id.AbstractC3557B;

/* renamed from: cc.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2390e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26564Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ xd.e f26565Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2390e(xd.e eVar, int i10) {
        super(1);
        this.f26564Y = i10;
        this.f26565Z = eVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        xd.e eVar = this.f26565Z;
        int i10 = this.f26564Y;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("$this$setState", oVar);
                        return new k(eVar);
                    default:
                        AbstractC3557B.c0("$this$setState", oVar);
                        return new l(eVar);
                }
            default:
                o oVar2 = (o) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("$this$setState", oVar2);
                        return new k(eVar);
                    default:
                        AbstractC3557B.c0("$this$setState", oVar2);
                        return new l(eVar);
                }
        }
    }
}
