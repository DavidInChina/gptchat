package ke;

import Wh.v;
import id.AbstractC3557B;
import jf.y;

/* renamed from: ke.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4263b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37374Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Wh.t f37375Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4263b(Zc.c cVar, int i10) {
        super(1);
        this.f37374Y = i10;
        this.f37375Z = cVar;
    }

    public final void a(v vVar) {
        int i10 = this.f37374Y;
        Wh.t tVar = this.f37375Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$config", vVar);
                AbstractC3557B.c0("interceptor", tVar);
                vVar.f21268c.add(tVar);
                return;
            default:
                AbstractC3557B.c0("$this$config", vVar);
                AbstractC3557B.c0("interceptor", tVar);
                vVar.f21269d.add(tVar);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f37374Y) {
            case 0:
                a((v) obj);
                return yVar;
            default:
                a((v) obj);
                return yVar;
        }
    }
}
