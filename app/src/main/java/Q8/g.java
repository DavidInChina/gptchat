package Q8;

import H0.W0;
import fb.AbstractC2985d;
import fb.C2984c;
import id.AbstractC3557B;
import jf.y;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14495Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ W0 f14496Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(W0 w02, int i10) {
        super(1);
        this.f14495Y = i10;
        this.f14496Z = w02;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f14495Y) {
            case 0:
                invoke((String) obj);
                return yVar;
            case 1:
                invoke((String) obj);
                return yVar;
            case 2:
                AbstractC2985d abstractC2985d = (AbstractC2985d) obj;
                AbstractC3557B.c0("effect", abstractC2985d);
                if (abstractC2985d instanceof C2984c) {
                    this.f14496Z.a(((C2984c) abstractC2985d).f30088a);
                }
                return yVar;
            default:
                invoke((String) obj);
                return yVar;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f14495Y;
        W0 w02 = this.f14496Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("url", str);
                w02.a(str);
                return;
            case 1:
                AbstractC3557B.c0("it", str);
                w02.a(str);
                return;
            default:
                AbstractC3557B.c0("it", str);
                w02.a(str);
                return;
        }
    }
}
