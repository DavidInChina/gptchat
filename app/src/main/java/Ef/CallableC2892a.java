package ef;

import id.AbstractC3557B;
import java.util.concurrent.Callable;
import wf.AbstractC6216a;

/* renamed from: ef.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2892a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29367a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f29368b;

    public /* synthetic */ CallableC2892a(AbstractC6216a abstractC6216a, int i10) {
        this.f29367a = i10;
        this.f29368b = abstractC6216a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f29367a;
        AbstractC6216a abstractC6216a = this.f29368b;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$tmp0", abstractC6216a);
                return abstractC6216a.mo122invoke();
            default:
                AbstractC3557B.c0("$tmp0", abstractC6216a);
                return abstractC6216a.mo122invoke();
        }
    }
}
