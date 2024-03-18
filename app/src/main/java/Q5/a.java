package Q5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f14425Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f14426h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f14427i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f14428j0 = new a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final a f14429k0 = new a(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final a f14430l0 = new a(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14431Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(0);
        this.f14431Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f14431Y) {
            case 0:
                return "Cannot copy ByteArray, dest doesn't have enough space";
            case 1:
                return "Cannot copy ByteArray, src doesn't have enough data";
            case 2:
                return "Internal I/O operation failed";
            case 3:
                return "Error cancelling the UploadWorker";
            case 4:
                return "UploadWorker was scheduled.";
            default:
                return "Error while trying to setup the UploadWorker";
        }
    }
}
