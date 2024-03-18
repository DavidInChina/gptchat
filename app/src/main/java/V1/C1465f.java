package V1;

import Ve.r0;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import cf.AbstractC2408g;
import h7.C3327a;
import i7.C3482a;
import id.AbstractC3557B;
import io.sentry.AbstractC3670o;
import io.sentry.C3667n;
import io.sentry.E1;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3652i;
import j$.util.Objects;
import java.io.File;
import java.util.Map;
import livekit.org.webrtc.FrameCryptor;
import y1.AbstractC6496f;
import z.AbstractC6708l;

/* renamed from: V1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1465f implements AbstractC6496f, k7.i, FrameCryptor.Observer {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18190Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f18191Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f18192h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f18193i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f18194j0;

    public /* synthetic */ C1465f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18190Y = i10;
        this.f18191Z = obj;
        this.f18192h0 = obj2;
        this.f18193i0 = obj3;
        this.f18194j0 = obj4;
    }

    public final void a() {
        int i10;
        int i11;
        int i12 = 0;
        io.sentry.H h10 = (io.sentry.H) this.f18191Z;
        String str = (String) this.f18192h0;
        AbstractC3670o abstractC3670o = (AbstractC3670o) this.f18193i0;
        File file = (File) this.f18194j0;
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        h10.f(enumC3642e1, "Started processing cached files from %s", str);
        io.sentry.H h11 = abstractC3670o.f34445b;
        try {
            h11.f(enumC3642e1, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                h11.f(EnumC3642e1.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (!file.isDirectory()) {
                h11.f(EnumC3642e1.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    h11.f(EnumC3642e1.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                } else {
                    File[] listFiles2 = file.listFiles(new Vd.d(1, abstractC3670o));
                    Object[] objArr = new Object[2];
                    if (listFiles2 != null) {
                        i11 = listFiles2.length;
                    } else {
                        i11 = 0;
                    }
                    objArr[0] = Integer.valueOf(i11);
                    objArr[1] = file.getAbsolutePath();
                    h11.f(enumC3642e1, "Processing %d items from cache dir %s", objArr);
                    int length = listFiles.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        File file2 = listFiles[i13];
                        if (!file2.isFile()) {
                            EnumC3642e1 enumC3642e12 = EnumC3642e1.DEBUG;
                            Object[] objArr2 = new Object[1];
                            objArr2[i12] = file2.getAbsolutePath();
                            h11.f(enumC3642e12, "File %s is not a File.", objArr2);
                        } else {
                            String absolutePath = file2.getAbsolutePath();
                            E1 e12 = abstractC3670o.f34447d;
                            if (e12.contains(absolutePath)) {
                                EnumC3642e1 enumC3642e13 = EnumC3642e1.DEBUG;
                                Object[] objArr3 = new Object[1];
                                objArr3[i12] = absolutePath;
                                h11.f(enumC3642e13, "File '%s' has already been processed so it will not be processed again.", objArr3);
                            } else {
                                io.sentry.transport.o e10 = abstractC3670o.f34444a.e();
                                if (e10 != null && e10.b(EnumC3652i.All)) {
                                    h11.f(EnumC3642e1.INFO, "DirectoryProcessor, rate limiting active.", new Object[i12]);
                                    break;
                                }
                                EnumC3642e1 enumC3642e14 = EnumC3642e1.DEBUG;
                                Object[] objArr4 = new Object[1];
                                objArr4[i12] = absolutePath;
                                h11.f(enumC3642e14, "Processing file: %s", objArr4);
                                abstractC3670o.c(file2, AbstractC3557B.t0(new C3667n(abstractC3670o.f34446c, abstractC3670o.f34445b, absolutePath, e12)));
                                Thread.sleep(100L);
                            }
                        }
                        i13++;
                        i12 = 0;
                    }
                }
            }
            i10 = i12;
        } catch (Throwable th2) {
            i10 = 0;
            h11.b(EnumC3642e1.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
        EnumC3642e1 enumC3642e15 = EnumC3642e1.DEBUG;
        Object[] objArr5 = new Object[1];
        objArr5[i10] = str;
        h10.f(enumC3642e15, "Finished processing cached files from %s", objArr5);
    }

    @Override // k7.i
    public final Object apply(Object obj) {
        k7.k kVar = (k7.k) this.f18191Z;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        b7.b bVar = k7.k.f37187k0;
        kVar.getClass();
        return (C3327a) k7.k.p(sQLiteDatabase.rawQuery((String) this.f18192h0, new String[0]), new C3482a(kVar, (Map) this.f18193i0, (U3.n) this.f18194j0, 4));
    }

    @Override // y1.AbstractC6496f
    public final void b() {
        View view = (View) this.f18191Z;
        C1471l c1471l = (C1471l) this.f18192h0;
        C1467h c1467h = (C1467h) this.f18193i0;
        e0 e0Var = (e0) this.f18194j0;
        AbstractC3557B.c0("this$0", c1471l);
        AbstractC3557B.c0("$animationInfo", c1467h);
        AbstractC3557B.c0("$operation", e0Var);
        view.clearAnimation();
        c1471l.f18216a.endViewTransition(view);
        c1467h.b();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + e0Var + " has been cancelled.");
        }
    }

    @Override // livekit.org.webrtc.FrameCryptor.Observer
    public final void onFrameCryptionStateChanged(String str, FrameCryptor.FrameCryptionState frameCryptionState) {
        int i10 = this.f18190Y;
        Object obj = this.f18194j0;
        Object obj2 = this.f18193i0;
        Object obj3 = this.f18192h0;
        Se.c cVar = (Se.c) this.f18191Z;
        switch (i10) {
            case 2:
                r0 r0Var = (r0) obj3;
                Xe.B b10 = (Xe.B) obj2;
                We.i iVar = (We.i) obj;
                AbstractC3557B.c0("this$0", cVar);
                AbstractC3557B.c0("$room", r0Var);
                AbstractC3557B.c0("$publication", b10);
                AbstractC3557B.c0("$participant", iVar);
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                    Objects.toString(frameCryptionState);
                    Mi.a.c(new Object[0]);
                }
                wf.k kVar = cVar.f16585f;
                if (kVar != null) {
                    Xe.z a5 = b10.a();
                    AbstractC3557B.Z(a5);
                    kVar.invoke(new Te.v(r0Var, a5, b10, iVar, Se.c.d(frameCryptionState)));
                    return;
                }
                AbstractC3557B.C2("emitEvent");
                throw null;
            default:
                r0 r0Var2 = (r0) obj3;
                Xe.B b11 = (Xe.B) obj2;
                We.C c10 = (We.C) obj;
                AbstractC3557B.c0("this$0", cVar);
                AbstractC3557B.c0("$room", r0Var2);
                AbstractC3557B.c0("$publication", b11);
                AbstractC3557B.c0("$participant", c10);
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                    Objects.toString(frameCryptionState);
                    Mi.a.c(new Object[0]);
                }
                wf.k kVar2 = cVar.f16585f;
                if (kVar2 != null) {
                    Xe.z a10 = b11.a();
                    AbstractC3557B.Z(a10);
                    kVar2.invoke(new Te.v(r0Var2, a10, b11, c10, Se.c.d(frameCryptionState)));
                    return;
                }
                AbstractC3557B.C2("emitEvent");
                throw null;
        }
    }
}
