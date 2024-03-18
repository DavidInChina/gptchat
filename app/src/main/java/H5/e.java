package H5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f7458Z = new e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f7459h0 = new e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final e f7460i0 = new e(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7461Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(0);
        this.f7461Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f7461Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "Can't move data from a null directory";
                    case 1:
                        return "Can't move data to a null directory";
                    default:
                        return "Can't wipe data from a null directory";
                }
            case 1:
                switch (i10) {
                    case 0:
                        return "Can't move data from a null directory";
                    case 1:
                        return "Can't move data to a null directory";
                    default:
                        return "Can't wipe data from a null directory";
                }
            default:
                switch (i10) {
                    case 0:
                        return "Can't move data from a null directory";
                    case 1:
                        return "Can't move data to a null directory";
                    default:
                        return "Can't wipe data from a null directory";
                }
        }
    }
}
