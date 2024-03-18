package G;

import F.C0530d;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class W extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5468Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ V f5469Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(V v10, int i10) {
        super(0);
        this.f5468Y = i10;
        this.f5469Z = v10;
    }

    public final Float a() {
        int i10 = this.f5468Y;
        V v10 = this.f5469Z;
        switch (i10) {
            case 0:
                C0530d c0530d = (C0530d) v10;
                switch (c0530d.f4918a) {
                    case 0:
                    default:
                        return Float.valueOf(E9.f.g(c0530d));
                }
            default:
                C0530d c0530d2 = (C0530d) v10;
                switch (c0530d2.f4918a) {
                    case 0:
                    default:
                        return Float.valueOf(E9.f.f(c0530d2));
                }
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f5468Y) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
