package v4;

import G4.u;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g.RunnableC3111d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ji.C4116E;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f47174a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet f47175b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f47176c = {80, 75, 3, 4};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f47177d = {31, -117, 8};

    public static p a(final String str, Callable callable, RunnableC3111d runnableC3111d) {
        C5971a c5971a;
        p pVar = null;
        if (str == null) {
            c5971a = null;
        } else {
            c5971a = B4.e.f1861b.a(str);
        }
        if (c5971a != null) {
            pVar = new p(c5971a);
        }
        HashMap hashMap = f47174a;
        if (str != null && hashMap.containsKey(str)) {
            pVar = (p) hashMap.get(str);
        }
        if (pVar != null) {
            if (runnableC3111d != null) {
                runnableC3111d.run();
            }
            return pVar;
        }
        p pVar2 = new p(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            pVar2.b(new n() { // from class: v4.d
                @Override // v4.n
                public final void a(Object obj) {
                    int i10 = r3;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i10) {
                        case 0:
                            C5971a c5971a2 = (C5971a) obj;
                            HashMap hashMap2 = e.f47174a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                e.g();
                                return;
                            }
                            return;
                        default:
                            Throwable th2 = (Throwable) obj;
                            HashMap hashMap3 = e.f47174a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                e.g();
                                return;
                            }
                            return;
                    }
                }
            });
            pVar2.a(new n() { // from class: v4.d
                @Override // v4.n
                public final void a(Object obj) {
                    int i10 = r3;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i10) {
                        case 0:
                            C5971a c5971a2 = (C5971a) obj;
                            HashMap hashMap2 = e.f47174a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                e.g();
                                return;
                            }
                            return;
                        default:
                            Throwable th2 = (Throwable) obj;
                            HashMap hashMap3 = e.f47174a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                e.g();
                                return;
                            }
                            return;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, pVar2);
                if (hashMap.size() == 1) {
                    g();
                }
            }
        }
        return pVar2;
    }

    public static o b(InputStream inputStream, String str) {
        C4116E J10 = R4.b.J(R4.b.Z1(inputStream));
        String[] strArr = H4.a.f7432j0;
        return c(new H4.b(J10), str, true);
    }

    public static o c(H4.b bVar, String str, boolean z10) {
        C5971a a5;
        try {
            if (str == null) {
                a5 = null;
            } else {
                try {
                    a5 = B4.e.f1861b.a(str);
                } catch (Exception e10) {
                    o oVar = new o(e10);
                    if (z10) {
                        I4.g.b(bVar);
                    }
                    return oVar;
                }
            }
            if (a5 != null) {
                o oVar2 = new o(a5);
                if (z10) {
                    I4.g.b(bVar);
                }
                return oVar2;
            }
            C5971a a10 = u.a(bVar);
            if (str != null) {
                B4.e.f1861b.f1862a.c(str, a10);
            }
            o oVar3 = new o(a10);
            if (z10) {
                I4.g.b(bVar);
            }
            return oVar3;
        } catch (Throwable th2) {
            if (z10) {
                I4.g.b(bVar);
            }
            throw th2;
        }
    }

    public static o d(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return e(context, zipInputStream, str);
        } finally {
            I4.g.b(zipInputStream);
        }
    }

    public static o e(Context context, ZipInputStream zipInputStream, String str) {
        C5971a a5;
        m mVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a5 = null;
        } else {
            try {
                a5 = B4.e.f1861b.a(str);
            } catch (IOException e10) {
                return new o(e10);
            }
        }
        if (a5 != null) {
            return new o(a5);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C5971a c5971a = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                C4116E J10 = R4.b.J(R4.b.Z1(zipInputStream));
                String[] strArr = H4.a.f7432j0;
                c5971a = (C5971a) c(new H4.b(J10), null, false).f47235a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split(Separators.SLASH);
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    r.f.p(new FileOutputStream(file), file);
                    io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file), file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            p10.write(bArr, 0, read);
                        }
                        p10.flush();
                        p10.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            I4.b.a("Failed to delete temp font file " + file.getAbsolutePath() + Separators.DOT);
                        }
                        hashMap2.put(str3, createFromFile);
                    } finally {
                        try {
                            p10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                String[] split2 = name.split(Separators.SLASH);
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c5971a == null) {
            return new o(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = c5971a.c().values().iterator();
            while (true) {
                if (it.hasNext()) {
                    mVar = (m) it.next();
                    if (mVar.f47232d.equals(str4)) {
                        break;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                mVar.f47234f = I4.g.e((Bitmap) entry.getValue(), mVar.f47229a, mVar.f47230b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (B4.c cVar : c5971a.f47153f.values()) {
                if (cVar.f1852a.equals(entry2.getKey())) {
                    cVar.f1855d = (Typeface) entry2.getValue();
                    z10 = true;
                }
            }
            if (!z10) {
                I4.b.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            for (Map.Entry entry3 : c5971a.c().entrySet()) {
                m mVar2 = (m) entry3.getValue();
                if (mVar2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = mVar2.f47232d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        mVar2.f47234f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e11) {
                        I4.b.b("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            B4.e.f1861b.f1862a.c(str, c5971a);
        }
        return new o(c5971a);
    }

    public static Boolean f(C4116E c4116e, byte[] bArr) {
        try {
            C4116E peek = c4116e.peek();
            for (byte b10 : bArr) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            I4.b.f8035a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void g() {
        ArrayList arrayList = new ArrayList(f47175b);
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC2469q0.p(arrayList.get(0));
        throw null;
    }
}
