package Y5;

import c6.j;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22102Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f22103Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, int i10) {
        super(0);
        this.f22102Y = i10;
        this.f22103Z = jVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f22102Y;
        j jVar = this.f22103Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "LogEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{jVar}, 1));
            default:
                return String.format(Locale.US, "LogEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{jVar}, 1));
        }
    }
}
