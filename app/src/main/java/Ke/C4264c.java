package ke;

import Wh.v;
import Wh.w;
import id.AbstractC3557B;
import jf.y;

/* renamed from: ke.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4264c extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4264c f37376Z = new C4264c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4264c f37377h0 = new C4264c(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37378Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4264c(int i10) {
        super(1);
        this.f37378Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f37378Y) {
            case 0:
                v vVar = (v) obj;
                AbstractC3557B.c0("$this$null", vVar);
                vVar.f21273h = false;
                vVar.f21274i = false;
                vVar.f21271f = true;
                return yVar;
            default:
                AbstractC3557B.c0("it", (w) obj);
                return yVar;
        }
    }
}
