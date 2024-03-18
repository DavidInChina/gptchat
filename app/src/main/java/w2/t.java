package w2;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.play_billing.C;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import k6.AbstractC4194d;
import q.C5241w;
import u2.C5827b;
import x8.S;

/* loaded from: classes.dex */
public final class t implements AbstractC6084b {

    /* renamed from: j  reason: collision with root package name */
    public static final HashSet f47721j = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final File f47722a;

    /* renamed from: b  reason: collision with root package name */
    public final f f47723b;

    /* renamed from: c  reason: collision with root package name */
    public final C5241w f47724c;

    /* renamed from: d  reason: collision with root package name */
    public final h f47725d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f47726e;

    /* renamed from: f  reason: collision with root package name */
    public final Random f47727f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f47728g;

    /* renamed from: h  reason: collision with root package name */
    public long f47729h;

    /* renamed from: i  reason: collision with root package name */
    public C6083a f47730i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q.w] */
    public t(File file, q qVar, C5827b c5827b) {
        boolean add;
        ?? obj = new Object();
        obj.f43573a = new HashMap();
        obj.f43574b = new SparseArray();
        obj.f43575c = new SparseBooleanArray();
        obj.f43576d = new SparseBooleanArray();
        m mVar = new m(c5827b);
        n nVar = new n(new File(file, "cached_content_index.exi"));
        obj.f43577e = mVar;
        obj.f43578f = nVar;
        h hVar = new h(c5827b);
        synchronized (t.class) {
            add = f47721j.add(file.getAbsoluteFile());
        }
        if (add) {
            this.f47722a = file;
            this.f47723b = qVar;
            this.f47724c = obj;
            this.f47725d = hVar;
            this.f47726e = new HashMap();
            this.f47727f = new Random();
            this.f47728g = true;
            this.f47729h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new s(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [w2.a, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v3, types: [w2.a, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v5, types: [w2.a, java.io.IOException] */
    public static void a(t tVar) {
        long j6;
        C5241w c5241w = tVar.f47724c;
        File file = tVar.f47722a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (C6083a e10) {
                tVar.f47730i = e10;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            s2.p.c("SimpleCache", str);
            tVar.f47730i = new IOException(str);
            return;
        }
        int length = listFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                File file2 = listFiles[i10];
                String name = file2.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j6 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        s2.p.c("SimpleCache", "Malformed UID file: " + file2);
                        file2.delete();
                    }
                }
                i10++;
            } else {
                j6 = -1;
                break;
            }
        }
        tVar.f47729h = j6;
        if (j6 == -1) {
            try {
                tVar.f47729h = f(file);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + file;
                s2.p.d("SimpleCache", str2, e11);
                tVar.f47730i = new IOException(str2, e11);
                return;
            }
        }
        try {
            c5241w.l(tVar.f47729h);
            h hVar = tVar.f47725d;
            if (hVar != null) {
                hVar.b(tVar.f47729h);
                HashMap a5 = hVar.a();
                tVar.i(file, true, listFiles, a5);
                hVar.c(a5.keySet());
            } else {
                tVar.i(file, true, listFiles, null);
            }
            C it = S.V(((HashMap) c5241w.f43573a).keySet()).iterator();
            while (it.hasNext()) {
                c5241w.m((String) it.next());
            }
            try {
                c5241w.p();
            } catch (IOException e12) {
                s2.p.d("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + file;
            s2.p.d("SimpleCache", str3, e13);
            tVar.f47730i = new IOException(str3, e13);
        }
    }

    public static void e(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            s2.p.c("SimpleCache", str);
            throw new IOException(str);
        }
    }

    public static long f(File file) {
        long j6;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            j6 = 0;
        } else {
            j6 = Math.abs(nextLong);
        }
        File file2 = new File(file, android.gov.nist.core.a.g(Long.toString(j6, 16), ".uid"));
        if (file2.createNewFile()) {
            return j6;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(u uVar) {
        C5241w c5241w = this.f47724c;
        String str = uVar.f47688Y;
        c5241w.i(str).f47698c.add(uVar);
        ArrayList arrayList = (ArrayList) this.f47726e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) ((f) arrayList.get(size))).b(this, uVar);
            }
        }
        ((q) this.f47723b).b(this, uVar);
    }

    public final synchronized void c(U3.l lVar, String str) {
        d();
        C5241w c5241w = this.f47724c;
        l i10 = c5241w.i(str);
        p pVar = i10.f47700e;
        p a5 = pVar.a(lVar);
        i10.f47700e = a5;
        if (!a5.equals(pVar)) {
            ((o) c5241w.f43577e).f(i10);
        }
        try {
            this.f47724c.p();
        } catch (IOException e10) {
            throw new IOException(e10);
        }
    }

    public final synchronized void d() {
        C6083a c6083a = this.f47730i;
        if (c6083a != null) {
            throw c6083a;
        }
    }

    public final synchronized p g(String str) {
        p pVar;
        l h10 = this.f47724c.h(str);
        if (h10 != null) {
            pVar = h10.f47700e;
        } else {
            pVar = p.f47713c;
        }
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [w2.j, w2.u] */
    /* JADX WARN: Type inference failed for: r13v1, types: [w2.j] */
    public final u h(long j6, long j10, String str) {
        u uVar;
        long j11;
        l h10 = this.f47724c.h(str);
        if (h10 == null) {
            return new j(str, j6, j10, -9223372036854775807L, null);
        }
        while (true) {
            j jVar = new j(h10.f47697b, j6, -1L, -9223372036854775807L, null);
            TreeSet treeSet = h10.f47698c;
            uVar = (u) treeSet.floor(jVar);
            if (uVar == null || uVar.f47689Z + uVar.f47690h0 <= j6) {
                u uVar2 = (u) treeSet.ceiling(jVar);
                if (uVar2 != null) {
                    long j12 = uVar2.f47689Z - j6;
                    if (j10 != -1) {
                        j12 = Math.min(j12, j10);
                    }
                    j11 = j12;
                } else {
                    j11 = j10;
                }
                uVar = new j(h10.f47697b, j6, j11, -9223372036854775807L, null);
            }
            if (!uVar.f47691i0) {
                break;
            }
            File file = uVar.f47692j0;
            file.getClass();
            if (file.length() == uVar.f47690h0) {
                break;
            }
            l();
        }
        return uVar;
    }

    public final void i(File file, boolean z10, File[] fileArr, HashMap hashMap) {
        g gVar;
        long j6;
        long j10;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z10 && name.indexOf(46) == -1) {
                    i(file2, false, file2.listFiles(), hashMap);
                } else if (!z10 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    if (hashMap != null) {
                        gVar = (g) hashMap.remove(name);
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        j10 = gVar.f47682a;
                        j6 = gVar.f47683b;
                    } else {
                        j6 = -9223372036854775807L;
                        j10 = -1;
                    }
                    u b10 = u.b(file2, j10, j6, this.f47724c);
                    if (b10 != null) {
                        b(b10);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z10) {
            file.delete();
        }
    }

    public final synchronized void j(j jVar) {
        l h10 = this.f47724c.h(jVar.f47688Y);
        h10.getClass();
        long j6 = jVar.f47689Z;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = h10.f47699d;
            if (i10 < arrayList.size()) {
                if (((k) arrayList.get(i10)).f47694a == j6) {
                    arrayList.remove(i10);
                    this.f47724c.m(h10.f47697b);
                    notifyAll();
                } else {
                    i10++;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void k(j jVar) {
        String str = jVar.f47688Y;
        C5241w c5241w = this.f47724c;
        l h10 = c5241w.h(str);
        if (h10 != null && h10.f47698c.remove(jVar)) {
            File file = jVar.f47692j0;
            if (file != null) {
                file.delete();
            }
            h hVar = this.f47725d;
            if (hVar != null) {
                file.getClass();
                String name = file.getName();
                try {
                    hVar.f47686b.getClass();
                    try {
                        hVar.f47685a.getWritableDatabase().delete(hVar.f47686b, "name = ?", new String[]{name});
                    } catch (SQLException e10) {
                        throw new IOException(e10);
                    }
                } catch (IOException unused) {
                    AbstractC4194d.C("Failed to remove file index entry for: ", name, "SimpleCache");
                }
            }
            c5241w.m(h10.f47697b);
            ArrayList arrayList = (ArrayList) this.f47726e.get(jVar.f47688Y);
            long j6 = jVar.f47690h0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    q qVar = (q) ((f) arrayList.get(size));
                    qVar.f47716a.remove(jVar);
                    qVar.f47717b -= j6;
                }
            }
            q qVar2 = (q) this.f47723b;
            qVar2.f47716a.remove(jVar);
            qVar2.f47717b -= j6;
        }
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        for (l lVar : Collections.unmodifiableCollection(((HashMap) this.f47724c.f43573a).values())) {
            Iterator it = lVar.f47698c.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                File file = jVar.f47692j0;
                file.getClass();
                if (file.length() != jVar.f47690h0) {
                    arrayList.add(jVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k((j) arrayList.get(i10));
        }
    }

    public final synchronized u m(long j6, long j10, String str) {
        d();
        u h10 = h(j6, j10, str);
        if (h10.f47691i0) {
            return n(str, h10);
        }
        l i10 = this.f47724c.i(str);
        long j11 = h10.f47690h0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = i10.f47699d;
            if (i11 < arrayList.size()) {
                k kVar = (k) arrayList.get(i11);
                long j12 = kVar.f47694a;
                if (j12 <= j6) {
                    long j13 = kVar.f47695b;
                    if (j13 == -1 || j12 + j13 > j6) {
                        break;
                    }
                    i11++;
                } else if (j11 == -1 || j6 + j11 > j12) {
                    break;
                } else {
                    i11++;
                }
            } else {
                arrayList.add(new k(j6, j11));
                return h10;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Type inference failed for: r2v3, types: [w2.j, w2.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u n(String str, u uVar) {
        boolean z10;
        File file;
        ArrayList arrayList;
        if (!this.f47728g) {
            return uVar;
        }
        File file2 = uVar.f47692j0;
        file2.getClass();
        String name = file2.getName();
        long j6 = uVar.f47690h0;
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = this.f47725d;
        if (hVar != null) {
            try {
                hVar.d(j6, currentTimeMillis, name);
            } catch (IOException unused) {
                s2.p.g("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        l h10 = this.f47724c.h(str);
        h10.getClass();
        TreeSet treeSet = h10.f47698c;
        Gi.e.n(treeSet.remove(uVar));
        file2.getClass();
        if (z10) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File c10 = u.c(parentFile, h10.f47696a, uVar.f47689Z, currentTimeMillis);
            if (file2.renameTo(c10)) {
                file = c10;
                Gi.e.n(uVar.f47691i0);
                ?? jVar = new j(uVar.f47688Y, uVar.f47689Z, uVar.f47690h0, currentTimeMillis, file);
                treeSet.add(jVar);
                arrayList = (ArrayList) this.f47726e.get(uVar.f47688Y);
                long j10 = uVar.f47690h0;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        q qVar = (q) ((f) arrayList.get(size));
                        qVar.f47716a.remove(uVar);
                        qVar.f47717b -= j10;
                        qVar.b(this, jVar);
                    }
                }
                q qVar2 = (q) this.f47723b;
                qVar2.f47716a.remove(uVar);
                qVar2.f47717b -= j10;
                qVar2.b(this, jVar);
                return jVar;
            }
            s2.p.g("CachedContent", "Failed to rename " + file2 + " to " + c10);
        }
        file = file2;
        Gi.e.n(uVar.f47691i0);
        ?? jVar2 = new j(uVar.f47688Y, uVar.f47689Z, uVar.f47690h0, currentTimeMillis, file);
        treeSet.add(jVar2);
        arrayList = (ArrayList) this.f47726e.get(uVar.f47688Y);
        long j102 = uVar.f47690h0;
        if (arrayList != null) {
        }
        q qVar22 = (q) this.f47723b;
        qVar22.f47716a.remove(uVar);
        qVar22.f47717b -= j102;
        qVar22.b(this, jVar2);
        return jVar2;
    }
}
