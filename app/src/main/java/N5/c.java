package N5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f12713Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f12714h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f12715i0 = new c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final c f12716j0 = new c(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12717Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f12717Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f12717Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                    case 2:
                        return "Thread was unable to set its own interrupted state";
                    case 1:
                        return "Uncaught exception during the task execution";
                    default:
                        return "Thread tried to sleep for a negative amount of time";
                }
            case 1:
                switch (i10) {
                    case 0:
                    case 2:
                        return "Thread was unable to set its own interrupted state";
                    case 1:
                        return "Uncaught exception during the task execution";
                    default:
                        return "Thread tried to sleep for a negative amount of time";
                }
            case 2:
                switch (i10) {
                    case 0:
                    case 2:
                        return "Thread was unable to set its own interrupted state";
                    case 1:
                        return "Uncaught exception during the task execution";
                    default:
                        return "Thread tried to sleep for a negative amount of time";
                }
            default:
                switch (i10) {
                    case 0:
                    case 2:
                        return "Thread was unable to set its own interrupted state";
                    case 1:
                        return "Uncaught exception during the task execution";
                    default:
                        return "Thread tried to sleep for a negative amount of time";
                }
        }
    }
}
