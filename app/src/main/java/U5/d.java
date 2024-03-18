package u5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class d extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f46420Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f46421h0 = new d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f46422i0 = new d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final d f46423j0 = new d(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final d f46424k0 = new d(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46425Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(0);
        this.f46425Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        C5842b c5842b = C5842b.f46416h0;
        int i10 = this.f46425Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "Unable to add shutdown hook, Runtime is already shutting down";
                    case 1:
                        return "Shutdown hook was rejected";
                    default:
                        return "Security Manager denied adding shutdown hook ";
                }
            case 1:
                switch (i10) {
                    case 0:
                        return "Unable to add shutdown hook, Runtime is already shutting down";
                    case 1:
                        return "Shutdown hook was rejected";
                    default:
                        return "Security Manager denied adding shutdown hook ";
                }
            case 2:
                switch (i10) {
                    case 0:
                        return "Unable to add shutdown hook, Runtime is already shutting down";
                    case 1:
                        return "Shutdown hook was rejected";
                    default:
                        return "Security Manager denied adding shutdown hook ";
                }
            case 3:
                switch (i10) {
                    case 3:
                        return new h(c5842b);
                    default:
                        return null;
                }
            default:
                switch (i10) {
                    case 3:
                        return new h(c5842b);
                    default:
                        return null;
                }
        }
    }
}
