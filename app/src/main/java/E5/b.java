package E5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f4525Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f4526h0 = new b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final b f4527i0 = new b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final b f4528j0 = new b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final b f4529k0 = new b(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final b f4530l0 = new b(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4531Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(0);
        this.f4531Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f4531Y) {
            case 0:
            case 1:
            case 2:
                return "We couldn't register a Network Callback, the network information reported will be less accurate.";
            default:
                return "We couldn't unregister the Network Callback";
        }
    }
}
