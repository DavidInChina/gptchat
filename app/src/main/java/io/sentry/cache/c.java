package io.sentry.cache;

import Ad.l;
import id.AbstractC3557B;
import io.sentry.C3686u;
import io.sentry.EnumC3639d1;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.M1;
import io.sentry.Q;
import io.sentry.Q0;
import io.sentry.T0;
import io.sentry.X0;
import io.sentry.Y0;
import io.sentry.hints.h;
import io.sentry.hints.i;
import io.sentry.r1;
import io.sentry.x1;
import io.sentry.y1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import v.C5934c;

/* loaded from: classes.dex */
public class c implements d {

    /* renamed from: l0  reason: collision with root package name */
    public static final Charset f34288l0 = Charset.forName("UTF-8");

    /* renamed from: Y  reason: collision with root package name */
    public final r1 f34289Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Q f34290Z;

    /* renamed from: h0  reason: collision with root package name */
    public final File f34291h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f34292i0;

    /* renamed from: k0  reason: collision with root package name */
    public final WeakHashMap f34294k0 = new WeakHashMap();

    /* renamed from: j0  reason: collision with root package name */
    public final CountDownLatch f34293j0 = new CountDownLatch(1);

    public c(r1 r1Var, String str, int i10) {
        l.Z0("SentryOptions is required.", r1Var);
        this.f34289Y = r1Var;
        this.f34290Z = r1Var.getSerializer();
        this.f34291h0 = new File(str);
        this.f34292i0 = i10;
    }

    public final boolean I() {
        r1 r1Var = this.f34289Y;
        try {
            return this.f34293j0.await(r1Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void M(File file, y1 y1Var) {
        boolean exists = file.exists();
        UUID uuid = y1Var.f34839j0;
        r1 r1Var = this.f34289Y;
        if (exists) {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Overwriting session to offline storage: %s", uuid);
            if (!file.delete()) {
                r1Var.getLogger().f(EnumC3642e1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f34288l0));
            try {
                this.f34290Z.n(y1Var, bufferedWriter);
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            r1Var.getLogger().b(EnumC3642e1.ERROR, th4, "Error writing Session to offline storage: %s", uuid);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0187 A[SYNTHETIC] */
    @Override // io.sentry.cache.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(T0 t02, C3686u c3686u) {
        T0 t03;
        Date date;
        Date date2;
        int i10;
        File[] fileArr;
        File[] fileArr2;
        y1 y1Var;
        Boolean bool;
        y1 y1Var2;
        int i11;
        int i12;
        Q q10;
        X0 x02;
        y1 y10;
        IOException e10;
        int i13 = 0;
        int i14 = 1;
        l.Z0("Envelope is required.", t02);
        File[] f6 = f();
        int length = f6.length;
        int i15 = this.f34292i0;
        if (length >= i15) {
            r1 r1Var = this.f34289Y;
            r1Var.getLogger().f(EnumC3642e1.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i16 = (length - i15) + 1;
            if (f6.length > 1) {
                Arrays.sort(f6, new C5934c(25));
            }
            File[] fileArr3 = (File[]) Arrays.copyOfRange(f6, i16, length);
            int i17 = 0;
            while (i17 < i16) {
                File file = f6[i17];
                T0 s10 = s(file);
                if (s10 != null) {
                    Iterable iterable = s10.f33865b;
                    if (iterable.iterator().hasNext()) {
                        r1Var.getClientReportRecorder().b(io.sentry.clientreport.d.CACHE_OVERFLOW, s10);
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                X0 x03 = (X0) it.next();
                                if (x03 != null && x03.f33884a.f33890h0.equals(EnumC3639d1.Session)) {
                                    y1Var = y(x03);
                                    break;
                                }
                            } else {
                                y1Var = null;
                                break;
                            }
                        }
                        if (y1Var != null && y1Var.f34841l0.equals(x1.Ok) && y1Var.f34839j0 != null && (bool = y1Var.f34840k0) != null && bool.booleanValue()) {
                            int length2 = fileArr3.length;
                            int i18 = i13;
                            while (i18 < length2) {
                                File file2 = fileArr3[i18];
                                T0 s11 = s(file2);
                                if (s11 != null) {
                                    Iterable<X0> iterable2 = s11.f33865b;
                                    if (!iterable2.iterator().hasNext()) {
                                        fileArr = f6;
                                        i10 = i16;
                                        fileArr2 = fileArr3;
                                        y1Var2 = y1Var;
                                        i11 = length2;
                                    } else {
                                        Iterator it2 = iterable2.iterator();
                                        while (true) {
                                            boolean hasNext = it2.hasNext();
                                            fileArr = f6;
                                            q10 = this.f34290Z;
                                            if (hasNext) {
                                                i10 = i16;
                                                X0 x04 = (X0) it2.next();
                                                if (x04 == null) {
                                                    fileArr2 = fileArr3;
                                                    i11 = length2;
                                                } else {
                                                    fileArr2 = fileArr3;
                                                    i11 = length2;
                                                    if (x04.f33884a.f33890h0.equals(EnumC3639d1.Session) && (y10 = y(x04)) != null) {
                                                        if (y10.f34841l0.equals(x1.Ok) && y10.f34839j0 != null) {
                                                            Boolean bool2 = y10.f34840k0;
                                                            UUID uuid = y1Var.f34839j0;
                                                            if (bool2 != null && bool2.booleanValue()) {
                                                                r1Var.getLogger().f(EnumC3642e1.ERROR, "Session %s has 2 times the init flag.", uuid);
                                                                break;
                                                            } else if (uuid != null && uuid.equals(y10.f34839j0)) {
                                                                y10.f34840k0 = Boolean.TRUE;
                                                                try {
                                                                    x02 = X0.b(q10, y10);
                                                                } catch (IOException e11) {
                                                                    e10 = e11;
                                                                    x02 = null;
                                                                }
                                                                try {
                                                                    it2.remove();
                                                                    y1Var2 = y1Var;
                                                                    break;
                                                                } catch (IOException e12) {
                                                                    e10 = e12;
                                                                    y1Var2 = y1Var;
                                                                    r1Var.getLogger().b(EnumC3642e1.ERROR, e10, "Failed to create new envelope item for the session %s", uuid);
                                                                    x02 = x02;
                                                                    if (x02 != null) {
                                                                    }
                                                                    i12 = 1;
                                                                    i18 += i12;
                                                                    i14 = i12;
                                                                    fileArr3 = fileArr2;
                                                                    f6 = fileArr;
                                                                    i16 = i10;
                                                                    length2 = i11;
                                                                    y1Var = y1Var2;
                                                                }
                                                            }
                                                        }
                                                        fileArr3 = fileArr2;
                                                        f6 = fileArr;
                                                        i16 = i10;
                                                        length2 = i11;
                                                        y1Var = y1Var;
                                                    }
                                                }
                                                fileArr3 = fileArr2;
                                                f6 = fileArr;
                                                i16 = i10;
                                                length2 = i11;
                                            } else {
                                                i10 = i16;
                                                fileArr2 = fileArr3;
                                                y1Var2 = y1Var;
                                                i11 = length2;
                                                x02 = null;
                                                break;
                                            }
                                        }
                                        if (x02 != null) {
                                            ArrayList arrayList = new ArrayList();
                                            for (X0 x05 : iterable2) {
                                                arrayList.add(x05);
                                            }
                                            arrayList.add(x02);
                                            T0 t04 = new T0(s11.f33864a, arrayList);
                                            long lastModified = file2.lastModified();
                                            if (!file2.delete()) {
                                                r1Var.getLogger().f(EnumC3642e1.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                            }
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                q10.b(t04, fileOutputStream);
                                                file2.setLastModified(lastModified);
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                r1Var.getLogger().d(EnumC3642e1.ERROR, "Failed to serialize the new envelope to the disk.", th2);
                                            }
                                        }
                                    }
                                    i12 = 1;
                                } else {
                                    fileArr = f6;
                                    i10 = i16;
                                    fileArr2 = fileArr3;
                                    y1Var2 = y1Var;
                                    i11 = length2;
                                    i12 = i14;
                                }
                                i18 += i12;
                                i14 = i12;
                                fileArr3 = fileArr2;
                                f6 = fileArr;
                                i16 = i10;
                                length2 = i11;
                                y1Var = y1Var2;
                            }
                        }
                    }
                }
                fileArr = f6;
                i10 = i16;
                fileArr2 = fileArr3;
                if (!file.delete()) {
                    i14 = 1;
                    r1Var.getLogger().f(EnumC3642e1.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                } else {
                    i14 = 1;
                }
                i17 += i14;
                fileArr3 = fileArr2;
                f6 = fileArr;
                i16 = i10;
                i13 = 0;
            }
        }
        File file3 = new File(this.f34291h0.getAbsolutePath(), "session.json");
        File file4 = new File(this.f34291h0.getAbsolutePath(), "previous_session.json");
        if (AbstractC3557B.D1(c3686u, h.class) && !file3.delete()) {
            this.f34289Y.getLogger().f(EnumC3642e1.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.hints.a.class.isInstance(AbstractC3557B.v1(c3686u))) {
            Object v12 = AbstractC3557B.v1(c3686u);
            if (v12 instanceof io.sentry.hints.a) {
                File file5 = new File(this.f34291h0.getAbsolutePath(), "previous_session.json");
                boolean exists = file5.exists();
                r1 r1Var2 = this.f34289Y;
                if (exists) {
                    H logger = r1Var2.getLogger();
                    EnumC3642e1 enumC3642e1 = EnumC3642e1.WARNING;
                    logger.f(enumC3642e1, "Previous session is not ended, we'd need to end it.", new Object[0]);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file5), f34288l0));
                        y1 y1Var3 = (y1) this.f34290Z.e(bufferedReader, y1.class);
                        if (y1Var3 != null) {
                            io.sentry.hints.a aVar = (io.sentry.hints.a) v12;
                            Long a5 = aVar.a();
                            if (a5 != null) {
                                date = r.f.B(a5.longValue());
                                Date date3 = y1Var3.f34835Y;
                                if (date3 == null) {
                                    date2 = null;
                                } else {
                                    date2 = (Date) date3.clone();
                                }
                                if (date2 != null) {
                                    if (date.before(date2)) {
                                    }
                                }
                                r1Var2.getLogger().f(enumC3642e1, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            } else {
                                date = null;
                            }
                            y1Var3.c(x1.Abnormal, null, true, aVar.c());
                            y1Var3.b(date);
                            M(file5, y1Var3);
                        }
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        r1Var2.getLogger().d(EnumC3642e1.ERROR, "Error processing previous session.", th3);
                    }
                } else {
                    r1Var2.getLogger().f(EnumC3642e1.DEBUG, "No previous session file to end.", new Object[0]);
                }
            }
        }
        if (i.class.isInstance(AbstractC3557B.v1(c3686u))) {
            if (file3.exists()) {
                this.f34289Y.getLogger().f(EnumC3642e1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file3), f34288l0));
                    y1 y1Var4 = (y1) this.f34290Z.e(bufferedReader2, y1.class);
                    if (y1Var4 != null) {
                        M(file4, y1Var4);
                    }
                    bufferedReader2.close();
                } catch (Throwable th4) {
                    this.f34289Y.getLogger().d(EnumC3642e1.ERROR, "Error processing session.", th4);
                }
            }
            t03 = t02;
            Iterable iterable3 = t03.f33865b;
            boolean hasNext2 = iterable3.iterator().hasNext();
            r1 r1Var3 = this.f34289Y;
            if (hasNext2) {
                X0 x06 = (X0) iterable3.iterator().next();
                boolean equals = EnumC3639d1.Session.equals(x06.f33884a.f33890h0);
                Y0 y02 = x06.f33884a;
                if (equals) {
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(x06.d()), f34288l0));
                        y1 y1Var5 = (y1) this.f34290Z.e(bufferedReader3, y1.class);
                        if (y1Var5 == null) {
                            r1Var3.getLogger().f(EnumC3642e1.ERROR, "Item of type %s returned null by the parser.", y02.f33890h0);
                        } else {
                            M(file3, y1Var5);
                        }
                        bufferedReader3.close();
                    } catch (Throwable th5) {
                        r1Var3.getLogger().d(EnumC3642e1.ERROR, "Item failed to process.", th5);
                    }
                } else {
                    r1Var3.getLogger().f(EnumC3642e1.INFO, "Current envelope has a different envelope type %s", y02.f33890h0);
                }
            } else {
                r1Var3.getLogger().f(EnumC3642e1.INFO, "Current envelope %s is empty", file3.getAbsolutePath());
            }
            if (!new File(this.f34289Y.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                File file6 = new File(this.f34289Y.getCacheDirPath(), "last_crash");
                if (file6.exists()) {
                    this.f34289Y.getLogger().f(EnumC3642e1.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file6.delete()) {
                        this.f34289Y.getLogger().f(EnumC3642e1.ERROR, "Failed to delete the crash marker file. %s.", file6.getAbsolutePath());
                    }
                }
            }
            Q0 q02 = Q0.f33856c;
            synchronized (q02.f33858b) {
                try {
                    if (!q02.f33857a) {
                        q02.f33857a = true;
                    }
                } finally {
                }
            }
            this.f34293j0.countDown();
        } else {
            t03 = t02;
        }
        File r10 = r(t02);
        if (r10.exists()) {
            this.f34289Y.getLogger().f(EnumC3642e1.WARNING, "Not adding Envelope to offline storage because it already exists: %s", r10.getAbsolutePath());
            return;
        }
        H logger2 = this.f34289Y.getLogger();
        EnumC3642e1 enumC3642e12 = EnumC3642e1.DEBUG;
        logger2.f(enumC3642e12, "Adding Envelope to offline storage: %s", r10.getAbsolutePath());
        boolean exists2 = r10.exists();
        r1 r1Var4 = this.f34289Y;
        if (exists2) {
            r1Var4.getLogger().f(enumC3642e12, "Overwriting envelope to offline storage: %s", r10.getAbsolutePath());
            if (!r10.delete()) {
                r1Var4.getLogger().f(EnumC3642e1.ERROR, "Failed to delete: %s", r10.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(r10);
            this.f34290Z.b(t03, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th6) {
            r1Var4.getLogger().b(EnumC3642e1.ERROR, th6, "Error writing Envelope %s to offline storage", r10.getAbsolutePath());
        }
        if (M1.class.isInstance(AbstractC3557B.v1(c3686u))) {
            r1 r1Var5 = this.f34289Y;
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(r1Var5.getCacheDirPath(), "last_crash"));
                fileOutputStream3.write(r.f.K(r.f.A()).getBytes(f34288l0));
                fileOutputStream3.flush();
                fileOutputStream3.close();
            } catch (Throwable th7) {
                r1Var5.getLogger().d(EnumC3642e1.ERROR, "Error writing the crash marker file to the disk", th7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FilenameFilter, java.lang.Object] */
    public final File[] f() {
        File file = this.f34291h0;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] listFiles = file.listFiles((FilenameFilter) new Object());
            if (listFiles != null) {
                return listFiles;
            }
        } else {
            this.f34289Y.getLogger().f(EnumC3642e1.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        r1 r1Var = this.f34289Y;
        File[] f6 = f();
        ArrayList arrayList = new ArrayList(f6.length);
        for (File file : f6) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f34290Z.h(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                    break;
                }
            } catch (FileNotFoundException unused) {
                r1Var.getLogger().f(EnumC3642e1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                r1Var.getLogger().d(EnumC3642e1.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e10);
            }
        }
        return arrayList.iterator();
    }

    public final synchronized File r(T0 t02) {
        String str;
        try {
            if (this.f34294k0.containsKey(t02)) {
                str = (String) this.f34294k0.get(t02);
            } else {
                String str2 = UUID.randomUUID() + ".envelope";
                this.f34294k0.put(t02, str2);
                str = str2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new File(this.f34291h0.getAbsolutePath(), str);
    }

    public final T0 s(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            T0 h10 = this.f34290Z.h(bufferedInputStream);
            bufferedInputStream.close();
            return h10;
        } catch (IOException e10) {
            this.f34289Y.getLogger().d(EnumC3642e1.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.cache.d
    public final void t(T0 t02) {
        l.Z0("Envelope is required.", t02);
        File r10 = r(t02);
        boolean exists = r10.exists();
        r1 r1Var = this.f34289Y;
        if (exists) {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Discarding envelope from cache: %s", r10.getAbsolutePath());
            if (!r10.delete()) {
                r1Var.getLogger().f(EnumC3642e1.ERROR, "Failed to delete envelope: %s", r10.getAbsolutePath());
                return;
            }
            return;
        }
        r1Var.getLogger().f(EnumC3642e1.DEBUG, "Envelope was not cached: %s", r10.getAbsolutePath());
    }

    public final y1 y(X0 x02) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(x02.d()), f34288l0));
            y1 y1Var = (y1) this.f34290Z.e(bufferedReader, y1.class);
            bufferedReader.close();
            return y1Var;
        } catch (Throwable th2) {
            this.f34289Y.getLogger().d(EnumC3642e1.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }
}
