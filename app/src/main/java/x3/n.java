package x3;

import android.database.sqlite.SQLiteException;
import g.RunnableC3118k;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kf.AbstractC4268D;
import lf.C4442g;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f48696n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final y f48697a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f48698b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f48699c;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f48701e;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f48703g;

    /* renamed from: h  reason: collision with root package name */
    public volatile B3.i f48704h;

    /* renamed from: i  reason: collision with root package name */
    public final l f48705i;

    /* renamed from: m  reason: collision with root package name */
    public final RunnableC3118k f48709m;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f48702f = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final s.g f48706j = new s.g();

    /* renamed from: k  reason: collision with root package name */
    public final Object f48707k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public final Object f48708l = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f48700d = new LinkedHashMap();

    public n(y yVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        AbstractC3557B.c0("database", yVar);
        this.f48697a = yVar;
        this.f48698b = hashMap;
        this.f48699c = hashMap2;
        this.f48705i = new l(strArr.length);
        AbstractC3557B.b0("newSetFromMap(IdentityHashMap())", Collections.newSetFromMap(new IdentityHashMap()));
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            String j6 = AbstractC6463a.j("US", locale, str2, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f48700d.put(j6, Integer.valueOf(i10));
            String str3 = (String) this.f48698b.get(strArr[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", str);
            } else {
                str = null;
            }
            if (str != null) {
                j6 = str;
            }
            strArr2[i10] = j6;
        }
        this.f48701e = strArr2;
        for (Map.Entry entry : this.f48698b.entrySet()) {
            Locale locale2 = Locale.US;
            String j10 = AbstractC6463a.j("US", locale2, (String) entry.getValue(), locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f48700d.containsKey(j10)) {
                String lowerCase = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", lowerCase);
                LinkedHashMap linkedHashMap = this.f48700d;
                linkedHashMap.put(lowerCase, AbstractC4268D.Z0(j10, linkedHashMap));
            }
        }
        this.f48709m = new RunnableC3118k(11, this);
    }

    public final void a(p pVar) {
        Object obj;
        m mVar;
        String[] strArr = pVar.f48712a;
        C4442g c4442g = new C4442g();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String j6 = AbstractC6463a.j("US", locale, str, locale, "this as java.lang.String).toLowerCase(locale)");
            Map map = this.f48699c;
            if (map.containsKey(j6)) {
                String lowerCase = str.toLowerCase(locale);
                AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", lowerCase);
                Object obj2 = map.get(lowerCase);
                AbstractC3557B.Z(obj2);
                c4442g.addAll((Collection) obj2);
            } else {
                c4442g.add(str);
            }
        }
        Object[] array = R4.b.K(c4442g).toArray(new String[0]);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>", array);
        String[] strArr2 = (String[]) array;
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.f48700d;
            Locale locale2 = Locale.US;
            Integer num = (Integer) linkedHashMap.get(AbstractC6463a.j("US", locale2, str2, locale2, "this as java.lang.String).toLowerCase(locale)"));
            if (num != null) {
                arrayList.add(num);
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
        }
        int[] J22 = kf.t.J2(arrayList);
        m mVar2 = new m(pVar, J22, strArr2);
        synchronized (this.f48706j) {
            s.g gVar = this.f48706j;
            s.c f6 = gVar.f(pVar);
            if (f6 != null) {
                obj = f6.f45004Z;
            } else {
                s.c cVar = new s.c(pVar, mVar2);
                gVar.f45015i0++;
                s.c cVar2 = gVar.f45013Z;
                if (cVar2 == null) {
                    gVar.f45012Y = cVar;
                    gVar.f45013Z = cVar;
                } else {
                    cVar2.f45005h0 = cVar;
                    cVar.f45006i0 = cVar2;
                    gVar.f45013Z = cVar;
                }
                obj = null;
            }
            mVar = (m) obj;
        }
        if (mVar == null && this.f48705i.b(Arrays.copyOf(J22, J22.length))) {
            y yVar = this.f48697a;
            if (yVar.k()) {
                d(yVar.g().getWritableDatabase());
            }
        }
    }

    public final boolean b() {
        if (!this.f48697a.k()) {
            return false;
        }
        if (!this.f48703g) {
            this.f48697a.g().getWritableDatabase();
        }
        if (!this.f48703g) {
            AbstractC3612c.c("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final void c(B3.b bVar, int i10) {
        String str;
        bVar.t("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str2 = this.f48701e[i10];
        String[] strArr = f48696n;
        for (int i11 = 0; i11 < 3; i11++) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + P5.c.H(str2, str) + " AFTER " + strArr[i11] + " ON `" + str2 + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", str3);
            bVar.t(str3);
        }
    }

    public final void d(B3.b bVar) {
        AbstractC3557B.c0("database", bVar);
        if (bVar.y0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f48697a.f48757h.readLock();
            AbstractC3557B.b0("readWriteLock.readLock()", readLock);
            readLock.lock();
            try {
                synchronized (this.f48707k) {
                    int[] a5 = this.f48705i.a();
                    if (a5 == null) {
                        return;
                    }
                    if (bVar.B0()) {
                        bVar.X();
                    } else {
                        bVar.n();
                    }
                    int length = a5.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = a5[i10];
                        int i13 = i11 + 1;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                String str = this.f48701e[i11];
                                String[] strArr = f48696n;
                                for (int i14 = 0; i14 < 3; i14++) {
                                    String str2 = strArr[i14];
                                    String str3 = "DROP TRIGGER IF EXISTS " + P5.c.H(str, str2);
                                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", str3);
                                    bVar.t(str3);
                                }
                            }
                        } else {
                            c(bVar, i11);
                        }
                        i10++;
                        i11 = i13;
                    }
                    bVar.U();
                    bVar.j0();
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e10) {
            AbstractC3612c.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            AbstractC3612c.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
