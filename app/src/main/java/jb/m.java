package Jb;

import Mb.B;
import Mb.C;
import Mb.D;
import Mb.E;
import Mb.H;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9005Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f9006Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(H h10, int i10) {
        super(1);
        this.f9005Y = i10;
        this.f9006Z = h10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f9005Y;
        H h10 = this.f9006Z;
        switch (i10) {
            case 0:
                invoke((String) obj);
                return yVar;
            case 1:
                invoke((String) obj);
                return yVar;
            case 2:
                invoke((String) obj);
                return yVar;
            case 3:
                invoke((String) obj);
                return yVar;
            case 4:
                Yg.r rVar = (Yg.r) obj;
                AbstractC3557B.c0("it", rVar);
                h10.j(new Mb.A(rVar));
                return yVar;
            case 5:
                Fb.f fVar = (Fb.f) obj;
                AbstractC3557B.c0("it", fVar);
                h10.j(new B(fVar));
                return yVar;
            default:
                invoke((String) obj);
                return yVar;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f9005Y;
        H h10 = this.f9006Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", str);
                h10.j(new C(str));
                return;
            case 1:
                AbstractC3557B.c0("it", str);
                h10.j(new C(str));
                return;
            case 2:
                AbstractC3557B.c0("it", str);
                h10.j(new D(str));
                return;
            case 3:
                AbstractC3557B.c0("it", str);
                h10.j(new D(str));
                return;
            default:
                AbstractC3557B.c0("it", str);
                h10.j(new E(str));
                return;
        }
    }
}
