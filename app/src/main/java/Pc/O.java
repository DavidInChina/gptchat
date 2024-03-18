package pc;

import Z.o1;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class O extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final O f42928Z = new O(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final O f42929h0 = new O(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final O f42930i0 = new O(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final O f42931j0 = new O(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final O f42932k0 = new O(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42933Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i10) {
        super(0);
        this.f42933Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        switch (this.f42933Y) {
            case 0:
            case 1:
            case 2:
                return yVar;
            case 3:
                return AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            default:
                return U3.f.h0(0);
        }
    }
}
