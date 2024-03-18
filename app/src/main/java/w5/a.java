package W5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f20733Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f20734h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f20735i0 = new a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20736Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(0);
        this.f20736Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f20736Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "Log event write operation wait was interrupted.";
                    case 1:
                        return "Logs feature received a NDK crash event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                    default:
                        return "Logs feature received a Span log event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                }
            case 1:
                switch (i10) {
                    case 0:
                        return "Log event write operation wait was interrupted.";
                    case 1:
                        return "Logs feature received a NDK crash event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                    default:
                        return "Logs feature received a Span log event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                }
            default:
                switch (i10) {
                    case 0:
                        return "Log event write operation wait was interrupted.";
                    case 1:
                        return "Logs feature received a NDK crash event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                    default:
                        return "Logs feature received a Span log event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
                }
        }
    }
}
