package G0;

import java.util.LinkedHashMap;
import wf.AbstractC6216a;

/* renamed from: G0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0582k extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0582k f5798Z = new C0582k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0582k f5799h0 = new C0582k(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0582k f5800i0 = new C0582k(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5801Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0582k(int i10) {
        super(0);
        this.f5801Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f5801Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return new androidx.compose.ui.node.a(2, true, 0);
                    default:
                        return new androidx.compose.ui.node.a(3, false, 0);
                }
            case 1:
                return new LinkedHashMap();
            default:
                switch (i10) {
                    case 0:
                        return new androidx.compose.ui.node.a(2, true, 0);
                    default:
                        return new androidx.compose.ui.node.a(3, false, 0);
                }
        }
    }
}
