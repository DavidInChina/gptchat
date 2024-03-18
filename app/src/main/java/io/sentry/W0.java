package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33878a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f33879b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Q f33880c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f33881d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f33882e;

    public /* synthetic */ W0(long j6, C3607a c3607a, H h10, Q q10) {
        this.f33881d = c3607a;
        this.f33879b = j6;
        this.f33880c = q10;
        this.f33882e = h10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f33878a;
        long j6 = this.f33879b;
        Q q10 = this.f33880c;
        Object obj = this.f33882e;
        Object obj2 = this.f33881d;
        switch (i10) {
            case 0:
                C3607a c3607a = (C3607a) obj2;
                H h10 = (H) obj;
                byte[] bArr = c3607a.f33905a;
                String str = c3607a.f33907c;
                if (bArr != null) {
                    long length = bArr.length;
                    if (length > j6) {
                        throw new Exception(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length), Long.valueOf(j6)));
                    }
                } else {
                    AbstractC3656j0 abstractC3656j0 = c3607a.f33906b;
                    if (abstractC3656j0 != null) {
                        Charset charset = io.sentry.util.b.f34772a;
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.b.f34772a));
                            q10.n(abstractC3656j0, bufferedWriter);
                            bArr = byteArrayOutputStream.toByteArray();
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            h10.d(EnumC3642e1.ERROR, "Could not serialize serializable", th2);
                            bArr = null;
                        }
                        if (bArr != null) {
                            long length2 = bArr.length;
                            if (length2 > j6) {
                                throw new Exception(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length2), Long.valueOf(j6)));
                            }
                        }
                    }
                    throw new Exception(android.gov.nist.core.a.A("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable or a path is set."));
                }
                return bArr;
            default:
                File file = (File) obj2;
                B0 b02 = (B0) obj;
                if (file.exists()) {
                    String path = file.getPath();
                    File file2 = new File(path);
                    if (file2.exists()) {
                        if (file2.isFile()) {
                            if (file2.canRead()) {
                                if (file2.length() <= j6) {
                                    FileInputStream fileInputStream = new FileInputStream(path);
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        try {
                                            byte[] bArr2 = new byte[1024];
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr2);
                                                if (read != -1) {
                                                    byteArrayOutputStream2.write(bArr2, 0, read);
                                                } else {
                                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                                    byteArrayOutputStream2.close();
                                                    bufferedInputStream.close();
                                                    fileInputStream.close();
                                                    try {
                                                        String str2 = new String(Gi.e.u(byteArray), "US-ASCII");
                                                        if (!str2.isEmpty()) {
                                                            b02.f33729F0 = str2;
                                                            try {
                                                                b02.f33742q0 = (List) b02.f33732Z.call();
                                                            } catch (Throwable unused) {
                                                            }
                                                            try {
                                                                try {
                                                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                                                    try {
                                                                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, X0.f33883d));
                                                                        q10.n(b02, bufferedWriter2);
                                                                        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                                                        bufferedWriter2.close();
                                                                        byteArrayOutputStream3.close();
                                                                        return byteArray2;
                                                                    } catch (Throwable th3) {
                                                                        try {
                                                                            byteArrayOutputStream3.close();
                                                                        } catch (Throwable th4) {
                                                                            th3.addSuppressed(th4);
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (IOException e10) {
                                                                    throw new Exception("Failed to serialize profiling trace data\n" + e10.getMessage());
                                                                }
                                                            } finally {
                                                                file.delete();
                                                            }
                                                        }
                                                        throw new Exception("Profiling trace file is empty");
                                                    } catch (UnsupportedEncodingException e11) {
                                                        throw new AssertionError(e11);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                byteArrayOutputStream2.close();
                                            } catch (Throwable th6) {
                                                th5.addSuppressed(th6);
                                            }
                                            throw th5;
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th8) {
                                            th7.addSuppressed(th8);
                                        }
                                        throw th7;
                                    }
                                } else {
                                    throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", path, Long.valueOf(file2.length()), Long.valueOf(j6)));
                                }
                            } else {
                                throw new IOException(android.gov.nist.core.a.A("Reading the item ", path, " failed, because can't read the file."));
                            }
                        } else {
                            throw new IOException(android.gov.nist.core.a.A("Reading path ", path, " failed, because it's not a file."));
                        }
                    } else {
                        throw new IOException(android.gov.nist.core.a.A("File '", file2.getName(), "' doesn't exists"));
                    }
                } else {
                    throw new Exception(android.gov.nist.core.a.A("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
        }
    }

    public /* synthetic */ W0(File file, long j6, B0 b02, Q q10) {
        this.f33881d = file;
        this.f33879b = j6;
        this.f33882e = b02;
        this.f33880c = q10;
    }
}
