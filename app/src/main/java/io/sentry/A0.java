package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: h0  reason: collision with root package name */
    public static final Charset f33711h0 = Charset.forName("UTF-8");

    /* renamed from: Y  reason: collision with root package name */
    public final r1 f33712Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G f33713Z;

    public A0(r1 r1Var) {
        A a5 = A.f33710a;
        this.f33712Y = r1Var;
        this.f33713Z = a5;
    }

    public final Date a(File file) {
        r1 r1Var = this.f33712Y;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f33711h0));
            String readLine = bufferedReader.readLine();
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Crash marker file has %s timestamp.", readLine);
            Date C10 = r.f.C(readLine);
            bufferedReader.close();
            return C10;
        } catch (IOException e10) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            r1Var.getLogger().b(EnumC3642e1.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date date;
        r1 r1Var = this.f33712Y;
        String cacheDirPath = r1Var.getCacheDirPath();
        if (cacheDirPath == null) {
            r1Var.getLogger().f(EnumC3642e1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
        } else if (!r1Var.isEnableAutoSessionTracking()) {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
        } else {
            io.sentry.cache.d envelopeDiskCache = r1Var.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).I()) {
                r1Var.getLogger().f(EnumC3642e1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
                return;
            }
            Charset charset = io.sentry.cache.c.f34288l0;
            File file = new File(cacheDirPath, "previous_session.json");
            Q serializer = r1Var.getSerializer();
            if (file.exists()) {
                r1Var.getLogger().f(EnumC3642e1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f33711h0));
                    y1 y1Var = (y1) serializer.e(bufferedReader, y1.class);
                    if (y1Var == null) {
                        r1Var.getLogger().f(EnumC3642e1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(r1Var.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            r1Var.getLogger().f(EnumC3642e1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            date = a(file2);
                            if (!file2.delete()) {
                                r1Var.getLogger().f(EnumC3642e1.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            y1Var.c(x1.Crashed, null, true, null);
                        } else {
                            date = null;
                        }
                        if (y1Var.f34848s0 == null) {
                            y1Var.b(date);
                        }
                        this.f33713Z.A(new T0(null, r1Var.getSdkVersion(), X0.b(serializer, y1Var)));
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    r1Var.getLogger().d(EnumC3642e1.ERROR, "Error processing previous session.", th2);
                }
                if (!file.delete()) {
                    r1Var.getLogger().f(EnumC3642e1.WARNING, "Failed to delete the previous session file.", new Object[0]);
                }
            }
        }
    }
}
