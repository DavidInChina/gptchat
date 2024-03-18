package Za;

import id.AbstractC3557B;
import xe.C6405J;

/* loaded from: classes2.dex */
public final class I0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final I0 f23469Z = new I0(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final I0 f23470h0 = new I0(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final I0 f23471i0 = new I0(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23472Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I0(int i10) {
        super(1);
        this.f23472Y = i10;
    }

    public final void a(C6405J c6405j) {
        switch (this.f23472Y) {
            case 0:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"gizmos"});
                return;
            case 1:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"oauth_redirect"});
                return;
            default:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"action_settings"});
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f23472Y) {
            case 0:
                a((C6405J) obj);
                return yVar;
            case 1:
                a((C6405J) obj);
                return yVar;
            default:
                a((C6405J) obj);
                return yVar;
        }
    }
}
