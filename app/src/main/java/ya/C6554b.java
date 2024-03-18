package ya;

import id.AbstractC3557B;
import java.util.List;
import jf.y;

/* renamed from: ya.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6554b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6554b f50849Z = new C6554b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6554b f50850h0 = new C6554b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50851Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6554b(int i10) {
        super(1);
        this.f50851Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f50851Y) {
            case 0:
                AbstractC3557B.c0("it", (List) obj);
                return y.f36177a;
            default:
                x xVar = (x) obj;
                AbstractC3557B.c0("$this$setState", xVar);
                return x.e(xVar, null, false, 5);
        }
    }
}
