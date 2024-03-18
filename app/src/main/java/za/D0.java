package Za;

import id.AbstractC3557B;
import xe.C6405J;

/* loaded from: classes2.dex */
public final class D0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final D0 f23446Z = new D0(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final D0 f23447h0 = new D0(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23448Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(int i10) {
        super(2);
        this.f23448Y = i10;
    }

    public final void a(C6405J c6405j, C6405J c6405j2) {
        switch (this.f23448Y) {
            case 0:
                AbstractC3557B.c0("$this$url", c6405j);
                AbstractC3557B.c0("it", c6405j2);
                P4.a.n(c6405j, new String[]{"gizmos", "discovery"});
                return;
            default:
                AbstractC3557B.c0("$this$url", c6405j);
                AbstractC3557B.c0("it", c6405j2);
                P4.a.n(c6405j, new String[]{"gizmos", "mine"});
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f23448Y) {
            case 0:
                a((C6405J) obj, (C6405J) obj2);
                return yVar;
            default:
                a((C6405J) obj, (C6405J) obj2);
                return yVar;
        }
    }
}
