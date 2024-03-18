package io.sentry.android.core;

import D1.N0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import id.AbstractC3557B;
import io.sentry.C3607a;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.Z0;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f34256Y;

    /* renamed from: Z  reason: collision with root package name */
    public final io.sentry.G f34257Z;

    /* renamed from: h0  reason: collision with root package name */
    public final SentryAndroidOptions f34258h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f34259i0 = System.currentTimeMillis() - AnrV2Integration.f33941h0;

    public w(Context context, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.A a5 = io.sentry.A.f33710a;
        this.f34256Y = context;
        this.f34257Z = a5;
        this.f34258h0 = sentryAndroidOptions;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, io.sentry.protocol.l] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, io.sentry.android.core.internal.threaddump.a] */
    public final void a(ApplicationExitInfo applicationExitInfo, boolean z10) {
        long timestamp;
        int importance;
        boolean z11;
        z zVar;
        byte[] bArr;
        String applicationExitInfo2;
        InputStream traceInputStream;
        SentryAndroidOptions sentryAndroidOptions = this.f34258h0;
        timestamp = applicationExitInfo.getTimestamp();
        importance = applicationExitInfo.getImportance();
        if (importance != 100) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                zVar = new z(y.NO_DUMP);
                if (traceInputStream != null) {
                    traceInputStream.close();
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = traceInputStream.read(bArr2, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            ?? obj = new Object();
                            obj.f34136a = readLine;
                            arrayList.add(obj);
                        }
                        ArrayList d10 = new io.sentry.android.core.internal.threaddump.b(sentryAndroidOptions, z11).d(new T0.m(arrayList));
                        if (d10.isEmpty()) {
                            zVar = new z(y.ERROR, byteArray);
                            bufferedReader.close();
                        } else {
                            z zVar2 = new z(y.DUMP, byteArray, d10);
                            bufferedReader.close();
                            zVar = zVar2;
                        }
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().d(EnumC3642e1.WARNING, "Failed to parse ANR thread dump", th2);
                        zVar = new z(y.ERROR, byteArray);
                    }
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().d(EnumC3642e1.WARNING, "Failed to read ANR thread dump", th4);
            zVar = new z(y.NO_DUMP);
        }
        y yVar = (y) zVar.f34263Y;
        if (yVar == y.NO_DUMP) {
            io.sentry.H logger = sentryAndroidOptions.getLogger();
            EnumC3642e1 enumC3642e1 = EnumC3642e1.WARNING;
            applicationExitInfo2 = applicationExitInfo.toString();
            logger.f(enumC3642e1, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo2);
            return;
        }
        x xVar = new x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z10, z11);
        C3686u t02 = AbstractC3557B.t0(xVar);
        Z0 z02 = new Z0();
        if (yVar == y.ERROR) {
            ?? obj2 = new Object();
            obj2.f34573Y = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            z02.f33900v0 = obj2;
        } else if (yVar == y.DUMP) {
            z02.f33902x0 = new C4.c(2, (List) zVar.f34265h0);
        }
        z02.f33904z0 = EnumC3642e1.FATAL;
        z02.f33899u0 = r.f.B(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) zVar.f34264Z) != null) {
            t02.f34768e = new C3607a(bArr, "thread-dump.txt", "text/plain");
        }
        if (!this.f34257Z.C(z02, t02).equals(io.sentry.protocol.s.f34619Z) && !xVar.d()) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", z02.f33836Y);
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:167)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:286)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:265)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb A[EDGE_INSN: B:64:0x00cb->B:33:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.w.run():void");
    }
}
