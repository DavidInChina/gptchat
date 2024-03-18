package F6;

import K6.l;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ l f5057Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(l lVar) {
        super(0);
        this.f5057Y = lVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{this.f5057Y.getClass().getSimpleName()}, 1));
    }
}
