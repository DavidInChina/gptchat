package qh;

import Ah.a0;
import Sh.J;
import dalvik.system.DexClassLoader;
import io.sentry.C3636c1;
import io.sentry.android.core.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.logging.Logger;
import yh.l1;

/* renamed from: qh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5332f implements a0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final AbstractC5331e f44142i0;

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5329c f44143Y;

    /* renamed from: Z  reason: collision with root package name */
    public final File f44144Z;

    /* renamed from: h0  reason: collision with root package name */
    public final J f44145h0;

    static {
        AbstractC5331e abstractC5331e;
        try {
            abstractC5331e = new z(Class.forName("java.nio.file.Files").getMethod("setPosixFilePermissions", Class.forName("java.nio.file.Path"), Set.class), File.class.getMethod("toPath", new Class[0]), Collections.singleton(Class.forName("java.nio.file.attribute.PosixFilePermission").getMethod("valueOf", String.class).invoke(null, "OWNER_READ")));
        } catch (Throwable unused) {
            abstractC5331e = EnumC5330d.f44140Y;
        }
        f44142i0 = abstractC5331e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Q4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R4.a, java.lang.Object] */
    public C5332f(File file) {
        AbstractC5327a abstractC5327a = C5328b.f44137c;
        ?? obj = new Object();
        obj.f14424a = 13;
        C5328b.f44137c.a(obj);
        C5328b c5328b = new C5328b(obj, new Object());
        if (file.isDirectory()) {
            this.f44144Z = file;
            this.f44143Y = c5328b;
            this.f44145h0 = new J(0);
            return;
        }
        throw new IllegalArgumentException("Not a directory " + file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, O4.a] */
    @Override // Ah.a0
    public final Map b(ClassLoader classLoader, LinkedHashMap linkedHashMap) {
        C5328b c5328b = (C5328b) this.f44143Y;
        C3636c1 c3636c1 = new C3636c1(c5328b, new S4.b(c5328b.f44138a), 26);
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String name = ((l1) entry.getKey()).getName();
            byte[] bArr = (byte[]) entry.getValue();
            String str = name.replace('.', '/') + ".class";
            S1.b bVar = new S1.b(bArr);
            ?? obj = new Object();
            if (str != null) {
                obj.f13388c = str;
                obj.f13389d = bVar;
                obj.f13387b = false;
                obj.f13386a = -1;
                obj.f13390e = new Object();
                AbstractC5327a abstractC5327a = C5328b.f44137c;
                C5328b c5328b2 = (C5328b) c3636c1.f34286h0;
                R4.a aVar = c5328b2.f44139b;
                Q4.a aVar2 = c5328b2.f44138a;
                abstractC5327a.j(obj, bArr, aVar, aVar2, new S4.b(aVar2));
                ((S4.b) c3636c1.f34285Z).f16146k.getClass();
                try {
                    throw null;
                } catch (NullPointerException unused) {
                    throw new NullPointerException("clazz == null");
                }
            }
            throw new NullPointerException("filePath == null");
        }
        File file = new File(this.f44144Z, this.f44145h0.a().concat(".jar"));
        try {
            try {
                if (file.createNewFile()) {
                    JarOutputStream jarOutputStream = new JarOutputStream(r.f.p(new FileOutputStream(file), file));
                    try {
                        jarOutputStream.putNextEntry(new JarEntry("classes.dex"));
                        c3636c1.h(jarOutputStream);
                        jarOutputStream.closeEntry();
                        jarOutputStream.close();
                        f44142i0.accept(file);
                        return c(classLoader, linkedHashMap.keySet(), file);
                    } catch (Throwable th2) {
                        jarOutputStream.close();
                        throw th2;
                    }
                }
                throw new IllegalStateException("Cannot create " + file);
            } catch (IOException e10) {
                throw new IllegalStateException("Cannot write to zip file " + file, e10);
            }
        } finally {
            if (!file.delete()) {
                Logger.getLogger("net.bytebuddy").warning("Could not delete " + file);
            }
        }
    }

    public final HashMap c(ClassLoader classLoader, Set set, File file) {
        DexClassLoader dexClassLoader = new DexClassLoader(file.getAbsolutePath(), this.f44144Z.getAbsolutePath(), null, classLoader);
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            try {
                hashMap.put(l1Var, Class.forName(l1Var.getName(), false, dexClassLoader));
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Cannot load " + l1Var, e10);
            }
        }
        return hashMap;
    }
}
