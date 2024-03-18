package k6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: k6.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4197g extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4197g f37128Z = new C4197g(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4197g f37129h0 = new C4197g(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4197g f37130i0 = new C4197g(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4197g f37131j0 = new C4197g(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C4197g f37132k0 = new C4197g(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C4197g f37133l0 = new C4197g(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37134Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4197g(int i10) {
        super(0);
        this.f37134Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f37134Y) {
            case 0:
                return "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
            case 1:
                return "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
            case 2:
            case 3:
            case 4:
                return "RUM feature received a telemetry event, but mandatory message field is either missing or has a wrong type.";
            default:
                return "Developer mode enabled, setting RUM sample rate to 100%.";
        }
    }
}
