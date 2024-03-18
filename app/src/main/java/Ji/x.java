package ji;

import id.AbstractC3557B;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class x extends AbstractC4141p {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ji.M] */
    @Override // ji.AbstractC4141p
    public final AbstractC4120I a(C4113B c4113b) {
        File e10 = c4113b.e();
        Logger logger = z.f36759a;
        return new C4129d(r.f.q(new FileOutputStream(e10, true), e10, true), (C4124M) new Object());
    }

    @Override // ji.AbstractC4141p
    public void b(C4113B c4113b, C4113B c4113b2) {
        AbstractC3557B.c0("source", c4113b);
        AbstractC3557B.c0("target", c4113b2);
        if (c4113b.e().renameTo(c4113b2.e())) {
            return;
        }
        throw new IOException("failed to move " + c4113b + " to " + c4113b2);
    }

    @Override // ji.AbstractC4141p
    public final void c(C4113B c4113b) {
        if (!c4113b.e().mkdir()) {
            C4140o i10 = i(c4113b);
            if (i10 != null && i10.f36730b) {
                return;
            }
            throw new IOException("failed to create directory: " + c4113b);
        }
    }

    @Override // ji.AbstractC4141p
    public final void d(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        if (!Thread.interrupted()) {
            File e10 = c4113b.e();
            if (!e10.delete() && e10.exists()) {
                throw new IOException("failed to delete " + c4113b);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // ji.AbstractC4141p
    public final List g(C4113B c4113b) {
        AbstractC3557B.c0("dir", c4113b);
        File e10 = c4113b.e();
        String[] list = e10.list();
        if (list == null) {
            if (!e10.exists()) {
                throw new FileNotFoundException("no such file: " + c4113b);
            }
            throw new IOException("failed to list " + c4113b);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC3557B.Z(str);
            arrayList.add(c4113b.d(str));
        }
        kf.r.J1(arrayList);
        return arrayList;
    }

    @Override // ji.AbstractC4141p
    public C4140o i(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        File e10 = c4113b.e();
        boolean isFile = e10.isFile();
        boolean isDirectory = e10.isDirectory();
        long lastModified = e10.lastModified();
        long length = e10.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e10.exists()) {
            return null;
        }
        return new C4140o(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // ji.AbstractC4141p
    public final w j(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        return new w(new RandomAccessFile(c4113b.e(), "r"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ji.M] */
    @Override // ji.AbstractC4141p
    public final AbstractC4120I k(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        File e10 = c4113b.e();
        Logger logger = z.f36759a;
        return new C4129d(r.f.q(new FileOutputStream(e10, false), e10, false), (C4124M) new Object());
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4122K l(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        File e10 = c4113b.e();
        Logger logger = z.f36759a;
        return new C4130e(com.google.android.gms.internal.play_billing.N.t(new FileInputStream(e10), e10), C4124M.f36687d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
