package com.pairip;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class VMRunner {
    private static final int PACKAGE_MANAGER_TRIES = 5;
    private static final String TAG = "VMRunner";
    private static String apkPath = null;
    private static Context context = null;
    private static String loggingEnabled = "false";

    public static native Object executeVM(byte[] vmCode, Object[] args);

    static {
        System.loadLibrary("pairipcore");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class VMRunnerException extends RuntimeException {
        public VMRunnerException(String message) {
            super(message);
        }

        public VMRunnerException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void setContext(Context context2) {
        context = context2;
    }

    public static Object invoke(String vmByteCodeFile, Object[] args) {
        if (isDebuggingEnabled()) {
            Log.i(TAG, "Executing " + vmByteCodeFile);
        }
        try {
            byte[] readByteCode = readByteCode(vmByteCodeFile);
            long currentTimeMillis = System.currentTimeMillis();
            Object executeVM = executeVM(readByteCode, args);
            if (isDebuggingEnabled()) {
                Log.i(TAG, String.format("Finished executing %s after %d ms.", vmByteCodeFile, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            return executeVM;
        } catch (IOException e10) {
            throw new VMRunnerException("Error while loading bytecode.", e10);
        }
    }

    public static Runnable createInvokeRunnable(final String vmByteCodeFile, final Object[] args) {
        return new Runnable() { // from class: com.pairip.VMRunner.1
            @Override // java.lang.Runnable
            public void run() {
                VMRunner.invoke(vmByteCodeFile, args);
            }
        };
    }

    private static byte[] readByteCode(String vmByteCodeFile) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        ZipFile openBaseApk = openBaseApk();
        try {
            ZipEntry entry = openBaseApk.getEntry("assets/" + vmByteCodeFile);
            if (entry == null) {
                throw new IOException(vmByteCodeFile + " not found.");
            }
            InputStream inputStream = openBaseApk.getInputStream(entry);
            int size = (int) entry.getSize();
            byte[] bArr = new byte[size];
            readFullByteArrayFromStream(inputStream, bArr);
            if (isDebuggingEnabled()) {
                Log.i(TAG, String.format("Finished loading %s (%d kB) after %d ms.", vmByteCodeFile, Integer.valueOf(size / 1024), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (openBaseApk != null) {
                openBaseApk.close();
            }
            return bArr;
        } catch (Throwable th2) {
            if (openBaseApk != null) {
                try {
                    openBaseApk.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private static ZipFile openBaseApk() {
        ZipFile tryOpen = tryOpen(apkPath);
        if (tryOpen != null) {
            return tryOpen;
        }
        ZipFile tryOpen2 = tryOpen(getApkPathFromResource());
        if (tryOpen2 != null) {
            return tryOpen2;
        }
        ZipFile apkFromContextPath = getApkFromContextPath();
        if (apkFromContextPath == null) {
            throw new VMRunnerException("Could not open base apk.");
        }
        return apkFromContextPath;
    }

    private static ZipFile getApkFromContextPath() {
        ZipFile zipFile = null;
        if (context == null) {
            return null;
        }
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                zipFile = tryOpen(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
                if (zipFile != null) {
                    return zipFile;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                String message = e10.getMessage();
                throw new VMRunnerException("Error while opening base apk: " + message, e10);
            }
        }
        return zipFile;
    }

    private static ZipFile tryOpen(String path) {
        if (path == null) {
            return null;
        }
        try {
            ZipFile zipFile = new ZipFile(path);
            apkPath = path;
            return zipFile;
        } catch (IOException e10) {
            if (isDebuggingEnabled()) {
                String message = e10.getMessage();
                Log.i(TAG, "Cannot open zipfile " + path + " error: " + message);
            }
            return null;
        }
    }

    private static byte[] readFullByteArrayFromStream(InputStream is, byte[] byteArray) throws IOException {
        int i10 = 0;
        while (true) {
            int read = is.read(byteArray, i10, byteArray.length - i10);
            if (read <= 0) {
                break;
            }
            i10 += read;
        }
        if (i10 == byteArray.length) {
            return byteArray;
        }
        int length = byteArray.length;
        throw new IOException("Read " + i10 + Separators.SLASH + length + " bytes.");
    }

    private static synchronized String getApkPathFromResource() {
        synchronized (VMRunner.class) {
            long currentTimeMillis = System.currentTimeMillis();
            URL resource = VMRunner.class.getResource("/AndroidManifest.xml");
            if (resource == null) {
                if (isDebuggingEnabled()) {
                    Log.i(TAG, "Cannot load resource!");
                }
                return null;
            }
            if (isDebuggingEnabled()) {
                String valueOf = String.valueOf(resource);
                Log.i(TAG, "Resource URL is " + valueOf);
            }
            String url = resource.toString();
            String substring = url.substring(9, url.lastIndexOf(33));
            if (isDebuggingEnabled()) {
                Log.i(TAG, String.format("Found APK path %s after %d ms.", substring, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            return substring;
        }
    }

    private static boolean isDebuggingEnabled() {
        return "true".equals(loggingEnabled);
    }

    private VMRunner() {
    }
}
