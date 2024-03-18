package eh;

import kotlinx.serialization.descriptors.SerialDescriptor;
import wf.AbstractC6216a;

/* renamed from: eh.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2912l extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2912l f29458Z = new C2912l(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2912l f29459h0 = new C2912l(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2912l f29460i0 = new C2912l(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2912l f29461j0 = new C2912l(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C2912l f29462k0 = new C2912l(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29463Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2912l(int i10) {
        super(0);
        this.f29463Y = i10;
    }

    public final SerialDescriptor a() {
        switch (this.f29463Y) {
            case 0:
                return C2900B.f29408b;
            case 1:
                return C2925y.f29478b;
            case 2:
                return C2919s.f29474b;
            case 3:
                return C2899A.f29406b;
            default:
                return C2906f.f29423b;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f29463Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            case 3:
                return a();
            default:
                return a();
        }
    }
}
