package d1;

import java.util.UUID;
import wf.AbstractC6216a;

/* renamed from: d1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2569d extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2569d f27856Z = new C2569d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2569d f27857h0 = new C2569d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2569d f27858i0 = new C2569d(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27859Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2569d(int i10) {
        super(0);
        this.f27859Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f27859Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                switch (i10) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
        }
    }
}
