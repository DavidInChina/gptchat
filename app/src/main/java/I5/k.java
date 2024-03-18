package I5;

import Ad.l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import kf.v;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import u5.C5843c;

/* loaded from: classes2.dex */
public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f8090a;

    public k(AbstractC5091c abstractC5091c) {
        this.f8090a = abstractC5091c;
    }

    public static void d(t5.d dVar, File file, boolean z10) {
        io.sentry.instrumentation.file.e q10 = r.f.q(new FileOutputStream(file, z10), file, z10);
        try {
            FileLock lock = q10.getChannel().lock();
            AbstractC3557B.b0("outputStream.channel.lock()", lock);
            byte[] bArr = dVar.f45752b;
            byte[] bArr2 = dVar.f45751a;
            ByteBuffer allocate = ByteBuffer.allocate(bArr2.length + 6 + bArr.length + 6);
            AbstractC3557B.b0("allocate(metaBlockSize + dataBlockSize)", allocate);
            ByteBuffer put = allocate.putShort(E9.f.n(2)).putInt(bArr.length).put(bArr);
            AbstractC3557B.b0("this\n            .putSho\u2026e)\n            .put(data)", put);
            ByteBuffer put2 = put.putShort(E9.f.n(1)).putInt(bArr2.length).put(bArr2);
            AbstractC3557B.b0("this\n            .putSho\u2026e)\n            .put(data)", put2);
            q10.write(put2.array());
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

    @Override // I5.e
    public final List a(File file) {
        v vVar = v.f37483Y;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        try {
            return f(file);
        } catch (IOException e10) {
            P4.a.l0(this.f8090a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 20), e10, 48);
            return vVar;
        } catch (SecurityException e11) {
            P4.a.l0(this.f8090a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), g.f8080Z, e11, 48);
            return vVar;
        }
    }

    @Override // G5.h
    public final boolean b(File file, Object obj, boolean z10) {
        t5.d dVar = (t5.d) obj;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        AbstractC3557B.c0("file", file);
        AbstractC3557B.c0("data", dVar);
        try {
            d(dVar, file, z10);
            return true;
        } catch (IOException e10) {
            P4.a.l0(this.f8090a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 22), e10, 48);
            return false;
        } catch (SecurityException e11) {
            P4.a.l0(this.f8090a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 23), e11, 48);
            return false;
        }
    }

    public final boolean c(int i10, int i11, String str) {
        if (i10 != i11) {
            EnumC5090b enumC5090b = EnumC5090b.f42739Z;
            if (i11 != -1) {
                P4.a.m0(this.f8090a, 5, enumC5090b, new i(str, i10, i11), null, false, 56);
            } else {
                P4.a.m0(this.f8090a, 5, enumC5090b, new C5843c(str, 17), null, false, 56);
            }
            return false;
        }
        return true;
    }

    public final h e(BufferedInputStream bufferedInputStream, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        int read = bufferedInputStream.read(allocate.array());
        if (!c(6, read, android.gov.nist.core.a.A("Block(", E9.f.F(i10), "): Header read"))) {
            return new h(null, Math.max(0, read), 0);
        }
        short s10 = allocate.getShort();
        if (s10 != E9.f.n(i10)) {
            P4.a.m0(this.f8090a, 5, EnumC5090b.f42739Z, new j(s10, i10), null, false, 56);
            return new h(null, read, 0);
        }
        int i11 = allocate.getInt();
        byte[] bArr = new byte[i11];
        int read2 = bufferedInputStream.read(bArr);
        if (c(i11, read2, android.gov.nist.core.a.A("Block(", E9.f.F(i10), "):Data read"))) {
            return new h(bArr, read + read2, 0);
        }
        return new h(null, Math.max(0, read2) + read, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        r5 = r5 - r6.f8084c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList f(File file) {
        BufferedInputStream bufferedInputStream;
        int D02 = (int) AbstractC4344b.D0(file, this.f8090a);
        ArrayList arrayList = new ArrayList();
        io.sentry.instrumentation.file.d t10 = N.t(new FileInputStream(file), file);
        if (t10 instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) t10;
        } else {
            bufferedInputStream = new BufferedInputStream(t10, 8192);
        }
        int i10 = D02;
        while (true) {
            if (i10 <= 0) {
                break;
            }
            try {
                h e10 = e(bufferedInputStream, 2);
                if (e10.f8083b != null) {
                    h e11 = e(bufferedInputStream, 1);
                    i10 -= e10.f8084c + e11.f8084c;
                    byte[] bArr = e11.f8083b;
                    if (bArr == null) {
                        break;
                    }
                    arrayList.add(new t5.d(bArr, e10.f8083b));
                } else {
                    break;
                }
            } finally {
            }
        }
        th = null;
        if (i10 != 0 || (D02 > 0 && arrayList.isEmpty())) {
            P4.a.l0(this.f8090a, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new u5.e(file, 21), null, 56);
        }
        return arrayList;
    }
}
