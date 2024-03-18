package Z5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f23212Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f23213h0 = new b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23214Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(0);
        this.f23214Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f23214Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "Requested to write log, but Logs feature is not registered.";
                    default:
                        return "Requested to forward error log to RUM, but RUM feature is not registered.";
                }
            default:
                switch (i10) {
                    case 0:
                        return "Requested to write log, but Logs feature is not registered.";
                    default:
                        return "Requested to forward error log to RUM, but RUM feature is not registered.";
                }
        }
    }
}
