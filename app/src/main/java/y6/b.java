package y6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f50823Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f50824h0 = new b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50825Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(0);
        this.f50825Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f50825Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
                    default:
                        return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
                }
            default:
                switch (i10) {
                    case 0:
                        return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
                    default:
                        return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
                }
        }
    }
}
