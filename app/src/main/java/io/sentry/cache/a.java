package io.sentry.cache;

import io.sentry.C3637d;
import io.sentry.EnumC3642e1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.r1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f34287a = Charset.forName("UTF-8");

    public static void a(r1 r1Var, String str, String str2) {
        File file;
        String cacheDirPath = r1Var.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            r1Var.getLogger().f(EnumC3642e1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Deleting %s from scope cache", str2);
            if (!file3.delete()) {
                r1Var.getLogger().f(EnumC3642e1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
            }
        }
    }

    public static Object b(SentryAndroidOptions sentryAndroidOptions, String str, String str2, Class cls, C3637d c3637d) {
        File file;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            file = new File(cacheDirPath, str);
            file.mkdirs();
        }
        if (file == null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), f34287a));
                if (c3637d == null) {
                    Object e10 = sentryAndroidOptions.getSerializer().e(bufferedReader, cls);
                    bufferedReader.close();
                    return e10;
                }
                Object k10 = sentryAndroidOptions.getSerializer().k(bufferedReader, cls, c3637d);
                bufferedReader.close();
                return k10;
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().b(EnumC3642e1.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static void c(r1 r1Var, Object obj, String str, String str2) {
        File file;
        String cacheDirPath = r1Var.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            r1Var.getLogger().f(EnumC3642e1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file3.delete()) {
                r1Var.getLogger().f(EnumC3642e1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f34287a));
            try {
                r1Var.getSerializer().n(obj, bufferedWriter);
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
            r1Var.getLogger().b(EnumC3642e1.ERROR, th4, "Error persisting entity: %s", str2);
        }
    }
}
