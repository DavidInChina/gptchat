package Vd;

import Lg.n;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class g {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final File f18596a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18597b;

    /* renamed from: c  reason: collision with root package name */
    public final i f18598c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18599d;

    /* renamed from: e  reason: collision with root package name */
    public FileOutputStream f18600e;

    /* renamed from: f  reason: collision with root package name */
    public File f18601f;

    /* renamed from: g  reason: collision with root package name */
    public final Wg.i f18602g;

    public g(File file, String str, i iVar) {
        AbstractC3557B.c0("writeKey", str);
        this.f18596a = file;
        this.f18597b = str;
        this.f18598c = iVar;
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Could not create directory at " + file);
        }
        Runtime.getRuntime().addShutdownHook(new x2.j(5, this));
        this.f18599d = "segment.events.file.index.".concat(str);
        int i10 = Wg.j.f21105a;
        this.f18602g = new Wg.i(1, 0);
    }

    public static final void a(g gVar) {
        File b10 = gVar.b();
        if (b10.exists()) {
            StringBuilder sb2 = new StringBuilder("],\"sentAt\":\"");
            k.Companion.getClass();
            sb2.append(j.a());
            sb2.append("\",\"writeKey\":\"");
            byte[] bytes = R.a.t(sb2, gVar.f18597b, "\"}").getBytes(Lg.a.f11131a);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
            gVar.e(b10, bytes);
            String name = b10.getName();
            AbstractC3557B.b0("getName(...)", name);
            b10.renameTo(new File(gVar.f18596a, n.S2(name, name)));
            FileOutputStream fileOutputStream = gVar.f18600e;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            i iVar = gVar.f18598c;
            String str = gVar.f18599d;
            iVar.a(iVar.b(str) + 1, str);
            gVar.f18600e = null;
            gVar.f18601f = null;
        }
    }

    public final File b() {
        File file = this.f18601f;
        if (file == null) {
            int b10 = this.f18598c.b(this.f18599d);
            file = new File(this.f18596a, this.f18597b + '-' + b10 + ".tmp");
        }
        this.f18601f = file;
        return file;
    }

    public final ArrayList c() {
        File[] listFiles = this.f18596a.listFiles(new d(0, this));
        if (listFiles == null) {
            listFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        g gVar;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f18595j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f18595j0 = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f18593h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f18595j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        abstractC6216a = fVar.f18592Z;
                        gVar = fVar.f18591Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Wg.i iVar = this.f18602g;
                    fVar.f18591Y = this;
                    fVar.f18592Z = abstractC6216a;
                    fVar.f18595j0 = 1;
                    if (iVar.a(fVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    gVar = this;
                }
                abstractC6216a.mo122invoke();
                gVar.f18602g.c();
                return y.f36177a;
            }
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f18593h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f18595j0;
        if (i10 == 0) {
        }
        abstractC6216a.mo122invoke();
        gVar.f18602g.c();
        return y.f36177a;
    }

    public final void e(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = this.f18600e;
        if (fileOutputStream == null) {
            fileOutputStream = r.f.q(new FileOutputStream(file, true), file, true);
        }
        this.f18600e = fileOutputStream;
        fileOutputStream.write(bArr);
        fileOutputStream.flush();
    }
}
