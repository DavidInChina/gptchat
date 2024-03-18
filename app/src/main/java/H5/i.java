package H5;

import id.AbstractC3557B;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: i0  reason: collision with root package name */
    public static final long f7470i0 = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: Y  reason: collision with root package name */
    public final File f7471Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G5.c f7472Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5091c f7473h0;

    public i(File file, G5.c cVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("fileMover", cVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f7471Y = file;
        this.f7472Z = cVar;
        this.f7473h0 = abstractC5091c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7471Y == null) {
            P4.a.m0(this.f7473h0, 4, EnumC5090b.f42739Z, e.f7460i0, null, false, 56);
            return;
        }
        A7.b.z1(f7470i0, this.f7473h0, new X0.b(19, this));
    }
}
