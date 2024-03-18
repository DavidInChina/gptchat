package T5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f16914Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f16915h0 = new b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final b f16916i0 = new b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final b f16917j0 = new b(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16918Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(0);
        this.f16918Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f16918Y) {
            case 0:
                return "Failed to get all threads dump";
            case 1:
                return "Logs feature is not registered, won't report crash as log.";
            case 2:
                return "RUM feature is not registered, won't report crash as RUM event.";
            default:
                return "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
        }
    }
}
