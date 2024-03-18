package df;

import id.AbstractC3557B;
import java.util.concurrent.Callable;

/* renamed from: df.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2647l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2649n f28280b;

    public /* synthetic */ CallableC2647l(C2649n c2649n, int i10) {
        this.f28279a = i10;
        this.f28280b = c2649n;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f28279a;
        C2649n c2649n = this.f28280b;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.getScalingSettings();
            case 1:
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.getImplementationName();
            case 2:
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.getResolutionBitrateLimits();
            case 3:
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.getEncoderInfo();
            case 4:
                AbstractC3557B.c0("this$0", c2649n);
                return Boolean.valueOf(c2649n.f28284a.isHardwareEncoder());
            case 5:
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.release();
            default:
                AbstractC3557B.c0("this$0", c2649n);
                return Long.valueOf(c2649n.f28284a.createNativeVideoEncoder());
        }
    }
}
