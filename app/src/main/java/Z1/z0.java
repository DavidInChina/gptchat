package Z1;

import java.util.Arrays;
import java.util.Locale;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23136Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f23137Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(long j6, int i10) {
        super(0);
        this.f23136Y = i10;
        this.f23137Z = j6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f23136Y;
        long j6 = this.f23137Z;
        switch (i10) {
            case 0:
                return new Z0.g(j6);
            default:
                return String.format(Locale.US, "Gap between views was %d nanoseconds", Arrays.copyOf(new Object[]{Long.valueOf(j6)}, 1));
        }
    }
}
