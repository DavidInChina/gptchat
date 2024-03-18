package n6;

import I8.u;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: n6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4718b extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39629Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ u f39630Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4718b(u uVar, int i10) {
        super(0);
        this.f39629Y = i10;
        this.f39630Z = uVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f39629Y;
        u uVar = this.f39630Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{uVar}, 1));
            default:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{uVar}, 1));
        }
    }
}
