package H5;

import id.AbstractC3557B;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: j0  reason: collision with root package name */
    public static final long f7462j0 = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: Y  reason: collision with root package name */
    public final File f7463Y;

    /* renamed from: Z  reason: collision with root package name */
    public final File f7464Z;

    /* renamed from: h0  reason: collision with root package name */
    public final G5.c f7465h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5091c f7466i0;

    public f(File file, File file2, G5.c cVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("fileMover", cVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f7463Y = file;
        this.f7464Z = file2;
        this.f7465h0 = cVar;
        this.f7466i0 = abstractC5091c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC5090b enumC5090b = EnumC5090b.f42739Z;
        if (this.f7463Y == null) {
            P4.a.m0(this.f7466i0, 4, enumC5090b, e.f7458Z, null, false, 56);
        } else if (this.f7464Z == null) {
            P4.a.m0(this.f7466i0, 4, enumC5090b, e.f7459h0, null, false, 56);
        } else {
            A7.b.z1(f7462j0, this.f7466i0, new X0.b(18, this));
        }
    }
}
