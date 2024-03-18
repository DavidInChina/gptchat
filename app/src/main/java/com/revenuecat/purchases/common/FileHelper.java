package com.revenuecat.purchases.common;

import Ad.l;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import id.AbstractC3557B;
import io.sentry.instrumentation.file.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import r.f;
import wf.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\b#\u0010$J+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\b\u001a\u0010\tJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001f\u0010\u0017R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Ljf/y;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lwf/k;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "j$/util/stream/Stream", "streamBlock", "readFilePerLines", "", "numberOfLinesToRemove", "removeFirstLinesFromFile", "(Ljava/lang/String;I)V", "fileIsEmpty", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FileHelper {
    private final Context applicationContext;

    public FileHelper(Context context) {
        AbstractC3557B.c0("applicationContext", context);
        this.applicationContext = context;
    }

    private final File getFileInFilesDir(String str) {
        return new File(getFilesDir(), str);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        AbstractC3557B.b0("applicationContext.filesDir", filesDir);
        return filesDir;
    }

    private final void openBufferedReader(String str, k kVar) {
        File fileInFilesDir = getFileInFilesDir(str);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(N.t(new FileInputStream(fileInFilesDir), fileInFilesDir));
            BufferedReader t10 = new BufferedReader(inputStreamReader);
            try {
                kVar.invoke(t10);
                th = null;
                l.S(t10, th);
                l.S(inputStreamReader, th);
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final void appendToFile(String str, String str2) {
        AbstractC3557B.c0("filePath", str);
        AbstractC3557B.c0("contentToAppend", str2);
        File fileInFilesDir = getFileInFilesDir(str);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        e q10 = f.q(new FileOutputStream(fileInFilesDir, true), fileInFilesDir, true);
        try {
            byte[] bytes = str2.getBytes(Lg.a.f11131a);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
            q10.write(bytes);
            th = null;
        } finally {
        }
    }

    public final boolean deleteFile(String str) {
        AbstractC3557B.c0("filePath", str);
        return getFileInFilesDir(str).delete();
    }

    public final boolean fileIsEmpty(String str) {
        AbstractC3557B.c0("filePath", str);
        File fileInFilesDir = getFileInFilesDir(str);
        if (fileInFilesDir.exists() && fileInFilesDir.length() != 0) {
            return false;
        }
        return true;
    }

    public final double fileSizeInKB(String str) {
        AbstractC3557B.c0("filePath", str);
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(str));
    }

    public final void readFilePerLines(String str, k kVar) {
        AbstractC3557B.c0("filePath", str);
        AbstractC3557B.c0("streamBlock", kVar);
        openBufferedReader(str, new FileHelper$readFilePerLines$1(kVar));
    }

    public final void removeFirstLinesFromFile(String str, int i10) {
        AbstractC3557B.c0("filePath", str);
        StringBuilder sb2 = new StringBuilder();
        readFilePerLines(str, new FileHelper$removeFirstLinesFromFile$1(i10, sb2));
        deleteFile(str);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("textToAppend.toString()", sb3);
        appendToFile(str, sb3);
    }
}
