package C6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f2701Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f2702h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f2703i0 = new c(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2704Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f2704Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f2704Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was disabled in your Configuration. No tracing data will be sent.";
                    case 1:
                        return "You're trying to bundle the traces with a RUM context, but the RUM feature was disabled in your Configuration. No RUM context will be attached to your traces in this case.";
                    default:
                        return "Default service name is missing during AndroidTracer.Builder creation, did you initialize SDK?";
                }
            case 1:
                switch (i10) {
                    case 0:
                        return "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was disabled in your Configuration. No tracing data will be sent.";
                    case 1:
                        return "You're trying to bundle the traces with a RUM context, but the RUM feature was disabled in your Configuration. No RUM context will be attached to your traces in this case.";
                    default:
                        return "Default service name is missing during AndroidTracer.Builder creation, did you initialize SDK?";
                }
            default:
                switch (i10) {
                    case 0:
                        return "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was disabled in your Configuration. No tracing data will be sent.";
                    case 1:
                        return "You're trying to bundle the traces with a RUM context, but the RUM feature was disabled in your Configuration. No RUM context will be attached to your traces in this case.";
                    default:
                        return "Default service name is missing during AndroidTracer.Builder creation, did you initialize SDK?";
                }
        }
    }
}
