package z;

import java.util.concurrent.CancellationException;

/* renamed from: z.Z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6685Z extends CancellationException {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51198Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6685Z(int i10) {
        super("The coroutine scope left the composition");
        this.f51198Y = i10;
        if (i10 == 3) {
            super("The Modifier.Node was detached");
        } else if (i10 != 4) {
        } else {
            super("Pointer input was reset");
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f51198Y) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 4:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6685Z(int i10, int i11) {
        super("Mutation interrupted");
        this.f51198Y = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6685Z(String str) {
        super(str);
        this.f51198Y = 5;
    }
}
