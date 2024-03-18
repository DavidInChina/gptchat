package s6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: s6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5578a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5578a f45405Z = new C5578a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5578a f45406h0 = new C5578a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45407Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5578a(int i10) {
        super(0);
        this.f45407Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f45407Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                    default:
                        return "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
                }
            default:
                switch (i10) {
                    case 0:
                        return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                    default:
                        return "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
                }
        }
    }
}
