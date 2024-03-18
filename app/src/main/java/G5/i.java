package G5;

import Ad.l;
import id.AbstractC3557B;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6062b = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f6063a;

    public i(AbstractC5091c abstractC5091c) {
        this.f6063a = abstractC5091c;
    }

    public static void c(File file, boolean z10, byte[] bArr) {
        io.sentry.instrumentation.file.e q10 = r.f.q(new FileOutputStream(file, z10), file, z10);
        try {
            FileLock lock = q10.getChannel().lock();
            AbstractC3557B.b0("outputStream.channel.lock()", lock);
            q10.write(bArr);
            lock.release();
            th = null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
                l.S(q10, th2);
            }
        }
    }

    @Override // G5.f
    public final Object a(File file) {
        byte[] bArr = f6062b;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        try {
            if (!file.exists()) {
                P4.a.l0(this.f6063a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 13), null, 56);
            } else if (file.isDirectory()) {
                P4.a.l0(this.f6063a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 14), null, 56);
            } else {
                bArr = AbstractC5260f.K(file);
            }
        } catch (IOException e10) {
            P4.a.l0(this.f6063a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 15), e10, 48);
        } catch (SecurityException e11) {
            P4.a.l0(this.f6063a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 16), e11, 48);
        }
        return bArr;
    }

    @Override // G5.h
    public final boolean b(File file, Object obj, boolean z10) {
        byte[] bArr = (byte[]) obj;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        AbstractC3557B.c0("file", file);
        AbstractC3557B.c0("data", bArr);
        try {
            c(file, z10, bArr);
            return true;
        } catch (IOException e10) {
            P4.a.l0(this.f6063a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 17), e10, 48);
            return false;
        } catch (SecurityException e11) {
            P4.a.l0(this.f6063a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 18), e11, 48);
            return false;
        }
    }
}
