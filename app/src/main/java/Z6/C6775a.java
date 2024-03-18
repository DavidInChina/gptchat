package z6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: z6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6775a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6775a f51741Z = new C6775a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6775a f51742h0 = new C6775a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6775a f51743i0 = new C6775a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51744Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6775a(int i10) {
        super(0);
        this.f51744Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f51744Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "Internal operation failed on ComponentPredicate";
                    case 1:
                        return "Write operation failed.";
                    default:
                        return "Write operation failed, but no onError callback was provided.";
                }
            case 1:
                switch (i10) {
                    case 0:
                        return "Internal operation failed on ComponentPredicate";
                    case 1:
                        return "Write operation failed.";
                    default:
                        return "Write operation failed, but no onError callback was provided.";
                }
            default:
                switch (i10) {
                    case 0:
                        return "Internal operation failed on ComponentPredicate";
                    case 1:
                        return "Write operation failed.";
                    default:
                        return "Write operation failed, but no onError callback was provided.";
                }
        }
    }
}
