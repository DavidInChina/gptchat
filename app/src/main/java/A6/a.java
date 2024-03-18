package A6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f697Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f698h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f699i0 = new a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f700Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(0);
        this.f700Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f700Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "One of the mandatory parameters for core configuration telemetry reporting is either missing or have a wrong type.";
                    case 1:
                        return "Max number of telemetry events per session reached, rejecting.";
                    default:
                        return "GlobalTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
                }
            case 1:
                switch (i10) {
                    case 0:
                        return "One of the mandatory parameters for core configuration telemetry reporting is either missing or have a wrong type.";
                    case 1:
                        return "Max number of telemetry events per session reached, rejecting.";
                    default:
                        return "GlobalTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
                }
            default:
                switch (i10) {
                    case 0:
                        return "One of the mandatory parameters for core configuration telemetry reporting is either missing or have a wrong type.";
                    case 1:
                        return "Max number of telemetry events per session reached, rejecting.";
                    default:
                        return "GlobalTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
                }
        }
    }
}
