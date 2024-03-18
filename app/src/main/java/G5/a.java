package G5;

import id.AbstractC3557B;
import java.io.File;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class a extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f6042Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f6043h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f6044i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f6045j0 = new a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final a f6046k0 = new a(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final a f6047l0 = new a(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final a f6048m0 = new a(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final a f6049n0 = new a(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final a f6050o0 = new a(8);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6051Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f6051Y = i10;
    }

    public final Boolean a(File file) {
        switch (this.f6051Y) {
            case 0:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.canRead());
            case 1:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.canWrite());
            case 2:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.delete());
            case 3:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.exists());
            case 4:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.isDirectory());
            case 5:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.isFile());
            default:
                AbstractC3557B.c0("$this$safeCall", file);
                return Boolean.valueOf(file.mkdirs());
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f6051Y) {
            case 0:
                return a((File) obj);
            case 1:
                return a((File) obj);
            case 2:
                return a((File) obj);
            case 3:
                return a((File) obj);
            case 4:
                return a((File) obj);
            case 5:
                return a((File) obj);
            case 6:
                File file = (File) obj;
                AbstractC3557B.c0("$this$safeCall", file);
                return Long.valueOf(file.length());
            case 7:
                File file2 = (File) obj;
                AbstractC3557B.c0("$this$safeCall", file2);
                return file2.listFiles();
            default:
                return a((File) obj);
        }
    }
}
